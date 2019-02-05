//everything that needs to be mapped out

package frc.robot;

public enum RobotMap {
  //PWM Motor Mappings

  LEFT_MOTOR(0), //slot on PWM
  RIGHT_MOTOR(1),

  //Control Mappings

  LEFT_JOYSTICK(1), //driver station
  RIGHT_JOYSTICK(2);
  
  public final int value;

  RobotMap(int value){
    this.value = value;
  }
}
