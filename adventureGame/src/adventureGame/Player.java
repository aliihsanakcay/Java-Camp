package adventureGame;

import java.util.Scanner;

public class Player {
	private Inventory inventory;
	private String playerName;
	private String charName;
	private int damage;
	private int health;
	private int originalHealth;
	private int money;
	private Scanner input = new Scanner(System.in);

	public Player(String playerName) {
		this.playerName = playerName;
		this.inventory = new Inventory();
	}

	public void selectChar() {

		GameChar[] gameCharList = { new Samurai(), new Archer(), new Knight() };
		
		System.out.println("-------------------------------");
		System.out.println("Karakterler");
		System.out.println("-------------------------------");
		for (GameChar gameChar : gameCharList) {
			System.out.println(
					gameChar.getId() + ". Karakter : " + gameChar.getCharName() + "\t Hasar : " + gameChar.getDamage()
							+ "\t Saðlýk : " + gameChar.getHealth() + "\t Para : " + gameChar.getMoney());
		}
		System.out.println("-------------------------------");
		System.out.print("Lütfen bir karakter seçiniz ! ");
		int selectChar = input.nextInt();
		
		while(selectChar<1 || selectChar>gameCharList.length) {
			System.out.println("Lütfen geçerli bir karakter seçiniz ! ");
			selectChar = input.nextInt();
		}

		switch (selectChar) {
		case 1:
			initPlayer(new Samurai());
			break;
		case 2:
			initPlayer(new Archer());
			break;
		case 3:
			initPlayer(new Knight());
			break;

		default:
			break;
		}
	}

	public void printInfo() {
		System.out.println("Karakter : " + this.getCharName() + "\tHasar : " + this.getTotalDamage() + "\tSaðlýk : "
				+ this.getHealth() + "\tPara : " + this.getMoney() 
				+ "\tSilah : " + this.getInventory().getWeapon().getWeaponName() 
				+ "\tZýrh : " + this.getInventory().getArmor().getArmorName() 
				+ "\tEngelleme : " + this.getTotalDefence());
	}

	public void initPlayer(GameChar gameChar) {
		this.setCharName(gameChar.getCharName());
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setOriginalHealth(gameChar.getHealth());
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}
	
	public int getTotalDamage() {
		return damage + this.getWeapon().getDamage();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public int getTotalDefence() {
		return this.getArmor().getDefence();
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0) {
			health = 0;
		}
		this.health = health;
	}

	public int getOriginalHealth() {
		return originalHealth;
	}

	public void setOriginalHealth(int originalHealth) {
		this.originalHealth = originalHealth;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Weapon getWeapon() {
		return this.getInventory().getWeapon();
	}
	
	public Armor getArmor() {
		return this.getInventory().getArmor();
	}
}
