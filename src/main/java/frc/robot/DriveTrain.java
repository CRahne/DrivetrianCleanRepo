package frc.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private static DifferentialDrive Drive = Robot.Drive;
  private static Encoder DTRE = Robot.DTRE;
  private static Encoder DTLE = Robot.DTLE;
  private static AHRS gyro = Robot.gyro;

  private ControlState ctrlstate;

  public DriveTrain(ControlState ctrlstate)
  {
    this.ctrlstate = ctrlstate;
  }

  public static void OPDRIVE(Joystick stick)
  {
    Drive.tankDrive(stick.getX(), stick.getY());
  }

  public void setCTRL(ControlState ctrl)
  {
    this.ctrlstate = ctrl;
  }

  public static void defaultAuto()
  {
    Drive.tankDrive(0.5, 0.5);
    Timer.delay(3);
    Drive.tankDrive(0.0, 0.0);
  }

  public void switchDT()
  {
    switch(ctrlstate)
    {
      case TELEOP:
        System.out.println("TeleOp enabled");
        break;
      case AUTO:
        System.out.println("Autonomous Driving Enabled");
        break;
      default:
        System.out.println("TeleOp enabled");
        break;
    }
  }

  public ControlState getControlState()
  {
    return this.ctrlstate;
  }

  public void ChangeState()
  {
    if(this.ctrlstate == ControlState.AUTO)
    {
      this.ctrlstate = ControlState.TELEOP;
    }
    else if(this.ctrlstate == ControlState.TELEOP)
    {
      this.ctrlstate = ControlState.AUTO;
    }
    else
    {
      this.ctrlstate = ControlState.NULL;
    }
  }

  public Boolean isAuto()
  {
    return (ctrlstate == ControlState.AUTO);
  }

  public Boolean isTeleOp()
  {
    return (ctrlstate == ControlState.TELEOP);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
