public class Serbatoio{
    private int livello; 
    private final int CAPACITA; 

    /**Costruttore che setta la capacità massima a 100 L*/
    public Serbatoio(){
        this.CAPACITA = 100;
    }
    
    /**Costruttore che setta la capacità massima attraverso il parametro */
    public Serbatoio(int capacita){
        this.CAPACITA = capacita;
    }
    
    /** Metodo per rifornire il serbatoio
     @param livello incrementa il livello di l litri */
    public void rifornisci(int livello){
        this.livello += livello;
    }
    
    /** Metodo per consumare il contenuto del serbatoio
     @param livello decrementa il livello di l litri */
    public void consuma(int livello){
        this.livello -= livello;
    }
    
    /**Metodo per trasferire il contenuto da un serbatoio ad un altro
    @param livello decrementa il livello del serbatoio e incrementa quelllo della secondo 
    @param s oggetto di tipo Serbatoio*/
    public void travasa(int livello, Serbatoio s){
        this.livello -= livello;
        s.livello += livello;
    }

    /**Metodo statico per trasferire il contenuto da un serbatoio ad un altro
    @param livello decrementa il livello del serbatoio e incrementa quelllo della secondo 
    @param s1 primo oggetto di tipo Serbatoio
    @param s2 secondo oggetto di tipo Serbatoio */
    public static void travasa2(int livello, Serbatoio s1, Serbatoio s2){
        s2.travasa(livello, s1);
    }
    
    /**Metodo che restituisce il livello del serbatoio
    @return livello del serbatoio */
    public int getLivello(){
        return this.livello;
    }
}