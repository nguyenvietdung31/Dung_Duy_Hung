/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai9;

import java.awt.FlowLayout;
import javax.swing.JComponent;

/**
 *
 * @author PC
 */
public class BankAccountComponent extends JComponent {
 public BankAccountComponent() {
 BankAccount account = new BankAccount();
 LogView view = new LogView("Transaction Log");
 account.addObServer(view);
 BankAccountControl control = new BankAccountControl(account);
 setLayout(new FlowLayout());
 add(view);
 add(control);
 }
}
