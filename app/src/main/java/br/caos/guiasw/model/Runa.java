package br.caos.guiasw.model;

import android.graphics.Bitmap;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class Runa {

    private Integer id;
    private String nome;
    private String descricao;
    private Bitmap imagem;

    public Runa() {
    }

    public Runa(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Runa(Integer id, String nome, String descricao, Bitmap imagem) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Bitmap getImagem() {
        return imagem;
    }

    public void setImagem(Bitmap imagem) {
        this.imagem = imagem;
    }
}
