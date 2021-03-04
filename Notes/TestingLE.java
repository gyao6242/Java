
public class TestingLE {
	public static void main(String[] args) {
		System.out.println("LE given only slope and y-int");
		LinearEquation a = new LinearEquation (5,10);
		System.out.println(a.toString());
		LinearEquation b = new LinearEquation (2,9);
		System.out.println(b.toString());
		LinearEquation c = new LinearEquation (1,7);
		System.out.println(c.toString());
		LinearEquation d = new LinearEquation (3.8,11.3);
		System.out.println(d.toString());
		LinearEquation e = new LinearEquation (6.2,4.7);
		System.out.println(e.toString());
		LinearEquation f = new LinearEquation (4.5,9.3);
		System.out.println(f.toString());
		System.out.println();
		
		System.out.println("LE with 2 given points");
		LinearEquation g = new LinearEquation (4,2,3,1);
		System.out.println(g.toString());
		LinearEquation h = new LinearEquation (2,9,3,7);
		System.out.println(h.toString());
		LinearEquation i = new LinearEquation (1,7,2,1);
		System.out.println(i.toString());
		LinearEquation j = new LinearEquation (3.8,11.4,2.2,7.4);
		System.out.println(j.toString());
		LinearEquation k = new LinearEquation (6.2,4.6,0.2,7.8);
		System.out.println(k.toString());
		LinearEquation l = new LinearEquation (4.5,9.5,9.0,7);
		System.out.println(l.toString());
		System.out.println();
		
		System.out.println("Getting y from x");
		System.out.println("If Y is 4, then, X is " + (a.getY(4)));
		System.out.println("If Y is 7.3, then, X is " + (b.getY(7.3)));
		System.out.println("If Y is 8.6, then, X is " + (c.getY(8.6)));
		System.out.println("If Y is 6, then, X is " + (d.getY(6)));
		System.out.println("If Y is 9, then, X is " + (e.getY(9)));
		System.out.println();
		
		System.out.println("Getting Y from X");
		System.out.println("If X is 4, then, Y is " + (f.getX(4)));
		System.out.println("If X is 7.3, then, Y is " + (g.getX(7.3)));
		System.out.println("If X is 8.6, then, Y is " + (h.getX(8.6)));
		System.out.println("If X is 6, then, Y is " + (i.getX(6)));
		System.out.println("If X ishen, Y is " + (j.getX(9)));
		System.out.println();
		System.out.println();
		
		System.out.println("Getting inverse LE with slope and y-int given");
		System.out.println(a.inverse(b));
		System.out.println(b.inverse(c));
		System.out.println(d.inverse(e));
		System.out.println(g.inverse(h));
		System.out.println(a.inverse(i));
		System.out.println(l.inverse(i));
		System.out.println();
		
		System.out.println("Composition with two linear equations");
		System.out.println(a.composition(b));
		System.out.println(c.composition(d));
		System.out.println(e.composition(f));
		System.out.println(g.composition(h));
		System.out.println(h.composition(a));
	}

}
