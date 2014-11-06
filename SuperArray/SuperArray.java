public class SuperArray{
    private Object[] Array;
    private int size;

    //constructors
    public SuperArray(){
	Array = new Object[10];
	size = 10;
    }

    public SuperArray(int s){
	Array = new Object[s];
	size = s;
    }

    public String toString(){
	String s = "[ ";
	for(int i = 0; i < size; i++){
	    s += Array[i] + " ";
	}
	s += "]";
	return s;
    }

    public void add(Object e){
	Object[] backup = new Object[size + 1];
	for(int i = 0; i < size; i++){
	    backup[i] = Array[i];
	}
	backup[size] = e;
	Array = backup;
	size += 1;
    }

    public int size(){
	return size;
    }

    public void resize(int newSize){
	Object[] backup = new Object[newSize];
	for(int i = 0; i < newSize; i++){
	    backup[i] = Array[i];
	}
	Array = backup;
	size = newSize;
    }

    public void set(int index, Object e){
	Array[index] = e;
    }

    public Object get(int index){
	return Array[index];
    }
    
    public void clear(){
	for(int i = 0; i < size; i++){
	    set(i,null);
	}
    }

	
	
    


}
