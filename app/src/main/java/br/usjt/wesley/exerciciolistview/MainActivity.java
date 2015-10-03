package br.usjt.wesley.exerciciolistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends ActionBarActivity {

    Spinner spinnerOrigem;
    Spinner spinnerDestino;


    Button btnConsultar;
    String origem,destino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();

    }

    private void setupViews() {
        origem = "";
        destino = "";
        btnConsultar = (Button) findViewById(R.id.botao_enviar);
        spinnerOrigem = (Spinner) findViewById(R.id.dropdown_origem);
        spinnerOrigem.setOnItemSelectedListener(new OrigemSelecionado());
        spinnerDestino = (Spinner) findViewById(R.id.dropdown_destino);
        spinnerDestino.setOnItemSelectedListener(new DestinoSelecionada());
    }

    private class OrigemSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            origem = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    private class DestinoSelecionada implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            destino = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    // constante static para identificar a mensagem
    public final static String ORIGEM = "br.usjt.wesley.exerciciolistview.ORIGEM";
    public final static String DESTINO = "br.usjt.wesley.exerciciolistview.DESTINO";
    public final static String MODO = "br.usjt.wesley.exerciciolistview.MODO";
    public final static String SIMPLES = "br.usjt.wesley.exerciciolistview.SIMPLES";
    public final static String MELHOR = "br.usjt.wesley.exerciciolistview.MELHOR";

    //será chamado quando o usuário clicar em enviar
    public void consultarVoos(View view) {
        consultar(view, SIMPLES);
    }

    public void consultarVoosMelhor(View view) {
        consultar(view, MELHOR);
    }

    public void consultar(View view, String modo){
        String passarOrigem = this.origem.equals("Selecione uma cidade")?"":origem;
        String passarDestino = this.destino.equals("Selecione uma cidade")?"":destino;


        Intent intent = new Intent(this, ListaVooActivity.class);
        intent.putExtra(ORIGEM, passarOrigem);
        intent.putExtra(DESTINO, passarDestino);
        intent.putExtra(MODO, modo);
        startActivity(intent);
    }

}
