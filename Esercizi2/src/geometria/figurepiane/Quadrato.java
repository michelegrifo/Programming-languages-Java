package geometria.figurepiane;

public class Quadrato{
    double lato;

    public Quadrato(double lato){
        this.lato = lato;
    }

    public double calcolaArea(){
        return this.lato * this.lato;
    }
    
    public double raddoppia(){
        return this.lato *= 2;
    }
}