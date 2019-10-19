import java.util.*;

public class EmailVerifier{
    
    public static Boolean isValidEmailR(String e){
        return e.matches("(\\w{1,20})@(\\w{4,10}).(it|edu|org|net|gov|com|fr|de)");
    }
    
    /*public static Boolean isValidEmail(String e){

    }*/
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);        
        String email = input.nextLine();
        
        if(isValidEmailR(email))
            System.out.println("This email is valid");
        else
            System.out.println("This email is not valid");
    }
}