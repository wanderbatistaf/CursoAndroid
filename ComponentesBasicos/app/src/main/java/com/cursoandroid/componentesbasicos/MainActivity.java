package com.cursoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

//    RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        campoNome = findViewById(R.id.editNome);
        textoResultado = findViewById(R.id.textResultado);
        campoEmail = findViewById(R.id.editEmail);

//        CheckBox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

//        RadioButton
        sexoFeminino = findViewById(R.id.radioButtonF);
        sexoMasculino = findViewById(R.id.radioButtonM);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        radiobutton();


    }

    public void radiobutton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if( checkedId == R.id.radioButtonM){
                    textoResultado.setText("Masculino");
                }else if( checkedId == R.id.radioButtonF){
                    textoResultado.setText("Feminino");
                }

            }
        });

        /*
        if(sexoMasculino.isChecked()){
            textoResultado.setText(texto);

        } else if (sexoFeminino.isChecked()) {
            textoResultado.setText(texto);
        }
         */

    }



    public void enviar(View view){

//        radiobutton();

//        checkbox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText( "Nome: " + nome + "\n" + "E-mail: " + email );
        */
    }

    public void checkbox(){

        String texto = "";

        if(checkVerde.isChecked()){
//            String corSelecionada = checkVerde.getText().toString();
//            texto = corSelecionada;
            texto = "Verde Selecionado - ";
        }

        if(checkBranco.isChecked()){
            texto = texto + "Branco Selecionado - ";
        }

        if(checkVermelho.isChecked()){
            texto = texto + "Vermelho Selecionado - ";
        }

        textoResultado.setText( texto );

    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");

        checkVerde.setChecked(false);
        checkBranco.setChecked(false);
        checkVermelho.setChecked(false);
    }

}