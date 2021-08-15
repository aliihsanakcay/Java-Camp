package adventureGame;

public class Armor {
	private int id;
	private String armorName;
	private int defence;
	private int price;
	
	public Armor(int id, String armorName, int defence, int price) {
		this.id = id;
		this.armorName = armorName;
		this.defence = defence;
		this.price = price;
	}
	
	public static Armor[] armors() {
		Armor[] armorList = new Armor[3];
		armorList[0] = new Armor(1, "Hafif Zýrh", 1, 15);
		armorList[1] = new Armor(2, "Orta Zýrh", 3, 25);
		armorList[2] = new Armor(3, "Aðýr Zýrh", 5, 40);
		return armorList;
	}
	
	public static Armor getArmorById(int id) {
		return armors()[id-1];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArmorName() {
		return armorName;
	}

	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
