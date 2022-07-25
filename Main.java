import java.util.Scanner;


public class Main {
	
	/* Method to Print Pattern */
	static void Print(int num) {
		for(int i = num ; i>=1; i--) {
			
			for(int j=i ; j<num;j++) {
				System.out.print(" ");
			} 
		
		for(int j=1; j<= (2 * i-1); j++) {
			System.out.print("*");
		}	
			
		System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number till Pattern to be Printed : ");
		int num = s.nextInt();
		Print(num);
		
		s.close();
	}

}
