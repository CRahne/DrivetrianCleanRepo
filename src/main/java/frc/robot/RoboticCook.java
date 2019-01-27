package frc.robot;

import frc.robot.Robot1;

public class RoboticCook implements RoboticState{

	private Robot1 robot = new Robot1();
	
	public RoboticCook(Robot1 robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(robot.getRoboticOn());
	}

	@Override
	public void cook() {
		System.out.println("Cooking...");
	}

	@Override
	public void off() {
		System.out.println("Cannot switched off while cooking...");
	}
}
