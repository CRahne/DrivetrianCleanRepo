package frc.robot;

import frc.robot.Robot1;

public class RoboticOff implements RoboticState{

	private Robot1 robot;
	
	public RoboticOff(Robot1 robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(robot.getRoboticOn());
	}

	@Override
	public void cook() {
		System.out.println("Cannot cook at Off state.");
	}

	@Override
	public void off() {
		System.out.println("Already switched off...");
	}
}
