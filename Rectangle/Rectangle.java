public class Rectangle{  
    public static void rect(int h, int w){
	int i = 0;
	String s = "";
	while(i < w){
	    s += "*";
	    i++;
	}
	i = 0;
	while(i < h){
	    System.out.println(s);
	    i++;
	}
    }

    public static void main(String[] args){
	rect(3,2);
	rect(0,4);
	rect(10,9);
    }   
}
