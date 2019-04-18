package singleton_pattern;

public class SingleObject {

	private SingleObject(){
	}
	
	private static SingleObject instance=new SingleObject();
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void message(){
		System.out.println("single object method");
	}
}
