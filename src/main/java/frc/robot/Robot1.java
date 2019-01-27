package frc.robot;

public class Robot1 implements RobotCtrlState{

	private RobotCtrlState teleOp;
	private RobotCtrlState Auto;
	private RobotCtrlState roboticStandby;
	
	private RobotCtrlState state;
	
	public Robot1(){
		this.teleOp = new teleOp(this);
		this.Auto = new Auto(this);

		this.roboticStandby = new RoboticStandby(this);
	}
	
	public void setRobotCtrlState(RobotCtrlState state){
		this.state = state;
	}
	
	public void teleOp() {
		state.teleOp();
		setState(getRoboticStandby());
	}

	public void Auto() {
		state.Auto();
		setState(getRoboticStandby());
	}

	public RobotCtrlState getTeleOp() {
		return teleOp;
	}

	public void setTeleOp(RobotCtrlState teleOp) {
		this.teleOp = teleOp;
	}

	public RobotCtrlState getAuto() {
		return Auto;
	}

	public void setAuto(RobotCtrlState Auto) {
		this.Auto = Auto;
	}

	public RobotCtrlState getState() {
		return state;
	}

	public void setState(RobotCtrlState state) {
		this.state = state;
	}

	public RobotCtrlState getRoboticStandby() {
		return roboticStandby;
	}

	public void setRoboticStandby(RobotCtrlState roboticStandby) {
		this.roboticStandby = roboticStandby;
	}
	
}
