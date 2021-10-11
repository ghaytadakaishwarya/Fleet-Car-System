/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class VitalInfo {
     private int model_num;
     private String manufacturer;
     private int Occupancy;
     private String manu_Certi;
     private int serial_num;
     private String city;
     private boolean Car_Availability;
     private String Brand_Name;
     private int Man_Date;
     private String Seat_capacity;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getOccupancy() {
        return Occupancy;
    }

    public void setOccupancy(int Occupancy) {
        this.Occupancy = Occupancy;
    }

    public String getManu_Certi() {
        return manu_Certi;
    }

    public void setManu_Certi(String manu_Certi) {
        this.manu_Certi = manu_Certi;
    }

    public int getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(int serial_num) {
        this.serial_num = serial_num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean getCar_Availability() {
        return Car_Availability;
    }

    public void setCar_Availability(boolean Car_Availability) {
        this.Car_Availability = Car_Availability;
    }

    public String getBrand_Name() {
        return Brand_Name;
    }

    public void setBrand_Name(String Brand_Name) {
        this.Brand_Name = Brand_Name;
    }

    public int getMan_Date() {
        return Man_Date;
    }

    public void setMan_Date(int Man_Date) {
        this.Man_Date = Man_Date;
    }

    public String getSeat_capacity() {
        return Seat_capacity;
    }

    public void setSeat_capacity(String Seat_capacity) {
        this.Seat_capacity = Seat_capacity;
    }

    

    
    
    @Override
    public String toString(){
        return Brand_Name;
        
    }   

    public void setModel_num(int model_num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMan_Certi(String manu_Certi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCar_Availability(boolean Car_Availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMan_Date(String Man_Date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSeat_Capacity(String Seat_Capacity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
