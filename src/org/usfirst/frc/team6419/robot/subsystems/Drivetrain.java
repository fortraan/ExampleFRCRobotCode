package org.usfirst.frc.team6419.robot.subsystems;

import org.usfirst.frc.team6419.robot.commands.HandleDrivetrain;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	VictorSP left0, right0, left1, right1;
	
	public Drivetrain() {
		left0 = new VictorSP(0);
		right0 = new VictorSP(1);
		left1 = new VictorSP(2);
		right1 = new VictorSP(3);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new HandleDrivetrain());
    }
    
    public void drive(double left, double right) {
    	left0.set(left);
    	right0.set(right);
    	left1.set(left);
    	right1.set(right);
    }
}

