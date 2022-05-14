import java.util.Scanner;


public class DynamicPoly {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
           Animal animal;
           System.out.println("WHAT ANIMAL DO YOU WANT?");
           System.out.println("1.DOG OR 2.CAT");
           int choice=scan.nextInt();
           
           if(choice ==1){
        	   animal=new Dog();
              animal.speak();}
           else
        	   if(choice ==2){
        		   animal = new Cat();
        		   animal.speak();
        	   }
        	   else
        	   {
        		   animal = new Animal();
        		   System.out.println("Invalid Choice!!");
        		   animal.speak();
        	   }
	}

}
