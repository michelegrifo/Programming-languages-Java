import java.util.*;

public class Dictionary extends Documents{

    protected Author[] authors;
    protected String title;
    protected String publisher;
    
    public Dictionary(){
        Scanner input = new Scanner(System.in);
         
        System.out.println("\nEnter number of authors: ");
        int number = Integer.parseInt(input.nextLine());
        this.authors = new Author[number];
        for(int i = 0; i < this.authors.length; i++){
            this.authors[i] = new Author();
        }

        System.out.print("\nEnter title: ");
        this.title = input.nextLine();

        System.out.print("\nEnter publisher: ");
        this.publisher = input.nextLine();
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
        String tmp = "";
        for(Author author: authors)
            tmp += author.toString() + " ";
        
        return "\n\n" + getInfo() + " -ID:" + this.id + 
               "\n-Author(s): " + tmp +  
               "\n-Title: " + this.title + 
               "\n-Publisher: " + this.publisher + "\n\n"; 

    }


}
