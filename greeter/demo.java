public class demo{
    public static void main(String[] args){ 
	greeter bob, amy;
	bob = new greeter();
	amy = new greeter("Hola!");
	bob.greet();
	bob.greetFormal();
	amy.greet();
	amy.greetFormal();
	
    }
}
