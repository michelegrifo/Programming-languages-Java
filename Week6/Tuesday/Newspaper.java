import java.util.*;

public class Newspaper extends Documents{
    protected String title, date;
    
    public Newspaper(){
        Scanner input = new Scanner(System.in);
    
        System.out.print("\nEnter title: ");
        this.title = input.nextLine();

        System.out.println("Enter the date (dd/mm/yy): ");
        this.date = input.nextLine();

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
               "\n-Title:" + this.title + 
               "\n-Date: " + this.date + "\n";     
    }

}
