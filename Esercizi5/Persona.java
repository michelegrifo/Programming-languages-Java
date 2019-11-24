public class Persona{
    protected String nome;
    protected String cognome;

    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome =  cognome;
    }
    
    public void presentati(){
        System.out.println("Mi chiamo " + this.nome + " " + this.cognome);    
    }
    
    public String toString(){
       return "Nome: " + this.nome + "\nCognome: " + this.cognome ;
    } 
}