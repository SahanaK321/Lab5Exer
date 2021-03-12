
package s3;
import java.util.Scanner;	
public class NameValidation {
	
	public boolean checkName(String firstName,String lastName) throws NameException{
		
		boolean status=false;
		if(firstName.length()==0 || lastName.length()==0)
		{
			status=false;
			throw new NameException();
		}
		else
		{
			System.out.println("Name Validated");
			status=true;
		}
		return status;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name");
		
		String lastName=sc.nextLine();
		boolean status=false;
		NameValidation obj=new NameValidation();
		try {
			status=obj.checkName(firstName, lastName);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		if(status) {
			System.out.println("valid");
		}
		
	}
}





