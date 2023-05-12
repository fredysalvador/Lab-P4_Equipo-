/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p4_equipo4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fredy Salvador
 */
public class Lab2P4_Equipo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //  rrayList<Transportes> transportes = new ArrayList();
        // ArrayList Estaciones = new ArrayList();
        ArrayList Transportes = new ArrayList();

        int opcion = 0;

        while (opcion != 6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Area de Seres Vivos\n2-Area de Planetas\n3-Area de Transporte\n4-Inicio de Sesion\n5-Salir"));

            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

                int menu = Integer.parseInt(JOptionPane.showInputDialog("1-Agregar Nave\n2-Eliminar Nave\n3-Actualizar Nave\n4-Listar Naves"));

                if (menu == 1) {

                    Double capTan = Double.valueOf(JOptionPane.showInputDialog("Ingrese la Capacidad del Tanque de Combustible"));
                    Double cantmaxkm = Double.valueOf(JOptionPane.showInputDialog("Ingrese la Cantidad de Km que soporta el tanque lleno"));
                    String Listaprim = "0";

                    Transportes t = new Transportes(capTan, cantmaxkm, null);

                    Transportes.add(t);

                } else if (menu == 2) {
                    
                ////Separación de codigos
                int f = 0;

                String mensaje2 = "Lista de Transportes:\n";

                for (Object clase :  Transportes) {
                    // System.out.println(clase);
                    mensaje2 += "Posicion-" + f + " - " + clase + "\n";

                    f++;
                }
                String PosTras = JOptionPane.showInputDialog(null, "Seleccione la Posiccion de la Clase a Agregar\n" + mensaje2);

                Transportes.remove(PosTras);
                JOptionPane.showInputDialog("Producto Eliminado Exitosamente");    
                    
                    
                    
                } else if (menu == 3) {

                    for (int i = 0; i < Transportes.size(); i++) {
                        JOptionPane.showMessageDialog(null, "" + Transportes.indexOf(Transportes.get(i)) + "-" + Transportes.get(i));
                    }
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar: "));

                    if (pos >= 0 && pos < Transportes.size()) {
                        if (Transportes.get(pos) instanceof Transportes) {
                            ((Transportes) Transportes.get(pos)).setCapcTant(Double.valueOf(JOptionPane.showInputDialog("Ingrese el nombre de la bebida: \n")));
                            ((Transportes) Transportes.get(pos)).setCantMaxKmTanLle(Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio de la bebida: \n")));
                            ((Transportes) Transportes.get(pos)).setPrimates(null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun Transportes en la posicion ingresada!!!");
                    }

                } else if (menu == 4) {
                    
                    
                    String mensaje = "Lista de Transportes:\n";
                    for (Object t : Transportes) {
                        
                        mensaje +=  t + "\n";
                        
                    }   JOptionPane.showMessageDialog(null, mensaje);
                  

                } else if (menu == 5) {

                }

            } else if (opcion == 4) {
                
                

            } else if (opcion == 5) {

            } else if (opcion == 6) {

            }

        }

    }

}
