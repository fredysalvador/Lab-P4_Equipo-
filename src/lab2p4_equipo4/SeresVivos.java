/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lourdes
 */
public class SeresVivos implements AbstractUsuario{

    public String nombre;
    public String GrupoSanguíneo;
    public String sexo;
    public double altura;
    public int peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String GrupoSanguíneo, String sexo, double altura, int peso) {
        this.nombre = nombre;
        this.GrupoSanguíneo = GrupoSanguíneo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupoSanguíneo() {
        return GrupoSanguíneo;
    }

    public void setGrupoSanguíneo(String GrupoSanguíneo) {
        this.GrupoSanguíneo = GrupoSanguíneo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Contraseña() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
