package Pattern;
/*A 
B C 
D E F 
G H I J 
K L M N O 
22 * */
public class SimpleChar {
	public static void main(String[] args)
	{   
		  char count='A';
		for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(count++ +" " );
			 }
		      System.out.println();
     	}
  	}
	

}
