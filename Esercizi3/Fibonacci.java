import java.util.*;

public class Fibonacci{
    public static String fibonacci(int n){
        String[] string = new String[1000];
        int i = 2;
        string[0] = "";
        string[1] = "b";
        string[2] = "a";
               
        if(n == 1){
            return "b";
        }

        if(n == 2){
            return "a";
        }

        while(i < n){
            string[i+1] = string[i].concat(string[i-1]);
            i++;
        }
        
        return string[n];
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        System.out.println("Fibonacci :" + fibonacci(n));   
    }
}