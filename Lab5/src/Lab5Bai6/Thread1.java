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
public class Thread1 extends Thread {
    myObject obj;
    public Thread1(myObject obj) {
        this.obj = obj;
        }
    @Override
    public void run() {
    myObject obj = new myObject();
    try {
        while (true) {
            obj.thoiGian();
            Thread.sleep(1000);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
