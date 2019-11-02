import java.util.*;

public class Library{

    protected static ArrayList<Book> library = new ArrayList<Book>();
    
    
    public static void search(ArrayList<Book> library, String key){
        Boolean result = false;
        
        for(Book item: library){
            if(item.toString().contains(key)){
                System.out.println(item);
                result = true;
            }
        }
        if (result != true)
            System.out.println("\nNo book found");
    }
    
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        Scanner input_str = new Scanner(System.in);
        int choice = 1;
        
        while(choice != 0){
            System.out.println("Enter:" + 
                         "\n1) to view the catalog" + 
                         "\n2) to insert a book" + 
                         "\n3) to search a book" +
                         "\n0 to end");
            
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println(library);
                    break;
                case 2:
                    library.add(new Book());
                    break;
                case 3:
                    System.out.println("Enter:");
                    String searchKey = input_str.nextLine();
                    search(library, searchKey);
                    break;
                
            }
        }
    }

}