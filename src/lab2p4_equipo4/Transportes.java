/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p4_equipo4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fredy Salvador
 */
public class Transportes {
    public Double capcTant;
    public Double CantMaxKmTanLle; 
    public List<String> Primates; 

    public Transportes(){
    }
    
    
    public Transportes(Double capcTant, Double CantMaxKmTanLle, List<String> Primates) {
        this.capcTant = capcTant;
        this.CantMaxKmTanLle = CantMaxKmTanLle;
        this.Primates =  new ArrayList<>();
    }

    public Double getCapcTant() {
        return capcTant;
    }

    public void setCapcTant(Double capcTant) {
        this.capcTant = capcTant;
    }

    public Double getCantMaxKmTanLle() {
        return CantMaxKmTanLle;
    }

    public void setCantMaxKmTanLle(Double CantMaxKmTanLle) {
        this.CantMaxKmTanLle = CantMaxKmTanLle;
    }

    public List<String> getPrimates() {
        return Primates;
    }

    public void setPrimates(List<String> Primates) {
        this.Primates = Primates;
    }


    
}
