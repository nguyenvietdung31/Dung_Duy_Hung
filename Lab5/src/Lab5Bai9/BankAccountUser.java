/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai9;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC
 */
public class BankAccountUser {
 private String name;
 private BankAccount account;
 private List<Integer> transactions;
 private boolean oneMore;
 private boolean finished; 
 public BankAccountUser(String name, BankAccount account,List<Integer> transactions) {
    this.name = name;
    this.account = account;
    this.transactions = transactions;
    oneMore = false;
    finished = false;
    }
    public String getName() {
    return name;
    }
    public BankAccount getAccount() {
    return account;
    }
    public boolean isFinished() {
    return finished;
    }
    public void setFinished(boolean finished) {
    this.finished = finished;
    }
    public boolean isOneMore() {
    return oneMore;
    }
    public void setOneMore(boolean oneMore) {
    this.oneMore = oneMore;
    }
 public void run() {
    Iterator<Integer> iter = transactions.iterator();
    while (iter.hasNext()) {
        int amount = iter.next();
        if(!iter.hasNext() ) {
            oneMore = true;
            }
        if (amount > 0) {
            account.deposit(amount, this);
        } 
        else if (amount < 0) {
        account.withdraw(Math.abs(amount), this);
        } 
    }
 }
}
