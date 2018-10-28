/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Shopping;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author owner 
 */


public class Data {
    public static void mydata() throws IOException{
        CustomerData();
         ProductData();
          OrderData();
          ManagerData();
    }
          
  public static void CustomerData() throws FileNotFoundException, IOException
    {
        try 
        {
            try (BufferedReader reads = new BufferedReader (new FileReader ("Customer.txt"))) {
                String line ;
                while ((line=reads.readLine())!= null)
                {
                    String [] colum = line.split(":");
                    String name = colum [0];
                    String username = colum [1];
                    String password = colum [2];
                    String id = colum [3];
                    
                   Customer add = new Customer();
                   add.setName(name);
                   add.setUsername(username);
                   add.setPassword(password);
                   add.setId(id);
                   Customer.getCustomersList().add(add);
                }}
           
        } catch (IOException a )
        {
            
        }
    }
  public static void ManagerData() throws FileNotFoundException, IOException
    {
        try 
        {
            try (BufferedReader reads = new BufferedReader (new FileReader ("Manager.txt"))) {
                String line ;
                while ((line=reads.readLine())!= null)
                {
                    String [] colum = line.split(":");
                    String name = colum [0];
                    String username = colum [1];
                    String password = colum [2];
                    String id = colum [3];
                    
                   Manager add = new Manager();
                   add.setName(name);
                   add.setUsername(username);
                   add.setPassword(password);
                   add.setId(id);
                   Manager.getManagerList().add(add);
                }}
           
        } catch (IOException a )
        {
            
        }
    }
    
    public static void ProductData() throws FileNotFoundException, IOException
    {
        try 
        {
            try (BufferedReader reads = new BufferedReader (new FileReader ("Product.txt"))) {
                String line ;
                while ((line=reads.readLine())!= null)
                {
                    String [] colum = line.split(":");
                    String name = colum [0];
                    String Productid = colum [1];
                    String Rate = colum [2];
                    String Price = colum [3];
                    int ra = Integer.parseInt(Rate);
                    double price = Double.parseDouble(Price);
                    
                   Product add = new Product();
                   add.setPname(name);
                   add.setPid(Productid);
                   add.setRate(ra);
                   add.setPrice(price);
                  Product.getPList().add(add);
                }}
           
        } catch (IOException a )
        {
            
        }
    }
    
      
    public static void OrderData() throws FileNotFoundException, IOException
    {
        try 
        {
            try (BufferedReader reads = new BufferedReader (new FileReader ("Orders.txt"))) {
                String line ;
                while ((line=reads.readLine())!= null)
                {
                    String [] colum = line.split(":");
                    String ID = colum [0];
                    String Cid = colum [1];
                    String item = colum [2];
                    int ra = Integer.parseInt(item);

                    
                   OrdersClass add = new  OrdersClass();
                   add.setID(ID);
                   add.setCustomer(Cid);
                   add.setNumberOFitem(ra);
                 
                  OrdersClass.getOrderList().add(add);
                }}
           
        } catch (IOException a )
        {
            
        }
    }
  
  
  
  
  
}
