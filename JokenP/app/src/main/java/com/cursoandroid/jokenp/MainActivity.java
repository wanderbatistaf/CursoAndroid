package com.cursoandroid.jokenp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");

    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");

    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");

    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResult);
        TextView textResultado = findViewById(R.id.textResult);

        int numero = new Random().nextInt(3);//0,1,2

        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
        }

        if ((opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
            (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
            (opcaoApp == "pedra" && opcaoSelecionada == "tesoura")){
            //App Ganha
            textResultado.setText("Você perdeu :P");

        }else if((opcaoSelecionada == "tesoura" && opcaoApp == "papel") ||
                (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
                (opcaoSelecionada == "pedra" && opcaoApp == "tesoura")){
            //User Ganha
            textResultado.setText("Você ganhou :)");
        }else{//Empate
            textResultado.setText("Empatamos :O");

        }


        System.out.println("Item clicado: " + numero);



    }
}