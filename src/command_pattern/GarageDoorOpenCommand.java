package command_pattern;

public class GarageDoorOpenCommand implements Command {

	Garage garage;
	
	public GarageDoorOpenCommand(Garage garage){
		this.garage=garage;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.open();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
