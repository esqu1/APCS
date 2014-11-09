public class SuperArray{
    private Object[] Array;
    private int size;

    //constructors
    public SuperArray(){
	Array = new Object[10];
	size = 0;
    }

    public SuperArray(int s){
	Array = new Object[s];
	size = 0;
    }

    public String toString(){
	String s = "[ ";
	for(int i = 0; i < size(); i++){
	    s += Array[i] + " ";
	}
	s += "]";
	return s;
    }

    public void add(Object o){
	if(size == Array.length){
	    resize(size() + 5);
	}
	Array[size] = o;
	size += 1;
    }

    public void add(int index, Object o){
	if(size == Array.length){
	    resize(size() + 5);
	}
	if(index >= size()){
	    add(o);
	}else{
	    Object[] backupfull = new Object[size() + 1];
	    for(int i = 0; i < index; i++){
		backupfull[i] = Array[i];
	    }
	    backupfull[index] = o;
	    for(int i = index; i < size(); i++){
		backupfull[i+1] = Array[i];
	    }
	    Array = backupfull;
	    size += 1;
	}

    }
	
	

    public int size(){
	return size;
    }

    public void resize(int newSize){
	Object[] backup = new Object[newSize];
	for(int i = 0; i < size(); i++){
	    backup[i] = Array[i];
	}
	Array = backup;
    }

    public Object set(int index, Object o){
	if(index < 0 || index >= size()){
	    System.out.println("Invalid index. The index should be between 0 and " + (size() - 1) + " inclusive.");
	    return null;
	}
	Object backup = Array[index];
	Array[index] = o;
	return backup;
    }

    public Object get(int index){
	if(index < 0 || index >= size()){
	    System.out.println("Invalid index. The index should be between 0 and " + (size() - 1) + " inclusive.");
	    return null;
	}
	return Array[index];
    }

    public Object remove(int index){
	if(index < 0 || index >= size()){
	    System.out.println("Invalid index. The index should be between 0 and " + (size() - 1) + " inclusive.");
	    return null;
	}
	Object[] backup = new Object[size() - 1];
	for(int i = 0; i < index; i++){
	    backup[i] = Array[i];
	}
	for(int i = index; i < size() - 1; i++){
	    backup[i] = Array[i+1];
	}
	Object tobe = Array[index];
	Array = backup;
	size -= 1;
	if(Array.length - size() >= 5){
	    resize(size() - 5);
	}
	return tobe;
    }
    public void clear(){
	for(int i = 0; i < size; i++){
	    set(i,null);
	}
	size = 0;
    }

	
	
    


}
