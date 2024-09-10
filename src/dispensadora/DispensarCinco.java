/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadora;

/**
 *
 * @author Luis Sepulveda
 */
public class DispensarCinco extends DispensadoraHandler{
    
    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= 5000) {
            int cantidadBilletes = cantidad / 5000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de 5000");
        }
    }
}
