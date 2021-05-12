package homework4ECommerceDemo.business.concretes;

import homework4ECommerceDemo.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	public EmailManager() {
	}

	@Override
	public void sendToEmail() {
		System.out.println(
				"Email adresinize do�rulama linki g�derilmi�tir. L�tfen gelen maildeki linke t�klayarak mail adresinizi do�rulay�n�z.");
	}

	@Override
	public void emailVerification() {
		System.out.println("Mail adresiniz do�rulanm��t�r. Te�ekk�r ederiz. ");
	}

}
