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
public class Manager extends Users{
    private String name,id;
    private static LinkedList<Manager>ManagerList = new LinkedList <>();

    public static LinkedList<Manager> getManagerList() {
        return ManagerList;
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
    public static boolean loginofManager(String name , String pass){
        for (int i =0; i<Manager.getManagerList().size(); i++){
            if (Manager.getManagerList().get(i).getUsername().equals(name)&&Manager.getManagerList().get(i).getPassword().equals(pass)){
                return true;
            }
        }    return false;
    }    

    
}
