package homework3.business.abstracts;

import homework3.entities.concretes.Customer;

public interface PersonCheckService {
	boolean checkIfRealPerson(Customer customer);
}
