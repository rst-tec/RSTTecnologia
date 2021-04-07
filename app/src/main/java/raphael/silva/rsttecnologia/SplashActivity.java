package raphael.silva.rsttecnologia;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        frase();

        getSupportActionBar().hide(); //REMOVER ACTIONBAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
            }
        },7000);
    }

    //FRASE MOTIVACIONAL:
    //https://www.ibccoaching.com.br/portal/lideranca-e-motivacao/confira-frases-motivacionais-famosas-inspiradoras/

    private void frase(){
        TextView texto = findViewById(R.id.idFrase);
        int i = new Random().nextInt(7);
        if(i == 0){
            texto.setText("O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis \n\n "+ "José de Alencar");

        }else if (i == 1){
            texto.setText("Se você quer ser bem-sucedido precisa de dedicação total, buscar seu último limite e dar o melhor de si mesmo.\n\n" + "Ayrton Senna");

        }else if (i == 2){
            texto.setText("Não crie limites para si mesmo. Você deve ir tão longe quanto sua mente permitir. O que você mais quer pode ser conquistado.\n\n" + "Mary Kay Ash");

        }else if (i == 3){
            texto.setText("Dificuldades preparam pessoas comuns para destinos extraordinários.\n\n" + "C.S Lewis");

        }else if (i == 4){
            texto.setText("Nenhum homem será um grande líder se quiser fazer tudo sozinho ou se quiser levar todo o crédito por fazer isso.\n\n" +"Andrew Carnegie");

        }else if (i == 5){
            texto.setText("Só existem dois dias do ano em que você não pode fazer nada: um se chama ontem e outro amanhã.\n\n" + "Dalai Lama");

        }else if (i == 6){
            texto.setText("Ouse ir além, ouse fazer diferente e o poder lhe será dado!\n\n" + "José Roberto Marques");

        }else if (i == 7) {
            texto.setText("Você nunca sabe que resultados virão da sua ação. Mas se você não fizer nada, não existirão resultados.\n\n" + "ahatma Gandhi");

        }else if (i == 8){
            texto.setText("O pessimista vê dificuldade em toda oportunidade. O otimista vê oportunidade em toda dificuldade.\n\n" + "Winston Churchill" );
        }
    }
}
