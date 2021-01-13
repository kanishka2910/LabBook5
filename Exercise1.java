import java.util.Scanner;
import com.cg.eis.exception.*;
public class Exercise1 {
	 
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter age ");
	  int age = sc.nextInt();
	  
	  try {
	   if(age < 18) 
	    throw new InvalidAgeException("Invalid age");
	   
	   else
	    System.out.println("Valid age");
	   
	  }
	  catch (InvalidAgeException a) {
	   System.out.println(a.getMessage());
	  }
	 }
}