package homework4ECommerceDemo.business.concretes;

import java.util.List;

import homework4ECommerceDemo.business.abstracts.EmailService;
import homework4ECommerceDemo.business.abstracts.UserAuthService;
import homework4ECommerceDemo.business.abstracts.UserService;
import homework4ECommerceDemo.dataAccess.abstracts.UserDao;
import homework4ECommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserAuthService userAuthService;
	private UserDao userDao;
	private EmailService emailService;
	
	public UserManager() {}
	
	public UserManager(UserAuthService userAuthService, UserDao userDao, EmailService emailService) {
		this.userAuthService = userAuthService;
		this.userDao = userDao;
		this.emailService = emailService;
	}
	
	@Override
	public void add(User user) {
		if (userDao.getByEmail(user.getEmail()) == null) {
			if(userAuthService.isValidUser(user)) {
				emailService.sendToEmail();
				emailService.emailVerification();
				this.userDao.add(user);
				System.out.println("Tebrikler. Baþarýlý bir þekilde üyeliðiniz tamamlanmýþtýr. ");
			}
		} else {
			System.out.println("Bu mail adresi ile bir kullanýcý mevcuttur. Lütfen baþka bir mail adresi giriniz.");
		}
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

}
