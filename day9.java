//Count the number of digits

/*Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.
Input
Enter the value of a, b and c : 1 -6 9
Output
Roots are equal
Root 1= root 2 = 3.00 */


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		
		int count=0;
		while(num>0)
		{
		    count++;
		    num=num/10;
		}
		System.out.println(count);
	}
}