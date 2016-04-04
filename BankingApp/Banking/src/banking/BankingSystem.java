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
public class BankingSystem {
   
    ArrayList<BankAccount> accounts;
    
    public BankingSystem(ArrayList<BankAccount> accounts){
        this.accounts = accounts;
    }
    
    public static Comparator<BankAccount> comparatorByName()
    {
        return new
            Comparator<BankAccount>()
            {
                public int compare(BankAccount bA1, BankAccount bA2)
                {
                    return bA1.getName().compareTo(bA2.getName());
                }
            };
    }
    
     public static Comparator<BankAccount> comparatorByBalance()
     {
         return new
             Comparator<BankAccount>()
             {
                 public int compare (BankAccount bA1, BankAccount bA2)
                 {
                     if (bA1.getBalance()<bA2.getBalance()) return -1;
                     if (bA1.getBalance()<bA2.getBalance()) return 1;
                     return 0;
                 }
             };
     }
     
     public  void addAccount(BankAccount ba)
     {
         accounts.add(ba);
     }
     
     public ArrayList<BankAccount> getAccounts()
     {
         
         return this.accounts;
     }

    /**
     * @param args the command line arguments
     */
    
}
