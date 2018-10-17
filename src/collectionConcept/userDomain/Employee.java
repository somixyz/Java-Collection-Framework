/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept.userDomain;

/**
 *
 * @author Milos Dragovic
 */
public class Employee implements Comparable<Employee>{ //we can compare only Employee type with this type

    public String name;
    public int age;
    public String dept;
    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
//avoid getters and setters 
    //........
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", dept=" + dept + '}';
    }

    @Override
    public int compareTo(Employee o) {   //retunr -1,0,1 depending on criteria
       if(this.age>o.age) {
           return 1;
       } else if(this.age<o.age) return -1;
            return 0;
    }
    
    
}
