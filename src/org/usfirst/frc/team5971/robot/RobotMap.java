package org.usfirst.frc.team5971.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

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
	
	// BALL MANIPULATION MOTORS
	public static int GRIPPER_MOTOR_RIGHT = 4;
	public static int GRIPPER_MOTOR_LEFT = 5;
	public static int THROW_MOTOR_RIGHT = 6;
	public static int THROW_MOTOR_LEFT = 7;
	
	// SENSORS
	
	// Digital Inputs
	public static int BOULDER_LIMIT_SWITCH_PORT = 0;
	
	// Analog Inputs
	public static int BOULDER_LED_SENSOR_PORT = 0;
	
	// Create Devices
	
	// Create Boulder Sensor
//	public static DigitalInput boulderSwitch;
	
	
	public static void init() {
		// Initialize modules
		leftFrontMotor = new VictorSP(DRIVE_MOTOR_LEFT_FRONT);
		
		rightFrontMotor = new VictorSP(DRIVE_MOTOR_RIGHT_FRONT);
		
		leftRearMotor = new VictorSP(DRIVE_MOTOR_LEFT_REAR);
		
		rightRearMotor = new VictorSP(DRIVE_MOTOR_RIGHT_REAR);		
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
