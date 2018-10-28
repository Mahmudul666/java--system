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
public class Product {
    private String pname;
    private String Pid;
    private int rate;
    private double price;
  private static LinkedList<Product>PList = new LinkedList <>();

    public static LinkedList<Product> getPList() {
        return PList;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
