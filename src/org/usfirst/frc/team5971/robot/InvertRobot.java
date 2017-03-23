package org.usfirst.frc.team5971.robot;

public class InvertRobot {

boolean isInverted = false;

public boolean getStatus() {
    return isInverted;
}

public void setStatus() {
    if (isInverted) {
        isInverted = false;
    } else  {
        isInverted = true;
    }
}


}

