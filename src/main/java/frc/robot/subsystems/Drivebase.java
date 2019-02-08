package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.*;

public class Drivebase extends Subsystem{

    private Spark FrontLeftMotor;
    private Spark FrontRightMotor;
    private Spark BackLeftMotor;
    private Spark BackRightMotor;
    
    private Spark Arm;

    public MecanumDrive mecanumDrive;
    RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    public Drivebase(){
        FrontLeftMotor = new Spark(RobotMap.FRONT_LEFT_MOTOR.value); //found in RobotMap enum
        FrontRightMotor = new Spark(RobotMap.FRONT_RIGHT_MOTOR.value);
        BackLeftMotor = new Spark(RobotMap.BACK_LEFT_MOTOR.value);
        BackRightMotor = new Spark(RobotMap.BACK_RIGHT_MOTOR.value);

        Arm = new Spark(RobotMap.ARM.value);

    }

    public void init(){
        FrontLeftMotor = new Spark(RobotMap.FRONT_LEFT_MOTOR.value); //found in RobotMap enum
        FrontRightMotor = new Spark(RobotMap.FRONT_RIGHT_MOTOR.value);
        BackLeftMotor = new Spark(RobotMap.BACK_LEFT_MOTOR.value); 
        BackRightMotor = new Spark(RobotMap.BACK_RIGHT_MOTOR.value);
        Arm = new Spark(RobotMap.ARM.value);

        mecanumDrive = new MecanumDrive(FrontLeftMotor, BackLeftMotor, FrontRightMotor, BackRightMotor);
    }

    public void setRaw(double leftvalue, double rightvalue){
        BackLeftMotor.set(leftvalue);
        BackRightMotor.set(rightvalue);
        FrontLeftMotor.set(leftvalue);
        FrontRightMotor.set(rightvalue);

    }

    public void setMecanumDrive(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
        mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation, gyroAngle);
    }

    @Override
    protected void initDefaultCommand(){
        setDefaultCommand(new TankDrive());//starts the command
    }
 
    public void stop(){
        setMecanumDrive(0, 0, 0, 0);
    }
}