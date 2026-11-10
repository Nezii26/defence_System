/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system;

/**
 *
 * @author wwwpa
 */
public class ControlRoom {
    
    public void setArea(boolean area){        
        notifyDevice(area);
    }
    
    public void notifyDevice(boolean area){
        Observer obj = new Helicopters();
        obj.update(area);
    }
    
}
