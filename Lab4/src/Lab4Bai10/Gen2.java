/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai10;

/**
 *
 * @author PC
 */
public class Gen2<T> extends Gen<T> {
  Gen2(T o)
{
super(o);
}
  @Override
T getObject()
{
System.out.println("Đây là hàm Gen2's getObject(): ");
return ob;
}  
}
