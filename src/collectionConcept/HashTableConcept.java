/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author Milos Dragovic
 */
public class HashTableConcept {
  
    
    public static void main(String[] args) {
        
        //HashTable is implementation of hashtable 
        //it is similar to hashmap, but it is SYNCHRONISED !! its ThreadSafe (only one thread can access)!!!
        //stores the value on the basis of key-value
        //key--> Object--HashCode(int) --> (on that particular key will be stored)  value
        //JVM give --> each and every object has its own uniqe and identifer hashcode value
        //32bit int number
        //it contains always unique values
        //we dont use in multithreading app, dont using when we want improving perfomance
        
        
        Hashtable h1 = new Hashtable();
        h1.put(1, "Tom");
        h1.put(2, "Jerry");
        h1.put(3, "MIka"); 
        h1.put(3, "MIka");
        System.out.println(h1);
        //it contains always unique values
        //h1.put(null, null);//no NULL key and/or NULL values--->> it will throw RuntimeExcepton (NullPointerExc)
        
        //create a clone copy/shallow copy:
        Hashtable h2 = new Hashtable();
        h2=(Hashtable)h1.clone(); //clone return Object type
        
        System.out.println("value from h1: "+h1);
        System.out.println("value from h2: "+h2);
        
        h1.clear();
        System.out.println("value from h1: "+h1);
    
        //contains value:
        Hashtable st = new Hashtable();
        st.put("A", "Milos");
        st.put("B", "Pera");
        st.put("C", "Mika");
        if(st.containsValue("Mika")) System.out.println("He is found");
        
        System.out.println("***********************************************");
        
        //print all the values from hashtable using --Enumeration--elements() 
        Enumeration e= st.elements(); //Returns all the values in particular Enumeration type object
        System.out.println("print values from st using enumeration");
       
        while (e.hasMoreElements()) {            
            System.out.println(e.nextElement()); 
        }
        
        //get all the values from hashtable using --entrySet()--> return set of hashtables values
        System.out.println("print values from st using entry set");
        Set s = st.entrySet(); //return one Set object
        System.out.println(s); 
         
         Hashtable st1 = new Hashtable();
        st1.put("A", "Milos");
        st1.put("B", "Pera");
        st1.put("C", "Mika");
        //check both the hashtables are equal aor not:
        if(st1.equals(st)) System.out.println("Both are equal");
         
         
        //get thevalue from a key:
        System.out.println(st1.get("A"));
        
        //get the hashcode of hashtable object
        System.out.println("the hash code value of st1: "+st1.hashCode());
        System.out.println("the hash code value of st1 first key:" + st1.get("A")+" "+st1.get("A").hashCode());

        //generics 
        Hashtable<String, String> st3 = new Hashtable<>(); 
        
    }
    
    
}
