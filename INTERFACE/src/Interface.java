
public class Interface {

	public static void main(String[] args) {
		
		Rabbit rab= new Rabbit();
		rab.flee();
		System.out.println();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		System.out.println();
		
		Fish fish = new Fish();
		fish.hunt();
		System.out.println();
		fish.flee();
		
	}

}
