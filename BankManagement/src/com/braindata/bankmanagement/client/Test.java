package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;
import com.braindata.bankmanagement.model.Account;
import java.util.*;

public class Test {
	public static void main(String[] args)
	{
	   Rbi bank=new Sbi();

	
	System.out.println(" \n Enter your choice  \n"
			       + "   1  for Create an Account \n"+"   2 for Dispaly Account Detail  \n "+"  3  for Deposite Money  \n "+"  4 for Withdraw money  \n");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	while(n!=0)
	{
	//Display proper msg for calling methods.
	//As per user choice perform bank operation using switch case
	switch(n)
	       {
	case 1:
		bank.createAccount();
		break;
	case 2:
		//bank.createAccount();
		bank.displayAllDetails();
	  	break;
	  case 3:
		//bank.createAccount();
		//bank.displayAllDetails();
		
		bank.depositeMoney();
	  break ;
	   case 4:
		//bank.createAccount();
		//bank.displayAllDetails();
		
		  bank.withdrawal();
	      	break;
	   case 5:
		   bank.balanceCheck();
		   break;
	      	default:
		              System.out.println("Please Enter valid Input");
	       }
	     System.out.println("  Want to continue ");
	     int t=sc.nextInt();
	      n=t;
	      }      //end of while
    }
}

