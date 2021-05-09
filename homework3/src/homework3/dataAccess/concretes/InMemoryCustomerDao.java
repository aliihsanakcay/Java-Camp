package homework3.dataAccess.concretes;

import homework3.dataAccess.abstracts.CustomerDao;
import homework3.entities.concretes.Customer;

public class InMemoryCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi " + customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
	}
}
