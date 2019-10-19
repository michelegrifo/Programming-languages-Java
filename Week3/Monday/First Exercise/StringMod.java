import java.util.*;

public class StringMod{
    static public String initial(String n, String s){
        return (n.charAt(0) + "&" + s.charAt(0));
    }

    static public String stringReverse(StringBuilder s){
        s.reverse();
        return s.toString();
    }
    
    static public int occurence(String p, String s){
        int counter = 0;
        for(int i = s.lastIndexOf(p, s.length()); i != -1; i = s.lastIndexOf(p, i-1)){
            
            //System.out.println(i); debug output
            counter++;
        }
        
        return counter;
    }

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in); //variable type class Scanner for input

        String name = input.nextLine();
        String surname = input.nextLine();    
        System.out.println(initial(name, surname));
        
        StringBuilder string = new StringBuilder(input.nextLine()); //variable type class StringBuilder to manage strings
        System.out.println(stringReverse(string));

        String o = input.nextLine();
        System.out.println(occurence(o, name));
    }
}