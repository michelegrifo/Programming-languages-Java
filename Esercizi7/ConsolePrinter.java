import java.util.*;
import java.io.*;

public class ConsolePrinter{
    
    static void Printer() throws Exception{ 
        
        Scanner in = new Scanner(new File("input.txt"));

        while(in.hasNext()){
            System.out.println(in.next());
        }
        in.close();
    }

    static void PrinterB() throws Exception{
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        
        String out;
        while((out = in.readLine()) != null){
            System.out.println(out);
        }

        in.close();
    }

    static void PrinterC() throws Exception{
        FileInputStream in = new FileInputStream("input.txt");
        int c;
        
        while((c = in.read()) != -1){
            System.out.write(c);
        }
        in.close();
    }


    public static void main (String[] args)throws Exception{
        Printer();
        PrinterB();
        PrinterC();   
    }
}