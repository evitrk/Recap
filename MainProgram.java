package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    
    public static void main(String [] args){
        
        BankAccount b1 = new BankAccount("Ethniki", 1);
        b1.deposit(100);
        b1.deposit(50);
        b1.withdraw(20);
        
      //  System.out.println();
        List<String> lista = b1.getTransactions();
        //for-enhanced
//        for(String minima : lista){
//            System.out.println(minima);
//        }

        //for-traditional
        for(int i = 0;i<lista.size();i++){
            System.out.println("mmmm" +lista.get(i));
           // String minima = lista.get(i);
           //System.out.println("lala" +minima);
        }
        
        BankAccount b2 = new BankAccount("Piraios", 2);
        b2.deposit(1000);
        b2.setName("Piraios tamieftiriou");
        //b2 = new BankAccount("Piraios tamieftiriou", 2);
      //  System.out.println("Accounts are " + BankAccount.getAccountsOpened());
        //b2.deposit(300);
        //b2.deposit(400);
        //b2.withdraw(100);
        
        BankAccount b3;
        //b3 = b2;
        b3 = new BankAccount();
        b3 = b2;
        
        b3.deposit(100);
        List<BankAccount> listOfAccounts = new ArrayList();
        listOfAccounts.add(b1);
        listOfAccounts.add(b2);
        listOfAccounts.add(b3);
     //   System.out.println("Adding logariasmous\n");
        Person p1 = new Person("Bary", 60, listOfAccounts);
       // System.out.println("Added in Bary");
        Person p2 = new Person("Mary", 23);
      //  System.out.println("Adding logariasmous in Mary\n");
        p2.addAccount(b1);
        p2.addAccount(b2);
        for(int i = 0;i<listOfAccounts.size()-1;i++){
            p2.addAccount(listOfAccounts.get(i));
        }
      //  System.out.println("Added in Mary");
        b3 = new BankAccount();
        b3 = null;
        double p1Total = p1.getTotalAmount();
      //  System.out.println("Bary has "+ p1Total +" in his accounts");
        
        PersonBankAccounts pba = new PersonBankAccounts(p1, listOfAccounts);
        
      //  System.out.println(p1);
      //  System.out.println("Person1 is "+p1.getName()+ " with age "+ p1.getAge());
      //  System.out.println(p2);
    }
    
    

}
