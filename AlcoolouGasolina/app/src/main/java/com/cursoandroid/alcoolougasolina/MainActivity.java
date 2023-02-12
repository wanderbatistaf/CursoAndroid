package com.cursoandroid.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view){

        //Recuperar valores digitados pelo user
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //Validar os campos digitados
        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina);
        if(camposValidados){

            //Convertendo String para Números
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            /*Calculo Utilizado
            Se (valorAlcool / valorGasolina) >= 0.7 é melhor utilizar gasolina
            Se não, é melhor usar álcool.
             */

            Double valorFinal = valorAlcool/valorGasolina;
            if(valorFinal >= 0.7){
                textResultado.setText("Melhor ir de Gasolina!");
            }else{
                textResultado.setText("Melhor ir de Álcool!");
            }

        }else {
            textResultado.setText("Preencha todos os campos!");
        }

    }

    public Boolean validarCampos(String pAlcool, String pGasolina){

        Boolean camposValidados = true;

        if(pAlcool == null | pAlcool.equals("")){
            camposValidados = false;
        } else if (pGasolina == null | pGasolina.equals("")) {
            camposValidados = false;
        }

        return camposValidados;

    }
}