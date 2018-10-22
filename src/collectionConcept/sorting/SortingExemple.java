/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept.sorting;

import collectionConcept.userDomain.Employee;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Iterator; 

/**
 *
 * @author Milos Dragovic
 */
public class SortingExemple {
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // Here we use both static sort method from Collections class
        ArrayList<Employee> arrEmp = new ArrayList<>();
        
        //creating 100 Employee objects and adding them into ArrayList
        for (int i = 0; i < 100; i++) {
            Employee emp = new Employee("Pera"+i);
            emp.age = (int)(Math.random()*100+1);
            arrEmp.add(emp);
        }
        
        //printing all elements in console
        Iterator<Employee> it= arrEmp.iterator();
        for ( ; it.hasNext();) {
            Employee nextEmp = it.next();
            System.out.println("age of Empployee: "+nextEmp.name +" is "+nextEmp.age);
        }
        
        //Sorting based on natural criteria
        Collections.sort(arrEmp);
        System.out.println("After sorting (natural criteria)-------------- \n");
        
        Iterator<Employee> it1= arrEmp.iterator();
         for (;it1.hasNext();) { 
            System.out.println("age of Empployee: "+it1.next().name +" is "+it1.next().age);
        }
       
         
    //Custom comparator, custom criteria
        System.out.println("\n****************************"); 
        System.out.println("Custom comparasion\n");
        Collections.sort(arrEmp, new CustomComparator());
        
        Iterator<Employee> iteratorCustomComp = arrEmp.iterator();
        while(iteratorCustomComp.hasNext()){
            System.out.println("Age of Employee is: "+iteratorCustomComp.next().age);
        
        }
    }
}
