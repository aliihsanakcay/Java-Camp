package adventureGame;

public class ToolStore extends NormalLoc {
	public ToolStore(Player player) {
		super(player, "Maðaza");
	}

	@Override
	public boolean onLocation() {
		System.out.println("\n------ Maðazaya hoþgeldiniz ! ------\n");
		while(true) {
			System.out.println("1 - Silahlar ");
			System.out.println("2 - Zýrhlar ");
			System.out.println("0 - Çýkýþ Yap");
			System.out.print("Seçiminiz : ");
			int selectTool = input.nextInt();

			while (selectTool < 0 || selectTool > 2) {
				System.out.println("Geçersiz deðer girdiniz. Lütfen tekrar giriniz : ");
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
		System.out.println("0 - Çýkýþ Yap");
	}
	
	public void buyWeapon() {
		System.out.print("Bir silah seçiniz : ");
		int selectWeaponId = input.nextInt();

		while (selectWeaponId < 0 || selectWeaponId > Weapon.weapons().length) {
			System.out.print("Geçersiz deðer girdiniz. Lütfen tekrar giriniz : ");
			selectWeaponId = input.nextInt();
		}
		
		if(selectWeaponId != 0) {
			Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponId);			
			if(selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paranýz bulunmamaktadýr ! ");
			}else {
				//SÝLAH SATIN ALMANIN GERÇEKLEÞTÝÐÝ YER
				System.out.println(selectedWeapon.getWeaponName() + " silahýný satýn aldýnýz !");
				int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paranýz : " + this.getPlayer().getMoney());
				this.getPlayer().getInventory().setWeapon(selectedWeapon);
			}
		}
	}

	public void printArmor() {
		System.out.println("\n------ Zýrhlar ------\n");
		for (Armor a : Armor.armors()) {
			System.out.println(a.getId() + " - " + a.getArmorName() + "\t<Para : " + a.getPrice() + "\tEnegelleme : "
					+ a.getDefence() + ">");
		}
		System.out.println("0 - Çýkýþ Yap");
	}
	
	public void buyArmor() {
		System.out.print("Bir zýrh seçiniz : ");
		int selectArmorId = input.nextInt();

		while (selectArmorId < 0 || selectArmorId > Armor.armors().length) {
			System.out.print("Geçersiz deðer girdiniz. Lütfen tekrar giriniz : ");
			selectArmorId = input.nextInt();
		}
		
		if(selectArmorId != 0) {
			Armor selectedArmor = Armor.getArmorById(selectArmorId);
			if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("Yeterli paranýz bulunmamaktadýr ! ");
			} else {
				//ZIRH SATIN ALMANIN GERÇEKLEÞTÝÐÝ YER
				System.out.println(selectedArmor.getArmorName() + " zýrhýný satýn aldýnýz !");
				int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Kalan paranýz : " + this.getPlayer().getMoney());
				this.getPlayer().getInventory().setArmor(selectedArmor);
			}
		}
	}
}
