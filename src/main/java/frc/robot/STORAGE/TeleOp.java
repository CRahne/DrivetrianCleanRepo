// package frc.robot;

// public class TeleOp implements RobotState{
//         private final Robot robot;

//         public TeleOp(Robot robot){
//             this.robot = robot;
//         }
//         public void walk() {
//             System.out.println("Walking...");
//         }
//         public void cook() {
//             System.out.println("Cooking...");
//             robot.setRoboticState(robot.getRoboticCook());
//         }
//         public void switchToAuto() {
//             robot.setState(RobotState.fullAuto());
//             System.out.println("Robot is switched off");
//         }
//     }