package interfaceAbstractDemo.business.concretes;

import interfaceAbstractDemo.business.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.business.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.concretes.Customer;

public class neroCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;

	public neroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}
}
