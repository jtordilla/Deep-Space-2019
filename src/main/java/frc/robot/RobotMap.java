//everything that needs to be mapped out

package frc.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

public enum RobotMap {
  //PWM Motor Mappings

  FRONT_LEFT_MOTOR(0), //slot on PWM
  FRONT_RIGHT_MOTOR(1),
  BACK_LEFT_MOTOR(2),
  BACK_RIGHT_MOTOR(3),

  //Control Mappings

  LEFT_JOYSTICK(0), //driver station
  RIGHT_JOYSTICK(1),

  //Arm

  CLIMBER(4);
  
  public final int value;
  public static RobotDrive driveTrainRobotDrive;

  RobotMap(int value){
    this.value = value;
  }
}
