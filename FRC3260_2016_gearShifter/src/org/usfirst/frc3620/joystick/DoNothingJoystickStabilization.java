package org.usfirst.frc3620.joystick;

public class DoNothingJoystickStabilization extends JoystickStabilization {

	@Override
	public JoystickPosition stabilizeJoystick(double x, double y)
	{
		double newx = x;
		double newy = y;
		JoystickPosition returnValue = new JoystickPosition(newx, newy);
		return returnValue;
	}

}
