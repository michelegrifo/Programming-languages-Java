public class Serbatoio{
    
    private int livello; /*attributo classe*/

    public Serbatoio(){  /*costruttore */
        this.livello = 20;
    }

    public void rifornisci(int livello){
        this.livello += livello; 
    }

    public void consuma(int livello){
        this.livello -= livello;
    }

    public void trasferisci(int livello, Serbatoio s2){
        this.livello -= livello;
        s2.livello += livello; 
    }
    
    public int getLivello(){
        return this.livello;
    }
}