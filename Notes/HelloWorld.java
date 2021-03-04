/*
 * Gregory Yao
 * September 2018
 * 
 * This is a multi-line comment.
 * At the beginning of every file, basically a description
 */
 
 /* Basic class to demonstrate variable declaration and usage. Will also
  *use basic arithmetic operations.
  */
public class HelloWorld {

	/*
	 * The main()  method is where program execution begins
	 */
	public static void main(String[] args) {
		// This is a single line comment format
		
		//This demonstrates how to declare an integer variable
		int x; // declaration format: Type varName;
		
		x = 2; // this is an assignment
		
		System.out.println("The value of x is " + x); //eclipse shortkey, sysout then hit crtl and spacebar
		// everything inside double code is a string
		
		int y = 11; // can declare and initialize at the same line
		// single equal sign is the assignment operator
		//var should always start in lower case... for now
		int otherVariable = 39;
		// anything immediately before parentheses are a function aka method
		
		x = y * otherVariable;
		
		System.out.println("the value of x is now" + x);
		
		System.out.println(otherVariable + " divided by "+ y + " = " + 
				otherVariable / y);
		
		//declaring some floating point numbers
		double myVar = 3.7, yourVar = 10.2;
		
		System.out.println(yourVar + " divided by "+ myVar + " = " + 
				yourVar / myVar);
		
		yourVar = x; // implicit conversion to a double, but not the other way around
		
		System.out.println(myVar + " divided by "+ y + " = " + 
				myVar / y);
	}
		
}