
public class Main{
    public static void main(String[] args){
        Serbatoio car1 = new Serbatoio();
        Serbatoio car2 = new Serbatoio();
        
        car1.rifornisci(15);
        car2.consuma(20);
        System.out.println("Il livello della prima macchina è " + car1.getLivello());
        System.out.println("Il livello è della seconda macchina è " + car2.getLivello());
        
        car1.trasferisci(15, car2);
        System.out.println("\nIl livello della prima macchina è " + car1.getLivello());
        System.out.println("Il livello della seconda macchina è " + car2.getLivello());
    }
}