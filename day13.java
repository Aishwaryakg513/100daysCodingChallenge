/*
Get the input from the user for the value of n and then find the sum of first n natural numbers.

e.g. let the n value = 5
Sthen first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum
Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15
Input:4
Output:10*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0;
		for(int i=0;i<=n;i++)
		{
		    sum += i;
		}
		System.out.println(sum);
	}
}