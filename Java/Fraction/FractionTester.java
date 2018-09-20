
public class FractionTester {

	// create Fraction Object
	Fraction f1 = new Fraction();
	f1.num = 3;
	f1.den = 4;
	double s = f1.size();
	System.out.println(s);
	System.out.println(f1);

	Fraction f2 = new Fraction();
	System.out.println(f2);
	f2.num = 2;
	f2.den = 3;
	
	Fraction f3 = f1.times(f2);
	System.out.println(f3.num+"/"+f3.den);
	
	Fraction f4 = f3.reduce();
	System.out.println(f4.num+"/"+f4.den);
	
	Fraction f5 = new Fraction("0.98");
	System.out.println(f5.num+"/"+f5.den);

}


