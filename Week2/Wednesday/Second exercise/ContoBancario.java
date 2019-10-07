public class ContoBancario{
    private double conto;
    private String nome;
    static private int num;
    
    public ContoBancario(double conto, String nome){
        this.conto = conto;
        this.nome = nome;
        num++;
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


    public static void main(String[] args){
        ContoBancario conto1 = new ContoBancario(25.50, "Mario Rossi");
        System.out.println("Numero conto: " + conto1.num +" Nome: " + conto1.nome + " Saldo: " + conto1.conto);
        ContoBancario conto2 = new ContoBancario(1200.25, "Mario Biondi");
        System.out.println("Numero conto: " + conto2.num +" Nome: " + conto2.nome + " Saldo: " + conto2.conto);
    
        conto1.trasferisci(1.25, conto2);

        System.out.println("Saldo: " + conto1.conto);
        System.out.println("Saldo: " + conto2.conto);
    }

}