public class Main{
    public static void main(String[] args){
        ContoBancario conto1 = new ContoBancario(25.50);
        ContoBancario conto2 = new ContoBancario(1200.25);
    
        conto1.trasferisci(1.25, conto2);
        
        System.out.println("Numero conto: " + conto1.getNumConto() + " Nome: " + conto1.getNome() + " Saldo: " + conto1.getConto());
        System.out.println("Numero conto: " + conto2.getNumConto() + " Nome: " + conto2.getNome() + " Saldo: " + conto2.getConto());
    }
}