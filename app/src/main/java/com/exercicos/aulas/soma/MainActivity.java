package com.exercicos.aulas.soma;
/*
bibliotecas que são necessários para o funcionamento do projeto, equivalente ao Using do C#.
Quando é necessário importar uma biblioteca a classe fica em vermelho por não ser reconhecida. Para corrigir pode :
1 - digitar o import manualmente
2 - clicar sobre a classe com erro e aguardar a solicitação do Android Studio para pressionar ALt+Tab
3 - clicar com o botão direito sobra a classe e selecionar a opção importar
*/

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


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
        num1 = (EditText) findViewById(R.id.num1);
        num2= (EditText) findViewById(R.id.num2);
        btnSoma = (Button) findViewById(R.id.btnCalcula);
        result = (TextView) findViewById(R.id.resultado);

        btnSoma.setOnClickListener(view -> {
            n1 =Integer.parseInt(String.valueOf(num1.getText()));
            n2 = Integer.parseInt(String.valueOf(num2.getText()));
            soma = n1+n2;
            result.setText(String.valueOf(soma));

        });
    }





}

