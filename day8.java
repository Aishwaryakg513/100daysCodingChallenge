//Quadratic equations finding roots
Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.

Input
Enter the value of a, b and c : 1 -6 9
Output
Roots are equal
Root 1= root 2 = 3.00*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double a,b,c;
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    
	    double d= Math.sqrt(b*b-4*a*c);
	    double root1,root2;
	    root1 = (-b+d)/(2*a);
	    root2 = (-b-d)/(2*a);
	    
	    if(root1==root2)
	    {
	        System.out.println("Roots are equal");
	       System.out.println(root1+" "+root2); 
	    }
	    
	}
}

double d = Math.pow(b,2) - 4*a*c;
 if(d > 0){
 System.out.println("There are two real roots");
 System.out.println("Roots are " + (-b+Math.sqrt(d))/(2*a) + " and " + (-b-Math.sqrt(d))/(2*a));
 }
 else if (d == 0){
 System.out.println("Roots are equal");
 System.out.println("Roots are " + -b/(2*a));
 }
 else{
 System.out.println("No real roots");
 System.out.println("Roots are " + -b/(2*a) + "+i" + 
 Math.sqrt(-d)/(2*a) + " and "
 + -b/(2*a) + "-i" + Math.sqrt(-d)/(2*a))

