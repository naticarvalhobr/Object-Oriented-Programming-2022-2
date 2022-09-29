/* Ponto de entrada de execução de todo o software */
package edu.ucb.aplication;

import edu.ucb.model.Conta;

public class main {
    Conta conta = new Conta(1000.0, 2000.0);
    
    /* Use a main apenas para invocar métodos e criar objetos */
    
    conta.depositar(1000.0);
    
    conta.sacar(200.0);
}
