/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Sepulveda
 */
public class Dispensadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DispensadoraHandler cien = new DispensarCien();
        DispensadoraHandler cin = new DispensarCincuenta();
        DispensadoraHandler vein = new DispensarVeinte();
        DispensadoraHandler diez = new DispensarDiez();
        DispensadoraHandler cinco = new DispensarCinco();
        
        cien.setNextChain(cin);
        cin.setNextChain(vein);
        vein.setNextChain(diez);
        diez.setNextChain(cinco);
        
        String numeroString = JOptionPane.showInputDialog("Digite la cantidada a retirar");
        int cantidad = Integer.parseInt(numeroString);
        
        /*if(cantidad % 5000 == 0){
            cien.dispensar(cantidad);
        }else{
            JOptionPane.showMessageDialog(null, "Cantidad no valida", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
        
        while(cantidad % 5000 != 0){
            JOptionPane.showMessageDialog(null, "Cantidad no valida", "Error", JOptionPane.ERROR_MESSAGE);
            numeroString = JOptionPane.showInputDialog("Digite la cantidada a retirar en multiplos de $5000");
            cantidad = Integer.parseInt(numeroString);
        }
        
        cien.dispensar(cantidad);

        //System.out.println("Usamos mas de 100.0000");
        
        //System.out.println("Usamos mas de 50.0000");
        /*cien.dispensar(60000);
        System.out.println("Usamos mas de 30.0000");
        cien.dispensar(40000);
        System.out.println("Usamos mas de 10.0000");
        cien.dispensar(10000);*/
      
    }
    
}
