//sum of the digits
/*Get a number from user and then find the sum of the digits in the given number
E.g. let the number = 341
Sum of digits is 3+4+1= 8
Input
4521
Output
12 */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n>0)
		{
		    int r=n%10;
		    n=n/10;
		    sum += r;
		}
		System.out.println(sum);
	}
}