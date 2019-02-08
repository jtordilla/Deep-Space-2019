package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Arm extends Subsystem{

    double highPotExtreme = 0.724;
    double lowPotExtreme = 0.666;

    SpeedController pWM2 = RobotMap.armPWM2;

    Analog Potentiometer

    public void initDefaultCommand(){

    }

    public void stop(){

    }
}