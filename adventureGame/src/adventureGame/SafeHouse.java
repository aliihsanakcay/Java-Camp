package adventureGame;

public class SafeHouse extends NormalLoc {
	
	public SafeHouse(Player player) {
		super(player, "G�venli Ev");
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("G�venli evdesiniz !");
		System.out.println("Can�n�z yenilendi !");
		this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
		return true;
	}
}
