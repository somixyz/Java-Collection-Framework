package collectionConcept.set;

import collectionConcept.userDomain.Employee; 
import java.util.HashSet;
import java.util.Iterator; 

/**
 *
 * @author Milos Dragovic
 */
public class HashSetConcept {

    public static void main(String[] args) {
        //unordered (does not maintain insertion order) and unsorted collection
        //Generic type can only be reference type
        //allow only unique elements but duplicate element will be procesed without some error, but it will not be inserted in structure
        //In Set you should reimplement (override) equlas and hashcode methods, because to be enabled 
            //stoping adding duplicate elements inside Set implementations classes---> this also is requried for Map
        //these two methods, equals and hashcode also improve system performance over collections    
            HashSet<Employee> setEmp = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            setEmp.add(new Employee("NekiPera" + i));
        }
        Iterator<Employee> empIterator = setEmp.iterator();
        while (empIterator.hasNext()) {
            System.out.println(empIterator.next());
        }
        
        
      

    }

}
