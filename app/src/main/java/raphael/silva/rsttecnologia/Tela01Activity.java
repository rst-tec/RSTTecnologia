package raphael.silva.rsttecnologia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tela01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela01);

        getSupportActionBar().hide(); //REMOVER ACTIONBAR
    }
}
