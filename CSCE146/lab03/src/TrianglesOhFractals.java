/*
 * Written by Lian Liao
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class TrianglesOhFractals extends Canvas {

	// setting frame
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Triangles");
		frame.setSize(400,400);
		TrianglesOhFractals sp = new TrianglesOhFractals();
		frame.add(sp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//draw the first black and white triangle
	public void paint(Graphics g) {
		int h=this.getSize().height;
		int w=this.getSize().width;
		int[] x = new int[3];
		int[] y = new int[3];
		x[0]=0; x[1]=w/2; x[2]=w;
		y[0]=h; y[1]=0; y[2]=h;
		g.setColor(Color.black);
		g.fillPolygon(x, y, 3);
		
		x[0]=w/4; x[1]=w/2; x[2]=w*3/4;
		y[0]=h/2; y[1]=h; y[2]=h/2;
		g.setColor(Color.white);
		g.fillPolygon(x, y, 3);
		
		draw(x,y,w/2,h/2,g);
	}
	// this method can combine with tri. 
	public void draw(int[] x, int[] y,int w, int h,Graphics g) {
		int sub = w / 4;	
		int subh = h / 4;

		x[0]=x[0]-sub; x[1]=x[1]-(sub*2); x[2]=x[2]-(sub*3);		
		y[0]=y[0]+(subh*2); y[1]=y[1]; y[2]=y[2]+(subh*2);	

		tri(x,y,w,h,g);
		
	}
	// recursive method to make Sierpenski¡¦s Triangle
	public void tri(int[] x,int[] y,int w,int h, Graphics g) {
		int[] xx = new int[3];
		int[] yy = new int[3];
		for(int i=0;i<3;i++) {
			xx[i]=x[i];
			yy[i]=y[i];
		}
		int sub = w / 4;	
		int subh = h / 4;
		//pixel limit of 4
		if(sub >= 4) {
			//bottom left triangle 
			g.fillPolygon(x, y, 3);
			draw(xx,yy,w/2,h/2,g);
			for(int i=1;i<3;i++) {		
				x[0]=x[0]+sub*2; x[1]=x[1]+sub*2; x[2]=x[2]+sub*2;
				if(i==2) {
					//top triangle 
					y[0]=y[0]+h; y[1]=y[1]+h; y[2]=y[2]+h;
					g.fillPolygon(x, y, 3);
					for(int k=0;k<3;k++) {
						xx[k]=x[k];
						yy[k]=y[k];
					}
					draw(xx,yy,w/2,h/2,g);
				}else {
					//top right triangle 
					y[0]=y[0]-h; y[1]=y[1]-h; y[2]=y[2]-h;
					g.fillPolygon(x, y, 3);
					for(int k=0;k<3;k++) {
						xx[k]=x[k];
						yy[k]=y[k];
					}
					draw(xx,yy,w/2,h/2,g);
				}
			}
			x[0]=x[0]-w; x[1]=x[1]-w; x[2]=x[2]-w;
		}
	}
}
	
