public class coordinate{
    private double x;
    private double y;

    public double getX(){
	return x;
    }

    public double getY(){
	return y;
    }

    public void changeX(double m){
	x = m;
    }
    
    /*
    public double setX(double x){
	this.x = x;
        */
    
    public void changeY(double m){
	y = m;
    }

    public void setxy(double m, double n){
	x = m;
	y = n;
	// changeX(x);
	// changeY(y);
    }

    public String toString(){
	return "(" + x + "," + y + ")";
    }
}
