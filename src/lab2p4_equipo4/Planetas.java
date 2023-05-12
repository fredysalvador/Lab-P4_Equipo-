/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lourdes
 */
public class Planetas {
    
    private String NombrePlaneta;
    private double DistanciaTierra;

    public Planetas(String NombrePlaneta, double DistanciaTierra) {
        this.NombrePlaneta = NombrePlaneta;
        this.DistanciaTierra = DistanciaTierra;
    }

    public String getNombrePlaneta() {
        return NombrePlaneta;
    }

    public void setNombrePlaneta(String NombrePlaneta) {
        this.NombrePlaneta = NombrePlaneta;
    }

    public double getDistanciaTierra() {
        return DistanciaTierra;
    }

    public void setDistanciaTierra(double DistanciaTierra) {
        this.DistanciaTierra = DistanciaTierra;
    }

    @Override
    public String toString() {
        return "\n PLANETAS: " + "\n Nombre del Planeta= " + NombrePlaneta
                + "\n Distancia desde la Tierra= " + DistanciaTierra;
    }
    
    
}
