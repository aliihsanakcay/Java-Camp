package homework4ECommerceDemo.business.abstracts;

import homework4ECommerceDemo.entities.concretes.User;

public interface UserAuthService {
	boolean isValidUser(User user);
}
