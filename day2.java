/*Program to say whether the given character is alphabet or not
Input : A
Output:  Alphabet

Input: 7
Output: Not an alphabet*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alpha = sc.next().charAt(0);
		
		if((alpha>='A' && alpha<='Z') || (alpha >='a' && alpha <='z' ))
		{
		    System.out.println("Is a alphabet");
		}
		else 
		{
		    System.out.println("not a alphabet");
		}
	}
}