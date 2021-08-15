package adventureGame;

public abstract class NormalLoc extends Location {
	
	public NormalLoc(Player player, String locationName) {
		super(player, locationName);
	}
	
	@Override
	public boolean onLocation() {
		return true;
	}
}
