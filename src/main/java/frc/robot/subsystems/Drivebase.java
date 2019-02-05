package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.*;

public class Drivebase extends Subsystem{

    private Spark LeftMotor;
    private Spark RightMotor;

    public Drivebase(){
        LeftMotor = new Spark(RobotMap.LEFT_MOTOR.value); //found in RobotMap enum
        RightMotor = new Spark(RobotMap.RIGHT_MOTOR.value);
    }

    public void setRaw(double leftvalue, double rightvalue){
        LeftMotor.set(leftvalue);
        RightMotor.set(rightvalue);

    }
    @Override
    protected void initDefaultCommand(){
        setDefaultCommand(new TankDrive());//starts the command
    }
}