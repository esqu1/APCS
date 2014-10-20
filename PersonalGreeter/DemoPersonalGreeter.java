public class DemoPersonalGreeter{
    public static void main(String[] args){
	PersonalGreeter Bob, Mary, Steve;

	// initializing the three different PersonalGreeters
	Bob = new PersonalGreeter();
	Mary = new PersonalGreeter("Mary");
	Steve = new PersonalGreeter("Steve", "What's good, my buddy");

	// testing get
	System.out.println(Bob.getName());
	System.out.println(Bob.getGreeting());
	System.out.println(Mary.getName());
	System.out.println(Mary.getGreeting());
	System.out.println(Steve.getName());
	System.out.println(Steve.getGreeting());

	// testing set
	Bob.setName("Brian");
	Bob.setGreeting("NiuNiu");

	System.out.println(Bob.getName());
	System.out.println(Bob.getGreeting());

	// testing greet
	System.out.println(Bob.greet());
	System.out.println(Mary.greet());
	System.out.println(Steve.greet());
    }

}
