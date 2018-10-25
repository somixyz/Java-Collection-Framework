/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionConcept.userDomain;

/**
 *
 * @author Milos Dragovic
 */
public class Car implements Comparable<Car> {

    private String regNumber;
    private int price;

    public Car(String regNumber) {
        this.regNumber = regNumber;
    }

    public Car(String regNumber, int price) {
        this.regNumber = regNumber;
        this.price = price;
    }

    /**
     *Natural ordering for Car instance
     *Sorting the cars in the descending order
     * 
     */
    @Override  
    public int compareTo(Car o) {
        if (this.getPrice() > o.getPrice()) {
            return 1;
        } else if (this.getPrice() < o.getPrice()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            String regNumber = ((Car) obj).regNumber();
            if (regNumber != null && regNumber.equals(this.regNumber)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.regNumber.hashCode();
    }

    @Override
    public String toString() {
        return this.regNumber;
    }

    public String regNumber() {
        return regNumber;
    }

    public void regNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
