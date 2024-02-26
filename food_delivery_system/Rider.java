/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Rider extends User{
     private int riderId;
    private int contactNO;

    public Rider() {
    }

    
    public Rider(int riderId, int contactNO, String name, String password, String gender, String group, LocalDate dob) {
        super(name, password, group);
        this.riderId = riderId;
        this.contactNO = contactNO;
    }

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public int getContactNO() {
        return contactNO;
    }

    public void setContactNO(int contactNO) {
        this.contactNO = contactNO;
    }

    @Override
    public String toString() {
        return "Rider{" + "riderId=" + riderId + ", contactNO=" + contactNO + '}';
    }

   
    
}
