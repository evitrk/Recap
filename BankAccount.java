package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int number;
    private double amount;
    private String name;
    private boolean active;
    private List<String> transactions;
    private static int accountsOpened;
    
    public BankAccount(){
        accountsOpened++;
        active = true;
        transactions = new ArrayList();
        transactions.add("Created with balance $0");
    }
    
    public BankAccount(String name, int number){
        this();
        this.name = name;
        this.number = number;
    }
    
    public BankAccount(String name, int number, double amount){
        this(name, number);
        this.amount = amount;
    }
    //?????
    public BankAccount(BankAccount a){
        this.name = a.name;
        this.number = a.number;
        this.active = a.active;
        this.amount = a.amount;
        this.transactions = new ArrayList(a.transactions);
    }
    
    public static int getAccountsOpened(){
        return accountsOpened;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

//    private void setAmount(double amount) {
//        this.amount = amount;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<String> getTransactions() {
        return transactions;
    }
    
    

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    
    public void deposit(double money){
        amount = amount + money;
        transactions.add("Added $"+money);
      //  System.out.println("You have $"+amount+" in your account "+number);
    }
    
    public void withdraw(double money){
        if(money>amount){
          //  System.out.println("You withdrew $"+amount+".");
          //  System.out.println("That's all that you had.");
            transactions.add("Removed $"+amount);
            amount = 0;
            System.out.println("Your balance is $"+amount);
        }else{
            amount = amount - money;
            transactions.add("Removed $"+money);
            System.out.println("You have $"+amount+" in your account");
        }
        
    }

    @Override
    public String toString() {
        return "BankAccount{" + "number=" + number + ", amount=" + amount + ", name=" + name + ", active=" + active + ", transactions=" + transactions + '}';
    }
    
    
}
