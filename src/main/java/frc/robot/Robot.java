package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends IterativeRobot {
  public static WPI_TalonSRX DTL1 = new WPI_TalonSRX(1);
  public static WPI_TalonSRX DTL2 = new WPI_TalonSRX(2);
  public static WPI_TalonSRX DTR1 = new WPI_TalonSRX(3);
  public static WPI_TalonSRX DTR2 = new WPI_TalonSRX(4);

  public static SpeedControllerGroup DTR = new SpeedControllerGroup(DTR1, DTR2);
  public static SpeedControllerGroup DTL = new SpeedControllerGroup(DTL1, DTL2);

  public static DifferentialDrive Drive = new DifferentialDrive(DTL, DTR);

  public static AHRS gyro = new AHRS(Port.kMXP); // FIX

  public static Encoder DTRE = new Encoder(1, 2); // FIX
  public static Encoder DTLE = new Encoder(2, 4); // FIX

  public static Joystick OPStick = new Joystick(0);
  public static JoystickButton ctrl_handler = new JoystickButton(OPStick, 2);

  private ControlState AUTO = ControlState.AUTO;
  private ControlState NULL = ControlState.NULL;
  private ControlState TELEOP = ControlState.TELEOP;

  public DriveTrain DT = new DriveTrain(NULL);

  public void robotInit() {
    DT.setCTRL(AUTO);
    ctrl_handler.toggleWhenPressed(new stateChange());
  }

  @Override
  public void robotPeriodic() {
    switch(DT.getControlState())
    {
      case AUTO:
        DT.defaultAuto();
      case TELEOP:
        DT.OPDRIVE(OPStick);
      default:
        teleopInit();
    }
  }
}
