/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2877.RoadKill.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2877.RoadKill.Robot;

/**
 *
 * @author Administrator
 */
public class SetServo extends Command { 
    
    private double position;
    private double direction;
    
    public SetServo() {
       requires(Robot.spikeSubsystem);
    }
    
    protected void initialize() {
        position = 0;
        direction = 1;
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
      if (position > .95) {  
          direction = -1;
      }
     position += direction * 0.1;
             //System.out.println("SetServo.execute. Current position is: " + position);
     Robot.spikeSubsystem.servoSet(position);
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return position < 0.05;
    }
    // Called once after isFinished returns true
    protected void end() {
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
}
