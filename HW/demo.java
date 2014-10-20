public class demo{
    public static void main(String[] args){
	coordinate p1;

	p1 = new coordinate();

	p1.changeX(5);
	p1.changeY(4);
	System.out.println(p1.getX());
	System.out.println(p1.getY());
	p1.setxy(4.5,6);
	System.out.println(p1.getX());
	System.out.println(p1.getY());
	System.out.println(p1.toString());
	
    }
}
