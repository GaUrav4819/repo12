package Pattern;/*
0101010
1010101
0101010
1010101
0101010
1010101

*/

public class BinaryNumPr {
	public static void main(String[] args)
	{   
		  int count=1;
		for(int i=1;i<=7;i++)
		 {     
			   
			 for(int j=1;j<=7;j++)
			 {    
				 if(count==1) {
				 System.out.print(count );
				 count=0;;
				 }
				 else {
					 System.out.print(count );
                         count=1;
                         }
			 }
		      System.out.println();
     	}
  	}

}
