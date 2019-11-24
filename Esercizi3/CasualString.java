import java.util.*;

public class CasualString{
    public static String generateString(int n, int a){
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < n; i++)
            string.append(String.valueOf((int) (a*Math.random())));
        
        return string.toString();
    }     

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n and a:");
        int n = input.nextInt();
        int a = input.nextInt();
        
        System.out.println(generateString(n, a));
    }
}