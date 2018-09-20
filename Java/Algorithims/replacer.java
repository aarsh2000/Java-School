
public class replacer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(replaceX("XabX"));
	}
	
	public static String replaceX(String s){

		if(s.length()==0){
			return s;
		}
		 return replaceX(s.substring(1))+s.charAt(0);
	}


}
