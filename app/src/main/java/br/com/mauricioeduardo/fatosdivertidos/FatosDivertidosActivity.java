package br.com.mauricioeduardo.fatosdivertidos;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FatosDivertidosActivity extends ActionBarActivity {
    private fatoBook fatosBook = new fatoBook();
    private mudaCor mudaCores = new mudaCor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatos_divertidos);


        final TextView factLabel = (TextView) findViewById(R.id.fatoDiverView);
        final Button showButton = (Button) findViewById(R.id.buttonProximo);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fatos = fatosBook.getFatos();
                factLabel.setText(fatos);

                int cores = mudaCores.getColor();
                relativeLayout.setBackgroundColor(cores);
                showButton.setTextColor(cores);
            }
        };
        showButton.setOnClickListener(listener);
        //Metodo de teste
        //Toast.makeText(this,"O activity foi criado!!",Toast.LENGTH_LONG).show();
    }

}

