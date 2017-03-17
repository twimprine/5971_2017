//this code was made by Quade Leonard

package org.usfirst.frc.team5971.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
//import edu.wpi.first.wpilibj.command.Subsystem;

public class RobotMap {
	
public static RobotDrive driveMap;
	
	// CAN Create Motor Controlers for driveTrain
	public static VictorSP leftFrontMotor; //0
	public static VictorSP leftRearMotor;  //2
	public static VictorSP rightFrontMotor; //1
	public static VictorSP rightRearMotor; //3

	
	
	public static int DRIVE_MOTOR_RIGHT_FRONT = 1;
	public static int DRIVE_MOTOR_LEFT_FRONT = 0;
	public static int DRIVE_MOTOR_LEFT_REAR = 2;
	public static int DRIVE_MOTOR_RIGHT_REAR = 3;
	
	// ROPE CLIMBING
	public static Victor ropeClimb;

	
	
	
	public static int DRIVE_MOTOR_ROPE = 7; //find port #
	
	// CAMERA

//	public static DigitalInput boulderSwitch;
	
	
	public static void init() {
		// Initialize modules
		leftFrontMotor = new VictorSP(DRIVE_MOTOR_LEFT_FRONT);
		
		rightFrontMotor = new VictorSP(DRIVE_MOTOR_RIGHT_FRONT);
		
		leftRearMotor = new VictorSP(DRIVE_MOTOR_LEFT_REAR);
		
		rightRearMotor = new VictorSP(DRIVE_MOTOR_RIGHT_REAR);	
		
		ropeClimb = new Victor(DRIVE_MOTOR_ROPE);
		
	}
	public static VictorSP getLeftFront() {
		return leftFrontMotor;	
	}
	public static VictorSP getRightFront() {
		return rightFrontMotor;	
	}
	public static VictorSP getLeftBack() {
		return leftRearMotor;	
	}
	public static VictorSP getRightBack() {
		return rightRearMotor;	
	}
	
	
	
}