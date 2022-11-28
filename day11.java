//fibonacci series
/*Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.
Input
5
Output
0,1,1,2,3

Input
8
Output
0,1,1,2,3,5,8,13*\

import java.util.*;
public class Main
{
    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(fib(i));
	    }
	}
}
