/*
 * Requirements
 * rational numbers (int values)
 * numerator
 * denominator (never be 0)
 * can add
 * can subtract
 * can multiply
 * can divide
 */
//define getters and setters
//two constructors (numerator and denominator) and (integers)
//ctors = constructors

public class Fraction {
	
	private int numerator; // numerator
	private int denominator;// denominator
	public double dValue; // for reducing later on
	
	/*
	 * Constructor based on a numerator and denominator
	 */
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;// this. is a self-reference
		this.denominator = denominator;
	}
	/*
	 * Constructor of a whole number
	 */
	public Fraction(int whole) {
		this.numerator = whole;
		this.denominator = 1;
	}
	/*
	 * Adds two fraction objects together
	 * Parameters:
	 *  Fraction other = the Fraction that will be added with 
	 *  this Fraction object
	 *  
	 *  Returns the product as a Fraction
	 */
	public Fraction add(Fraction other) {
		int menumerator = this.numerator * other.denominator + this.denominator * other.numerator;
		int mudenominator = this.denominator * other.denominator;
		return new Fraction(menumerator, mudenominator);
	}
	/*
	 * Subtracts two fraction objects together
	 * Parameters:
	 *  Fraction other = the Fraction that will be subtracted with 
	 *  this Fraction object
	 *  
	 *  Returns the product as a Fraction
	 */
	public Fraction subtract(Fraction other) {
		int menumerator = this.numerator * other.denominator - this.denominator * other.numerator;
		int mudenominator = this.denominator * other.denominator;
		return new Fraction(menumerator, mudenominator);
	}
	/*
	 * Multiplies two fraction objects together
	 * Parameters:
	 *  Fraction other = the Fraction that will be multiplied with 
	 *  this Fraction object
	 *  
	 *  Returns the product as a Fraction
	 */
	public Fraction multiply(Fraction other) {
		int menumerator = this.numerator * other.numerator;
		int mudenominator = this.denominator * other.denominator;
		Fraction product = new Fraction(menumerator, mudenominator);
		return product;
				
	}
	/*
	 * Divides two fraction objects together
	 * Parameters:
	 *  Fraction other = the Fraction that will be divided with 
	 *  this Fraction object
	 *  
	 *  Returns the product as a Fraction
	 */
	public Fraction divide(Fraction other) {
		int menumerator = this.numerator * other.denominator;
		int mudenominator = this.denominator * other.numerator;
		return new Fraction(menumerator, mudenominator);
				
	}
	// Reducer
	public void display(){
	    System.out.println("Numerator: " + numerator);
	    System.out.println("Denominator: " + denominator);
	    }
	    public double dValue(){
	    	dValue = (double)numerator/denominator;
	    	return dValue;
	    }
	/*
	 * Reciprocal
	 */
	public Fraction reciprocal(){
		return new Fraction(denominator, numerator);
	}
	/*
	 * Returns the decimal (double) value of this Fraction object
	 */
	public double toDecimal() {
		return (double)numerator / denominator;
	}
	/*
	 * Returns a string representation of a fraction object in the form
	 * "numerator/denominator"
	 */
	public String toString() {
		if(denominator == 0) {
            return ("Denominator can't be zero: ");
		}
		return numerator + "/" + denominator;
	}
	//getter
	public int getNumerator() {
		return numerator;
	}
	//setter
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}
