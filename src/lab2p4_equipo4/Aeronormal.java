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
public class Aeronormal extends Transportes {
    private int cant_pas;
    private double longit;
    private int cant_motores;

    public Aeronormal() {
        super();
    }

    public Aeronormal(int cant_pas, double longit, int cant_motores, Double capcTant, Double CantMaxKmTanLle, List<String> Primates) {
        super(capcTant, CantMaxKmTanLle, Primates);
        this.cant_pas = cant_pas;
        this.longit = longit;
        this.cant_motores = cant_motores;
    }

    public int getCant_pas() {
        return cant_pas;
    }

    public void setCant_pas(int cant_pas) {
        this.cant_pas = cant_pas;
    }

    public double getLongit() {
        return longit;
    }

    public void setLongit(double longit) {
        this.longit = longit;
    }

    public int getCant_motores() {
        return cant_motores;
    }

    public void setCant_motores(int cant_motores) {
        this.cant_motores = cant_motores;
    }
    
        @Override
    public String toString() {
        return "Transportes{" + "capcTant=" + capcTant + ", CantMaxKmTanLle=" + CantMaxKmTanLle + ", Primates=" + Primates + ",cant_pas=" + cant_pas + ", longit=" + longit + ", cant_motores=" + cant_motores + '}';
    }
    
    
    
}
