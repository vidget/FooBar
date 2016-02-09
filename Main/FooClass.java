package Main;

public class FooClass {
	
	//Three methods that return the proper string.
	
	public String divisibleThree(int number){
		String result="";
		
		if(number%3==0){
			result = "foo";
		}
		else
		{
			result = Integer.toString(number);
		}
		return result; 
	}
	
	
	public String divisibleFive(int number){
		String result="";
		
		if(number%5==0){
			result = "bar";
		}
		else
		{
			result = Integer.toString(number);
		}
		return result; 
	}
	
	public String divisibleFifteen(int number){
		String result="";
		
		if(number%15==0){
			result = "foobar";
		}else
		{
			result = Integer.toString(number);
		}
		return result; 
	}

}
