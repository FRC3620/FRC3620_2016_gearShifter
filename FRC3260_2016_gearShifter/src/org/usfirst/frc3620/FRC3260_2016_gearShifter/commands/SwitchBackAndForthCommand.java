package org.usfirst.frc3620.FRC3260_2016_gearShifter.commands;

import org.usfirst.frc3620.FRC3260_2016_gearShifter.Robot;
import org.usfirst.frc3620.FRC3260_2016_gearShifter.subsystems.Subsystem1;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SwitchBackAndForthCommand extends Command {

    public SwitchBackAndForthCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (Robot.subsystem1.weAreInReverse) {
            Robot.subsystem1.weAreInReverse = false;
        } else {
            Robot.subsystem1.weAreInReverse = true;
        }System.out.println("I shifted" + Robot.subsystem1.weAreInReverse );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
