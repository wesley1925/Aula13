package br.usjt.wesley.exerciciolistview;

import java.io.Serializable;

public class Voo implements Comparable<Voo>, Serializable{
    private String origem;
    private String imagem;
    private double valor;
    private String destino;

    public static final String NAO_ENCONTRADA = "Não encontrada.";

    public Voo(String origem, String destino, String imagem, double valor) {
        this.origem = origem;
        this.imagem = imagem;
        this.valor = valor;
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getPreco() {
        return valor;
    }

    public void setPreco(double preco) {
        this.valor = preco;
    }

    public String getDestino() {return destino;}

    public void setDestino(String destino) {this.destino = destino;}

      @Override
    public int compareTo(Voo voo) {
        if (voo.equals(this)){
            return 0;
        }
        return 1;
    }
}
