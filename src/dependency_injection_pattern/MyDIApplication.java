package dependency_injection_pattern;

public class MyDIApplication implements Consumer {

	private MessageService service;
	
	public MyDIApplication(MessageService svc){
		this.service=svc;
	}

	@Override
	public void processMessage(String msg, String receiver) {
		// TODO Auto-generated method stub
		this.service.sendMessage(msg, receiver);
	}
	
	
}
