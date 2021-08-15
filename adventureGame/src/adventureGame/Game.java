package adventureGame;

import java.util.Scanner;

public class Game {
	private Scanner input = new Scanner(System.in);

	public Game() {
	}

	public void start() {

		System.out.println("Macera oyununa Hoþgeldiniz !");
		System.out.println("Lütfen bir isim giriniz : ");
		// String playerName = input.nextLine();
		Player player = new Player("ali");
		System.out.println("Merhaba Sayýn " + player.getPlayerName()
				+ " bu sisli ve karanlýk adaya hoþgeldiniz! Burada yaþananlarýn hepsi gerçek! ");
		System.out.println("Lütfen bir karakter seçiniz ! ");
		player.selectChar();
		selectLocation(player);
	}

	public void selectLocation(Player player) {
		
		Location location = null;
		
		boolean isWin = false;
		
		while (!isWin) {
			player.printInfo();
			System.out.println("\n########### BÖLGELER ############\n");
			System.out.println("1 - Güvenli Ev --> Burasý sizin için güvenli bir ev, düþman yoktur ! ");
			System.out.println("2 - Eþya Dükkaný --> Silah veya zýrh satýn alabilirsiniz ! ");
			System.out.println("3 - Maðara --> Ödül <Yemek>, dikkatli ol zombi çýkabilir ! ");
			System.out.println("4 - Orman --> Ödül <Odun>, dikkatli ol karþýna vampir çýkabilir ! ");
			System.out.println("5 - Nehir --> Ödül <Su>, dikkatli ol ayý çýkabilir ! ");
			System.out.println("6 - Maden --> Ödül <Su>, dikkatli ol ayý çýkabilir ! ");
			System.out.println("0 - Çýkýþ Yap --> Oyunu sonlandýr. ");
			System.out.print("Lütfen gitmek istediðiniz bölgeyi seçiniz : ");
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
					System.out.println("Maðara bölgesine daha önce girdiniz ve Ödülünüzü aldýnýz ! Kazanýlan bölgeye tekrar giriþ yoktur ! ");
					location = null;
				}else {
					location = new Cave(player);
				}
				break;

			case 4:
				if(player.getInventory().isFirewood()) {
					System.out.println("Orman bölgesine daha önce girdiniz ve Ödülünüzü aldýnýz ! Kazanýlan bölgeye tekrar giriþ yoktur ! ");
					location = null;
				}else {
					location = new Forest(player);
				}
				break;

			case 5:
				if(player.getInventory().isWater()) {
					System.out.println("Nehir bölgesine daha önce girdiniz ve Ödülünüzü aldýnýz ! Kazanýlan bölgeye tekrar giriþ yoktur ! ");
					location = null;
				}else {
					location = new River(player);
				}
				break;

			case 6:
				location = new Mine(player);
				break;

			default:
				System.out.println("Lütfen geçerli bir bölge giriniz ! ");
				break;
			}
			
			if(selectLoc == 0) {
				System.out.println("Bu karanlýk ve sisli adadan çabuk vazgeçtiniz ! ");
				break;
			}

			if (location != null && !location.onLocation()) {
				System.out.println("GAME OVER ! ");
				break;
			}
			if(isWin) {
				System.out.println("\n----------- TEBRÝKLER OYUNU KAZANDINIZ -----------\n");
			}
		}
	}
}
