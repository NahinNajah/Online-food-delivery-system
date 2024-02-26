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
public class Table {
    
    private String name;
    private String item;
    private String price;


public Table()
    {
        this("","","");
    }
    public Table(String name, String item, String price) {
        this.name = name;
        this.item = item;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item= item;
    }

    public String getPrice() {
        return price;
    }

   public void setPrice(String price) {
        this.price = price;
    }
    @Override
   public String toString()
     {
         return String.format("%-20s",name)+ 
                
                String.format("%-20s",item)+ 
                String.format("%-20s",price);

     }
    
}
