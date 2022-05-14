import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ARRAY2D {

	public static void main(String[] args) {
		System.out.println("The List of Groceries is as follows!!!");
		ArrayList<ArrayList<String>> Grocery = new ArrayList<ArrayList<String>>();
		
		ArrayList <String> food = new ArrayList<String>();
		food.add("MANGOES");
		food.add("WHEAT FLOUR");
		food.add("SUGAR");
		food.add("TEA");
		food.add("PULSES");
		
		ArrayList <String> drink = new ArrayList<String>();
		drink.add("PEPSI");
		drink.add("COCA-COLA");
		drink.add("SPRITE");
		drink.add("MAAZA");
		
		Grocery.add(drink);
		Grocery.add(food);
		
	     for(int i=0;i<Grocery.size();i++){
	    	 System.out.println(Grocery.get(i));
	    	                             }

			 for(String i: drink){
				 System.out.println(i);
			 }
		
	}}
