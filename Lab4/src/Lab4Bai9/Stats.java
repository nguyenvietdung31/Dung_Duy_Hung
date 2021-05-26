/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai9;

/**
 *
 * @author PC
 */
public class Stats <T extends Number>{
    T[] nums;
Stats(T[] o)
{
nums = o;
}
double average()
{
double sum = 0.0;
for(int i=0; i < nums.length; i++) sum += nums[i].doubleValue();
return sum / nums.length;
}
}
