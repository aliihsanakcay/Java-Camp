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
				award = "Silah, Tüfek";
			} else if (randAward < 50) {
				award = "Silah, Kýlýç";
			} else {
				award = "Silah, Tabanca";
			}
		} else if (randAward < 30) {
			randAward = r.nextInt(100);
			if (randAward < 20) {
				award = "Zýrh, Aðýr Zýrh";
			} else if (randAward < 50) {
				award = "Zýrh, Orta Zýrh";
			} else {
				award = "Zýrh, Hafif Zýrh";
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
