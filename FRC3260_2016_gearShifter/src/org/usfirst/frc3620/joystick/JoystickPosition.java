package org.usfirst.frc3620.joystick;

public class JoystickPosition 
{
	private double x, y;
	
	public JoystickPosition (double _x, double _y) {
		this.x = _x;
		this.y = _y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}
}

