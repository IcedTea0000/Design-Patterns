package command_pattern;

public class Light {
	
	String name;
	
	public Light(String name){
		this.name=name;
	}
	
	public void on(){
		System.out.println("light's on");
	}
	
	public void off(){
		System.out.println("light's off");
	}

}
