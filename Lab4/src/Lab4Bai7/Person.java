/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai7;

/**
 *
 * @author PC
 */
public class Person implements Comparable<Person>
{
    private String firstName;
private String surname;
public Person(String firstName, String surname)
{
this.firstName = firstName;
this.surname = surname;
}
public String toString()
{
return firstName + " " + surname;
}

    @Override
public int compareTo(Person person)
{
int result = surname.compareTo(person.surname);
return result == 0 ? firstName.compareTo(((Person)
person).firstName):result;
}
}