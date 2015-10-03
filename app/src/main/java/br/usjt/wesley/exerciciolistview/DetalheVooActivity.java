package br.usjt.wesley.exerciciolistview;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class DetalheVooActivity extends ActionBarActivity {
    TextView origemVoo;
    ImageView imageView;
    TextView precoVoo;
    TextView destinoVoo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_voo);

        Intent intent = getIntent();
        Serializable obj = intent.getSerializableExtra(ListaVooActivity.VOO);
        Voo voo = (Voo)obj;
        setupViews(voo);

    }

    private void setupViews(Voo voo) {
        origemVoo = (TextView) findViewById(R.id.txt_voo_origem);
        origemVoo.setText(voo.getOrigem());

        imageView= (ImageView) findViewById(R.id.voo_image_view);
        Drawable drawable = Util.getDrawable(this, voo.getImagem());
        imageView.setImageDrawable(drawable);

        precoVoo = (TextView) findViewById(R.id.txt_voo_preco);
        Locale locale = new Locale("pt", "BR");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        precoVoo.setText(""+formatter.format(voo.getPreco()));

        destinoVoo= (TextView) findViewById(R.id.txt_voo_destino);
        destinoVoo.setText(voo.getDestino());


    }

}
