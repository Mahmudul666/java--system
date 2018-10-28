/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Shopping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Admin extends Users{
    static int c;
    private String name;
    private String id;
    private static LinkedList<Admin>AdminList = new LinkedList <>();

    public static LinkedList<Admin> getAdminList() {
        return AdminList;
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
   public static void create_Admin(){
       Admin addnewAdmin = new Admin();//object for adding new Admin to the ArrayList 
       addnewAdmin.setName("Alshugaa");
       addnewAdmin.setUsername("Admin");
       addnewAdmin.setPassword("Admin");
       addnewAdmin.setId("TP0000");
       Admin.AdminList.add(addnewAdmin);   
   }
   
   
   static boolean Login(String user, String pass){ //boolean for checking whether the user name and password match to the username and password that user enter 
       for (int i=0; i<AdminList.size(); i++){
           if (Admin.AdminList.get(i).getUsername().equals(user)&&Admin.AdminList.get(i).getPassword().equals(pass)){        
             return true;
           }    
       }   
   return false;
   }
   
   static void addUser(String name , String username , String password, String id ) throws IOException{
       PrintWriter file = new PrintWriter (new FileWriter ("Customer.txt",true));
       file.print(name+":");
       file.print(username+":");
       file.print(password+":");
       file.println(id);
       file.flush();
       file.close();
       {
          Customer.getCustomersList().clear();
           Data.CustomerData();
            JOptionPane.showMessageDialog(null, "Customer has been add to the file  ", "Message", JOptionPane.INFORMATION_MESSAGE);  
       }
       
   }
   
   public static boolean ckuser(String ID){
       for(int i=0; i<Customer.getCustomersList().size(); i++ ){
           if (Customer.getCustomersList().get(i).getId().equals(ID)){
                
                return true;
           }
           
       }return false;
   }
   static void addUser1(String name , String username , String password, String id ) throws IOException{
       PrintWriter file = new PrintWriter (new FileWriter ("Manager.txt",true));
       file.print(name+":");
       file.print(username+":");
       file.print(password+":");
       file.println(id);
       file.flush();
       file.close();
       {
          Manager.getManagerList().clear();
           Data.ManagerData();
            JOptionPane.showMessageDialog(null, "Manager has been add to the file  ", "Message", JOptionPane.INFORMATION_MESSAGE);  
       }
       
   }
   
   public static boolean ckuser1(String ID){
       for(int i=0; i<Manager.getManagerList().size(); i++ ){
           if (Manager.getManagerList().get(i).getId().equals(ID)){
                
                return true;
           }
           
       }return false;
   }
   
   
   
   
   
   public static void Edituser(String name, String username, String password, String id) throws FileNotFoundException{
         Customer.getCustomersList().get(c).setName(name);
           Customer.getCustomersList().get(c).setUsername(username);
           Customer.getCustomersList().get(c).setPassword(password);
           Customer.getCustomersList().get(c).setId(id); 
         File f1 = new File("Customer.txt");
        try (PrintWriter file = new PrintWriter(f1)) {
            for (Customer get : Customer.getCustomersList()) {
                file.print(get.getName()+":");
                file.print(get.getUsername()+":");
                file.print(get.getPassword()+":");
                file.println(get.getId());
            }
            file.flush();
            file.close();
        }
        JOptionPane.showMessageDialog(null, "Updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
   }
  public static  int search (String id){
      for (int a =0; a<Customer.getCustomersList().size(); a++){
          if (Customer.getCustomersList().get(a).getId().equals(id)){
              return a;
          }
      }
      return -1;
  }
  public static void Edituser1(String name, String username, String password, String id) throws FileNotFoundException{
         Manager.getManagerList().get(c).setName(name);
           Manager.getManagerList().get(c).setUsername(username);
           Manager.getManagerList().get(c).setPassword(password);
           Manager.getManagerList().get(c).setId(id); 
         File f1 = new File("Manager.txt");
        try (PrintWriter file = new PrintWriter(f1)) {
            for (Manager get : Manager.getManagerList()) {
                file.print(get.getName()+":");
                file.print(get.getUsername()+":");
                file.print(get.getPassword()+":");
                file.println(get.getId());
            }
            file.flush();
            file.close();
        }
        JOptionPane.showMessageDialog(null, "Updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
   }
  public static  int search1 (String id){
      for (int a =0; a<Manager.getManagerList().size(); a++){
          if (Manager.getManagerList().get(a).getId().equals(id)){
              return a;
          }
      }
      return -1;
  }
  
  
  
  
  
  public static void delte(int id) throws FileNotFoundException{
      Customer.getCustomersList().remove(id);
      File f1 = new File("Customer.txt");
        try (PrintWriter file = new PrintWriter(f1)) {
            for (Customer get : Customer.getCustomersList()) {
                file.print(get.getName()+":");
                file.print(get.getUsername()+":");
                file.print(get.getPassword()+":");
                file.println(get.getId());
                
      
            }
            file.close();
            file.flush();
              JOptionPane.showMessageDialog(null, "Delete seccessfully    " , "Message" , JOptionPane.INFORMATION_MESSAGE); 
        }

       
      
     
 } 
   public static void delte1(int id) throws FileNotFoundException{
      Manager.getManagerList().remove(id);
      File f1 = new File("Manager.txt");
        try (PrintWriter file = new PrintWriter(f1)) {
            for (Manager get : Manager.getManagerList()) {
                file.print(get.getName()+":");
                file.print(get.getUsername()+":");
                file.print(get.getPassword()+":");
                file.println(get.getId());
                
      
            }
            file.close();
            file.flush();
              JOptionPane.showMessageDialog(null, "Delete seccessfully    " , "Message" , JOptionPane.INFORMATION_MESSAGE); 
        }

       
      
     
 } 
   
    static void addProduct(String name , String productID , int rate, double price ) throws IOException{
       PrintWriter file = new PrintWriter (new FileWriter ("Product.txt",true));
       file.print(name+":");
       file.print(productID+":");
       file.print(rate+":");
       file.println(price);
       file.flush();
       file.close();
       {
//        
           Product.getPList().clear();
           Data.ProductData();
            JOptionPane.showMessageDialog(null, "product has been add to the file  ", "Message", JOptionPane.INFORMATION_MESSAGE);  
       }
       
   }
      public static void EdiProduct(String name, String Productid, int rate, double price) throws FileNotFoundException, IOException{
         Product.getPList().get(c).setPname(name);
           Product.getPList().get(c).setPid(Productid);
           Product.getPList().get(c).setRate(rate);
        Product.getPList().get(c).setPrice(price); 
         File f1 = new File("Product.txt");
        try (PrintWriter file = new PrintWriter(f1)) {
            for (Product get : Product.getPList()) {
                file.print(get.getPname()+":");
                file.print(get.getPid()+":");
                file.print(get.getRate()+":");
                file.println(get.getPrice());
            }
            file.flush();
            file.close();
        }
      
        JOptionPane.showMessageDialog(null, "Updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
   }
     
   static  int serachpr(String id){
       for (int i=0; i<Product.getPList().size(); i++){
           if (Product.getPList().get(i).getPid().equals(id)){
               return i;
           }
       }
       return -1;
   }

   public static void deletPr(int ID) throws FileNotFoundException{
       Product.getPList().remove(ID);
       File f1 = new File("Product.txt");
        try (PrintWriter file = new PrintWriter(f1)) {
            for (Product get : Product.getPList()) {
                file.print(get.getPname()+":");
                file.print(get.getPid()+":");
                file.print(get.getRate()+":");
                file.println(get.getPrice());
            }
            file.close();
            file.flush();
              JOptionPane.showMessageDialog(null, "Delete seccessfully    " , "Message" , JOptionPane.INFORMATION_MESSAGE); 
        }  
   }
   
   public static void addorder(String id , String Cid, int item ) throws IOException{
       PrintWriter f = new PrintWriter (new FileWriter ("Orders.txt",true));
       f.print(id+":");
       f.print(Cid+":");
       f.println(item);
       {
           f.flush();
           f.close();
           OrdersClass.getOrderList().clear();
           Data.OrderData();
            JOptionPane.showMessageDialog(null, "Order has been add to the file  ", "Message", JOptionPane.INFORMATION_MESSAGE);  
       }
       
       
       
   }
   
   public static boolean ckorder(String id){
       for (int i=0; i<OrdersClass.getOrderList().size(); i++){
           if (OrdersClass.getOrderList().get(i).getID().equals(id)){
                  return true;
           }
          
        
           
       }
       return false;
               
   }
   
    static void addProduct1(String name , String productID , int rate, double price ) throws IOException{
       PrintWriter file = new PrintWriter (new FileWriter ("Orders.txt",true));
       file.print(name+":");
       file.print(productID+":");
       file.print(rate+":");
       file.println(price);
       file.flush();
       file.close();
       {
//        
           Product.getPList().clear();
           Data.ProductData();
            JOptionPane.showMessageDialog(null, "Order has been add to the file  ", "Message", JOptionPane.INFORMATION_MESSAGE);  
       }
       
   }
   public static boolean ckProduct(String id){
       for (int i=0; i<Product.getPList().size(); i++){
           if (Product.getPList().get(i).getPid().equals(id)){
                    return true;
           }

       }
     return false;
   }
   
   public static void editOrder(String id, String cid, int item) throws IOException{
       OrdersClass.getOrderList().get(c).setID(id);
       OrdersClass.getOrderList().get(c).setCustomer(cid);
       OrdersClass.getOrderList().get(c).setNumberOFitem(item);
       
        try (PrintWriter a = new PrintWriter (new FileWriter ("Orders.txt"))) {
            for(OrdersClass get :OrdersClass.getOrderList()){
                a.print(get.getID()+":");
                a.print(get.getCustomer()+":");
                a.println(get.getNumberOFitem());
            }
            a.flush();
            a.close();
          
        }
    JOptionPane.showMessageDialog(null, "Updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
     
     
   }
   public static void deletOrder(int Onum) throws IOException{
       OrdersClass.getOrderList().remove(Onum);
       File t = new File ("Orders.txt");
      try( PrintWriter file = new PrintWriter (t)){
          for (OrdersClass h :OrdersClass.getOrderList()){
              file.print(h.getCustomer()+":");
              file.print(h.getCustomer()+":");
              file.print(h.getNumberOFitem());
          }
          file.flush();
          file.close();
           JOptionPane.showMessageDialog(null, "Delete seccessfully    " , "Message" , JOptionPane.INFORMATION_MESSAGE); 
      }
          
      
       
   }
 
  public static int orderserach(String id){
      for (int i=0; i<OrdersClass.getOrderList().size(); i++){
          if (OrdersClass.getOrderList().get(i).getID().equals(id)){
              return i;
          }
      }
      return -1;
      
  }
   public static void addItem(final String Iname, final String Oid, final String Pid , int ni) throws IOException{
      PrintWriter it = new PrintWriter (new FileWriter("Item File.txt",true) );
      it.print(Iname+":");
      it.print(Oid+":");
      it.print(Pid+":");
      it.println(ni);
      {
          it.flush();
          it.close();
          JOptionPane.showMessageDialog(null, "order has been added seccessfully  " , "Message" , JOptionPane.INFORMATION_MESSAGE); 
      }
  }
  
  
   
}
