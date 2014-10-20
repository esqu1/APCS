public class Triangle{

    public static void tri(int height){
	int i = 0;
	String s = "";
	while(i < height){
	    s = s + "*";
	    System.out.println(s);
	    i++;
	}
    }
    public static void triBack(int height){
	int i = 0;
	String s = "";
	String t = "";
	while(i < height){
	    s += " ";
	    i++;
	}
	i = 0;
	while(i < height){
	    s = s.substring(0, s.length() - 1);
	    t += "*";
	    System.out.println(s + t);
	    i++;
	}
    }

    public static void main(String[] args){
	tri(3);
	tri(4);
	tri(5);
	triBack(3);
	triBack(4);
	triBack(5);
    }
}
