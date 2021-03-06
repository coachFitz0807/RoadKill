// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc2877.RoadKill.subsystems;
import org.usfirst.frc2877.RoadKill.RobotMap;
import org.usfirst.frc2877.RoadKill.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2877.RoadKill.Robot;
/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Jaguar jaguar1 = RobotMap.driveTrainJaguar1;
    Jaguar jaguar2 = RobotMap.driveTrainJaguar2;
    Jaguar jaguar3 = RobotMap.driveTrainJaguar3;
    Jaguar jaguar4 = RobotMap.driveTrainJaguar4;
    RobotDrive robotDrive41 = RobotMap.driveTrainRobotDrive41;
    public DigitalInput limitSwitch = RobotMap.limitSwitch;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void runMotor1( double speed ) {
        System.out.println("driveTrain.runMotor1. About to call jaguar1.set()");
        System.out.print ("The value of speed is ");
        System.out.println(speed);
 
        jaguar1.set(speed);
    }
    public void runMotor2 ( double speed ) {
        System.out.println("drivetrain.runMotor2. About to call jaguar2.set()");
        System.out.print("The value of speed is ");
        System.out.println(speed); 
        
        jaguar2.set(speed);
    }
    public void drive ( double x, double y ) {
//        if (Robot.oi.joystickButton2.get()){
//            robotDrive41.mecanumDrive_Cartesian(x, y, 0, 0);}
//        else {
            robotDrive41.arcadeDrive(x, y);
//        }
//        jaguar1.set(x);
//        jaguar2.set(y);
    }
}