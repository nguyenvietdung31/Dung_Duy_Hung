/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai6;

/**
 *
 * @author PC
 */
public class Thread2 extends Thread {
    myObject obj;
    public Thread2(myObject obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
    try {
    while (true) {
        obj.kiemtra();
        Thread.sleep(1000);
     }
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
