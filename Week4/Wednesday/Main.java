public class Main{
    public static void main(String[] args){
        Persona[] persone = new Persona[4];
        persone[0] = new Persona("Carlo", "Venezia");
        persone[1] = new Studente("Toni", "Cassetta", "Unibo", 0241645);
        persone[2] = new Impiegato("Vincenzo", "Vicari", "PT", 1200.67);
        persone[3] = new Dirigente("Gianni", "Giannini", "Pizzeria da Toni", 3000.98, "Impasti");

        for(Persona p : persone){
            p.presentati();
            System.out.println(p);
            System.out.println("");
        }
    }
}