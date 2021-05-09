package homework3.business.abstracts;

import homework3.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
