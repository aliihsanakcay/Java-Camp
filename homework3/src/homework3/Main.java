package homework3;

import java.util.Date;

import homework3.business.concretes.CustomerManager;
import homework3.core.edevletVerification.MernisServiceAdapter;
import homework3.dataAccess.concretes.InMemoryCustomerDao;
import homework3.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Ali Ýhsan", "Akçay", "36780665866", new Date(1943, 9, 1));
		
		CustomerManager customerManager = new CustomerManager(new InMemoryCustomerDao(), new MernisServiceAdapter());
		customerManager.add(customer);
		
	}

}
