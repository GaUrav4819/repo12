package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;
import java.util.*;
public class Sbi  extends Account implements Rbi {
	Scanner sc=new Scanner( System.in);
	Account ac=new Account();
	Random rn=new Random();
	/*public int randomNumber()
	{
	Random rn=new Random();
	int num=rn.nextInt();
	return num;
	}*/
	public void createAccount()
	{
		
	System.out.println("Create An Account");
	System.out.println("Enter Name of Person");
	String  name=sc.next();
	ac.setName(name);//1
	System.out.println("Enter Aadhar Number");
	String adharNo=sc.next();
	  if (adharNo.length()==12)    //VALIDATION
		  ac.setAdharNo(adharNo);
	  else
		  	  System.out.println("Invalid Adhar Number");//2;
	System.out.println("Enter Gender of Person ");
           String gender=sc.next();
	if (gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female"))   //  3   if (gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")) 
			{
	  ac.setGender(gender);//3
			}
	else 
		System.out.println("Invalid Gender Input");
	System.out.println("Enter Age of Person");
	int age=sc.nextInt();
	if(age<18 ||age >100)  // VALIDATION 
	{
		System.out.println("AGE is not valid");
	}
	else
	ac.setAge(age);//4
	System.out.println("Enter Mobile Number");
	String mobNo=sc.next();
	if (mobNo.length()==10)
			ac.setMobNo(mobNo);  //5;
	else
		System.out.println("Enter Mobile No is Invalid ");
	
	System.out.println("Enter  Opening Balance ");
	double balance=sc.nextDouble();
	ac.setBalance(balance);//6
	System.out.println(" Enter  Account Number" );
	long accNo=sc.nextLong();
	//slong accNo=randomNumber();   // account number can be generated from random number function also
	ac.setAccNo(accNo);//7
	}
	public void displayAllDetails()
	{
		System.out.println("Detail of Account Holder--->");
		System.out.println(" Name   --"+ac.getName());
		System.out.println(" Aadhar Number--"+ac.getAdharNo());
		System.out.println(" Gender --"+ac.getGender());
		System.out.println(" Age --"+ac.getAge());
		System.out.println(" Mobile Number--"+ac.getMobNo());
		System.out.println("  Balance-- "+ac.getBalance());
		System.out.println("  Account Number--"+ac.getAccNo());
		
	}
	public void depositeMoney()
	{
		System.out.println("Enter Amount To be Deposite");
		int a =sc.nextInt();
		int b=(int) ac.getBalance()+a;
		ac.setBalance(b);
		System.out.println("  Deposit of   "+a+"      Takes Place. Total Available Balance   "+ac.getBalance());
	}
	public void withdrawal()
	{   
		System.out.println("Enter Account Number ");
	          if(ac.getAccNo()!=sc.nextInt())
	          {
	        	  System.out.println("Invalid Account Number");
	          }
	          else  
	          {
		 System.out.println("Enter Amount To be Withdraw  ");
		  int c=sc.nextInt();
		if(ac.getBalance()<=500)
		{
			System.out.println("Insufficient Balance ");
		
		}
	 	else {    
	 		System.out.println( c+"   Withdraw from   "+  ac.getBalance());
	 		int d=(int) ac.getBalance()-c;
	 		ac.setBalance(d);
	 		System.out.println("  Total Avilable Balance Is  "+ac.getBalance());
	 	}
	 	
	 	}
	}
	public void balanceCheck()
	{
		    int otp= rn.nextInt(0,9999);
				System.out.println(otp);
				System.out.println("Enter Account Number and OTP");
				if(sc.nextInt()==ac.getAccNo() && sc.nextInt()==otp)
       {
		System.out.println("  Balance in Account is --"+ac.getBalance());
         }
		else 
			System.out.println("   Invalid Account Number or OTP ");
	}
}
