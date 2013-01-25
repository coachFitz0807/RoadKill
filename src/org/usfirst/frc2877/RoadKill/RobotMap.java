// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc2877.RoadKill;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//    public static CANJaguar cANDriveTrainCANJaguar1;
//    public static CANJaguar cANDriveTrainCANJaguar2;
//    public static RobotDrive cANDriveTrainRobotDrive21;
    public static RobotDrive driveTrainRobotDrive21;
    public static Jaguar driveTrainJaguar1;
    public static Jaguar driveTrainJaguar2;
    public static Relay spikeSubSystemSpike1;
    public static SpeedController testSubSystemSpeedController1;
    public static Servo servo1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
//        try { 
//            cANDriveTrainCANJaguar1 = new CANJaguar(2);
//        } catch (CANTimeoutException ex) {
//            ex.printStackTrace();
//        }
	
        
//        try { 
//            cANDriveTrainCANJaguar2 = new CANJaguar(3);
//        } catch (CANTimeoutException ex) {
//            ex.printStackTrace();
//        }
	
     
//        cANDriveTrainRobotDrive21 = new RobotDrive(cANDriveTrainCANJaguar1, cANDriveTrainCANJaguar2);
//	
//        cANDriveTrainRobotDrive21.setSafetyEnabled(true);
//        cANDriveTrainRobotDrive21.setExpiration(0.1);
//        cANDriveTrainRobotDrive21.setSensitivity(0.5);
//        cANDriveTrainRobotDrive21.setMaxOutput(1.0);
        
        driveTrainJaguar1 = new Jaguar(3);
        driveTrainJaguar2 = new Jaguar(2);
  	
        driveTrainRobotDrive21 = new RobotDrive(driveTrainJaguar1,driveTrainJaguar2);
        
        driveTrainRobotDrive21.setSafetyEnabled(false);
        driveTrainRobotDrive21.setExpiration(10);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);

        spikeSubSystemSpike1 = new Relay(1,1,Direction.kForward);
	LiveWindow.addActuator("SpikeSubSystem", "Spike 1", spikeSubSystemSpike1);
        
        testSubSystemSpeedController1 = new Victor(1, 1);
	LiveWindow.addActuator("TestSubSystem", "Speed Controller 1", (Victor) testSubSystemSpeedController1);
        
        servo1 = new Servo(1,1);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
