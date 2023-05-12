/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p4_equipo4;

import java.util.List;

/**
 *
 * @author Fredy Salvador
 */
public class Aeroespacial extends Transportes{

private String Tipo_comb;
private boolean combatop;

    public Aeroespacial(){ 
    super();
    }

    public Aeroespacial(String Tipo_comb, boolean combatop, Double capcTant, Double CantMaxKmTanLle, List<String> Primates) {
        super(capcTant, CantMaxKmTanLle, Primates);
        this.Tipo_comb = Tipo_comb;
        this.combatop = combatop;
    }

    public String getTipo_comb() {
        return Tipo_comb;
    }

    public void setTipo_comb(String Tipo_comb) {
        this.Tipo_comb = Tipo_comb;
    }

    public boolean isCombatop() {
        return combatop;
    }

    public void setCombatop(boolean combatop) {
        this.combatop = combatop;
    }

   



    
    
    
    
    
    
    
    
}
