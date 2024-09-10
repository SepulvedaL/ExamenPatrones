package dispensadora;

/**
 *
 * @author Luis Sepulveda
 */
abstract class DispensadoraHandler implements IDispensadoraHandler {
    protected IDispensadoraHandler NextChain;

    @Override
    public void setNextChain(IDispensadoraHandler NextChain) {
        this.NextChain = NextChain;
    }

    @Override
    public void dispensar(int cantidad){
        if(NextChain != null){
            NextChain.dispensar(cantidad);
        }
    }
    
}
