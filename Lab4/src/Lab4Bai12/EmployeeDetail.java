/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai12;

import java.util.Collection;

/**
 *
 * @author PC
 */
public class EmployeeDetail {
  public void printCollection(Collection c)
 {
 for (Object object : c)
 {
 System.out.println(object.toString());
 }
 }
 public void printDerivedCollection(Collection c)
 {
 for (Object object : c)
 {
 System.out.println(object.toString());
 }
 }  
}
