package homework3.business.concretes;

import homework3.business.abstracts.OrderService;
import homework3.entities.concretes.Campaign;
import homework3.entities.concretes.Customer;
import homework3.entities.concretes.Game;

public class OrderManager implements OrderService {

	@Override
	public void sales(Customer customer, Game game) {
		System.out.println(customer.getFirstName() + " isimli oyuncu " + game.getGameName() + " oyununu "
				+ game.getGamePrice() + " fiyatýndan satýn aldý.");
	}

	@Override
	public void sales(Customer customer, Game game, Campaign campaign) {
		double discountedSales = game.getGamePrice() - game.getGamePrice() * campaign.getDiscount();
		System.out.println(customer.getFirstName() + " isimli oyuncu " + game.getGameName() + " oyununu "
				+ campaign.getCampaignName() + " kampanyasýyla " + discountedSales + " fiyatýndan satýn aldý.");
	}

}
