package CommandPattern;

public class DriverCommandPattern {
	public DriverCommandPattern(){
		System.out.println();
		System.out.println("========COMMAND");
		RemoteControl control = new RemoteControl();
	    Light light = new Light();
	    Command lightsOn = new LightsOnCmd(light);
	    Command lightsOff = new LightsOffCmd(light);
	    control.setCommand(lightsOn);
	    control.pressButton();
	    control.setCommand(lightsOff);
	    control.pressButton();
	}
}