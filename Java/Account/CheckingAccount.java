
class CheckingAccount {

	int accountNum;
	String accountHolder;
	private double curBalance;
	
	public CheckingAccount(){
		this.accountNum=0;
		this.accountHolder = "null";
		this.curBalance = 0;
		}
	
	public CheckingAccount(int accountNum, String accountHolder, double curBalance){
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.curBalance = curBalance;
		
	}
	
	public CheckingAccount(CheckingAccount Other){
		Other.accountNum = this.accountNum;
		Other.accountHolder = this.accountHolder;
		Other.curBalance = this.curBalance;
		}
	

/**
 * @return the curBalance
 */
public double getCurBalance() {
	return curBalance;
}
/**
 * @param curBalance the curBalance to set
 */
public void setCurBalance(double curBalance) {
	this.curBalance = curBalance;
}
   

public void deposit(double add){
	this.curBalance+=add;
}

public void  proccessCheck(double check){
	if(this.curBalance<1000){
		this.curBalance -=0.15;
	}
	this.curBalance-=check;
}

public boolean overDraft(){
	if(curBalance<0){
		return true;
	}
	return false;
}
   
public boolean equals(CheckingAccount Other){
	if(this.accountNum==Other.accountNum){
		return true;
	}
	return false;
}

public String toString(CheckingAccount Other){
String a= ("Account Number: ");
String b = ("Name of Account: ");
String c = ("Currenct Balance: ");
	return (a+ this.accountNum + "\n" + b+ this.accountHolder+"\n"+c+this.curBalance );
}
}
