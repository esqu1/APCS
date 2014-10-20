public class BankAccount{
    private double balance;
    private int account, pin;
    private String username, password;

    // constructor methods
    public BankAccount(){
	account = 999999999;
	pin = 9999;
    }
    
    public BankAccount(double balance, int account, int pin, String username, String password){
	setBalance(balance);
	setAccount(account);
	setPin(pin);
	setUsername(username);
	setPassword(password);
    }

    // set methods
    public void setBalance(double x){
	balance = x;
    }

    public void setAccount(int x){
	if(x >= 100000000 && x <= 999999998){
	    acccount = x;
	}else{
	    account = 999999999;
	    System.out.println("You have entered an invalid account number. Your account number will be set to 999999999.");
    }

    public void setPin(int x){
	pin = x;
    }

    public void setUsername(String s){
	username = s;
    }

    public void setPassword(String s){
	password = s;
    }

    // print all instance variables
    public void printAll(){
	System.out.println(balance);
	System.out.println(account);
	System.out.println(pin);
	System.out.println(username);
	System.out.println(password);
    }

    // deposit and withdraw
    public boolean deposit(double amount){
	if(amount > 0){
	    balance += amount;
	    return true;
	}
	return false;
    }

    public boolean withdraw(double amount){
	if(amount <= balance && amount > 0){
	    balance -= amount;
	    return true;
	}else{
	    System.out.println("You are trying to withdraw too much money.");
	}
	return false;
	
    }

    // check for username and password
    public boolean authenticate(String user, String pass){
	return user.equals(username) && pass.equals(password);
    }

    // converts BankAccount into string representation
    public String toString(){
	return username + "    " + account + "    " + balance;
    }

    // main
    public static void main(String[] args){
	BankAccount bob;
	bob = new BankAccount(24.56,12345,1234,"bobby","hello");
	bob.printAll();
	bob.setBalance(24);
	bob.printAll();

	bob.deposit(23);
	bob.printAll();

	System.out.println(bob.withdraw(24));
	System.out.println(bob.balance);
	System.out.println(bob.withdraw(10000));

	System.out.println("");
	System.out.println(bob);

	System.out.println(bob.authenticate("bobby","hello"));
    }
}
