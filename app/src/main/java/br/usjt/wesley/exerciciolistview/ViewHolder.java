package br.usjt.wesley.exerciciolistview;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    private ImageView fotoVoo;
    private TextView dadoVoo;

    public ViewHolder(ImageView fotVoo, TextView dadosVoo) {
        this.fotoVoo = fotVoo;
        this.dadoVoo = dadosVoo;

    }

    public ImageView getFotinhoVoo() {
        return fotoVoo;
    }

    public void setFotinhoVoo(ImageView fotinhoVoo) {
        this.fotoVoo = fotinhoVoo;
    }

    public TextView getDadosVoo() {
        return dadoVoo;
    }

    public void setDadosVoo(TextView dadosVoo) {
        this.dadoVoo = dadosVoo;
    }


}
