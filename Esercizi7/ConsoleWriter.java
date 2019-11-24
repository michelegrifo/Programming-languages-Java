import java.io.*;
import java.util.*;


public class ConsoleWriter{
    public static void main(String[] args)throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter (new BufferedWriter(new FileWriter("output.txt")));
        
        boolean f = false;
        System.out.println("Enter text (ctrl+d to finish)");
        while(!f){
            String copy = input.readLine();
            if(copy != null)
                output.println(copy);
            else
                f = true;
        }

        
        input.close();
        output.close();

    }
}