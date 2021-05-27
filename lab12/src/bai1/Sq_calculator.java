/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Dac Hung
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Sq_calculator extends UnicastRemoteObject implements Calculator {
// Khai báo phương thức khởi tạo

    public Sq_calculator() throws RemoteException {

    }
// Viết xử lý cho phương thức tính bình phương

    @Override
    public double square(double a) throws RemoteException {
        return a * a;
    }
}
