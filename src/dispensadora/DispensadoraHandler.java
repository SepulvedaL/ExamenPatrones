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
