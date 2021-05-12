package homework4ECommerceDemo.core.SignUpWithGoogleService;

import homework4ECommerceDemo.SignUpWithGoogle.RegisterWithGoogle;
import homework4ECommerceDemo.core.ExternalEmailService;

public class SignUpWithGoogleManager implements ExternalEmailService {
	private RegisterWithGoogle registerWithGoogle;

	public SignUpWithGoogleManager(RegisterWithGoogle registerWithGoogle) {
		this.registerWithGoogle = registerWithGoogle;
	}
	
}
