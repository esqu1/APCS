import java.util.Random;
public class Rand{
    public static void main(String[] args){
	//Random rand = new Random();
	//int randomNum = rand.nextInt(5);
	Random ran = new Random();
	int x = ran.nextInt(6) + 5;
	System.out.println(x);
    }
}
