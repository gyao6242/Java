/*
 * Gregory Yao
 * 9-25-2017 to 10-6-2017
 * 
 * Class that creates a linear equation in m-intercept form
 */
public class LinearEquation {
	// Defined variables
	private double m; //slope
	private double yInt; //y-intercept (y-int)
	
	// Method: Constructor that returns a Linear equation when given m and Y-int
	public LinearEquation(double m, double yInt) {
		this.m = m;
		this.yInt = yInt;
	}
	/*
	 * Method
	 * Constructor that returns a Linear equation when given two coordinate points
	 * 
	 * Parameters
	 * x1 = first x coordinate
	 * y1 = first y coordinate
	 * x2 = second x coordinate
	 * y2 = second y coordinate
	 */
	public LinearEquation (double x1, double y1, double x2, double y2) {
		m = ((y2-y1)/(x2-x1));
		yInt = ((y1)-(m*x1));
	
	}
	/*
	 * Method: Returns y1 when given the x1
	 * 
	 * Parameters: x1 = the x value given
	 * 
	 * Returns: y1 = the y value corresponding to the given x value
	 */
	
	public double getY(double x1) {
		double y1 = m*x1+yInt;
		return y1;
	}
	/*
	 * Method: Returns x1 when given the y1
	 * 
	 * Parameters: y1 = the y value given
	 * 
	 * Returns: x1 = the x value corresponding to the given y value
	 */
	
	public double getX(double y1) {
		double x1 = (y1-yInt)/m;
		return x1;
	}
	/*
	 * Method: Gives inverse of a linear equation, given the m and y-int
	 * 
	 * Parameters: A linear equation
	 * 
	 * Returns: The inverse of the given linear equation
	 */
	public LinearEquation inverse(LinearEquation other){
		double invm = 1/m; //inverse slope
		double invb = -yInt/m; //inverse y-int 
		return new LinearEquation(invm, invb);
	}
	/*
	 * Method: Composites two linear equations together
	 * 
	 * Parameters: A given linear equation
	 * 
	 * Returns: A composition of two linear equations written in one 
	 */
	public LinearEquation composition(LinearEquation eq){
		double m = this.m*eq.m;
		double b = this.m*eq.yInt+this.yInt;
		return new LinearEquation(m,b);
	}
	// Structure of Linear Equation (m-intercept)
	public String toString() {
		return " y = " + m + "x " + "+ " + yInt;
	}
}
