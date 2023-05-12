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

        //  rrayList<transportes> transportes = new ArrayList();
        // ArrayList Estaciones = new ArrayList();
        ArrayList<Transportes> transportes = new ArrayList();

        int opcion = 0;

        while (opcion != 6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Area de Seres Vivos\n2-Area de Planetas\n3-Area de Transporte\n4-Inicio de Sesion\n5-Salir"));

            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

                int menu = Integer.parseInt(JOptionPane.showInputDialog("1-Agregar Nave\n2-Eliminar Nave\n3-Actualizar Nave\n4-Listar Naves"));

                if (menu == 1) {

                    int tipodato = 0;

                    while (tipodato != 3) {
                        tipodato = Integer.parseInt(JOptionPane.showInputDialog("1-Crear Nave Aero Espacial\n2-Crear Nave Aero Normal \n3-Salir"));

                        if (tipodato == 1) {

                            Double capTan = Double.valueOf(JOptionPane.showInputDialog("Ingrese la Capacidad del Tanque de Combustible"));
                            Double cantmaxkm = Double.valueOf(JOptionPane.showInputDialog("Ingrese la Cantidad de Km que soporta el tanque lleno"));
                            String Listaprim = "0";
                            String TipoCom = JOptionPane.showInputDialog("Ingrese el tipo de Combustible");

                            Object[] opciones = {"Verdadero", "Falso"};

                            // Muestra la caja de diálogo y obtiene el índice de la opción seleccionada
                            int seleccion = JOptionPane.showOptionDialog(null, "Es de Combate la Nave?", "Seleccione una opción",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                            // Asigna el valor booleano correspondiente según la opción seleccionada
                            boolean valor = (seleccion == 0) ? true : false;
                            
                            
                            Aeroespacial t = new Aeroespacial();

                            transportes.add(t);

                        } else if (tipodato == 2) {

                            Double capTan = Double.valueOf(JOptionPane.showInputDialog("Ingrese la Capacidad del Tanque de Combustible"));
                            Double cantmaxkm = Double.valueOf(JOptionPane.showInputDialog("Ingrese la Cantidad de Km que soporta el tanque lleno"));

                            String Listaprim = "0";

                            Aeronormal c = new Aeronormal();

                            transportes.add(c);

                        }

                    }

                } else if (menu == 2) {

                    ////Separación de codigos
                    int f = 0;

                    String mensaje2 = "Lista de transportes:\n";

                    for (Object clase : transportes) {
                        // System.out.println(clase);
                        mensaje2 += "Posicion-" + f + " - " + clase + "\n";

                        f++;
                    }
                    String PosTras = JOptionPane.showInputDialog(null, "Seleccione la Posiccion de la Clase a Agregar\n" + mensaje2);

                    transportes.remove(PosTras);
                    JOptionPane.showInputDialog("Producto Eliminado Exitosamente");

                } else if (menu == 3) {

                    for (int i = 0; i < transportes.size(); i++) {
                        JOptionPane.showMessageDialog(null, "" + transportes.indexOf(transportes.get(i)) + "-" + transportes.get(i));
                    }
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar: "));

                    if (pos >= 0 && pos < transportes.size()) {
                        if (transportes.get(pos) instanceof Aeroespacial) {
                            ((Aeroespacial) transportes.get(pos)).setCapcTant(Double.valueOf(JOptionPane.showInputDialog("Ingrese el nombre de la bebida: \n")));
                            ((Aeroespacial) transportes.get(pos)).setCantMaxKmTanLle(Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio de la bebida: \n")));
                            ((Aeroespacial) transportes.get(pos)).setPrimates(null);

                        } else if (transportes.get(pos) instanceof Aeronormal) {
                            ((Aeronormal) transportes.get(pos)).setCapcTant(Double.valueOf(JOptionPane.showInputDialog("Ingrese el nombre de la bebida: \n")));
                            ((Aeronormal) transportes.get(pos)).setCantMaxKmTanLle(Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio de la bebida: \n")));
                            ((Aeronormal) transportes.get(pos)).setPrimates(null);

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun transportes en la posicion ingresada!!!");
                    }

                } else if (menu == 4) {

                    String mensaje = "Lista de transportes:\n";
                    for (Object t : transportes) {

                        mensaje += t + "\n";

                    }
                    JOptionPane.showMessageDialog(null, mensaje);

                } else if (menu == 5) {

                }

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {

            }

        }

    }

}
