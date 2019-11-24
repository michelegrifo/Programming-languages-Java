public class Circle{
    private int r; 
    private int d;
    final static double PI_GRECO = 3.141592;

    public Circle(){
        this.r =  25;
        this.d = this.r * 2;
    }

    public double circumference(){
        double c = this.d * PI_GRECO;
        return c;
    }

    public int getRadius(){
        return this.r;
    }    

    public int getDiameter(){
        return this.d;
    }
}