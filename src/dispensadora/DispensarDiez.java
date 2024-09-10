package dispensadora;

/**
 *
 * @author Luis Sepulveda
 */
public class DispensarDiez extends DispensadoraHandler{
    
    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= 10000) {
            int cantidadBilletes = cantidad / 10000;
            int sobrante = cantidad % 10000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de 10000");
            if (sobrante > 0) this.NextChain.dispensar(sobrante);
        } else {
            NextChain.dispensar(cantidad);
        }
    }
}
