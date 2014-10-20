public class greeter{
    // instance variables
    private String greeting;

    // constructor - a method that initializes the state
    // of an object.
    public greeter(){
	greeting = "Hello";
	
    }

    public greeter(String s){
	greeting = s;
    }

    // other methods
    public void greet(){
	System.out.println(greeting);
    }
    public void greetCasual(){
	System.out.println("Sup dawg");
    }
    public void greetFormal(){
	System.out.println("Good day sir!");
    }
}
