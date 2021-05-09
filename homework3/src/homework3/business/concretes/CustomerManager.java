package homework3.business.concretes;

import homework3.business.abstracts.CustomerService;
import homework3.business.abstracts.PersonCheckService;
import homework3.dataAccess.abstracts.CustomerDao;
import homework3.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerDao customerDao;
	private PersonCheckService personCheckService;

	public CustomerManager(CustomerDao customerDao, PersonCheckService personCheckService) {
		this.customerDao = customerDao;
		this.personCheckService = personCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (personCheckService.checkIfRealPerson(customer)) {
			customerDao.add(customer);
		} else {
			System.out.println("Not a valid customer " + customer.getFirstName());
		}
	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
	}

}
