import java.util.*;
import java.io.*;

class BankAccount implements Serializable{
    private double balance;
    private String accountName;

    public BankAccount(String account, double balance){
        this.accountName = account;
        this.balance = balance;
    }

    public void deposit(double money){
        this.balance += money;
    }

    public void withdraw(double money){
        this.balance -= money;
    }

    public final double getBalance(){
        return this.balance;
    }

    public final String getAccount(){
        return this.accountName;
    }

    public void bankTransfer(double money, BankAccount other){
        this.withdraw(money);
        other.deposit(money);
    }

    @Override 
    public String toString(){
        return "\nBank account:" + 
        "\n\tAccount name: " + this.accountName +
        "\n\tBalance: " + this.balance + "\n";
    }

    

}