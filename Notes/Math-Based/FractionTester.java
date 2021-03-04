
public class FractionTester {

	public static void main(String[] args) {
		
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(5, 8);
		Fraction c = new Fraction(2);
		Fraction d = new Fraction(75, 3);
		Fraction e = new Fraction(6, 51);
		Fraction f = new Fraction(80, 63);
		Fraction k = new Fraction(80, 0);
		System.out.print("Testing the 2-parameter ctor with 1 and 2: ");
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(k);
		System.out.println();
		
		System.out.println("Multiplying fractions");
		Fraction g = a.multiply(b);
		Fraction h = c.multiply(d);
		Fraction i = e.multiply(f);
		System.out.println(a + " * " + b + " = " + g);
		System.out.println(g + " * " + b + " = " + g.multiply(b));
		System.out.println(c + " * " + d + " = " + h);
		System.out.println(e + " * " + f + " = " + i.multiply(h));
		System.out.println();
		
		System.out.println("Converting fractions into decimals");
		System.out.println(a + " as a decimal: " + a.toDecimal());
		System.out.println(b + " as a decimal: " + b.toDecimal());
		System.out.println(c + " as a decimal: " + c.toDecimal());
		System.out.println(d + " as a decimal: " + d.toDecimal());
		System.out.println(e + " as a decimal: " + e.toDecimal());
		System.out.println(f + " as a decimal: " + f.toDecimal());
		System.out.println();
		
		Fraction j = new Fraction();
		System.out.println("Testing the default ctor: " + j);
	}

}
