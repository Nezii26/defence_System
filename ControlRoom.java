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
    
    Helicopters helicopters;
    Tank tank;
    Submarine submarine;
    Observer  observer; 
    MainController mainController;
    
    
    String[] saveArray = new String[0];
    String[] saveUnitMsg = new String[0];
    
    
  
    public void saveMsg(String msg){
        String[] tempMainMsg =  new String[saveArray.length+1];
        for(int i=0; i<saveArray.length; i++){
            tempMainMsg[i]=saveArray[i];
        }
        tempMainMsg[saveArray.length]=msg;
        saveArray=tempMainMsg;
        
    }
    
    public void unitSoliderCount(int soliderCount){
        
        mainController.UnitSoliderCount(soliderCount);

    
    }
    public void unitAmmoCount(int ammoCount){
        
        mainController.UnitAmmoCount(ammoCount);
    
    }
    
    
     public void getMSG(String msgFromUnit) {
        String[] tempUnitMsg =  new String[saveUnitMsg.length+1];
        for(int i=0; i<saveUnitMsg.length; i++){
            tempUnitMsg[i]=saveUnitMsg[i];
        }
        tempUnitMsg[saveUnitMsg.length]=msgFromUnit;
        saveUnitMsg=tempUnitMsg;
        
        mainController.displayUnitMsg(msgFromUnit);
        
        
    }
    
    public void notifyMessage(String msg) {
        saveMsg(msg);
         observer.updateMessage(msg);
        
    }

    public void updateMainMessage(){
        
        for(String msg : saveArray){
            observer.updateMessage(msg);
        }
    }	
    
    public void setArea(boolean area){  
        notifyDevice(area);
    }
    
    public void notifyDevice(boolean area){
       
       helicopters.update(area);
       tank.update(area);
       submarine.update(area);
    }
  
}
