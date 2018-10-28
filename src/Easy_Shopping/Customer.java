/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Shopping;

import java.util.LinkedList;

/**
 *
 * 
 */
public class Customer extends Users{
    private String name,id;
    private static LinkedList<Customer>CustomersList = new LinkedList <>();

    public static LinkedList<Customer> getCustomersList() {
        return CustomersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public static boolean loginofCustomer(String name , String pass){
        for (int i =0; i<Customer.getCustomersList().size(); i++){
            if (Customer.getCustomersList().get(i).getUsername().equals(name)&&Customer.getCustomersList().get(i).getPassword().equals(pass)){
                return true;
            }
        }    return false;
    }    

    
}
