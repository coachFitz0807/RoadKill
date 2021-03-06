// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc2877.RoadKill.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2877.RoadKill.Robot;
/**
 *
 */
public class  Drive2 extends Command { 
    public Drive2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis); 
        requires(Robot.driveTrain);
	System.out.println("Drive2 constructor");
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
   private Timer timer = new Timer();
   private double time = 0;
   private boolean running = false;
    // Called just before this Command runs the first time
    protected void initialize() {
           System.out.println("Drive2 initialize");

        timer.start();
        timer.reset();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
          if (running != true) {
           running = true;
           timer.reset() ;
          }
      System.out.println("Drive2.execute.  About to call driveTrain.runMotor2");
        Robot.driveTrain.runMotor2( 0.25 );
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        time = timer.get();
        System.out.print ("d2 isFinished. The value of time is ");
        System.out.println(time);
       if (time > 3.0) { 
          System.out.println("Drive2.isFinished");
       }
        return (timer.get() > 3.0);
    }
    // Called once after isFinished returns true
    protected void end() {  
        Robot.driveTrain.runMotor2(0.0);
        System.out.println("Drive2.end");
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
