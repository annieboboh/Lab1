/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.util.Comparator;
import java.util.*;

/**
 *
 * @author anhsu
 */
public class BankApp {
    public static void main(String[] args) {
        BankingSystem myBank = 
            new BankingSystem(new ArrayList<BankAccount>());
        BankAccount account1 = new BankAccount("Fred", 15);
        BankAccount account2 = new BankAccount("Abby", 247);
        BankAccount account3 = new BankAccount("Ilana", 100);
        myBank.addAccount(account1);
        myBank.addAccount(account2);
        myBank.addAccount(account3);
        
        System.out.println("List of Accounts");
        for (BankAccount b: myBank.accounts) {
            System.out.println(" " + b.getName()+ " " + b.getBalance());
        }
        
        Comparator<BankAccount> comp = BankingSystem.comparatorByName();
        Collections.sort(myBank.accounts, comp);
        System.out.println("\nSorted By name");
        for (BankAccount b : myBank.accounts){
            System.out.println(" " + b.getName() + " " + b.getBalance());
        }
        
        Comparator<BankAccount> comp1 = BankingSystem.comparatorByBalance();
        Collections.sort(myBank.accounts, comp1);
        System.out.println("\nSorted By Balance");
        for (BankAccount b: myBank.accounts){
            System.out.println(" " + b.getName() + " " + b.getBalance());
        }
    }
    
}
