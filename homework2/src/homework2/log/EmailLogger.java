package homework2.log;

public class EmailLogger extends BaseLogger{

	@Override
	public void log(String message) {
		super.log(message);
		System.out.println("logged to Email.");
	}
	
}
