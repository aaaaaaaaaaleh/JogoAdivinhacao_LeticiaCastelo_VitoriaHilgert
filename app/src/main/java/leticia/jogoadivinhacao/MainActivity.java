package leticia.jogoadivinhacao;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // criando as variáveis no código
    private Button btn_opcao1;
    private Button btn_opcao2;
    private Button btn_opcao3;
    private TextView txt_resultado;
    private TextView txt_numPensado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associando os componentes criadas no activity_main.xml com as variáveis criadas no MainActivity
        //a associação é feita buscando pelo id dos componentes
        btn_opcao1 = findViewById(R.id.btn_opcao1);
        btn_opcao2 = findViewById(R.id.btn_opcao2);
        btn_opcao3 = findViewById(R.id.btn_opcao3);
        txt_resultado = findViewById(R.id.txt_resultado);
        txt_numPensado = findViewById(R.id.txt_numPensado);

        //define que os botões deverão chamar um escutador ao serem clicados
        btn_opcao1.setOnClickListener(new EscutadorBotao1());
        btn_opcao2.setOnClickListener(new EscutadorBotao2());
        btn_opcao3.setOnClickListener(new EscutadorBotao3());
    }

    //método que será chamado ao clicar no botão 1
    class EscutadorBotao1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            //usa o Random para guardar um número aleatório de 1 a 3
            //o +1 é usado porque, no java, os números começam a ser contados a partir do 0
            int num_random = new Random().nextInt(3) + 1;

            //exibindo na tela o número aleatório
            txt_numPensado.setText(String.valueOf(num_random));

            //definindo o resultado, ou seja, se o número "pensado" e o número informado pelo usuário são iguais
            if (num_random == 1) {
                txt_resultado.setText("Você acertou!!");
            } else {
                txt_resultado.setText("Você errou.");
            }

            //definindo a mensagem que será exibida pelo Toast
            String msg = "Número selecionado: " + btn_opcao1.getText() + "\n" + "Número pensado: " + txt_numPensado.getText() + "\n" + "Resultado: " + txt_resultado.getText();

            //chamando o Toast e passando como um dos parâmetros a mensagem definida acima
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
        }
    }

    //método que será chamado ao clicar no botão 2
    class EscutadorBotao2 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int num_random = new Random().nextInt(3) + 1;
            txt_numPensado.setText(String.valueOf(num_random));
            if (num_random == 2) {
                txt_resultado.setText("Você acertou!!");
            } else {
                txt_resultado.setText("Você errou.");
            }
            String msg = "Número selecionado: " + btn_opcao2.getText() + "\n" + "Número pensado: " + txt_numPensado.getText() + "\n" + "Resultado: " + txt_resultado.getText();
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
        }
    }

    //método que será chamado ao clicar no botão 3
    class EscutadorBotao3 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int num_random = new Random().nextInt(3) + 1;
            txt_numPensado.setText(String.valueOf(num_random));
            if (num_random == 3) {
                txt_resultado.setText("Você acertou!!");
            } else {
                txt_resultado.setText("Você errou.");
            }
            String msg = "Número selecionado: " + btn_opcao3.getText() + "\n" + "Número pensado: " + txt_numPensado.getText() + "\n" + "Resultado: " + txt_resultado.getText();
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
        }
    }
}