package Main;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner scannerConsole = new Scanner(System.in);
		int repeat=1;
		int userNumber=0;
		
		//loops while(repeat==1)
		do{
		//Used a try-catch block to check if INT is used, if not program EXITS	
			try
			{
			  System.out.println("Please input an integer");
			  userNumber=scannerConsole.nextInt();
			  				
			  //instantiates an object of FooClass			
			  FooClass checkFoo = new FooClass();
				
				/*
			 	I used if statements with a Modulus operator to check 15 first
			 	and trickle down into 'else if' with the remaining numbers
				the last else statement prints the original number
				*/
				
			  if(userNumber%15==0){
					String result = checkFoo.divisibleFifteen(userNumber);
					System.out.println(result);
				}
				else if(userNumber%5==0){
					String result = checkFoo.divisibleFive(userNumber);
					System.out.println(result);
				}
				else if(userNumber%3==0){
					String result = checkFoo.divisibleThree(userNumber);
					System.out.println(result);
				}
				else
				{//Could run any of the three methods here, just need the number returned.
					String result = checkFoo.divisibleThree(userNumber);
					System.out.println(result + " isn't divisible by 3,5 or 15");	
				}
					
			  System.out.println("Press 1 to contine or other number to QUIT");
							
			  repeat=scannerConsole.nextInt();
					  
			}
			catch(InputMismatchException exception)
			{
			 
			  //when user put other than integer
			  System.out.println("This is NOT an integer");
			  //exits the program setting 'repeat' to 0
			  repeat=0;
			}
					
		}while(repeat==1);
				
		System.out.println("Goodbye");
		scannerConsole.close();
	}

}
