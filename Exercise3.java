import java.util.Scanner;

import com.cg.eis.exception.*;
public class Exercise3 {
	 
	 public static void main(String[] args) throws EmployeeException {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter salary ");
	  int salary = sc.nextInt();
	  
	  try {
	   if(salary < 3000) 
	    throw new EmployeeException("salary less than 3000");
	   else
	    System.out.println("salary:"+salary);
	  }
	  catch (EmployeeException a) {
	   System.out.println(a.getMessage());
	  }
	 }
}