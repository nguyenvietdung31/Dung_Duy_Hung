/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai3;

import java.util.List;
public interface Vali {
     public void add(List<Employees> list);
    public void display(List<Employees> list);
    public void remove(List<Employees> list, int i);
    public void search(List<Employees> list, String i);
}
