package BitManipulation;

import java.util.Scanner;

public class OddEven {
static boolean isEven(int n)
{
	  if((n^1)==(n+1))//   Xor Operator   1  xor 1= 0     0  xor 0=0     1 xor 0=1  0   xor 1=1  
		    return true;
	  else
		    return false;
}
public static void main(String [] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to find out it is Odd or Even");
	            int n=sc.nextInt();
	System.out.println(isEven(n)== true ? "Number is Even"  :  "Number is Odd");
    }
}
