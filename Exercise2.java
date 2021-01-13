import java.util.Scanner;

import com.cg.eis.exception.*;
public class Exercise2 {
	public static void main(String[]args) throws InvalidNameException
	{
		String fname;
		String lname;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first name");
		fname=sc.nextLine();
		System.out.println("Enter last name");
		lname=sc.nextLine();
		try {
			   if(fname.length()==0||lname.length()==0) 
			    throw new InvalidAgeException("Invalid name");
			   else
			    System.out.println("name:"+fname+" "+lname);
			  }
			  catch (InvalidAgeException a) {
			   System.out.println(a.getMessage());
			  }
	
			 }
	
	}


