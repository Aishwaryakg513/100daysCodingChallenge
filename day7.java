/*Get the number of month and year as input from the user and check the number of days present in that month.

Input
Enter month : 2
Enter year : 2000

Output
29*/

import java.util.*;
public class Main
{
    
    public static boolean isLeap(int year)
    {
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int month;
		int year;
		System.out.print("Enter the month: ");
		month = sc.nextInt();
		System.out.print("Enter the year: ");
		year = sc.nextInt();
		
		switch(month)
		{
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		   case 10:
		   case 12: System.out.println("31");
		            break;
		    case 4:
		    case 6:
		    case 9:
		   case 11:  System.out.println("30");
		             break;
		    case 2: if(isLeap(year))
		            {
		                System.out.println("29");
		            }
		            else{
		                System.out.println("28");
		            }
		            break;
		   default:System.out.println("Invalid month");
		           break;
		}
	}
}
