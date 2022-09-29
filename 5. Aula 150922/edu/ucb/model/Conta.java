package edu.ucb.model;

public class Conta {
    
    /* Visibilidade, tipo de acesso, modificador de acesso: private, public, protected
    Public: acessado por todas as classes da aplicação, de qualquer pacote
    Protected: acessado pelas classes do pacote e daquelas classes que são herdadas da que possui o atributo protected
    Privated: acessado por membros da própria classe, ou seja, pelos métodos públicos
    */
    
    private String titular;
    private double saldo, limite;
    private int numero;
    
    public Conta(double valor, double limite){ // método construtor: possui o nome da classe
        this.limite = limite;
        saldo = valor;
    }

    /* Muitas vezes, realiza inúmeras operações dentro de uma classe por meio de
    métodos privados, e as outras classes visualizam apenas o resultado por meio
    dos métodos públicos, além dos sets e gets.
    */
    private void saldoComLimite() {
        saldo = saldo + limite;
        System.out.println("Saldo com limite: " + saldo);
    }
    
    private void saldoSemLimite() {
        saldo = saldo - limite;
        System.out.println("Saldo sem limite: " + saldo);
    }
    
    public void depositar(double valor){ /* Pode usar esse método para acessar o atributo privado */
        saldo += valor; /* saldo = saldo + valor */ 
        /* Não precisa usar o "this" porque o nome do parâmetro é diferente do nome do atributo */
        System.out.println("Deposito efetuado com sucesso!");
        System.out.println("Saldo atual: " + saldo);
    }
    
    public double sacar (double valor) {
        saldoComLimite();
        saldoSemLimite();
        
        if (valor >= (saldo + limite)){
            System.out.println("Saldo indisponivel.");
            return 0.0;
        } else {
            saldo -= valor;
            saldoComLimite();
            saldoSemLimite();
        }
        
        return saldo;
    }
}
