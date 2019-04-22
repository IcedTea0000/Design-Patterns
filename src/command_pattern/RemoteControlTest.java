package command_pattern;

public class RemoteControlTest {

	public static void main(String args[]){
		RemoteControlWithUndo remoteControl=new RemoteControlWithUndo();
		Light livingRoomLight=new Light("Living Room");
		Light kitchenLight=new Light("Kitchen");
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
		LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);
		
		Garage garage=new Garage();
		GarageDoorOpenCommand garageDoorUp=new GarageDoorOpenCommand(garage);
		
		Stereo stereo=new Stereo("Living Room");
		StereoOnWithCDCommand stereoOnWithCD=new StereoOnWithCDCommand(stereo);
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
	}
	
}
