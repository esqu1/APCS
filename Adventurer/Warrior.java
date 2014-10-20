import java.util.Random;
public class Warrior extends Adventurer{
    private int rage;

    public Warrior(){
	super("Dennis");
	setHP(60);
	setRage(50);
	setSTR(14);
	setDEX(6);
	setINT(10);
    }
    
    public Warrior(String n){
	super(n);
	setHP(60);
	setRage(50);
	setSTR(14);
	setDEX(6);
	setINT(10);
    }

    public void setRage(int r){
	rage = r;
    }

    public int getRage(){
	return rage;
    }

    public String getStats(){
	return super.getStats() + getRage() + "RAGE ";
    }

    public int getSC(){
	return getRage();
    }
    
    public void attack(Adventurer other){
	Random r = new Random();
	int n = protect(r.nextInt(getSTR()),other);
	if(hit(other) || hit(other)){
	    System.out.println(this + " attacks " + other + " with a sword for " + n + " points of damage!!");
	    other.setHP(other.getHP() - n);
	}else{
	    System.out.println(this + " misses " + other + "!");
	}
    }

    public void specialAttack(Adventurer other){
	Random r = new Random();
	int n = protect(r.nextInt(getSTR() + 7),other);
	if(rage < 5){
	    System.out.println("Not enough rage. Using regular attack");
	    attack(other);
	}else{
	    if(hit(other)){
		System.out.println(this + " fiercely attacks " + other + " with a sword for " + n + " points of damage!!");
		other.setHP(other.getHP() - n);
		setRage(getRage() - 5);
	    }else{
		System.out.println(this + " misses " + other + "!");
		this.setRage(getRage() - 5);
	    }
	}
    }
}
