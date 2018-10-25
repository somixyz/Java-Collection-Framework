/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept.set;

import collectionConcept.sorting.CustomComparator;
import collectionConcept.userDomain.Employee;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Milos Dragovic
 */
public class TreeSetConcept {
    
    //Implement interfaces Set, SortedSet and NavigableSet
    
    // Sorted based on natural order 
    // TreeSet is collection which sors the elements and maintains that order
    
    //SortedSet interface has methods : comparator(), first(), last(), headSet(E toElement), subSet(E fromElement,E toElement)
            //, tailSet(E fromElement)
    
    //TreeSet sort elements at the moment when element is getting added 
    
    //NavigableSet interface defains utility methods which can help to navigate throw the collection
        // and help to fetch closes match with respect with element we specified
        //helps in navigatinh through elements to find closet match
    
    //With giving implementation interface Comparator<> you can  define your own sorting criteria 
        // and you can use them with TreeSet based in collection
    
    
    public static void main(String[] args) {
        TreeSet<Employee> treeEmp = new TreeSet<>();
        
        for(int i =0; i<100 ; i++){
            treeEmp.add(new Employee("Pera"+i, (int)(Math.random()*100+1)));
        } 
        
        
        Iterator<Employee> iteratorEmp = treeEmp.iterator();
        while (iteratorEmp.hasNext()) {            
            Employee ite = iteratorEmp.next();
            System.out.println("Empployee name: "+ite.name+" id: "+ite.id);
        }
        
        System.out.println(treeEmp.first());
        System.out.println(treeEmp.last());
        
        Employee e = new Employee("Perica499");
        e.id = "50";
        treeEmp.add(e);
        Iterator<Employee> headSetIterator = treeEmp.headSet(e).iterator();
        while (headSetIterator.hasNext()) {            
            System.out.println("object Id "+headSetIterator.next().id);
        }
        
        System.out.println("*****************************");
        
        TreeSet<Employee> emps = new TreeSet<>(new CustomComparator());
        
        
    }
    
    
}
