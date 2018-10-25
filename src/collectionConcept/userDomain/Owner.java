/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionConcept.userDomain;

import java.util.Random;

/**
 *
 * @author Milos Dragovic
 */
public class Owner {
    private String ownerName;

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }
//    we generate random name of 6 caracter, if we dont use constructor with params
    public Owner() {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        final int N = alphabet.length();
        
        Random r = new Random();
        StringBuffer name = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            name.append(alphabet.charAt(r.nextInt(N)));
        }
        ownerName = name.toString();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return this.ownerName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Owner){
            Owner owner2 = (Owner)obj;
            if(owner2.getOwnerName()!=null && owner2.equals(this.ownerName)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
