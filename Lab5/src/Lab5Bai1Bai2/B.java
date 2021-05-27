/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai1Bai2;

/**
 *
 * @author PC
 */
public class B implements Runnable  {
    public void run(){
        B b = new B(); 
        Thread t = new Thread(b);
        t.start(); 
    }
    
}
