import java.io.*;
import java.util.*;

public class FileCopy{
    
    static void CopyChar() throws Exception{
        FileInputStream in = new FileInputStream("input.txt");
        FileOutputStream out = new FileOutputStream("output.txt");
        int c;
        
        while((c = in.read()) != -1){
            out.write(c);
        }


        in.close();
        out.close();
    }

    static void CopyBuf() throws Exception{
        
        
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        String copy;

        while((copy = in.readLine()) != null)
            out.println(copy);

        in.close();
        out.close();
    
    }


    public static void main(String[] args)throws Exception{
        CopyChar();
        CopyBuf();
    }
}