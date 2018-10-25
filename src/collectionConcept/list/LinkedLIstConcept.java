/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *  
 * @author Milos Dragovic
 */
public class LinkedLIstConcept {

    public static void main(String[] args) {
        
        LinkedList<String> ll = new LinkedList<>();
        
        //add
        ll.add("test");
        ll.add("QA");
        ll.add("Java");
        ll.add("RRA");
        ll.add("RFT");
        System.out.println("Contetn of LinkedList: " +ll);
        
        //addFirst:
        ll.addFirst("Spring");
        ll.addLast("framework");
        System.out.println("Contetn of LinkedList: " +ll);
        
        //get
        System.out.println("first value: "+ll.get(0));
        //set
        ll.set(1, "MIlos");
        System.out.println(ll.get(1));
        //remove first element:
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Contetn of LinkedList: " +ll);
        //remove from dezire index
        ll.remove(2);
        System.out.println("Contetn of LinkedList: " +ll);
        
        System.out.println("**********************************************");
        //how to print all the values of LinkedList
        //for loop
        System.err.println("*******using for loop");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        //advanced for loop
        System.err.println("*******using advanced for loop");
        for(String str : ll){
            System.out.println(str);
        }
        
        //while loop
        System.err.println("*******usuing while loop");
        int num = 0;
        while (ll.size()>num) {            
            System.out.println(ll.get(num));
            num++;
        }
        //iterator
        System.err.println("*******using iterator");
        Iterator<String> it = ll.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next());
        }
    
    
    
    
    }
    
}
