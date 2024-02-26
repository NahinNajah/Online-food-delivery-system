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
public class Food {
    private String name;
    private String price;
    
    
    
    public Food()
    {
        this("","");
    }
    public Food(String name,String price){
        
        this.name=name;
        this.price=price;
        
    }
    public String getName()
    {
        return name;
    }
     public String getPrice()
    {
        return price;
    }
     public void setName(String name)
     {
         this.name=name;
     }
     public void setPrice(String price)
     {
         this.price=price;
     }
     public String toStringWithLineBreak()
     {
         return name +"\n" + price +"\n";

     }
     
     @Override
     public String toString()
     {
         return String.format("%-20s",name)+ 
                String.format("%-20s",price);

     }
     
}


