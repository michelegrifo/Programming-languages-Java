public abstract class Documents{
    
    protected static int counter;
    protected final int id;

    public Documents(){
        this.id = counter++;
    }

    public int getId(){
        return this.id;
    }
    
    
    public abstract Object getInfo();
}