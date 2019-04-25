package dependency_injection_pattern;

public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("email sent to " + receiver + " : " + msg);
	}

}
