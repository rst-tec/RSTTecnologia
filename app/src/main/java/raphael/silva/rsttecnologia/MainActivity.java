package raphael.silva.rsttecnologia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private Button btApp01;
    private Button btApp02;
    private Button btApp03;
    private Button btApp04;
    private Button btApp05;
    private Button btApp06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* TESTE DE BANCO DE DADOS

        try{
            //CRIANDO BANCO DE DADOS
            SQLiteDatabase bancoDados = openOrCreateDatabase("app",MODE_PRIVATE,null);

            //CRIANDO TABELA
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas(nome VARCHAR, idade INT(3))");

            //ADICIONANDO DADOS
            bancoDados.execSQL("INSERT INTO pesssoas(nome, idade) VALUES('Raphael',30) ");
            bancoDados.execSQL("INSERT INTO pesssoas(nome, idade) VALUES('Maria',35) ");

            //RECUPERAR DADOS
            Cursor cursor = bancoDados.rawQuery("SELECT nome, idade FROM pessoas",null);

            //INDICE DA TABELA
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();//mover o cursor para o inicio da tabela

            while (cursor != null){
                Log.i("RESULTADO - Nome:", cursor.getString(indiceNome));
                Log.i("RESULTADO - Idade:", cursor.getString(indiceIdade));

                cursor.moveToNext();//mover o cursor para o proximo registro da tabela
            }

        }catch(Exception e){
            e.printStackTrace();

        }

         */

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        getSupportActionBar().hide(); //REMOVER ACTIONBAR

        btApp01 = findViewById(R.id.btApp01);
        btApp01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tela01Activity.class);
                startActivity(intent);
            }
        });

        btApp02 = findViewById(R.id.btApp02);
        btApp02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tela02Activity.class);
                startActivity(intent);
            }
        });

        btApp03 = findViewById(R.id.btApp03);
        btApp03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tela03Activity.class);
                startActivity(intent);
            }
        });

        btApp04 = findViewById(R.id.btApp04);
        btApp04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tela04Activity.class);
                startActivity(intent);
            }
        });





    }

}
