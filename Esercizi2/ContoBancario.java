import java.util.*;

public class ContoBancario{
    private double conto;
    private String nome;
    private final int numConto;
    private static int count; 
    
    public ContoBancario(double conto){
        Scanner input = new Scanner(System.in);
        
        this.conto = conto;
        this.nome = input.nextLine();
        this.numConto = ++count;
    }
    public void preleva(double conto){
        this.conto -= conto;
    }

    public void versa(double conto){
        this.conto += conto;
    }
    
    public void trasferisci(double conto, ContoBancario c){
        this.conto -= conto;
        c.conto += conto;  
    }
    
    public double getConto(){
        return this.conto;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumConto(){
        return this.numConto;
    }
}