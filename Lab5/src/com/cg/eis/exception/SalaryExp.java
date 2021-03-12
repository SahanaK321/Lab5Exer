package com.cg.eis.exception;
import java.util.Scanner;	
public class SalaryExp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		int n=sc.nextInt();
		
		try {
			if(n>3000) {
				System.out.println("valid");
			}
			else {
				throw new EmployeeException();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
			
		

	


