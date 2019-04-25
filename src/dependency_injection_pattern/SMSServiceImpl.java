package dependency_injection_pattern;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("SMS sent to " + receiver + " : " + msg);
	}

}
