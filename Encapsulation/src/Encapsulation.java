
public class Encapsulation {

	public static void main(String[] args) {
		Person p1= new Person("Piyush",20,"Doctor");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getJob());
		System.out.println();
		
		p1.setName("Harry");
		p1.setAge(38);
		p1.setJob("Auror");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getJob());
		System.out.println();
	}

}
