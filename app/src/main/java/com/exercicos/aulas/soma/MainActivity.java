package com.exercicos.aulas.soma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/*
    Cria uma instância dos elementos utilizados na tela
    EditText --> Caixa de edição de texto
    TextView --> Exibição de texto ( equivale ao Label do C#)
 */

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;

    //Variaveis locais para manipulação de Valores
    int n1,n2,soma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
    associar os elementos locais aos elementos de tela através da propriedade ID
    onde:
        findViewById --> método que localiza os elementos
        R --> Classe autogerada que mapeia a View

 */
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.resultado);
        btnSoma = (Button)findViewById(R.id.btnCalcula);

    }

    // método associado ao evento Click do botão
    //Recebe sempre a classe View como parametrro, que contém as informações da origem da ação
    public void Calcula(View view){
        //recupera o valor do elemento
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        soma = n1 + n2;

        //modifica o valor do elemento para exibir em tela
        result.setText(Integer.toString(soma));
    }


}

