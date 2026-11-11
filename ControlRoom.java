/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system;

/**
 *
 * @author wwwpa
 */
public class ControlRoom{
    //Helicopters helicopters = new Helicopters();
    Helicopters helicopters;
    Tank tank;
    Submarine submarine;
    public void setArea(boolean area){  
        notifyDevice(area);
    }
    
    public void notifyDevice(boolean area){
       // helicopters.update(area);
        //helicopters = new Helicopters();
       helicopters.update(area);
       tank.update(area);
       submarine.update(area);
    }
    
    
    
}
