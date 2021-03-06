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
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class SpikeSubsystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Relay spike1 = RobotMap.spikeSubSystemSpike1;
    SpeedController speedController1 = RobotMap.testSubSystemSpeedController1;
    
    Servo servo1 = RobotMap.servo1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void spikeSet (boolean isOn) {
       if (isOn) {
           spike1.set(Relay.Value.kOn);
           System.out.println("Relay is ON");
       } else {
           spike1.set(Relay.Value.kOff);
           System.out.println("Relay is OFF");
       }
    }
    
    public void servoSet (double position) {
//       servo1.set (position);
//       System.out.println("ServoSet position out: " + position);
        servo1.setAngle(170);
       double newPosition = servo1.get();
       System.out.println("ServoGet position out: " + newPosition);
   }
}
