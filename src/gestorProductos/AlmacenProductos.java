/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorProductos;

import clasePadre.Producto;
import clasesHijas.NoParecero;
import clasesHijas.Parecedero;
import java.util.ArrayList;
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
public class AlmacenProductos {

    private ArrayList<Producto> arreglo;
    private int pos;

    public AlmacenProductos() {
        arreglo = new ArrayList<Producto>();
        pos = -1;
    }

    //Metodo para agregar un producto
    public void addProducto(Producto p) {
        arreglo.add(p);
        JOptionPane.showMessageDialog(null,"Producto agregado","Agregado con exito",1);
        pos++;
    }

    //Metodo para rellenar los valores
    public Producto rellenar(int i) {
        Producto a = null;

        String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre", ((i == 1) ? "Parecedero" : "No parecedero"), 1);
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el precio del producto", ((i == 1) ? "Parecedero" : "No parecedero"), 1));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad", "Introduciendo cantidad", 1));
        if (i == 1) {
            int diasCaducidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce los dias de caducidad", "Parecedero", 1));
            a = new Parecedero(diasCaducidad, nombre, precio);

        } else {
            String tipo = JOptionPane.showInputDialog(null, "Introduce el tipo", "No parecedero", 1);
            a = new NoParecero(tipo, nombre, precio);
        }
        a.calcular(cantidad);
        return a;
    }

    //Metodo para mostrar los productos
    public void mostrarProductos() {
        int a1=0,a2=0;
        String a = "";
        String b = "";
        for (Producto i : arreglo) {
            if (i instanceof Parecedero) {
                a1++;
                a = a + "\n" + i + "\n----------------";
            } else {
                a2++;
                b = b + "\n" + i + "\n----------------";
            }
        }
        JOptionPane.showMessageDialog(null, "PARECEDERO\n" + ((a1!=0) ? a : "Lista Vacias"), "Parecedero", 1);
        JOptionPane.showMessageDialog(null, "NO-PARECEDERO\n" + ((a2!=0) ? b : "Lista Vacias"), "No parecedero", 1);
    }

    //Metodo para mostrar precio total y precio de cada instancia
    public void mostrarPrecio(int d) {
        double a = 0;
        double b = 0;
        double total = 0;
        for (Producto i : arreglo) {
            total += i.getPrecio();
            if (i instanceof Parecedero) {
                a = +i.getPrecio();
            } else {
                b = +i.getPrecio();
            }
        }
        if (d == 1) {
            JOptionPane.showMessageDialog(null, "PARECEDERO PRECIO TOTAL:\n" + ((a != 0) ? a : "Lista Vacias"), "Parecedero", 1);
            JOptionPane.showMessageDialog(null, "NO-PARECEDERO PRECIO TOTAL:\n" + ((b != 0) ? b : "Lista Vacias"), "No Parecedero", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Precio total:\n" + total, "Total precio", 1);
        }
    }

    public boolean noVacia() {
        return (pos >= 0);
    }
}
