/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListConcept;

/**
 *
 * @author Milos Dragovic
 */
public class Employee {

    String name;
    int age;
    String dept;

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", dept=" + dept + '}';
    }
    
    
}
