/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai3;

/**
 *
 * @author PC
 */
public class Square implements Runnable, Listener {
    Thread t;
    int number;
    boolean flag = false;
    @Override
    public void addNumber(int number){
    this.number = number;
    this.flag = true;
    }
    @Override
    public void run(){
    try {
        while(true) {
            if(this.flag) {
                System.out.println("Square: " + number * number);
                this.flag = false;
            }
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    public void start(){
    if(t == null) {
        t = new Thread(this, "Square");
        t.start();
        }
    }
}
