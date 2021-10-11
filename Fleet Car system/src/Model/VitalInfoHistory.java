/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class VitalInfoHistory {
    
    private ArrayList<VitalInfo> History;
    
    public VitalInfoHistory(){
        this.History=new ArrayList<VitalInfo>();
    }

    public ArrayList<VitalInfo> getHistory() {
        return History;
    }

    public void setHistory(ArrayList<VitalInfo> History) {
        this.History = History;
    }
    
    
    public VitalInfo addNewVitals(){
        
        VitalInfo  newVitals = new VitalInfo();
        History.add(newVitals);
        return newVitals;
    }
    
    public void deleteVitals(VitalInfo vih){
        History.remove(vih);
    }
    
    
    
    
    
    
    
    
    
    
 
}
