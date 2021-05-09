package interfaceAbstractDemo.business.abstracts;

import interfaceAbstractDemo.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
