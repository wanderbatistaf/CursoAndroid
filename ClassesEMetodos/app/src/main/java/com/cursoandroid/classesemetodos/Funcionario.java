package com.cursoandroid.classesemetodos;

class Funcionario {

    //Propriedades
    String nome;
    double salario;

    //Métodos(Ações}
    //void = Método sem retorno
    double recuperarSalario(double bonus, double descontoAdicional){
        //Ao usar o this, significa que estou referenciando a propriedade da própria classe
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;
        //System.out.println(this.salario);
    }

}
