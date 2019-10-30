public class Studente extends Persona{
    protected String universita;
    protected int matricola;

    public Studente(String nome, String cognome, String universita, int matricola){
        super(nome, cognome);
        this.universita = universita;
        this.matricola = matricola;
    }
    
    @Override
    public void presentati(){
        System.out.println("Mi chiamo " + this.nome + " " + this.cognome + " e studio a " +  this.universita);
    }
    
    public String toString(){
        super.toString();
        return "\nUniversità: " + this.universita + "\nMatricola: " + this.matricola; 
    }

}
