package adventureGame;

public class Inventory {
	private boolean water;
	private boolean food;
	private boolean firewood;
	private Weapon weapon;
	private Armor armor;
	
	public Inventory() {
		this.water = false;
		this.food = false;
		this.firewood = false;
		this.weapon = new Weapon(0, "Yumruk", 0, 0);
		this.armor = new Armor(0, "Paçavra", 0, 0);
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isFirewood() {
		return firewood;
	}

	public void setFirewood(boolean firewood) {
		this.firewood = firewood;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	
}
