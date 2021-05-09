package homework3.business.abstracts;

import homework3.entities.concretes.Campaign;
import homework3.entities.concretes.Customer;
import homework3.entities.concretes.Game;

public interface OrderService {
	void sales(Customer customer, Game game);
	void sales(Customer customer, Game game, Campaign campaign);
}
