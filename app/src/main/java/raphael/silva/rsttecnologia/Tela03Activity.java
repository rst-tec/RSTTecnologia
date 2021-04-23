package raphael.silva.rsttecnologia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
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


        resposta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        resposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exemplo_layout();
            }
        });

    }

    private AlertDialog alerta;

    private void exemplo_layout() {
        //LayoutInflater é utilizado para inflar nosso layout em uma view.
        //-pegamos nossa instancia da classe
        LayoutInflater li = getLayoutInflater();

        //inflamos o layout alerta.xml na view
        View view = li.inflate(R.layout.alerta, null);
        //definimos para o botão do layout um clickListener
        view.findViewById(R.id.btFechar).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //exibe um Toast informativo.
                Toast.makeText(Tela03Activity.this, "alerta.dismiss()", Toast.LENGTH_SHORT).show();
                //desfaz o alerta.
                alerta.dismiss();
            }
        });

        view.findViewById(R.id.btProxima).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), Tela04Activity.class);
                startActivity(intent);
                alerta.dismiss();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(view);
        alerta = builder.create();
        alerta.show();
    }
}