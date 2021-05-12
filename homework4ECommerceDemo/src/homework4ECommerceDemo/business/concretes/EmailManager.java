package homework4ECommerceDemo.business.concretes;

import homework4ECommerceDemo.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	public EmailManager() {
	}

	@Override
	public void sendToEmail() {
		System.out.println(
				"Email adresinize doðrulama linki göderilmiþtir. Lütfen gelen maildeki linke týklayarak mail adresinizi doðrulayýnýz.");
	}

	@Override
	public void emailVerification() {
		System.out.println("Mail adresiniz doðrulanmýþtýr. Teþekkür ederiz. ");
	}

}
