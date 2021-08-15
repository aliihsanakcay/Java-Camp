package adventureGame;

import java.util.Random;

public abstract class BattleLoc extends Location {
	private Obstacle obstacle;
	private String award;
	private int maxObstacle;
	private int minObstacle;

	public BattleLoc(Player player, String locationName, Obstacle obstacle, String award, int maxObstacle, int minObstacle) {
		super(player, locationName);
		this.obstacle = obstacle;
		this.award = award;
		this.maxObstacle = maxObstacle;
		this.minObstacle = minObstacle;
	}

	@Override
	public boolean onLocation() {
		int obstacleNumber = randomObstacleNumber();

		System.out.println("�u an buradas�n�z : " + this.getLocationName());
		System.out.println("Dikkatli ol! Burada " + obstacleNumber + " tane " + this.getObstacle().getObstacleName()
				+ " ya��yor ! ");
		System.out.print("<S>ava� veya <K>a� ");
		String selectCase = input.nextLine().toUpperCase();
		if (selectCase.equals("S") && combat(obstacleNumber)) {
			System.out.println(this.getLocationName() + " b�lgesindeki t�m d��manlar� yendiniz ! ");
			reward();
			return true;
		}
		if (this.getPlayer().getHealth() <= 0) {
			System.out.println("�ld�n�z ! ");
			return false;
		}
		return true;
	}

	public boolean combat(int obstacleNumber) {

		for (int i = 1; i <= obstacleNumber; i++) {
			this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
			if(this.getObstacle().getObstacleName().toLowerCase().equals("y�lan")) {
				this.getObstacle().setDamage(Snake.randomDamage());
			}
			playerStats();
			obstacleStats(i);
			whoHitFirst();
			while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
				System.out.print("<V>ur veya <K>a� ");
				String selectCombat = input.nextLine().toUpperCase();
				if (selectCombat.equals("V")) {
					System.out.println("Siz vurdunuz ! ");
					this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
					afterHit();
					if (this.getObstacle().getHealth() > 0) {
						System.out.println("Canavar size vurdu ! ");
						int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getTotalDefence();
						if (obsDamage < 0) {
							obsDamage = 0;
						}
						this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
						afterHit();
					}
				} else {
					return false;
				}
			}
			if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
				System.out.println("D��man� yendiniz ! ");
				System.out.println(this.getObstacle().getAwardMoney() + " para kazand�n�z ! ");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAwardMoney());
				System.out.println("G�ncel paran�z : " + this.getPlayer().getMoney());
			} else {
				return false;
			}
		}
		return true;
	}
	
	public void whoHitFirst(){
		Random r = new Random();
		// 1 ==> Player hit firstly // 0 ==> Obstacle hit firstly
		int whoHit = r.nextInt(2);
		if(whoHit == 0) {
			System.out.println("Canavar size vurdu ! ");
			int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getTotalDefence();
			if (obsDamage < 0) {
				obsDamage = 0;
			}
			this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
			afterHit();
		}
	}
	
	//B�LGEDEN KAZANILAN �D�L VER�LEN YER
	public void reward() {
		if(this.getLocationName().toLowerCase().equals("ma�ara")) {
			System.out.println("Tebrikler !" + this.getLocationName() + " b�lgesinden sa� ��kt�n�z ! �d�l�n�z : Yemek");
			this.getPlayer().getInventory().setFood(true);
		}else if(this.getLocationName().toLowerCase().equals("orman")) {
			System.out.println("Tebrikler !" + this.getLocationName() + " b�lgesinden sa� ��kt�n�z ! �d�l�n�z : Odun");
			this.getPlayer().getInventory().setFirewood(true);
		}else if(this.getLocationName().toLowerCase().equals("nehir")) {
			System.out.println("Tebrikler !" + this.getLocationName() + " b�lgesinden sa� ��kt�n�z ! �d�l�n�z : Su");
			this.getPlayer().getInventory().setWater(true);
		}else if(this.getLocationName().toLowerCase().equals("maden")) {
			if(this.getAward().toLowerCase().equals("")) {
				System.out.println("Malesef �d�l YOK !");
			}else {
				rewardForMine();
			}
		}
	}
	
	public void rewardForMine() {
		String[] awardWords= this.getAward().toLowerCase().split(", ");
		if(awardWords[0].toLowerCase().equals("silah")) {
			for (Weapon w : Weapon.weapons()) {
				if(w.getWeaponName().toLowerCase().equals(awardWords[1])) {
					System.out.println("Tebrikler !" + this.getLocationName() + " b�lgesinden sa� ��kt�n�z ! �d�l�n�z : " + awardWords[1]);
					this.getPlayer().getInventory().setWeapon(w);
				}
			}
		} else if(awardWords[0].toLowerCase().equals("z�rh")) {
			for (Armor a : Armor.armors()) {
				if(a.getArmorName().toLowerCase().equals(awardWords[1])) {
					System.out.println("Tebrikler !" + this.getLocationName() + " b�lgesinden sa� ��kt�n�z ! �d�l�n�z : " + awardWords[1]);
					this.getPlayer().getInventory().setArmor(a);
				}
			}
		} else if(awardWords[0].toLowerCase().equals("para")) {
			System.out.println("Tebrikler !" + this.getLocationName() + " b�lgesinden sa� ��kt�n�z ! �d�l�n�z : " + awardWords[1] + " Para");
			this.getPlayer().setMoney(this.getPlayer().getMoney() + Integer.parseInt(awardWords[1]));
		}
	}

	public void afterHit() {
		System.out.println("Can�n�z : " + this.getPlayer().getHealth());
		System.out.println(this.getObstacle().getObstacleName() + " can� : " + this.getObstacle().getHealth());
		System.out.println();
	}

	public void playerStats() {
		System.out.println("\n-------- Oyuncu Bilgileri ---------");
		System.out.println("Sa�l�k : " + this.getPlayer().getHealth());
		System.out.println("Silah : " + this.getPlayer().getWeapon().getWeaponName());
		System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
		System.out.println("Para : " + this.getPlayer().getMoney());
		System.out.println("Bloklama : " + this.getPlayer().getArmor().getDefence());
		System.out.println("Z�rh : " + this.getPlayer().getArmor().getArmorName());
	}

	public void obstacleStats(int i) {
		System.out.println("\n-------- " + i + ". " + this.getObstacle().getObstacleName() + " Bilgileri ---------");
		System.out.println("Sa�l�k : " + this.getObstacle().getHealth());
		System.out.println("Hasar : " + this.getObstacle().getDamage());
		System.out.println("�d�l : " + this.getObstacle().getAwardMoney());
		System.out.println();
	}

	public int randomObstacleNumber() {
		Random r = new Random();
		int obstacleNumber = r.nextInt(this.getMaxObstacle() - this.getMinObstacle() + 1) + this.getMinObstacle();
		return obstacleNumber;
	}

	public Obstacle getObstacle() {
		return obstacle;
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxObstacle() {
		return maxObstacle;
	}

	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}

	public int getMinObstacle() {
		return minObstacle;
	}

	public void setMinObstacle(int minObstacle) {
		this.minObstacle = minObstacle;
	}
}
