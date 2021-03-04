
public class LinearEquationsHonorsTesting {
	public static void main(String[] args) {
		LinearEquationHonors a = new LinearEquationHonors (5,10,6,3);
		LinearEquationHonors b = new LinearEquationHonors (10,0,3,0);
		LinearEquationHonors c = new LinearEquationHonors (3,58,0,7);
		LinearEquationHonors d = new LinearEquationHonors (7,58,7,7);
		LinearEquationHonors e = new LinearEquationHonors (5,10,6,3);
		LinearEquationHonors f = new LinearEquationHonors (43,87,75,9);
		LinearEquationHonors g = new LinearEquationHonors (73,59,567,123);
		LinearEquationHonors h = new LinearEquationHonors (8,7,3,6);
		System.out.println("Linear equation given only two coordinate points");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println();
		
		System.out.println("Testing .getX method");
		System.out.println("If y is 71, x is " + a.getX(71));
		System.out.println("If y is 34, x is " + a.getX(34));
		System.out.println("If y is 13, x is " + b.getX(13));
		System.out.println("If y is 97, x is " + b.getX(97));
		System.out.println("If y is 68, x is " + c.getX(68));
		System.out.println("If y is 35, x is " + c.getX(35));
		System.out.println("If y is 62, x is " + d.getX(62));
		System.out.println("If y is 789, x is " + d.getX(789));
		System.out.println();
		
		System.out.println("Testing .getY method");
		System.out.println("If x is 71, y is " + e.getY(71));
		System.out.println("If x is 34, y is " + e.getY(34));
		System.out.println("If x is 13, y is " + f.getY(13));
		System.out.println("If x is 97, y is " + f.getY(97));
		System.out.println("If x is 68, y is " + g.getY(68));
		System.out.println("If x is 35, y is " + g.getY(35));
		System.out.println("If x is 62, y is " + h.getY(62));
		System.out.println("If x is 789, y is " + h.getY(789));
		System.out.println();
		
		System.out.println("Testing composition method");
		System.out.println(a.composition(b));
		System.out.println(c.composition(d));
		System.out.println(e.composition(f));
		System.out.println(g.composition(h));
		System.out.println(h.composition(a));
		System.out.println();
		
		System.out.println("Testing inverse method");
		System.out.println(a.inverse());
		System.out.println(b.inverse());
		System.out.println(c.inverse());
		System.out.println(d.inverse());
		System.out.println(e.inverse());
		System.out.println(f.inverse());
		System.out.println(g.inverse());
		System.out.println(h.inverse());
		System.out.println();
	}
}