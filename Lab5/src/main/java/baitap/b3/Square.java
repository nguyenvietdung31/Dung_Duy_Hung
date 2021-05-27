/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.b3;

/**
 *
 * @author Dac Hung
 */
public class Square implements Runnable, Listener{
Thread t;
int number;
boolean flag = false;
// nhận số được tạo ra từ Generator
public void daddNumber(int number){
this.number = number;
// flag = true khi nhận được 1 số mới tạo ra
this.flag = true;
}

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