package dispensadora;

/**
 *
 * @author Luis Sepulveda
 */
public interface IDispensadoraHandler {
    void setNextChain(IDispensadoraHandler NextChain);
    void dispensar(int cantidad);
}
