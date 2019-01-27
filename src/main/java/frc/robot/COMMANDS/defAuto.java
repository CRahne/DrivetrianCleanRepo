
package frc.robot.COMMANDS;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.DriveTrain;

public class defAuto extends Command {
  private DriveTrain DT = new DriveTrain(null);
  public defAuto() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    DT.defaultAuto();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // DT.defaultAuto();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  public void end() {
    // DT.OPDRIVE();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}