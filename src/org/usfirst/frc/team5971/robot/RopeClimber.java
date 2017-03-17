package org.usfirst.frc.team5971.robot;

import edu.wpi.first.wpilibj.Victor;
//import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RopeClimber extends Subsystem {

	public static Victor motor = RobotMap.ropeClimb;

	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	public void driveUp(){
		motor.set(1);
	}
	
	public void driveDown(){
		motor.set(-1);
	}
	
	public void stop(){
		motor.set(0);
	}
}