package studio1;
import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		Scanner sc = new Scanner(System.in);
		
		//variables 
		int n1;
		int n2; 
		
		//get input
		System.out.println("The first of two interegers to be avereaged????");
		n1 = sc.nextInt();
		System.out.println("The second of two interegers to be avereaged????");
		n2 = sc.nextInt();
		
		//define and get avrg
		double averageNums = ((n1 + n2)/2.0);
		
		//print avrg
		System.out.println("The exact and very precise average of the two numerical symbols you entered are: " + averageNums);

		
		
		
		

	}

}
