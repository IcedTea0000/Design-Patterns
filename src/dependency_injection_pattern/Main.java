package dependency_injection_pattern;

public class Main {

	public static void main(String[] args){
		String msg="Hello, this is  a test";
		String email="testEmail@gmail.com";
		String phone="123 456 7890";
		MessageServiceInjector injector=null;
		Consumer app=null;
		
		injector=new EmailServiceInjector();
		app=injector.getConsumer();
		app.processMessage(msg, email);
		
		
	}
}
