/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai7;

import java.util.Random;

/**
 *
 * @author PC
 */
public class TransferMoney implements Runnable {
    Bank bank;
    int fromAcc;
    double maxAmount;
    int delay = 1000;
    public TransferMoney(Bank bank, int fromAcc, double maxAmount) {
        this.bank = bank;
        this.fromAcc = fromAcc;
        this.maxAmount = maxAmount;
    }

    TransferMoney(Bank bank, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void run()
    {
        Random rd = new Random();
        int toAcc = 0;
        double amount = 0;
        try
        {
            while (true)
            {
                do
                    {
                    toAcc = rd.nextInt(bank.size());
                    }while (toAcc==fromAcc);
            amount = rd.nextInt((int)maxAmount);
            bank.transfer(fromAcc, toAcc, amount);
            Thread.sleep(rd.nextInt(delay));
            }
        }catch(InterruptedException ex)
            {
            InterruptedException("Giao dịch chuyển tiền từ account " +fromAcc + " sang account " + toAcc + " bị gián đoạn");
            }
    }
private void InterruptedException(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
