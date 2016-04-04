/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author anhsu
 */
public class BankAccount {
    
    String name;
    int balance;
    
    public BankAccount(String a, int b){
        name = a;
        balance = b;
    };
    
    public String getName()
    {
        return name;
    }
    public int getBalance()
    {
        return balance;
    }
    }

