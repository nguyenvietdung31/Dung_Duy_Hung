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
public class Demo {
public static void main(String[] args) {
Square square = new Square();
square.start();
Generator generator = new Generator(square);
generator.start();
}
}
