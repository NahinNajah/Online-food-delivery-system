
package food_delivery_system;

import java.time.LocalDate;


public class Customer extends User{
    private int customerId;
    private int contactNO;
    private String address;

    Customer() {
       
        super();
    }
    
  
    public Customer(int customerId, int contactNO, String address, String name, String password, String gender, String group, LocalDate dob) {
        super(name, password, group);
        this.customerId = customerId;
        this.contactNO = contactNO;
        this.address = address;
    }

    public int getContactNO() {
        return contactNO;
    }

    public void setContactNO(int contactNO) {
        this.contactNO = contactNO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }






}

