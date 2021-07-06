/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHijas;

import clasePadre.Producto;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 2/07/2021
 *
 */
public class Parecedero extends Producto {
//• Perecedero: tiene un atributo llamado días a caducar

    private int diasCaducidad;

    public Parecedero(int diasCaducidad, String nombre, double precio) {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }
    /*
     • En Perecedero, aparte de lo que hace producto, el precio se reducirá según los días a caducar:
     o Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
     o Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
     o Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final. 
     */

    @Override
    public void  calcular(int cantidad) {
        double total = cantidad * super.getPrecio();
        switch (this.diasCaducidad) {
            case 1:
                total = (total / 4);
                break;
            case 2:
                total = (total / 3);
                break;
            case 3:
                total = (total / 2);
                break;
            default:
                break;
        }
        super.setPrecio(total);
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nDias Caducidad: " + diasCaducidad;
    }

}
