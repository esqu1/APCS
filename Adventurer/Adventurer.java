import java.util.Random;
public abstract class Adventurer{
    private String name;
    private int HP, STR, DEX, INT;

    public Adventurer(){
	setName("Bob");
	setHP(50);
	setSTR(10);
	setDEX(10);
	setINT(10);
    }
    
    public Adventurer(String n){
	setName(n);
	setHP(50);
	setSTR(10);
	setDEX(10);
	setINT(10);
    }
    
    public void setName(String n){
	name = n;
    }

    public void setHP(int health){
	HP = health;
    }

    public void setSTR(int strength){
	STR = strength;
    }

    public void setDEX(int dexterity){
	DEX = dexterity;
    }

    public void setINT(int integrity){
	INT = integrity;
    }

    public String getStats(){
	return name + "\n" + getHP() + "HP " + getSTR() + "STR " + getDEX() + "DEX " + getINT() + "INT ";
    }
    
    
    public String getName(){
	return name;
    }

    public int getSC(){
	return 1234567890;
    }
    
    public int getHP(){
	return HP;
    }

    public int getSTR(){
	return STR;
    }

    public int getDEX(){
	return DEX;
    }
    
    public int getINT(){
	return INT;
    }
    
    public String toString(){
	return getName();
    }

    public int protect(int n, Adventurer other){
	return n / ((other.getINT() / 8) + 1);
    }
    
    public boolean hit(Adventurer other){
	int m = (int)((this.getDEX() - other.getDEX()) * 1.25) + 50;
	Random rand = new Random();
	int n = rand.nextInt(100);
	return n < m;
    }

    public abstract void attack(Adventurer other);
	/*
	Random r = new Random();
	int n = protect(r.nextInt(getSTR()),other);
	if(hit(other) || hit(other)){
	    System.out.println(this + " attacks " + other + " for " + n + " points of damage!!");
	    other.setHP(other.getHP() - n);
	}else{
	    System.out.println(this + " misses " + other + "!");
	}
	*/
    

    public abstract void specialAttack(Adventurer other);
	/*
	Random r = new Random();
	int n = protect(r.nextInt(getSTR() + 4),other);
	if(hit(other)){
	    System.out.println(this + " fiercely attacks " + other + " for " + n + " points of damage!!");
	    other.setHP(other.getHP() - n);
	}else{
	    System.out.println(this + " misses " + other + "!");
	}
	*/
    

    
}
