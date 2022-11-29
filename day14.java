/*Get an input from the user and the print the reverse of the given number as the output
E.g. let the number be 324 then the reverse of the number is 423
Input
675
Output
576*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int r=0,rev=0;
		
		while(n>0)
		{
		    r=n%10;
		    rev = rev*10+r;
		    n=n/10;
		}
		System.out.println(rev);
	}
}