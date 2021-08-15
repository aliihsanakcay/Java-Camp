package adventureGame;

import java.util.Scanner;

public class Game {
	private Scanner input = new Scanner(System.in);

	public Game() {
	}

	public void start() {

		System.out.println("Macera oyununa Ho�geldiniz !");
		System.out.println("L�tfen bir isim giriniz : ");
		// String playerName = input.nextLine();
		Player player = new Player("ali");
		System.out.println("Merhaba Say�n " + player.getPlayerName()
				+ " bu sisli ve karanl�k adaya ho�geldiniz! Burada ya�ananlar�n hepsi ger�ek! ");
		System.out.println("L�tfen bir karakter se�iniz ! ");
		player.selectChar();
		selectLocation(player);
	}

	public void selectLocation(Player player) {
		
		Location location = null;
		
		boolean isWin = false;
		
		while (!isWin) {
			player.printInfo();
			System.out.println("\n########### B�LGELER ############\n");
			System.out.println("1 - G�venli Ev --> Buras� sizin i�in g�venli bir ev, d��man yoktur ! ");
			System.out.println("2 - E�ya D�kkan� --> Silah veya z�rh sat�n alabilirsiniz ! ");
			System.out.println("3 - Ma�ara --> �d�l <Yemek>, dikkatli ol zombi ��kabilir ! ");
			System.out.println("4 - Orman --> �d�l <Odun>, dikkatli ol kar��na vampir ��kabilir ! ");
			System.out.println("5 - Nehir --> �d�l <Su>, dikkatli ol ay� ��kabilir ! ");
			System.out.println("6 - Maden --> �d�l <Su>, dikkatli ol ay� ��kabilir ! ");
			System.out.println("0 - ��k�� Yap --> Oyunu sonland�r. ");
			System.out.print("L�tfen gitmek istedi�iniz b�lgeyi se�iniz : ");
			int selectLoc = input.nextInt();

			switch (selectLoc) {
			case 0:
				break;
			case 1:
				location = new SafeHouse(player);
				if(player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()){
					isWin = true;
				}
				break;

			case 2:
				location = new ToolStore(player);
				break;

			case 3:
				if(player.getInventory().isFood()) {
					System.out.println("Ma�ara b�lgesine daha �nce girdiniz ve �d�l�n�z� ald�n�z ! Kazan�lan b�lgeye tekrar giri� yoktur ! ");
					location = null;
				}else {
					location = new Cave(player);
				}
				break;

			case 4:
				if(player.getInventory().isFirewood()) {
					System.out.println("Orman b�lgesine daha �nce girdiniz ve �d�l�n�z� ald�n�z ! Kazan�lan b�lgeye tekrar giri� yoktur ! ");
					location = null;
				}else {
					location = new Forest(player);
				}
				break;

			case 5:
				if(player.getInventory().isWater()) {
					System.out.println("Nehir b�lgesine daha �nce girdiniz ve �d�l�n�z� ald�n�z ! Kazan�lan b�lgeye tekrar giri� yoktur ! ");
					location = null;
				}else {
					location = new River(player);
				}
				break;

			case 6:
				location = new Mine(player);
				break;

			default:
				System.out.println("L�tfen ge�erli bir b�lge giriniz ! ");
				break;
			}
			
			if(selectLoc == 0) {
				System.out.println("Bu karanl�k ve sisli adadan �abuk vazge�tiniz ! ");
				break;
			}

			if (location != null && !location.onLocation()) {
				System.out.println("GAME OVER ! ");
				break;
			}
			if(isWin) {
				System.out.println("\n----------- TEBR�KLER OYUNU KAZANDINIZ -----------\n");
			}
		}
	}
}
