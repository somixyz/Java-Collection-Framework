package collectionConcept;

import collectionConcept.userDomain.Employee; 
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author Milos Dragovic
 */
public class LinkedHashSetConcept {
    
    //Order elements in the way we insert them
    //There is no index like we have in List like ArrayList or LinkedList
    
    
    public static void main(String[] args) {
        LinkedHashSet<Employee> setEmp = new LinkedHashSet<>();

        for (int i = 0; i < 100; i++) {
            setEmp.add(new Employee("NekiPera" + i));
        }
        
        Iterator<Employee> empIterator = setEmp.iterator();
        while (empIterator.hasNext()) {
            System.out.println(empIterator.next());
        }
        
        System.out.println(setEmp.add(new Employee("NekiPera0")));
    }
    
}
