package adventureGame;

public class SafeHouse extends NormalLoc {
	
	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("Güvenli evdesiniz !");
		System.out.println("Canýnýz yenilendi !");
		this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
		return true;
	}
}
