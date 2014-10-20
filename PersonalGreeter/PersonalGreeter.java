public class PersonalGreeter{
    private String name, greeting;

    // constructors
    public PersonalGreeter(){
	setName("Bob");
	setGreeting("Hello");
    }

    public PersonalGreeter(String name){
	setName(name);
	setGreeting("Hello");
    }

    public PersonalGreeter(String name, String greeting){
	setName(name);
	setGreeting(greeting);
    }

    // get methods
    public String getName(){
	return name;
    }

    public String getGreeting(){
	return greeting;
    }

    // set methods
    public void setName(String name){
	this.name = name;
    }

    public void setGreeting(String greeting){
	this.greeting = greeting;
    }

    // greet method
    public String greet(){
	return getGreeting() + " " + getName();
    }
}
