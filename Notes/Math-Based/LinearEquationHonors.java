	/*
	 *Gregory Yao
	 *
	 * Class that creates a linear equation in standard form but better
	 */
public class LinearEquationHonors {
	
		// Defined variables
		private int a;
		private int b;
		private int c;
		
		/*
		 * Method: Constructor creating slope and y-intercept
		 * 
		 * Parameters: 
		 * m = slope
		 * yIntercept = y-intercept
		 */
		public LinearEquationHonors (int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		public LinearEquationHonors (Fraction slope, Fraction yInt) {
			a = -(slope.getNumerator() * yInt.getDenominator());
			b= slope.getDenominator() * yInt.getDenominator();
			c= slope.getDenominator() * yInt.getNumerator();
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
		public LinearEquationHonors (int x1, int y1, int x2, int y2) {
			if (x2 ==x1) {
				a = 1;
				b =0;
				c = x1;
			}
			else {
				Fraction slope = new Fraction(y2 - y1, x2 - x1);
				Fraction yInt = slope.multiply(new Fraction (-x2)).add(new Fraction (y2));
				a = -(slope.getNumerator() * yInt.getDenominator());
				b= slope.getDenominator() * yInt.getDenominator();
				c= slope.getDenominator() * yInt.getNumerator();
			}
			
		}

		/*
		 * Method: Returns y1 when given the x1
		 * 
		 * Parameters: x1 = the x value given
		 * 
		 * Returns: y1 = the y value corresponding to the given x value
		 */
		public double getY(double x) {
			if (b == 0) {
				return 1;
			}
			double y = -a / (double)b * x + (double)c / b;
			return y;
		}
		/*
		 * Method: Returns x1 when given the y1
		 * 
		 * Parameters: y1 = the y value given
		 * 
		 * Returns: x1 = the x value corresponding to the given y value
		 */

		public double getX(double y) {
			if (a == 0) {
				return 1;
			}
			double x = -b / (double)a * y + (double)c / a;
			return x;
		}
		/*
		 * Method: Creates a composition of two linear equations together
		 * 
		 * Parameters: LinearEquationHonors = given linear equation
		 * 
		 * Returns: Linear Equation of a composition
		 */
		public LinearEquationHonors composition(LinearEquationHonors eq){
			int slopeN = this.a * eq.a;
			int slopeD = this.b * eq.b;
			Fraction slope = new Fraction (slopeN, slopeD);
			
			int yIntN = this.c * eq.b - this.a * eq.c;
			int yIntD = this.b * eq.b;
			Fraction yInt = new Fraction (yIntN, yIntD);
			
			LinearEquationHonors composition = new LinearEquationHonors (slope, yInt);
			return composition;
		}
		/*
		 * Method: Gives inverse of a linear equation, given the m and y-int
		 * 
		 * Parameters: A linear equation
		 * 
		 * Returns: The inverse of the given linear equation
		 */
		public LinearEquationHonors inverse(){
			return new LinearEquationHonors(b, a, c);
		}
		/*
		 * Returns a string (str) representing a linear equation in slope y-intercept form
		 */
		public String toString() {
			if (a == 0 && b== 0) {
				if (c == 0) {
					return "0";
				}
				else {
					return "This equation is not valid/possible";
				}
			}
			if (b == 0) {
				Fraction x = new Fraction (c,a);
				String horizontalStr = "x = " + x;
				return horizontalStr;
			}
			if (a == 0) {
				Fraction y = new Fraction (c,b);
				String verticalStr = "y = " + y;
				return verticalStr;
			}
			Fraction slope = new Fraction (-a,b);
			Fraction yInt = new Fraction (c,b);
			String str = "y = ";
			if (a == b || a == -b) {
				if (slope.getNumerator() < 0) {
					str += "-";
				}
			}
			else {
				str += slope;
			}
			str += "x";
			if (c == 0) {
				return str;
			}
			if (yInt.getNumerator() > 0) {
				str += " + ";
			}
			str += yInt;
			return str;
		}
}
