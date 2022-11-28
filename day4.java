/*Get an input number from the user and check whether it is a positive or negative number.

Input : -10
Output : Negative number

Input :0
Output : Neither positive nor negative

Input :15
Output : Positive number*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n==0)
		{
		    System.out.println("Neither positive or negative");
		}
		else if(n<0)
		{
		    System.out.println("Negatiive Number");
		}
		else{
		    System.out.println("Positive Number");
		}
		
	}
}