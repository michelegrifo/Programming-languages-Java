import java.util.*;

public class EmailVerifier{
    
    public static Boolean isValidEmailR(String e){
        return e.matches("(\\w{1,20})@(\\w{4,10}).(it|edu|org|net|gov|com|fr|de)");
    }
    
    public static Boolean isValidEmail(String e){
        Boolean v = false;
        
        if(e.isEmpty())
            v = false;
        
        else{
            if(e.indexOf('@') != -1 && e.indexOf('@') != 0)// if there is '@' and it is not the first char
                v = true;
        
            if(e.indexOf('@') == e.lastIndexOf('@') && e.indexOf('@') + 3 < e.indexOf('.')) // if there is only one '@' and is placed after 3 char
                v = true;
            else 
                v = false; 
            
            if(e.substring(e.indexOf('.')).contains("org")) //if after '.' contains a valid domain (the same with other ||)
                v = true;
            else
                v = false;
        }
        
        return v;
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter an email:");
        String email = input.nextLine();
        
        if(isValidEmailR(email))
            System.out.println("This email is valid");
        else
            System.out.println("This email is not valid");
        
        if(isValidEmail(email))
            System.out.println("This email is valid");
        else
            System.out.println("This email is not valid");
    }
}