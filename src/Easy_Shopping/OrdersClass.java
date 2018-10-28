/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Shopping;

import java.util.ArrayList;

/**
 *
 * 
 */
public class OrdersClass {
    private String ID,Customer;
    int numberOFitem;
    private static ArrayList<OrdersClass>OrderList = new ArrayList <>();
    
     public static ArrayList<OrdersClass> getOrderList() {
        return OrderList;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public int getNumberOFitem() {
        return numberOFitem;
    }

    public void setNumberOFitem(int numberOFitem) {
        this.numberOFitem = numberOFitem;
    }

   
    
    
    
}
