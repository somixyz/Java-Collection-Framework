/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionConcept.sorting;

import collectionConcept.userDomain.Car;
import java.util.Comparator;

/**
 *
 * @author Milos Dragovic
 */
public class CustomComparatorCar implements Comparator<Car> {

    
    // sorting in Descending order
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return 1;
        }
        return 0;
    }

}
