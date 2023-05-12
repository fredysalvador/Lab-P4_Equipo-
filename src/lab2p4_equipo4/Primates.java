/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lourdes
 */
public class Primates extends SeresVivos {

    private double Cantcomida;
    private double CuantoCxKM;
    private String LugarNacimiento;

    public Primates(double Cantcomida, double CuantoCxKM, String LugarNacimiento,
            String nombre, String GrupoSanguíneo, String sexo, double altura, int peso) {
        super(nombre, GrupoSanguíneo, sexo, altura, peso);
        this.Cantcomida = Cantcomida;
        this.CuantoCxKM = CuantoCxKM;
        this.LugarNacimiento = LugarNacimiento;
    }

    public double getCantcomida() {
        return Cantcomida;
    }

    public void setCantcomida(double Cantcomida) {
        this.Cantcomida = Cantcomida;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String LugarNacimiento) {
        this.LugarNacimiento = LugarNacimiento;
    }

    public double getCuantoCxKM() {
        return CuantoCxKM;
    }

    public void setCuantoCxKM(double CuantoCxKM) {
        this.CuantoCxKM = CuantoCxKM;
    }
    

    @Override
    public String toString() {
        return "PRIMATES:" + "\nNombre= " + nombre
                + "\nGrupo Sanguineo= " + GrupoSanguíneo
                + "\nSexo=" + sexo + "\n Altura= " + altura + "\nPeso= " + peso
                + "\nCantidad de Comida= " + Cantcomida + "\nLugar de Nacimiento= " 
                + LugarNacimiento + "\n Cuanto Come Por KM"+CuantoCxKM;
    }

}
