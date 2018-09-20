
public class Person {
	protected String name;
	protected char gender;
	
	public Person(String n, char g){
		this.name = n;
		this.gender = g;
	}
	
	public String toString(){
		String s ="Name: "+ this.name + "\n";
		s+= "Gender: "+this.gender+"\n";
		return s;
	}

}
