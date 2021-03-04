/*
 * This is a multi-line comment.
 * At the beginning of every file, basically a description
 */
 
 /* Basic class to demonstrate variable declaration and usage. Will also
  *use basic arithmetic operations.
  */
public class IntroVariables {

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
		// blue is defined as an instance/class data
		
		int y = 11; // can declare and initialize at the same line
		// single equal sign is the assignment operator
		//var should always start in lower case... for now
		int otherVariable = 39;
		// anything immediately before parentheses are a function aka method
		
		x = y * otherVariable;
		
		System.out.println("the value of x is now" + x);
		
		System.out.print(otherVariable + " divided by " + y + " = " + 
				otherVariable / y);
		// The modulus operator (%) gives the remainder
		System.out.println("with a remainder of " + otherVariable % y);
		
		//declaring some floating point numbers
		double myVar = 3.7, yourVar = 10.2;
		
		System.out.println(yourVar + " divided by " + myVar + " = " + 
				yourVar / myVar);
		
		yourVar = x; // implicit conversion to a double, but not the other way around
		
		System.out.println(myVar + " divided by " + y + " = " + 
				myVar / y);
		
		// illustrating "casting" or "typecasting"
		System.out.println(otherVariable + " divided by " + y+ " = " + 
				(double)otherVariable / y); //casting only changes the number on that one line, nowhere else
		
		String word = "food";
		System.out.println("Adam likes " + word);
		
		System.out.println(x + " + " + y + " = " + x + y); // int + string = string
		
		String sentence = "Olivia likes " + word + ",too!";
		System.out.println(sentence);
		System.out.println(sentence.toUpperCase()); 
		/* period (member operator)
		 * a binary operator (takes two operands to do its job)
		 * the operand on the left is either a object/reference or a name of a class
		 * the operand on the right has to be a public member (data or method) from that class definition
		 */
		
		// a class is an overall definition of an idea (broad)
		// an object is an instance of a class (specific)
		/* word is a reference variable (reference to a string object), all references are the same size
		 * "food" is a string object
		 */
		// primitive types (int, double,,,,), cannot be used with  a member number
		// example: System.out.prinln(x.toUpperCase)
		/* defining class needs variables (attributes) and methods (functions) defined
		 * method lines: public double f(double x){
		 * 	return 3*X + 2;
		 * }
		 */
		// invoking methods
		/* Constructor: method to create an object, doesn't have a return type (automatically knows its returning a reference)
		 * A constructor always has the same class
		 */
		//hw: make a code snippet that removes all letter a's or a method
		String slam = "come on and SLAM! and WELCOME TO THE JAM";
		String jam = slam.replaceAll("[aA]", "");
		System.out.println(jam);
		//hw end
		System.out.println(IntroVariables.removeA(slam));
	}
	//creating a method
	public static String removeA(String potato){
		return potato.replaceAll("[aA]","");
	}
	
}