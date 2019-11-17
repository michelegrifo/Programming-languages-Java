public class Dirigente extends Impiegato{
    private String dipartimento;

    public Dirigente(String nome, String cognome, String datoreLavoro, double salario, String dipartimento){
        super(nome, cognome, datoreLavoro, salario);
        this.dipartimento = dipartimento;   
    }
    
    @Override
    public void presentati(){
        System.out.println("Mi chiamo " + this.nome + " " + this.cognome + " e lavoro per " + this.datoreLavoro);
    }

    
    public String toString(){
       super.toString(); 
       return  "\nDatore di lavoro: " + this.datoreLavoro + "\nSalario: " + this.salario + "\nDipartimento: " + this.dipartimento; 
    }

}