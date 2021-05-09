package interfaceAbstractDemo;

import java.util.Date;

import interfaceAbstractDemo.business.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.business.concretes.CustomerCheckManager;
import interfaceAbstractDemo.business.concretes.neroCustomerManager;
import interfaceAbstractDemo.business.concretes.starbucksCustomerManager;
import interfaceAbstractDemo.core.mernisService.MernisServiceAdapter;
import interfaceAbstractDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new neroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Ali Ýhsan", "Akçay", new Date(1993, 9, 1), "26200706474"));
		
		
	}

}
