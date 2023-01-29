package com.cursoandroid.classesemetodos.classes;

public class Animal {

    //Propriedades
    protected int tamanho;
    protected String cor;
    protected double peso;

    //Getters and Setters
    void setCor(String cor){
        //Formatação ou validação
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    String getCor(){
        return this.cor;
    }


    //Metodos(Ações)
    void dormir(){
        System.out.println("Dormir como um animal");
    }
    void correr(){
        System.out.println("Correr como um ");
    }
}
