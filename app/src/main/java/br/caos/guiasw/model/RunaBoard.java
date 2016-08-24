package br.caos.guiasw.model;

import android.graphics.Bitmap;

/**
 * Created by 0118431 on 23/08/2016.
 */
public class RunaBoard {

    private Integer id;
    private String nome;
    private Integer numero;
    private Bitmap imagem;

    public RunaBoard() {
    }

    public RunaBoard(Integer id, String nome, Integer numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public RunaBoard(Integer id, String nome, Integer numero, Bitmap imagem) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.imagem = imagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Bitmap getImagem() {
        return imagem;
    }

    public void setImagem(Bitmap imagem) {
        this.imagem = imagem;
    }
}
