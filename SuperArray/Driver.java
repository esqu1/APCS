public class Driver{

    public static void main(String[] args){
	SuperArray L = new SuperArray(4);
	Integer x = new Integer(5);
	System.out.println(L);
	L.add(x);
	System.out.println(L);
	L.add(new Integer(99));
	L.add(new Integer(100));
	L.add(new Integer(1001));
	L.add(new Integer(9000));
	System.out.println(L);
	try{
	    L.set(9000,new String("What do you want"));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("What are you doing");
	}
	L.set(1,new Integer(78));
	System.out.println(L);
	L.set(2,new String("Hello"));
	System.out.println(L);
	System.out.println(L.get(2) + " is located at index " + 2);
	try{
	    System.out.println(L.get(100));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("What are you doing");
	}
	L.add(2,new Integer(12345));
	L.add(10, new Integer(123));
	System.out.println(L);
	System.out.println(L.set(1,new String("Hi")));
	System.out.println(L);
	L.clear();
	System.out.println(L);

	SuperArray M = new SuperArray(5);
	M.add(new Integer(0));
	M.add(new Integer(1));
	M.add(new Integer(2));
	M.add(new Integer(3));
	M.add(new Integer(4));
	M.add(new Integer(5));
	System.out.println(M);
	M.set(3,new Integer(100));
	System.out.println(M);
	M.remove(4);
	System.out.println(M);
	M.remove(3);
	M.remove(2);
	M.remove(1);
	M.remove(0);
	System.out.println(M);
	
	
    }

}
