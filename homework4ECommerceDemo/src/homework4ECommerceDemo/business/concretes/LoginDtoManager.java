package homework4ECommerceDemo.business.concretes;

import homework4ECommerceDemo.business.abstracts.LoginDtoService;
import homework4ECommerceDemo.dataAccess.abstracts.UserDao;
import homework4ECommerceDemo.entities.concretes.User;

public class LoginDtoManager implements LoginDtoService {

	private UserDao userDao;
	
	public LoginDtoManager(homework4ECommerceDemo.dataAccess.abstracts.UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void login(String email, String password) {
		User user = this.userDao.getByEmail(email);
		
		if (user!=null && user.getPassword() == password) {
			System.out.println("Baþarýlý bir þekilde giriþ yapýlmýþtýr.");
		}else {
			System.out.println("Email veya þifre hatalýdýr. Lütfen tekrar giriþ yapýnýz.");
		}
	}

}
