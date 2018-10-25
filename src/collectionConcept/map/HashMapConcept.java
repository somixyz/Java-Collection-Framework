/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionConcept.map;

import collectionConcept.userDomain.Car;
import collectionConcept.userDomain.Employee;
import collectionConcept.userDomain.Owner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
        //it maintains no particular order              ne zadrzava redosled ubacivanja elemenata
        //HashMap IS NON-SYNCHRONISED  <--> can be acceptable of multiple threads
        //not ThreadSafe !

        //concurrent modification exception --  Fail-fast condition
        //HashMaps is used in multithreding application where we want to improve performance
        HashMap<Integer, String> hm = new HashMap<>();
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
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println(hm);
        //remove from HashMap
        hm.remove(2);
        System.out.println(hm);

        HashMap<Integer, Employee> emp = new HashMap<>();
        //Employee emplyee = new Employee("Pera", 22, "DEv");
        emp.put(1, new Employee("Milos", 25, "ISiT"));
        emp.put(2, new Employee("Pera", 26, "DEV"));
        emp.put(3, new Employee("Zika", 39, "FrontEnd"));
        System.out.println("***********************************************");
        //traverse the HasMap
        for (Entry<Integer, Employee> employee : emp.entrySet()) {
            Integer i = employee.getKey();
            Employee em = employee.getValue();
            System.out.println("info: " + i + " " + " employee: " + em);
            System.out.println("Employee information:" + em.name + " " + em.age + " " + em.dept);

        }

        HashMap<Car, Owner> carOwners = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            carOwners.put(new Car("BG "+i), new Owner());
        }
        // Attention !!! Here we dont have Iterator interface so we here firstly call keySet() and then iterator()
        Iterator<Car> carIterator = carOwners.keySet().iterator();
        while (carIterator.hasNext()) {            
            Car c = carIterator.next();
            // And here we geting a key, write key (CAR c) and geting a propper value from key (get(c))
            System.out.println(c + " Owner: "+carOwners.get(c));  // here we 'asking' for value using key
        }
        
        //EntrySet   get the all entries in the map
        System.out.println("****************************");
        System.out.println("MapEntry");         //with entrySet we get all part of entry (not just key or values like we see above)
        Set<Map.Entry<Car,Owner>> mapEntries = carOwners.entrySet();   //we dont need to ask for value using key, we already get Key/Value
        Iterator<Map.Entry<Car,Owner>> mapEntryItr = mapEntries.iterator();
        while(mapEntryItr.hasNext()){
            Map.Entry<Car,Owner> carEntry = mapEntryItr.next();
            System.out.println("Key "+carEntry.getKey()+" value "+carEntry.getValue()); 
        }
    }
            // HashTable    and    HashMap
            // --> HashTable, all the funconality is same as in HashMap
            //except Hashtable is ThreadSafe (single thread can access to shared value) and HashMap is not
            //ThreadSafe means restricting multiple threads to manipulate a single instance, to achive that we gonna use SYNCHRONISE blocks which obtains
                // the lock object, and this is certainly some performance impact when we use hashTable in EE application.
                // recommendetion is to useing HashMap instead HashTable, and if we want to have threadsafe instance of HashMap we can use
                //Collection.synhronisedMap(new HashMap<>(K,V));
}
