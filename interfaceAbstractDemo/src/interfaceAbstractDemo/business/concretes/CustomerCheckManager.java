package interfaceAbstractDemo.business.concretes;

import java.rmi.RemoteException;

import interfaceAbstractDemo.business.abstracts.CustomerCheckService;
import interfaceAbstractDemo.core.mernisService.MernisServiceAdapter;
import interfaceAbstractDemo.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


//Burasý kendi servisimiz
public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
