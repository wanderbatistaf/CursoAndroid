package com.cursoandroid.classesemetodos.classes;


//extends é o @super do Python
class Cao extends Animal{

    void latir(){
        System.out.println("Latir como um cao.");
    }

    void correr(){
        super.correr();
        System.out.println("Cao");
    }
}
