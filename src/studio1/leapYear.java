package studio1;
import java.util.Scanner;


public class leapYear 
{

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("could you please please enter a year for me: ");
		int year = sc.nextInt();
		
		//define and determine if it is a leap
		boolean isLeap = false;

		isLeap= ((year % 4 == 0 ) && (year % 100 != 0)) || (year % 400 == 0);
		
		
		
		//print out 
		System.out.println(year + " is a leap year: " + isLeap);

		
		/*Creative exercise - ice cream
		 * int
		 * boolean
		 * int
		 * double
		 * string
		 * string
		 * double
		 */
				


	}

}
