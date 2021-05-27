/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai9;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author PC
 */
public class BankAccountControl extends JComponent {
    private static Random generator = new Random();
    private BankAccount account;
 private BankAccountUser[] users; 
 private JComboBox balanceChoices;
 private JComboBox usersChoices;
 private JComboBox limitChoices;
 private JComboBox transactionsChoices;
 private JButton runButton;
 private int startBalance;
 private int numUsers;
 private int amountLimit;
 private int numTransactions; 
 public BankAccountControl(BankAccount account) { 
 this.account = account; 
balanceChoices = makeComboBox("Start Balance", new int[] {100, 500, 1000, 10000});
 usersChoices = makeComboBox("Number of Siblings", new int[] {1, 2, 3, 4, 5});
 limitChoices = makeComboBox("Transaction Limit", new int[] {50, 100, 200, 500});
 transactionsChoices = makeComboBox("Transactions per Sibling", new
int[] {10, 25, 50, 100});
 runButton = new JButton("RUN");
 runButton.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) { 
 setup();
 run();
 }
 });
 JPanel panel = new JPanel();
 panel.setLayout(new GridLayout(5, 1, 0, 10));
 panel.add(balanceChoices);
 panel.add(usersChoices);
 panel.add(transactionsChoices);
 panel.add(limitChoices);
 panel.add(runButton);
 setLayout(new FlowLayout());
 add(panel);
 }
 private JComboBox makeComboBox(String title, int[] options) {
 JComboBox comboBox = new JComboBox();
 comboBox.setPreferredSize(new Dimension(title.length()*8, 50));
 comboBox.setBorder(new TitledBorder(title));
 for (int i = 0; i < options.length; i++) {
 comboBox.addItem(options[i]);
 }
 return comboBox;
 }
 private void setup() {
 startBalance = (Integer) balanceChoices.getSelectedItem();
 numUsers = (Integer) usersChoices.getSelectedItem();
 amountLimit = (Integer) limitChoices.getSelectedItem();
 numTransactions = (Integer) 
transactionsChoices.getSelectedItem();
 account.setBalance(startBalance);
 users = new BankAccountUser[numUsers];
 for (int i = 0; i < users.length; i++) {
 users[i] = new BankAccountUser("Sibling " + (i+1), account, 
makeTransactions());
 }
 }
 private void run() {
 try {
 for (int i = 0; i < users.length; i++) {
 users[i].run();
 }
 }
 catch(RuntimeException ex) {
 JOptionPane.showMessageDialog(null, ex.getMessage());
 }
 } 
 private List<Integer> makeTransactions() {
 List<Integer> transactions = new ArrayList<Integer>();
 for (int i = 0; i < numTransactions; i++) {
 int amount = generator.nextInt(amountLimit) + 1; 
transactions.add(generator.nextBoolean() ? amount : -amount);
 }
 return transactions;
 }
}
