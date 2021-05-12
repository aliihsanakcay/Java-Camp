package homework4ECommerceDemo.business.concretes;

import homework4ECommerceDemo.business.abstracts.UserAuthService;
import homework4ECommerceDemo.core.utilities.EmailFormatControl;
import homework4ECommerceDemo.entities.concretes.User;

public class UserAuthManager implements UserAuthService {
	
	public UserAuthManager() {}

	@Override
	public boolean isValidUser(User user) {
		return isValidFirstNameLength(user) && isValidLastNameLength(user) && isValidEmailFormat(user)
				&& isValidPasswordLength(user);
	}

	public boolean isValidPasswordLength(User user) {
		if (user.getPassword().length() >= 6) {
			return true;
		}
		System.out.println("�ifreniz en az 6 karakter olmal�d�r.");
		return false;
	}

	public boolean isValidEmailFormat(User user) {
		if(EmailFormatControl.validateEmail(user.getEmail())) {
			return true;
		}
		System.out.println("L�tfen ge�erli bir email adresi giriniz.");
		return false;
	}

	public boolean isValidFirstNameLength(User user) {
		if (user.getFirstName().length() >= 2) {
			return true;
		}
		System.out.println("�sminiz en az iki karakter olmal�d�r.");
		return false;
	}

	public boolean isValidLastNameLength(User user) {
		if (user.getLastName().length() >= 2) {
			return true;
		}
		System.out.println("Soyad�n�z en az iki karakter olmal�d�r.");
		return false;
	}

}
