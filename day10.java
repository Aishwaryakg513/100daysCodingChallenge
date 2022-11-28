//Factorial of a number
Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.
/*Input
4
Output
24*/

import java.util.*;
public class Main
{
    public static int factorial(int n)
    {
        int product=1;
        while(n>1)
        {
            product *= n;
            n--;
        }
        return product;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
	}
}

public static int factorial(int n)
{
	int fact=1;
	for(int i=0;i<n;i++)
	{
	  fact = fact*i;
	}
  return fact;
}