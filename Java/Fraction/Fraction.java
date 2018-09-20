public class Fraction {

	// define instance variables
	int num;     // will hold the numerator
	int den;     // will hold the denominator
	
	public double size() {
		return Math.abs((double)num/den);
	}
	
	/**
	 * Returns a Fraction object that is the product 
	 * of the implicit object parameter and the explicit 
	 * parameter other. 
	 * @param other Fraction to multiply to this object
	 * @return product of both Fractions (Fraction)
	 */
	public Fraction times (Fraction other) {
		Fraction temp = new Fraction();
		temp.num = this.num * other.num;
		temp.den = this.den * other.den;
		return temp;
	}

	public Fraction plus (Fraction other){
		Fraction temp = new Fraction();
		
		temp.num =(this.num * other.den) + (other.num * this.den);
		temp.den = this.den * other.den;
		return temp;
	}
	
	public Fraction reduce (){
		for(int i = this.den; i > 0; i--){
			if(this.den % i == 0 && this.num % i == 0){
				this.num = this.num / i;
				this.den = this.den / i;
			}
		}
		
		return this;
	}
	
	
	public Fraction (String d){
		int x=0; 
		for (int i =0; d.length()>i;i++){
			if(d.charAt(i)=='.'){
				 x = d.indexOf(i);		
			}
		}
	int m = d.length()-x;
	int hund =1;
	for (int z = 1; m>=z;z++){
	  hund = hund*10;
	}
	double di = Double.parseDouble(d);
	int num = (int)di*hund;
	int den = 1*hund;
	
	this.num = num;
	this.den = den;
	}

	public Fraction() {
		// TODO Auto-generated constructor stub
	}
	
}

