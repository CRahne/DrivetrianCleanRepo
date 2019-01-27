package frc.robot;

import frc.robot.Robot1;

public class RoboticOn implements RoboticState{

	private Robot1 robot = new Robot1();
	
	public RoboticOn(Robot1 robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("Walking...");
	}

	@Override
	public void cook() {
		System.out.println("Cooking...");
		robot.setRoboticState(robot.getRoboticCook());
	}

	@Override
	public void off() {
		robot.setState(robot.getRoboticOff());
		System.out.println("Robot is switched off");
		
	}

}
