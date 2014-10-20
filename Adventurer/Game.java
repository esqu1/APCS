import java.util.Random;
import java.util.Scanner;
public class Game{
    public static void main(String[] args){
	// initialize the players
	Adventurer player = new Adventurer();
	Adventurer opponent = new Adventurer();
	
	Random r = new Random();
	Scanner s = new Scanner(System.in);

	// ask for name and class
	System.out.println("Welcome! What will be your adventurer's name?");
	String name = s.nextLine();
	System.out.println("Welcome, " + name + "! Choose a class:\nA : Warrior\nB : Wizard\nC : Rogue\n");
	String choice = s.nextLine();
	while(! choice.equals("A") && ! choice.equals("B") && ! choice.equals("C")){ // if they enter something invalid
	    System.out.println("Invalid response received. Please try again.");
	    choice = s.nextLine();
	}
	if(choice.equals("A")){
	    player = new Warrior(name);
	    System.out.println("You chose Warrior!");
	}else if(choice.equals("B")){
	    player = new Wizard(name);
	    if(name.equals("Harry")){
		System.out.println("Yer a Wizard, " + name + "!");
	    }else{
		System.out.println("You chose Wizard!");
	    }
	}else if(choice.equals("C")){
	    player = new Rogue(name);
	    System.out.println("You chose Rogue!");
	}

	// create the opponent class randomly
	int oppChoice = r.nextInt(4) + 1;
	if(oppChoice == 1){
	    opponent = new Warrior();
	    System.out.println("Your opponent is a Warrior!");
	}else if(oppChoice == 2){
	    opponent = new Wizard();
	    System.out.println("Your opponent is a Wizard!");
	}else if(oppChoice == 3){
	    opponent = new Rogue();
	    System.out.println("Your opponent is a Rogue!");
	}else{
	    System.out.println("Your opponent is an Adventurer!");
	}

	System.out.println("\nYou will first need to stock yourself.");
	System.out.println("Now you shall face against the fierce opponent, " + opponent.getName() + ".");
	System.out.println("We need to decide who goes first. Allow me to randomly pick with a coin...\n.\n.\n.");
	
	int n = r.nextInt(2) + 1;
	int decision = 0;
	if(n == 1){
	    System.out.println("You go first!");
	}else{
	    System.out.println("Opponent goes first!");
	}
	boolean endmatch = true;
	String loser = "nobody";
        System.out.println("\n********** GAME BEGINS **********\n");
	

	if(n == 1){
	    System.out.println("********** YOUR TURN **********\n");
	    System.out.println("Current stats:\n" + player.getStats() + "\n" + opponent.getStats() + "\n");
	    System.out.println("Choose an action:\nA : attack\nS : special attack\nG : give up");
	    String act = s.nextLine();	    
	
	    while(! act.equals("A") && ! act.equals("S") && ! act.equals("G")){
		System.out.println("Invalid response received. Please try again.");
		act = s.nextLine();
	    }
	    if(act.equals("A")){
		player.attack(opponent);
	    }else if(act.equals("S")){
		player.specialAttack(opponent);
	    }else if(act.equals("G")){
		endmatch = false;
		loser = "player";
	    }
	    if(opponent.getHP() < 1){
		endmatch = false;
		loser = "opponent";
	    }
	}
	String act2 = "";
	while(endmatch){
	    System.out.println("********** OPPONENT'S TURN **********\n");
	    if(n == 2){
		System.out.println("Current stats:\n" + player.getStats() + "\n" + opponent.getStats() + "\n");
	    }
	    double chance = r.nextDouble();
	    if(chance < 0.6){
		opponent.attack(player);
	    }else{
		if(oppChoice != 4 && opponent.getSC() > 5){
		    opponent.specialAttack(player);
		}else{
		    opponent.attack(player);
		} 
	    }
	    if(player.getHP() < 1){
		endmatch = false;
		loser = "player";
		break;
	    }
	    System.out.println("********** YOUR TURN **********\n");
	    if(n==1){
		System.out.println("Current stats:\n" + player.getStats() + "\n" + opponent.getStats() + "\n");
	    }
	    System.out.println("Choose an action:\nA : attack\nS : special attack\nG : give up");
	    act2 = s.nextLine();	    
	    
	    while(! act2.equals("A") && ! act2.equals("S") && ! act2.equals("G")){
		System.out.println("Invalid response received. Please try again.");
		act2 = s.nextLine();
	    }
	    if(act2.equals("A")){
		player.attack(opponent);
	    }else if(act2.equals("S")){
		player.specialAttack(opponent);
	    }else if(act2.equals("G")){
		endmatch = false;
		loser = "player";
	    }
	    if(opponent.getHP() < 1){
		endmatch = false;
		loser = "opponent";
		break;
	    }
      	}
	if(loser.equals("player")){
	    System.out.println(name + " has lost!\n" + "Malevolence has won!!");
	}else if(loser.equals("opponent")){
	    System.out.println("Malevolence has lost!\n" + name + " has won!!");
	}
    }
	
}
    

