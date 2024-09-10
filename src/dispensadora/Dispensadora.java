package dispensadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Sepulveda
 */
public class Dispensadora {

    public static void main(String[] args) {

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
        
        while(cantidad % 5000 != 0){
            JOptionPane.showMessageDialog(null, "Cantidad no valida", "Error", JOptionPane.ERROR_MESSAGE);
            numeroString = JOptionPane.showInputDialog("Digite la cantidada a retirar en multiplos de $5000");
            cantidad = Integer.parseInt(numeroString);
        }
        
        cien.dispensar(cantidad);
      
    }
    
}
