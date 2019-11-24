import java.util.*;

public class CompactDisk extends Documents{
    protected String title;
    protected double size;
    protected double price;

    public CompactDisk(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter title: ");
        this.title = input.nextLine();

        System.out.print("\nEnter size: ");
        this.size = Double.parseDouble(input.nextLine());

    }

    @Override
    public Object getInfo(){
        return getClass();
    }

    public String getTitle(){
        return this.title;
    }
    
    @Override
    public String toString(){
        return "\n\n" + getInfo() + " -ID:" + this.id + 
               "\n-Title: " + this.title + 
               "\n-Size: " + this.size + "GB" + "\n\n" ;
    }

}