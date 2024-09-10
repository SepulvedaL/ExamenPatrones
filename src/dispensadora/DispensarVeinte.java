package dispensadora;

/**
 *
 * @author Luis Sepulveda
 */
public class DispensarVeinte extends DispensadoraHandler{

    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= 20000) {
            int cantidadBilletes = cantidad / 20000;
            int sobrante = cantidad % 20000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de 20000");
            if (sobrante > 0) NextChain.dispensar(sobrante);
        } else {
            NextChain.dispensar(cantidad);
        }
    }
    
}
