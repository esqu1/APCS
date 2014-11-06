public class Driver{

    public static void main(String[] args){
	SuperArray L = new SuperArray(4);
	Integer x = new Integer(5);
	System.out.println(L);
	L.add(x);
	System.out.println(L);
	L.add(new Integer(99));
	System.out.println(L);
	L.set(4,new Integer(78));
	System.out.println(L);
	L.set(2,new String("Hello"));
	System.out.println(L);
	System.out.println(L.get(2) + " is located at index " + 2);
	L.clear();
	System.out.println(L);
	
    }

}
