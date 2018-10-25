/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept.map;

import collectionConcept.userDomain.Car;
import collectionConcept.userDomain.Owner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Milos Dragovic
 */
public class LinkedHashMapConcept {
    
    // Order of the entries are perfectly maintain as the getting added
    // LinkedHashMap when we using ? so we use when we want to fetch the enty based on insertion order
    public static void main(String[] args) {
        LinkedHashMap<Car,Owner> cars = new LinkedHashMap<>();
        
        for (int i = 0; i < 10; i++) {
            cars.put(new Car("BG-"+i), new Owner());
        }
        LinkedHashMapConcept.mapIterator(cars);
        
        System.out.println("HashMap=============");
        HashMap<Car,Owner> hm = new HashMap<>();
        hm.putAll(cars);
        LinkedHashMapConcept.mapIterator(hm);
        
        
        //LinkedHashMap can enabled Recently using mechansm (used in caching systems)
        //Olso maintain the access order of its entries
        //whatever entriy that u have recently access will be moves to end of collection
        
        //useful in implementing caching mechanism, recently open files... 
        System.out.println("Access Order=================");
        LinkedHashMap<Car,Owner> lhm = new LinkedHashMap<>(10,2.1f,true); //particular constructor
        lhm.putAll(cars);                                   //10-initial capacity for LinkedHashMap(so it doesnt expand everytime elemnt getting add), 
        LinkedHashMapConcept.mapIterator(lhm);              //2.1f ---load factor, true -- Accessing order instead of insertion order 
             //Here we are getting entry with key BG-5 and it will be removed to the end of collection  
        System.out.println("Ater access===============");
        lhm.get(new Car("BG-"+5));  //will be moved to end of collection
        LinkedHashMapConcept.mapIterator(lhm);
    }
    
    //printing all entries in Map
    private static void mapIterator(Map<Car, Owner> cars) {
        Iterator<Map.Entry<Car,Owner>> itr = cars.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Car,Owner> entry = itr.next();
            System.out.println(entry.getKey()+" Owner: "+entry.getValue());
        }
    }
}
