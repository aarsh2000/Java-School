0
public class Lock {
	private int key;
	private boolean open;
	private int failAttempt;
	
	private int NUM_DIGIT = 6;
	private int MAX_FAIL_ATTEMPT = 3;
	private int universalKey = 123456;
	
	
	
	public Lock(){
		this.key=universalKey;
		this.open=true;
		this.failAttempt=0;
		
	}

    public Lock(int key){
    	if(String.valueOf(key).length()!=NUM_DIGIT){
	   		 System.out.println("Invalid key!");
	   		 
	   		}
    	else{
    	this.key=key;
    	this.open=true;
    	this.failAttempt=0;
    	}
    }
    
    public Lock(Lock Other){
    	Other.key=this.key;
    	Other.open=this.open;
    	Other.failAttempt = this.failAttempt;
    }

	



	public void setKey(int key) {
		
		this.key = key;
		
	}

    public void close(){
    	this.open=false;
    }
    
    public boolean isOpen(){
    	if(this.open==true){
    		return true;
    	}
    	else{
    		return false;
    	   	}
    }
    
    public boolean open(int trial){
    	if(this.failAttempt>MAX_FAIL_ATTEMPT){
    		System.out.println("Max # of fails");
    		if(trial==universalKey){    	
        		this.failAttempt=0;
        		return true;
        	}
    		else{
    		return false;
    		}
    	}
    	else{
    		if(trial==universalKey||trial == this.key){
    		return true;
    		}
    		else{
    		this.failAttempt++;
    		System.out.println("ALARM");
    		return false;
    		}    		
    	}
    }
    
    public boolean equals(Lock Other){
    	if(this.key==Other.key){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
    public String toString(){
    	
    	if(this.open==true){
    		return "open";
    	}
    	else{
    		return "close";
    	}
    }

}