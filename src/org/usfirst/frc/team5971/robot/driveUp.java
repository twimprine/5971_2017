package org.usfirst.frc.team5971.robot;
import edu.wpi.first.wpilibj.command.Command;


public class driveUp extends Command {

	public driveUp(){
	 requires(Robot.ropeClimber);
	 setTimeout(0.5);
	}

	@Override
	protected void initialize() {
		((RopeClimber) Robot.ropeClimber).driveUp();	
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		((RopeClimber) Robot.ropeClimber).stop();	
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		((RopeClimber) Robot.ropeClimber).stop();	
	}


}
