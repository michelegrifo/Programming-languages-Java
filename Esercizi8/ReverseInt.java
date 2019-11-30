import java.util.*;

public class ReverseInt{
    public static void main(String[] args){
        Boolean check = false;
        
        while(!check){
            try{
                Scanner in = new Scanner(System.in);
                System.out.println("Enter int:");
                int i = in.nextInt();     
                System.out.println("Result: " + (double) 1/i);
                check = true;
                in.close();
            }
            
            catch(InputMismatchException ex){
                System.out.println("You must enter an int!");
            }        
        } 
    }
}

