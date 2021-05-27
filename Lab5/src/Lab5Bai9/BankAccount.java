/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai9;

import java.util.Observable;

/**
 *
 * @author PC
 */
public class BankAccount extends Observable {
    private int balance;
    public void setBalance(int balance) {
    this.balance = balance;
    setChanged();
    notifyObServers(null);
    }
    public void deposit(int amount, BankAccountUser user) {
    log("\n" +user.getName()+ " Depositing $" +amount);
    int newBalance = balance + amount;
    balance = balance + amount;
    log(". Balance = " + balance);
    checkFinished(user);
    assert(balance == newBalance); 
    }
    public void withdraw(int amount, BankAccountUser user) {
    log("\n" +user.getName() + " Withdrawing $" + amount);
    if ( amount > balance ) {
    throw new RuntimeException("Amount (" +amount+ ") must not be greater than " +balance+ ".");
        }
    int newBalance = balance - amount;
    balance = balance - amount;
    log(". Balance = " + balance);
    checkFinished(user);
    assert(balance == newBalance); 
    }
    public int getBalance() {
    return balance;
    }
    private void checkFinished(BankAccountUser user) {
    if(user.isOneMore()) {
    log("\n****\n"+user.getName()+"finished.\*******");
    user.setFinished(true);
        }   
    }
    private void log(String message) {
    setChanged();
    notifyObServers(message);
    }

    private void notifyObServers(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addObServer(LogView view) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
