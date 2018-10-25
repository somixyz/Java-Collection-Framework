/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionConcept.list;

import collectionConcept.userDomain.Employee;
import java.util.ArrayList; 
import java.util.Iterator; 

/**
 *
 * @author Milos Dragovic
 */
public class ArrayListConcept {

    public static  void main(String[] args) {

        // static array --> size is fixed
        int[] a = new int[3];
        //if we try a[4]=10; it will throw ArrayOutOfBound exception

        // dynamic array --> ArrayList
        //size is not fixed
        //store the values based of indexes
        //1. it ca contain duplicate values/elements
        //2. maintains insertion order
        //3. it is not Synchronized, its mean it is not thread safe---> that is
        //  why is ArrayList slow in ordering with other collections
        //4. Allows random access to fetch the element,because it store the values on the basis of indexes
        
        ArrayList ar = new ArrayList(); // !!! Non-generic type !!!
        //index position 0,1,2,3,4,5
        ar.add(10);//0  
        ar.add(20);//1
        ar.add(30);//2
        System.out.println(ar.size()); //size of arraylist
        ar.add(40);//3
        ar.add(50);//4
        ar.add("Milos");  // because this is non-generic array list you can store different type information
        //to get value from an index
        System.out.println(ar.get(4)); // 4. point, fetch any element with index
    
        //to print all the values from arrylist: we can use for loop
        //because its store the values based of indexes
        //1. for loop
        //2. using iterator
        
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        
        // non generic vs generic:
        
        ArrayList<Integer> ar1 = new ArrayList<>();  //!!! Generic type !!!
        ar1.add(100);
        ar1.add(200);
        //ar1.add("Milos");  Compile error 
        ArrayList<String> ar2 = new ArrayList<>();  // you can store String object, and other ref type
        //primitve type cant be used as generic type !!

        
        //ArrayList<E> ar3 = new ArrayList<>(); 
        // if we are not sure of what type of data will be stored 
        // array, we put in <E> for generic type, BUT we must also mark it in the method singnature... in
        //our example it will be in main() method, public static <E> void main(String[] args)
        //but generaly we dont ues this, because we usualy knows what kind of data type we retrive
        
        //User defined ArrayList
        //Employee class Object
        Employee emp = new Employee("Milos", 25, "Java Developer");
        Employee emp1 = new Employee("Pera", 23, "QA");
        Employee emp2 = new Employee("Zika", 29, "Admin");
        
        //create arraylist:
        ArrayList<Employee> ar4 = new ArrayList();
        ar4.add(emp);
        ar4.add(emp1);
        ar4.add(emp2);
        //2. iterator for traverse the values: 
        Iterator<Employee> it = ar4.iterator();
        // for traverse we can use for example while or foreach loops
        while (it.hasNext()) {
            Employee employee = it.next(); //restore generic object type//Employee
            System.out.println(employee);
        } 
        System.out.println("\n*************************************************");
        System.out.println("addAll()");
        //*************************
        //addAll()
        ArrayList<String> ar5 = new ArrayList();
        ar5.add("Milos");
        ar5.add("Pera");
        ar5.add("Zika");
        ArrayList<String> ar6 = new ArrayList();
        ar6.add("Dev");
        ar6.add("Java");
        ar6.add("JavaScript");
        //perform addAll() method--> adding 2nd list to 1st
        ar5.addAll(ar6); //merge two arraylist together
        for (int i = 0; i < ar5.size(); i++) {
            System.out.println(ar5.get(i));
        }
        
        System.out.println("\n*************************************************");
        System.out.println("removeAll()");
        //removeAll():
        ar5.removeAll(ar6);
        for (int i = 0; i < ar5.size(); i++) {
            System.out.println(ar5.get(i));
        }
        
        System.out.println("\n*************************************************");        
        System.out.println("retainAll()");
        //retainAll()
        ArrayList<String> ar7 = new ArrayList();
        ar7.add("test"); //same value as in ar8
        ar7.add("selenium");
        ar7.add("php");
        ArrayList<String> ar8 = new ArrayList();
        ar8.add("test"); // test
        ar8.add("java");
        
        
        ar7.retainAll(ar8);
        for (int i = 0; i < ar7.size(); i++) {
            System.out.println(ar7.get(i));  // only test is common 
        }
        System.out.println("\nyou can print array list like this : "+ar7);
        
    }
    
}
