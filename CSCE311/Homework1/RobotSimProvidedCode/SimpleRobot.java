/**
 * Written by Lian Liao
 * This class represents Simple Robots that runs and updates on a separate threads.
 */
import java.lang.Thread;
import java.lang.Math;
import java.awt.*;

public class SimpleRobot extends Thread //Extends (inheritance) the functionality of Thread in order to update the Robot's position
{
	// right and down used to determine which direction they go
	private boolean right,down = true;
	// S = Speed Amp = Amplitude, Per = Period, T = temp = Initial_Y
	private int x,y,S,Amp,Per,T;//Location of the Robot
	private Color rColor = Color.DARK_GRAY;//Default Color
	public static final int ROBOT_SIZE = 15;//Robot's are 15 pixel circles
	public static final int TIME_DELAY = 30;//Update is called every 30 milliseconds.
	public SimpleRobot(int aX, int aY, Color aC, int aS,int aAmp,int aPer)
	{
		this.setX(aX);
		this.setY(aY);
		this.setrColor(aC);
		this.setS(aS);
		this.setAmp(aAmp);
		this.setPer(aPer);
		this.T=aY;
	}
	public int getS() {
		return S;
	}
	public void setS(int S) {
		this.S = S;
	}
	public int getPer() {
		return Per;
	}
	public void setPer(int Per) {
		this.Per = Per;
	}
	public int getAmp() {
		return Amp;
	}
	public void setAmp(int Amp) {
		this.Amp = Amp;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getrColor() {
		return rColor;
	}

	public void setrColor(Color rColor) {
		this.rColor = rColor;
	}
	
	/**
	 * Overrides the method run in Thread. This calls the method update and sleeps the thread for 30 milliseconds before calling update again.
	 */
	public void run()
	{
		while(true)
		{
			//Calls update on each robot
			this.update();
			//Sleeps this thread for 30 milliseconds before updating again
			try {Thread.sleep(TIME_DELAY);}catch(Exception e) {e.printStackTrace();}
		}
	}
	/**
	 * This updates the position of the robot based on the robot's type.
	 * This is meant to be overridden for other extended robot types.
	 */
	public void update()
	{
		//TODO determine how the robot will move. This type of robot does not move but other may need to override this, and set the X and Y coordinates.
		//Left Right Robots
		if(this.getrColor()==Color.BLUE) {
			// I set 500 because it seem better at edge
			if(this.getX()>=500) {
				this.right = false;
			} else if(this.getX()<=0) {
				this.right = true;
			}
			if (this.right) {
				this.setX(this.getX()+this.getS());
			} else {
				this.setX(this.getX()-this.getS());
			}
		}
		//Diagonal Robots
		if(this.getrColor()==Color.ORANGE) {
			if(this.getX()>=500) {
				this.right = false;
			} else if(this.getX()<=0) {
			this.right = true;
			}
			// idk why 465 seem better at edge on my computer
			if(this.getY()>=465) {
				this.down = false;
			} else if(this.getY()<=0) {
				this.down = true;
			}
			if (this.right) {
				this.setX(this.getX()+this.getS());
			} else {
				this.setX(this.getX()-this.getS());
			}
			if (this.down) {
				this.setY(this.getY()+this.getS());
			} else {
				this.setY(this.getY()-this.getS());
			}
		}
		//Wavy Robots
		if(this.getrColor()==Color.PINK) {
			if(this.getX()>=500) {
				this.right = false;
			} else if(this.getX()<=0) {
				this.right = true;
			}
			if (this.right) {
				this.setX(this.getX()+this.getS());
			} else {
				this.setX(this.getX()-this.getS());
			}
			double ampY = this.T+Math.sin(this.getX()*this.getPer())*this.getAmp();
			this.setY((int)ampY);
		}
	}
}
