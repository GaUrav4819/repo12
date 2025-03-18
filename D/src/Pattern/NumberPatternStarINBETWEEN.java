package Pattern;/*
*4321
5*321
54*21
543*1
5432*

*/

public class NumberPatternStarINBETWEEN {
	public static void main(String[] args)
	{
		 for(int i=5;i>=1;i--)
		 {
			 for(int j=5;j>=1;j--)
			 {
				 if(i==j)
				 System.out.print("*");
				 else
				 {System.out.print(j);}
			 }
		      System.out.println();
      	}
	}
}
