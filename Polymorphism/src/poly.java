
public class poly {

	public static void main(String[] args) {
		car c= new car();
		bus b= new bus();
		
		vehicle []racers={c,b};
		
		for(vehicle x: racers){
			x.go();
		}

	}

}
