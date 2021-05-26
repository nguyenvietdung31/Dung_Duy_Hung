/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai11;

/**
 *
 * @author PC
 */
public class EVDictionaryTest {
   public static void main(String[] args)
{
EVDictionary dic = new EVDictionary();
for(int i=1; i<10; i++)
{
dic.addWord(new EVWordClass("Word" + i, "", "Tu thu " + i, ""));
}
System.out.println(dic);
//Them tu
EVWordClass w = new EVWordClass("Word2", "", "Tu thu ", "");
if(!dic.addWord(w))
System.out.println("Khong them duoc!");
//Tra tu
EVWordClass l = dic.lookup("word2");
if(l != null)
System.out.println(l.toString());
}
}
