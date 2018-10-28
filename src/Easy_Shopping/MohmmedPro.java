/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Shopping;

import java.io.IOException;

/**
 *
 * 
 */
public class MohmmedPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      Admin.create_Admin();
      Data.mydata();
      LoginForm get = new LoginForm();
      get.setLocationRelativeTo(null);
      get.setVisible(true);
        System.out.println(Product.getPList().get(0).getPid());
        System.out.println(OrdersClass.getOrderList().get(1).getID());
      
        // TODO code application logic here
    }
    
}
