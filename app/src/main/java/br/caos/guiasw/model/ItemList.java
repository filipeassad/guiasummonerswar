package br.caos.guiasw.model;

import android.graphics.Bitmap;

/**
 * Created by 0118431 on 22/08/2016.
 */
public class ItemList {

    private String titulo;
    private Bitmap imagem;

    public ItemList() {
    }

    public ItemList(String titulo, Bitmap imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Bitmap getImagem() {
        return imagem;
    }

    public void setImagem(Bitmap imagem) {
        this.imagem = imagem;
    }
}
