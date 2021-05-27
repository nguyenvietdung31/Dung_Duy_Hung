/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai7;

/**
 *
 * @author PC
 */
public class SynchBank {
    public static void main(String[] args) throws InterruptedException {
 Bank bank = new Bank(100, 1000);
 int size = bank.size();
 for (int i = 0; i < size; i++)
 {
    TransferMoney transferMoney = new TransferMoney(bank, i, 1000);
    Thread thread = new Thread(transferMoney);
 thread.start();
 }
    }
}
