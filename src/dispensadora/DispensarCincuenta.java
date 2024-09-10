package dispensadora;

/**
 *
 * @author Luis Sepulveda
 */
public class DispensarCincuenta extends DispensadoraHandler {

    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= 50000) {
            int cantidadBilletes = cantidad / 50000;
            int sobrante = cantidad % 50000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de 50000");
            if (sobrante > 0) this.NextChain.dispensar(sobrante);
        } else {
            NextChain.dispensar(cantidad);
        }
    }
    
}
