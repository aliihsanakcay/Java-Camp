package homework2.log;

public class ConsoleLogger extends BaseLogger {
	
	@Override
	public void log(String message) {
		System.out.println(message + " console logged.");
	}

}
