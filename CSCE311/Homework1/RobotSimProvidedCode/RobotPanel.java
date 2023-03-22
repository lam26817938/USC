/**
 * Written by Lian Liao
 * This class creates a new JPanel that will specifically draw the robot's.
 */
import java.awt.*;
import javax.swing.*;

public class RobotPanel extends JPanel //Extends (inheritance) the functionality of the JPanel Component in order to draw Robots. 
{
	public static final int DEF_R_SIZE = 8; //Default number of Robots
	private SimpleRobot[] robots = new SimpleRobot[DEF_R_SIZE]; //Creates the array of robots to be updated and drawn
	/**
	 * Initializes elements of the JPanel. This method is to be called before added to a JFrame.
	 */
	public void init()
	{
		//Set's the JPanel's Preferred Size to be the same as the Frame.
		super.setPreferredSize(new Dimension(RobotThreadSimulator.FRAME_DIM,RobotThreadSimulator.FRAME_DIM));
		
		//TODO Add Robots to the Array
		
		//2 Simple Robots
		SimpleRobot bot = new SimpleRobot(20,20,Color.GREEN,0,0,0);
		SimpleRobot bot2 = new SimpleRobot(30,30,Color.RED,0,0,0);
		robots[0]=bot;
		robots[1]=bot2;
		
		//2 Left Right Robots
		SimpleRobot bot3 = new SimpleRobot(8,200,Color.BLUE,4,0,0);
		robots[2]=bot3;
		SimpleRobot bot4 = new SimpleRobot(250,400,Color.BLUE,8,0,0);
		robots[3]=bot4;
		
		//2 Diagonal Robots
		SimpleRobot bot5 = new SimpleRobot(100,400,Color.ORANGE,5,0,0);
		robots[4]=bot5;
		SimpleRobot bot6 = new SimpleRobot(450,80,Color.ORANGE,10,0,0);
		robots[5]=bot6;
		
		//2 Wavy Robots
		SimpleRobot bot7 = new SimpleRobot(150,100,Color.PINK,3,30,40);
		robots[6]=bot7;
		SimpleRobot bot8 = new SimpleRobot(350,300,Color.PINK,9,80,90);
		robots[7]=bot8;
		
		//See assignment requirements for more details
		
		//TODO Start each robot thread
		for(int i=0;i<8;i++) {
			new Thread(robots[i]).start();
		}

	}
	
	/**
	 *Overrides JPanel's paintComponent method in order to draw each robot.
	 */
	public void paintComponent(Graphics g)
	{
		//Calling super class' paintComponents first
		super.paintComponent(g);
		//For each robot in the array of robots
		for(SimpleRobot r : robots)
		{
			if(r == null)
				continue;
			//Sets the drawing color
			g.setColor(r.getrColor());
			//Draws the oval to the JPanel
			g.fillOval(r.getX(),r.getY(),SimpleRobot.ROBOT_SIZE,SimpleRobot.ROBOT_SIZE);
		}
	}
}
