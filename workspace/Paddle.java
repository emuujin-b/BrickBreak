import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	//constructor(s):
	public Paddle(int x, int y, int width, int height) {
		//pre-condition: x,y,width,height must be ints
		//post-condition: creates a paddle with width, height, x, y
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//methods:
	public void move(){
		//pre-condition: x and velocity must be ints. velocity or x must be assigned a value
		//post-condition: makes the paddle move
		x=x+velocity;
	}
	public void draw(Graphics g){
		//pre-condition: none
		//post-condition: draws a paddle that is magenta and has the indicated width and height
		g.setColor(Color.magenta); 
		g.fillRect(x , y, width, height);
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
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public void addVelocity(int a){
		//pre-condition: a must be an int
		//post-condition: adds a to velocity
		setVelocity(a);
	}
	public void setVelocity(int b){
		this.velocity=b;
	}
	public int getVelocity(){
		return velocity;

	}
	
}

