package org.usfirst.frc.team5971.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	RobotDrive myRobot;
	Joystick stick;
	int counterLoop;
	int counterLoop2;
	int counterLoop3;
	int counterLoop4;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	myRobot = new RobotDrive(0,2,1,3);
    	stick = new Joystick(0);
    	myRobot.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	myRobot.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
    	myRobot.setInvertedMotor(RobotDrive.MotorType.kRearLeft,true);
    	myRobot.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }
    
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit(){
    	counterLoop = 600;
    	counterLoop2 = 0;
    	counterLoop3 = 0;
    	counterLoop4 = 0;
    }


    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	if(counterLoop >300)
    	{
    		myRobot.drive(-0.15, 0.0);
    		
    		counterLoop--;
    	}else{
    		counterLoop--;
    		if(counterLoop==0){
    			counterLoop=600;
    	
    		}
    		myRobot.drive(0.15, 0.0);
    	}
    	
    	
    }
    
    
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    public void teleopInit(){
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        myRobot.arcadeDrive(stick);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
