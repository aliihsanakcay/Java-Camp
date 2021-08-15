package adventureGame;

public class Weapon {
	private int id;
	private String weaponName;
	private int damage;
	private int price;
	
	public Weapon(int id, String weaponName, int damage, int price) {
		this.id = id;
		this.weaponName = weaponName;
		this.damage = damage;
		this.price = price;
	}
	

	public static Weapon[] weapons() {
		Weapon[] weaponList = new Weapon[3];
		weaponList[0] = new Weapon(1, "Tabanca", 2, 15);
		weaponList[1] = new Weapon(2, "Kýlýç", 3, 35);
		weaponList[2] = new Weapon(3, "Tüfek", 7, 45);
		return weaponList;
	}
	
	public static Weapon getWeaponById(int id) {
		return weapons()[id-1];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
