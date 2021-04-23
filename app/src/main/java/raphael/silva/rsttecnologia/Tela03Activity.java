package raphael.silva.rsttecnologia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela03Activity extends AppCompatActivity {

    private Button resposta1;
    private Button resposta2;
    private Button resposta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela03);

        resposta1 = findViewById(R.id.resposta1);
        resposta2 = findViewById(R.id.resposta2);
        resposta3 = findViewById(R.id.resposta3);

    }

    public void abrirDialog(View view){

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder( this );

        //Configurar titulo e mensagem
        dialog.setTitle("Resposta correta");
        dialog.setMessage("Parabéns voce acertou!");

        //Configurar cancelamento
        dialog.setCancelable(false);

        //Configurar icone
        //dialog.setIcon( android.R.drawable.ic_btn_speak_now );

        //Configura acoes para sim e nao
        dialog.setPositiveButton("Próxima Pergunta", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão Sim",
                        Toast.LENGTH_SHORT
                ).show();

            }
        });

        dialog.setNegativeButton("Tentar novamente", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão não",
                        Toast.LENGTH_SHORT
                ).show();

            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }

}
