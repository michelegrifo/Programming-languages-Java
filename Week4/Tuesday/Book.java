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
        
        System.out.print("Number of author(s):");
        int number = Integer.parseInt(input.nextLine());
        
        this.authors = new Author[number];
        for(int i = 0; i < this.authors.length; i++)
            this.authors[i] = new Author(); 
         
        System.out.print("\nTitle:");
        this.title = input.nextLine();
    
        System.out.print("\nSelling price:");
        this.price = Double.parseDouble(input.nextLine());

        System.out.print("\nPublisher:");
        this.publisher = input.nextLine();
    }
    
    @Override
    public String toString(){
        
        String tmp = "";
        for(Author author : authors)
            tmp += author.toString();

        return("\nID:"+ this.idNumber + " Author(s): " + tmp + 
                " Title: " + this.title + " Price: " + this.price + 
                " Publisher: " + this.publisher +"\n");
    }
}