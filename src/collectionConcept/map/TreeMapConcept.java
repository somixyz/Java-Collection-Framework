/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept.map;

import collectionConcept.sorting.CustomComparator;
import collectionConcept.sorting.CustomComparatorCar;
import collectionConcept.userDomain.Car;
import collectionConcept.userDomain.Owner;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Milos Dragovic
 */
public class TreeMapConcept {
    
    //TreeMap sort entries with interface 1. Comparable //compareTo// method and 2.Comparator 
    //TreeMap looks for compareTo method only when KEY TYPE implement Comparable interface
    //If KEY type don't implement Comparable, then we use implementation of Comparator interface and inject that in constructor when that collection gets initialized
    //for treemap you need to implement some sorting criteria
    
    //it will not ordering by insertion, it will order by our sorting criteria
    public static void main(String[] args) {
        TreeMap<Car, Owner> carOwners = new TreeMap<Car, Owner>();
        
        for (int i = 0; i < 100; i++) {
            Car c = new Car("BG-"+i);
            c.setPrice((int)(Math.random()*100)+1);
            carOwners.put(c, new Owner());
        }
        TreeMapConcept.mapIterator(carOwners);  //it will be sorted in desc order according to price (because key type Car has implement Comparable interface)
        
        System.out.println("Higher Entry: "+carOwners.higherEntry(new Car("BG-"+1000,40)));
        System.out.println("Lower Entry: "+carOwners.lowerEntry(new Car("BG-"+1000,40)));
        
        System.out.println("Head Map=========");
        Map<Car,Owner> headMap = carOwners.headMap(new Car("BG-1000",40));
        TreeMapConcept.mapIterator(headMap); 
        
        System.out.println("Price filter ========= Cars between 30-80 price");
        Map<Car,Owner> headMap2 = carOwners.tailMap(new Car("BG-1000",30));
        TreeMapConcept.mapIterator(headMap2); 
        
        System.out.println("Head Map=========");
        Map<Car,Owner> headMap3 = carOwners.tailMap(new Car("BG-1000",40)).headMap(new Car("BG-1000",80));
        TreeMapConcept.mapIterator(headMap3); 
        
        
        //ThreadSafe TreeMap
        SortedMap<Car, Owner> threadSafeMap = Collections.synchronizedSortedMap(new TreeMap<Car,Owner>());
        System.out.println("Custom order");
        TreeMap<Car,Owner> customOrderMap = new TreeMap<Car,Owner>(new CustomComparatorCar());
        customOrderMap.putAll(carOwners);
        TreeMapConcept.mapIterator(customOrderMap);
        
        
    }

    //Printing map entries in console
    private static void mapIterator(Map<Car, Owner> map) {
        Iterator<Map.Entry<Car,Owner>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {            
            Map.Entry<Car,Owner> entry = entryIterator.next();
            System.out.println("Car "+entry.getKey()+" Price "+entry.getKey().getPrice()+" Owner "+entry.getValue());
        } 
    }
    
    
}
