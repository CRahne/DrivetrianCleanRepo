package frc.robot; // package declaraition

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.COMMANDS.NullCommand;
import frc.robot.COMMANDS.OPDRIVE;
import frc.robot.COMMANDS.defAuto;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static Joystick OPStick;
    public static JoystickButton CtrlSwitch;
    public static DriveTrain DT = new DriveTrain(ControlState.NULL);
    public static OPDRIVE opd = new OPDRIVE();
    public static defAuto dA = new defAuto();

  public OI() {
    /* Joysticks & Buttons */
    OPStick = new Joystick(0);
    CtrlSwitch = new JoystickButton(OPStick, 2);
  }
  public void oi_init()
  {
      if(DT.getControlState() == ControlState.TELEOP)
      {
        opd.end();
        CtrlSwitch.toggleWhenPressed(new defAuto());
      }
      else if(DT.getControlState() == ControlState.AUTO)
      {
          dA.end();
          CtrlSwitch.toggleWhenPressed(new OPDRIVE());
      }
  }
  public void oi_destruct()
  {
    CtrlSwitch.toggleWhenPressed(new NullCommand());
  }
}