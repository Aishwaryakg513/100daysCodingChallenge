/*Get a number as input from the user and check whether the given number is odd or even

Input
10
Output
Even

Input
5
Output
Odd*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0)
		{
		    System.out.println("Even number");
		}
		else{
		    System.out.println("Odd number");
		}
	}
}