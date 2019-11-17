public class Impiegato extends Persona{
    protected String datoreLavoro;
    protected double salario;

    public Impiegato(String nome, String cognome, String datoreLavoro, double salario){
        super(nome, cognome);
        this.datoreLavoro = datoreLavoro;
        this.salario = salario;
    }

    @Override
    public void presentati(){
        System.out.println("Mi chiamo " + this.nome + " " + this.cognome + " e lavoro per " +  this.datoreLavoro);
    }

    public String toString(){
        super.toString();
        return "\nDatore di lavoro: " + this.datoreLavoro + "\nSalario: " + this.salario; 
    }
}