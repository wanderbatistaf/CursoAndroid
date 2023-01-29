package com.cursoandroid.frasesdemotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "O Caminho é longo, mas a derrota é certa.",
                "É só uma fase ruim, logo vai piorar.",
                "Para de desejar e comece a desistir.",
                "Os sonhos antecedem os seus facassos.",
                "Seja o protagonista do seu fracasso.",
                "No começo é difícil, mas no final dará errado.",
                "Nenhum obstáculo é grande para quem desiste.",
                "Desiste não. Tudo tem o momento certo para dar errado.",
                "O não você ja tem. Agora vai lá buscar a humilhação.",
                "Lute como nunca. Perca como sempre.",
        };
        int numero = new Random().nextInt(9); //0,1,2,3,4,5,6,7,8,9

        TextView texto = findViewById(R.id.textFrase);
        texto.setText( frases[numero] );



    }
}