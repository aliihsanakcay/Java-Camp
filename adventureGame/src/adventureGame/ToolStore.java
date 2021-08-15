package adventureGame;

public class ToolStore extends NormalLoc {
	public ToolStore(Player player) {
		super(player, "Ma�aza");
	}

	@Override
	public boolean onLocation() {
		System.out.println("\n------ Ma�azaya ho�geldiniz ! ------\n");
		while(true) {
			System.out.println("1 - Silahlar ");
			System.out.println("2 - Z�rhlar ");
			System.out.println("0 - ��k�� Yap");
			System.out.print("Se�iminiz : ");
			int selectTool = input.nextInt();

			while (selectTool < 0 || selectTool > 2) {
				System.out.println("Ge�ersiz de�er girdiniz. L�tfen tekrar giriniz : ");
				selectTool = input.nextInt();
			}

			switch (selectTool) {
			case 1:
				printWeapon();
				buyWeapon();
				break;

			case 2:
				printArmor();
				buyArmor();
				break;
			}
			
			if(selectTool==0) {
				System.out.println("Bir daha bekleriz.");
				break;
			}
		}
		
		return true;
	}

	public void printWeapon() {
		System.out.println("\n------ Silahlar ------\n");
		for (Weapon w : Weapon.weapons()) {
			System.out.println(w.getId() + " - " + w.getWeaponName() + "\t<Para : " + w.getPrice() + "\tHasar : "
					+ w.getDamage() + ">");
		}
		System.out.println("0 - ��k�� Yap");
	}
	
	public void buyWeapon() {
		System.out.print("Bir silah se�iniz : ");
		int selectWeaponId = input.nextInt();

		while (selectWeaponId < 0 || selectWeaponId > Weapon.weapons().length) {
			System.out.print("Ge�ersiz de�er girdiniz. L�tfen tekrar giriniz : ");
			selectWeaponId = input.nextInt();
		}
		
		if(selectWeaponId != 0) {
			Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponId);			
			if(selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paran�z bulunmamaktad�r ! ");
			}else {
				//S�LAH SATIN ALMANIN GER�EKLE�T��� YER
				System.out.println(selectedWeapon.getWeaponName() + " silah�n� sat�n ald�n�z !");
				int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paran�z : " + this.getPlayer().getMoney());
				this.getPlayer().getInventory().setWeapon(selectedWeapon);
			}
		}
	}

	public void printArmor() {
		System.out.println("\n------ Z�rhlar ------\n");
		for (Armor a : Armor.armors()) {
			System.out.println(a.getId() + " - " + a.getArmorName() + "\t<Para : " + a.getPrice() + "\tEnegelleme : "
					+ a.getDefence() + ">");
		}
		System.out.println("0 - ��k�� Yap");
	}
	
	public void buyArmor() {
		System.out.print("Bir z�rh se�iniz : ");
		int selectArmorId = input.nextInt();

		while (selectArmorId < 0 || selectArmorId > Armor.armors().length) {
			System.out.print("Ge�ersiz de�er girdiniz. L�tfen tekrar giriniz : ");
			selectArmorId = input.nextInt();
		}
		
		if(selectArmorId != 0) {
			Armor selectedArmor = Armor.getArmorById(selectArmorId);
			if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paran�z bulunmamaktad�r ! ");
			} else {
				//ZIRH SATIN ALMANIN GER�EKLE�T��� YER
				System.out.println(selectedArmor.getArmorName() + " z�rh�n� sat�n ald�n�z !");
				int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paran�z : " + this.getPlayer().getMoney());
				this.getPlayer().getInventory().setArmor(selectedArmor);
			}
		}
	}
}
