package geometria.figurepiane;

public class Cerchio{
    double raggio;
    static final double PI_GRECO = 3.141592;

    public Cerchio(double raggio){
        this.raggio = raggio;
    }

    public double calcolaArea(){
        return PI_GRECO * (2 * this.raggio);
    }

}

