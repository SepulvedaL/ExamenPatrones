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
