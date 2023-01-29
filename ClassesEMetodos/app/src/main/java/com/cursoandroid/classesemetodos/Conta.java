package com.cursoandroid.classesemetodos;
/*
Modificadores de Acesso.

1) public -> Todas as classes terão acesso.
2) private -> Apenas pode ser acessado de dentro da Classe
3) protected -> Pode ser acessado estando dentro do nome pacote e/ou subclasses
4) default -> Caso não tenha sido definido nenhum modificador, permitindo o acesso dentro do pacote
 */


public class Conta {

    private int numeroConta;
    private double saldo = 100;

    public double recuperarSaldo(){
        return this.saldo;
    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    private void sacar(double valorSacar){
        this.saldo = this.saldo - valorSacar;
    }


}
