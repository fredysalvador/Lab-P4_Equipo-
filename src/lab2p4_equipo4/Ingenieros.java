package lab2p4_equipo4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lourdes
 */
public class Ingenieros extends SeresVivos {
    
    private int NumRRHH;

    public Ingenieros(int NumRRHH, String nombre, String GrupoSanguíneo, String sexo, double altura, int peso) {
        super(nombre, GrupoSanguíneo, sexo, altura, peso);
        this.NumRRHH = NumRRHH;
    }

    public int getNumRRHH() {
        return NumRRHH;
    }

    public void setNumRRHH(int NumRRHH) {
        this.NumRRHH = NumRRHH;
    }

    @Override
    public String toString() {
        return "\n INGENIERO: \n" + "\n Nombre= " + nombre
                + "\n Grupo Sanguineo= " + GrupoSanguíneo
                + "\n Sexo=" + sexo + "\n Altura= " + altura + "\n Peso= " + peso+ "\nNumero de RRHH= " + NumRRHH ;
    }
    
    public String nivel() {
        return "Ingeniero";
    }
}
