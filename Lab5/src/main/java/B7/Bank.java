/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B7;
/**
 *
 * @author Dac Hung
 */
public class Bank
{
 double[] accounts;
 public Bank(int n, double initBalance)
 {
 accounts = new double[n];
 for (int i = 0; i < accounts.length; i++)
 {
 accounts[i] = initBalance;
 }
 }
public int size()
 {
 return accounts.length;
 }
 public synchronized double getTotalBalance()
 {
 double total = 0;
 for (int i = 0; i < accounts.length; i++)
 {total+=accounts[i];
 }
 return total;
 }
 public synchronized void transfer(int from, int to, double amount)
 {
 try
 {
 while(accounts[from] < amount)
 {
 System.out.println(Thread.currentThread().getName()+"đợi đủ tiền");
 wait();
System.out.println(Thread.currentThread().getName()+"tiếp tục giao dich");
 }
 accounts[from] -= amount;
 accounts[to] += amount;
System.out.println("Chuyển " + amount + " từ account " + from + " sangaccount " + to);
 System.out.println("Tổng tiền của các account: " +getTotalBalance());
 notifyAll();
 }
 catch (InterruptedException ex)
 {
 InterruptedException("Giao dịch bị gián đoạn");
 }
 }
}
