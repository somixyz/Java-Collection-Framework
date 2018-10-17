/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionConcept;

import collectionConcept.userDomain.Employee;
import java.util.Comparator;

/**
 *
 * @author Milos Dragovic
 */
public class CustomComparator implements Comparator<Employee> {

    
    //here we delcare our criteria for comparation Employee object for sorting array
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.age > o2.age) {
            return -1;
        } else if (o1.age < o2.age) {
            return 1;
        } 
        return 0;
    }

}
