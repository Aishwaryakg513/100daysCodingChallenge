/*Take an input character from the user and check whether the given input is a vowel or consonant.
Input       Output
A           Vowel
Input       Output
m	      Consonant
Input 	Output
3	      Invalid Input*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char literal = sc.next().charAt(0);
		
		if((literal>='A' && literal<='Z') || (literal >='a' && literal <='z' ))
		{
		    if(literal == 'a' || literal=='A' || literal== 'e'||literal=='E'||literal=='i'||literal=='I'||literal=='o'||literal=='O'||literal=='u'||literal=='U')
		    {
		        System.out.println("Vowel");
		    }
		    else
		    {
		        System.out.println("Consonant");
		    }
		}
		else
		{
		    System.out.println("invalid input");
		}
	}
}
