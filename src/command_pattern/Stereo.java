package command_pattern;

public class Stereo {

	String name;
	
	public Stereo(String name){
		this.name=name;
	}
	
	public void on(){
		System.out.println("stereo is on");
	}
	
	public void setCD(){
		System.out.println("cd is set");
	}
	
	public void setVolume(int volume){
		System.out.println("volume is set at "+volume);
	}
	
}
