public class Matrices{

    public static boolean contains(int value, int[] L){
	for(int i = 0; i < L.length; i++){
	    if(L[i] == value){
		return true;
	    }
	}
	return false;
    }

    public static boolean contains(int value, int[][] L){
	for(int i = 0; i < L.length; i++){
	    if(contains(value,L[i])){
		return true;
	    }
	}
	return false;
    }

    public static void main(String[] args){
	int[][] L = new int[][]{
	    {1,2,3,4},
	    {5,6,7,8}
	};
	System.out.println(contains(5,L));
	System.out.println(contains(9,L));
    }
    
}
