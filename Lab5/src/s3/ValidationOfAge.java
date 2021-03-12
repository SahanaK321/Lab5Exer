package s3;

import java.util.Scanner;

public class ValidationOfAge 
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter age");
   	int n=sc.nextInt();
   	
   	try {
   		if(n>15)
   		{
   			System.out.println("Valid");
   		}
   		else {
   			throw new Exception("Invalid Age Exception");
   		}
   	} 
   	catch(Exception ex) 
   	{
   	 	System.out.println(ex); //raise exception
   	}
}
}