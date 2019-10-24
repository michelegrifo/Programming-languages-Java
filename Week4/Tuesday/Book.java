import java.util.*;

public class Book{
    private final int idNumber;
    private Author[] authors;
    private String title;
    private double price;
    private String publisher;
    private static int counter = 0;

    public Book(){
        Scanner input = new Scanner(System.in);
        this.idNumber = counter++;
        
        System.out.print("Number of author(s)");
        int number = input.nextInt();
        
        this.authors = new Author[number];
        for(int i = 0; i < this.authors.length; i++)
            this.authors[i] = new Author(); 
        
        System.out.print("\nTitle:");
        this.title = input.nextLine();
    
        System.out.print("\nSelling price:");
        this.price = input.nextDouble();

        System.out.print("\nPublisher:");
        this.publisher = input.nextLine();
    }
     
    public int getId(){
        return this.idNumber;
    }

    public String getAuthors(){
        return this.authors.toString();
    }   

    public String getTitle(){
        return this.title;
    }

    public double getPrice(){
        return this.price;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public String toString(){
        return("\nID:"+ this.getId() + " Author(s):" + this.getAuthors() + 
                " Title:" + this.getTitle() + " Price:" + this.getPrice() + 
                " Publisher:" + this.getPublisher() +"\n");
    }
}