import java.util.*;
import java.io.*;

public class Bank implements Serializable{
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public static void main(String[] args) throws Exception{

        Bank test;

        File f = new File("bank.dat");
        if(f.exists() && f.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            test = (Bank) in.readObject();
            in.close();
        }
        else
            test = new Bank();

        test.accounts.add(new BankAccount("Tony", 1500));
        test.accounts.add(new BankAccount("James", 3500));
        test.accounts.get(1).bankTransfer(1500, test.accounts.get(0));

        for(BankAccount account: test.accounts)
            System.out.println(account);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(test);
        out.close();   
    }
}