/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePadre;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 2/07/2021
 *
 */
public class Producto {

    /*
     Nos piden hacer que gestionemos una serie de productos.
     Los productos tienen los siguientes atributos:
     • Nombre
     • Precio
     Tenemos dos tipos de productos:
     • Perecedero: tiene un atributo llamado días a caducar
     • No perecedero: tiene un atributo llamado tipo
     */
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Tendremos una función llamada calcular, que según cada clase hará una cosa u otra, a esta función le pasaremos un numero siendo la cantidad de productos
    //• En Producto, simplemente seria multiplicar el precio por la cantidad de productos pasados.
    public void calcular(int cantidad) {
        setPrecio(precio*cantidad);
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nPrecio: " + precio+"$";
    }

}
