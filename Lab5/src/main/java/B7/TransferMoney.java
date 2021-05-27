/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B7;

import java.util.Random;

/**
 *
 * @author Dac Hung
 */
public class TransferMoney implements Runnable
{
 Bank bank;
 int fromAcc;
 double maxAmount;
 int delay = 1000;
 public TransferMoney(Bank bank, int fromAcc, double maxAmount) {
 this.bank = bank;
 this.fromAcc = fromAcc;
 this.maxAmount = maxAmount;

 }