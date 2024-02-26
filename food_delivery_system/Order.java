/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;


public class Order {
    private int orderId;
    private String orderAddress;
    private String foodname;
    private int foodPrice;
    
    public Order() {
    }

    public Order(int orderId, String orderAddress, String foodname, int foodPrice) {
        this.orderId = orderId;
        this.orderAddress = orderAddress;
        this.foodname = foodname;
        this.foodPrice = foodPrice;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
    

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", orderAddress=" + orderAddress + ", foodname=" + foodname + ", foodPrice=" + foodPrice + '}';
    }
    
    public void confirm_order(){
    
    }
    
}
