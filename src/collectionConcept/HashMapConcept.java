/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept;

import collectionConcept.userDomain.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



/**
 *
 * @author Milos Dragovic
 */
public class HashMapConcept {

    public static void main(String[] args) {
        //HashMap is a class implemets Map Interface
        //extends AbstractMap
        //it contains only uniqe elements
        //stores the values -key-value pair
        //it may have one null key multiple null values
        //it maintains no order 
        //HashMap IS NON-SYNCHRONISED  <--> can be acceptable of multiple threads
        //not ThreadSafe !
        
        //concurrent modification exception --  Fail-fast condition
        //HashMaps is used in multithreding application where we want to improve performance
        
        HashMap<Integer,String> hm = new HashMap<>(); 
        hm.put(1, "Java");
        hm.put(2, "Spring");
        hm.put(3, "JavaFX");
        hm.put(4, "Go");

        
        System.out.println(hm.get(1));
        System.out.println(hm.get(6));  // it will not give you Exception
                                        //it will return just null
                                        //because it doesn not stores the values beased on indexes

                                        
            //ITERATING THROW HashMap
            // moze i for( Entry m : hm.entrySet()){....}
        for (Map.Entry<Integer,String> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }   
            System.out.println(hm);
            //remove from HashMap
            hm.remove(2);
            System.out.println(hm);
            
            HashMap<Integer,Employee> emp = new HashMap<>();
            //Employee emplyee = new Employee("Pera", 22, "DEv");
            emp.put(1, new Employee("Milos", 25, "ISiT"));
            emp.put(2, new Employee("Pera", 26, "DEV"));
            emp.put(3, new Employee("Zika", 39, "FrontEnd"));
            System.out.println("***********************************************");
            //traverse the HasMap
            for(Entry<Integer,Employee> employee : emp.entrySet()){
                Integer i = employee.getKey();
                Employee em = employee.getValue();
                System.out.println("info: "+i+" "+" employee: "+em);
                System.out.println("Employee information:" + em.name+ " "+em.age+" "+em.dept);
                
            }
    }
    
    
}
