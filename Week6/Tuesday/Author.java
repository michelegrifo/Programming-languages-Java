import java.util.*;

public class Author{

    private String name;
    private String surname;

    public Author(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter name:");
        this.name = input.nextLine();
        System.out.println("\nEnter surname:");
        this.surname = input.nextLine();
    }
    
    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.surname + " ";
    }
}