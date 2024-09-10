package dispensadora;

/**
 *
 * @author Luis Sepulveda
 */
public class DispensarCien extends DispensadoraHandler{

    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= 100000) {
            int cantidadBilletes = cantidad / 100000;
            int sobrante = cantidad % 100000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de 100000");
            if (sobrante > 0) NextChain.dispensar(sobrante);
        } else {
            NextChain.dispensar(cantidad);
        }
    }
    
}
