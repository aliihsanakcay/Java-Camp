package homework4ECommerceDemo.core.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFormatControl {
	// Email Regex java
	private final static String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	
	public static boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);	
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
