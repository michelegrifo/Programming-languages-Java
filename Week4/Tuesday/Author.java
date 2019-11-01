import java.util.*;

public class Author{
    private String name;
    private String surname;
    
    public Author(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Name:");
        this.name = input.nextLine();
        System.out.print("\nEnter Surname:");
        this.surname = input.nextLine();
    }

    public String getAuthor(){
        return this.name + " " + this.surname + " ";
    }

    @Override
    public String toString(){
        return (" " + this.getAuthor());
    }
}