import java.util.*;

public class ReverseInt{
    public static void main(String[] args){
        Boolean check = false;
        
        while(!check){
            try{
                Scanner in = new Scanner(System.in);
                System.out.println("Enter integer:");
                int i = in.nextInt();
                
                if(i == 0){
                    throw new ArithmeticException();
                }
                
                System.out.println("Result: " + (double) 1/i);
                check = true;
            }
            
            catch(InputMismatchException ex){
                System.out.println("You must enter an int!");
            }        
        } 
    }
}

