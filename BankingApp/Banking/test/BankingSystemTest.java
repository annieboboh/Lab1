/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banking.BankAccount;
import banking.BankingSystem;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author anhsu
 */
public class BankingSystemTest {
    
    BankingSystem bankSystemTester = 
            new BankingSystem(new ArrayList<BankAccount>());
    
        BankAccount account1 = new BankAccount("Fred", 15);
    @Test
   public void addAccountTest()
     {
         System.out.println("AddAccountTest");
         bankSystemTester.addAccount(account1);
         assertEquals(1, bankSystemTester.getAccounts().size());
     }
   
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
