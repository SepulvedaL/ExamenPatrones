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
public interface IDispensadoraHandler {
    void setNextChain(IDispensadoraHandler NextChain);
    void dispensar(int cantidad);
}
