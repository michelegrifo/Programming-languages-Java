import geometria.figurepiane.Cerchio;
import geometria.figurepiane.Quadrato;
import geometria.figuresolide.Cubo;

public class Main{
    static public void main(String[] args){
        
        Cerchio c = new Cerchio(25);
        Quadrato q = new Quadrato(50);

        System.out.println("Area cerchio: " + c.calcolaArea());
    
        System.out.println("Area quadrato: " + q.calcolaArea());
        System.out.println("Lato raddoppiato: " + q.raddoppia() + "\nNuova area: " + q.calcolaArea());

        
    
    }
}