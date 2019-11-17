import java.util.*;

public class Library{
    static ArrayList<Documents> library = new ArrayList<Documents>();

    
    static void choiceMenu(){
        System.out.println("\nEnter:" + 
                            "\n1) to view list of documents" + 
                            "\n2) to (insert|modify|delete) a document" + 
                            "\n3) to search a document" +
                            "\n0) to end");
    }

    static void modifyMenu(){
        System.out.println("\n 1)to insert a document"+
                           "\n 2)to modify a document"+
                           "\n 3)to delete a document");
    }
    
    static void typeMenu(){
        System.out.println("\n   1)to insert a book"+
                           "\n   2)to insert a dictionary" + 
                           "\n   3)to insert a newspaper" +
                           "\n   4)to insert a CD");

    }

    static void searchMenu(){
        System.out.println("\n 1)to search by name's author" +
                           "\n 2)to search by surname's author" +
                           "\n 3)to search by title");
    }
    
    static void modifyDoc(){
        /*System.out.println("\nSelect by ID item:");
        int itemId = Integer.parseInt(input.nextLine());
        check = false;
        
        for(int i = 0; i < library.size(); i++){
            if(library.get(i).getId() == (itemId)){
                library.set(i, (Documents) new (library.get(i).getInfo()));
                    check = true;
            }
        }
        if(check == false) 
            System.out.println("\nItem not found");*/
    }
    
    static void removeDoc(){
        Scanner input = new Scanner(System.in);
        boolean check = false;    
        System.out.println("\nSelect by ID item:");
        int itemId = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < library.size(); i++){
            if(library.get(i).getId() == (itemId)){
                library.remove(i);
                check = true;
            }
        }
        if(check == false) 
            System.out.println("\nDocument not found");      
    }
    
    static void searchNameAuthor(String key){
        boolean check = false;
        Book tmp;
        Dictionary tmp2;
        
        for(int i = 0; i < library.size(); i ++){
            if(library.get(i) instanceof Book){
                tmp = (Book) library.get(i);
                for(int j = 0; j < tmp.authors.length; j++){
                    String currentName = tmp.authors[j].getName();
                    if(currentName.equalsIgnoreCase(key)){
                        System.out.println(library.get(i));
                        check = true;
                    }
                }
            }

            else if (library.get(i) instanceof Dictionary){
                tmp2 = (Dictionary) library.get(i);
                for(int j = 0; j < tmp2.authors.length; j++){
                    String currentName2 = tmp2.authors[j].getName();
                    if(currentName2.equalsIgnoreCase(key)){
                        System.out.println(library.get(i));
                        check = true;
                    } 
                }
            }   
        }
        
        if(check == false)
            System.out.println("Author not founded");
    }

    static void searchSurnameAuthor(String key){
        boolean check = false;
        Book tmp;
        Dictionary tmp2;
        
        for(int i = 0; i < library.size(); i ++){
            if(library.get(i) instanceof Book){
                tmp = (Book) library.get(i);
                for(int j = 0; j < tmp.authors.length; j++){
                    String currentSurname = tmp.authors[j].getSurname();
                    if(currentSurname.equalsIgnoreCase(key)){
                        System.out.println(library.get(i));
                        check = true;
                    }
                }
            }

            else if (library.get(i) instanceof Dictionary){
                tmp2 = (Dictionary) library.get(i);
                for(int j = 0; j < tmp2.authors.length; j++){
                    String currentSurname2 = tmp2.authors[j].getSurname();
                    if(currentSurname2.equalsIgnoreCase(key)){
                        System.out.println(library.get(i));
                        check = true;
                    } 
                }
            }   
        }
        
        if(check == false)
            System.out.println("Author not founded");
    
    }

    static void searchTitle(String key){
        boolean check = false;
        Book b;
        Dictionary d;
        Newspaper n;
        CompactDisk c;
        String temp;
        
        for(Documents title : library){
            if(title instanceof Book){
                b = (Book) title; 
                temp =  new String (b.getTitle());
                if(temp.equalsIgnoreCase(key))
                    System.out.println(title);
            }
            else if(title instanceof Dictionary){
                d = (Dictionary) title;
                temp = new String(d.getTitle());
                if(temp.equalsIgnoreCase(key))
                    System.out.println(title);
            }
            else if(title instanceof Newspaper){
                n = (Newspaper) title;
                temp = new String (n.getTitle());
                if(temp.equalsIgnoreCase(key))
                    System.out.println(title); 
            }
            else if(title instanceof CompactDisk){
                c = (CompactDisk) title;
                temp = new String (c.getTitle());
                if(temp.equalsIgnoreCase(key))
                    System.out.println(title);
            }
        }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 1;
        boolean check = false;
        String searchKey = new String();

        while(choice != 0){
            choiceMenu();
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    System.out.println(library);
                    break;
                case 2:
                    modifyMenu();
                    int choice2 = Integer.parseInt(input.nextLine());
                    switch(choice2){
                        case 1:
                            typeMenu();
                            int choice3 = Integer.parseInt(input.nextLine());
                            switch(choice3){
                                case 1:
                                    library.add(new Book());
                                    break;
                                case 2:
                                    library.add(new Dictionary());
                                    break;
                                case 3:
                                    library.add(new Newspaper());
                                    break;
                                case 4:
                                    library.add(new CompactDisk());
                                    break;
                                default:
                                    System.out.println("\nInvalid input, retry");
                                    break;
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            removeDoc(); 
                            break;
                        
                        default:
                            System.out.println("\nInvalid input, retry");
                            break;    
                    }
                    break;
                
                case 3:
                    searchMenu();
                    int choice4 = Integer.parseInt(input.nextLine());
                    System.out.println("\nEnter:");
                    searchKey = input.nextLine();
                    switch(choice4){
                        case 1:
                            searchNameAuthor(searchKey);
                            break;
                        case 2:
                            searchSurnameAuthor(searchKey);
                            break;
                        case 3:
                            searchTitle(searchKey);
                            break;   
                    }
                    break;     
                
            }
        }
    }
}