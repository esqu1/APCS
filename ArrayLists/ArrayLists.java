import java.util.*;
public class ArrayLists{

    public static void collapseDuplicates(ArrayList<Integer> L){
	for(int i = 0; i < L.size(); i++){
	    while(true){
		if(i < L.size() - 1 && L.get(i) == L.get(i+1)){
		    L.remove(i+1);
		}else{
		    break;
		}
	    }
	}
    }


    public static void main(String[] args){
	ArrayList<Integer> L = new ArrayList<Integer>();
	int[] A = {1,9,3,3,4,2,2,2,7,8,8,8,8,9};
	for(int i = 0; i < A.length; i++){
	    L.add(A[i]);
	}
	collapseDuplicates(L);
	System.out.println(L);
    }

	


}
