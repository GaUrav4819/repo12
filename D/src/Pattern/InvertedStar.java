package Pattern;
/*
 * *  *  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  
*  *  *  *  *  *  
*  *  *  *  *  
*  *  *  *  
*  *  *  
*  *  
*  
 * */
public class InvertedStar {
	public static void main(String[] args)
	{
		 for(int i=10;i>=1;i--)
		 {
			 for(int j=i;j>=1;j--)
			 {
				 System.out.print("*  ");
			 }
		      System.out.println();
      	}
	}

}
