import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int xVelocity;
	private int yVelocity;
	//constructor(s):
	public Ball(int x, int y, int size) {
		//pre-condition: x, y, size must be all ints
		//post-condition: creates a ball with width height and size
		this.x = x;
		this.y = y;
		this.size = size;
		xVelocity=2;
		yVelocity=2;
	}
	//methods:
	public void draw(Graphics g){
		//pre-condition: none?
		//post-condition: draws the ball in cyan color and the indicated x, y, and size
		g.setColor(Color.cyan); 
		g.fillOval(x , y, size, size);
	}
	public int getYpos(){
		return y;
	}
	public int getXpos(){
		return x;
	}
	public int getSize(){
		return size;
	}
	public void setXVelocity(int c){
		this.xVelocity=c;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setYVelocity(int d){
		this.yVelocity=d;
	}
	public void reverseY(){
		//pre-condition: y must be an int
		//post-condition: reverses the y position. makes the y negative
		yVelocity= 0-yVelocity;
	}
	public void reverseX(){
		//pre-condition: x must be an int
		//post-condition: reverses the x position. makes the x negative
		xVelocity= 0-xVelocity;
	}
	public void move(){
		//pre-condition:xVelocity and yVelocity must have int values. x and y must be ints
		//post-condition: the ball will move
		x=x+xVelocity;
		y=y+yVelocity;
	}
}
