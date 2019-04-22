package command_pattern;

public class StereoOnWithCDCommand implements Command {

	Stereo stereo;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
		
	}
	
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo=stereo;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
		
	}
	
	
	
	
}
