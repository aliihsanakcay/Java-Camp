package adventureGame;

import java.util.Random;

public class Mine extends BattleLoc {
	public Mine(Player player) {
		super(player, "Maden", new Snake(), randomAward(), 5, 1);
	}

	public static String randomAward() {
		Random r = new Random();
		int randAward = r.nextInt(100);
		String award = "";

		if (randAward < 15) {
			randAward = r.nextInt(100);
			if (randAward < 20) {
				award = "Silah, T�fek";
			} else if (randAward < 50) {
				award = "Silah, K�l��";
			} else {
				award = "Silah, Tabanca";
			}
		} else if (randAward < 30) {
			randAward = r.nextInt(100);
			if (randAward < 20) {
				award = "Z�rh, A��r Z�rh";
			} else if (randAward < 50) {
				award = "Z�rh, Orta Z�rh";
			} else {
				award = "Z�rh, Hafif Z�rh";
			}
		} else if (randAward < 55) {
			randAward = r.nextInt(100);
			if (randAward < 20) {
				award = "Para, 10";
			} else if (randAward < 50) {
				award = "Para, 5";
			} else {
				award = "Para, 1";
			}
		} else {
			award = "";
		}

		return award;
	}
}
