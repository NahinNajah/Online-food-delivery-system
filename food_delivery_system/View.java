/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

/**
 *
 * @author User
 */
public class View {
    private String name;
    private String email;
    private String pass;


    public View(String name,String email, String pass ) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        
    }
 
    public String getName() {
        //return firstName;
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
}

    
    

