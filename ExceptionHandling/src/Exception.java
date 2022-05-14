import java.util.*;
public class Exception {
     public static void main(String args[]){
    	 Scanner scan = new Scanner(System.in);
    	  try{
    		  System.out.println("THIS PROGRAM DIVIDES TWO WHOLE NUMBERS!!");
    		  int x,y,z=0;
    		  System.out.println("ENTER THE NUMBER TO DIVIDE :");
    		  x = scan.nextInt();
    		  System.out.println("ENTER THE NUMBER TO DIVIDE BY : ");
    		  y= scan.nextInt();
    		  
    		  z=x/y;
    		  System.out.println("THE RESULT OF DIVISON IS: "+ z);
    		  
    	  }
    	  
    	  catch(ArithmeticException e){
    		  System.out.println("THE DIVISON IS NOT POSSIBLE");
    	  }
    	  
    	  catch(InputMismatchException e){
    		  System.out.println("ENTER PROPER WHOLE NUMBERS ONLY!!");
    	  }
    	  
    	  
    	  finally{
    		  scan.close();
    	  }
    	  
    	  
    	 
    	 
     }
}
