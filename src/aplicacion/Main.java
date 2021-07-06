/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clasePadre.Producto;
import clasesHijas.NoParecero;
import clasesHijas.Parecedero;
import gestorProductos.AlmacenProductos;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 2/07/2021
 *
 */
public class Main {

    public static void main(String[] args) {
        AlmacenProductos gestor = new AlmacenProductos();
        Producto a;
        int op = 0, opi = 0;
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU PRINCIPAL\n"
                        + "1.-Agregar Producto"
                        + "\n2.-Mostrar Productos"
                        + "\n3.-Mostrar Precio"
                        + "\n4.-Mostrar Precio Total"
                        + "\n5.-Salir"
                        + "\n¿Que desea realizar?", "MENU", 3));
                switch (op) {
                    case 1: {
                        do {
                            try {

                                opi = Integer.parseInt(JOptionPane.showInputDialog(null, "AGREGAR\n"
                                        + "1.-Agregar Producto Parecedero"
                                        + "\n2.-Agregar Producto No Parecederp"
                                        + "\n3.-Salir al menu principal\n¿Que desea realizar?", "Agregar", 3));
                                switch (opi) {
                                    case 1: {
                                        a = gestor.rellenar(1);
                                        gestor.addProducto(a);
                                        break;
                                    }
                                    case 2: {
                                        a = gestor.rellenar(2);
                                        gestor.addProducto(a);
                                        break;
                                    }
                                    case 3: {
                                        JOptionPane.showMessageDialog(null, "Saliendo al menu Principal", "Saliendo", 1);
                                        break;
                                    }
                                    default: {
                                        JOptionPane.showMessageDialog(null, "Introduce valores validor", "Valores no validos", 2);
                                        break;
                                    }
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
                            }
                        } while (opi != 3);

                        break;
                    }
                    case 2: {
                        if (gestor.noVacia()) {
                            gestor.mostrarProductos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);

                        }

                        break;
                    }
                    case 3: {
                        if (gestor.noVacia()) {
                            gestor.mostrarPrecio(1);
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
                        }
                        break;
                    }
                    case 4: {
                        if (gestor.noVacia()) {
                            gestor.mostrarPrecio(2);
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
                        }
                        break;
                    }

                    case 5: {
                        JOptionPane.showMessageDialog(null, "Cerrando programa", "Saliendo", 2);

                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce valores validor", "Valores no validos", 2);

                        break;
                    }

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }
        } while (op != 5);
        /*  Producto arreglo[] = new Producto[4];
         arreglo[0] = new NoParecero("Agua", "Ciel", 10);
         arreglo[1] = new NoParecero("Agua", "Ciel", 10);
         arreglo[2] = new Parecedero(3, "Coca", 10);
         arreglo[3] = new Parecedero(3, "Coca", 10);
         double n1 = 0, n2 = 0;
         for (Producto a : arreglo) {
         a.calcular(5);
         if (a instanceof NoParecero) {
         n1 += a.getPrecio();
         } else if (a instanceof Parecedero) {
         n2 += a.getPrecio();
         }
         }
         System.out.println("No parecero: " + n1);
         System.out.println("Parecero: " + n2);*/
    }

}
