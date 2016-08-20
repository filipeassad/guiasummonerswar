package br.caos.guiasw.model;

import android.graphics.Bitmap;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class Habilidade {

    private Integer id;
    private Integer idMonstro;
    private String nome;
    private String descricao;
    private Bitmap imgHabilidade;

    public Habilidade() {
    }

    public Habilidade(Integer id, String nome, String descricao, Integer idMonstro, Bitmap imgHabilidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.idMonstro = idMonstro;
        this.imgHabilidade = imgHabilidade;
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

    public Integer getIdMonstro() {
        return idMonstro;
    }

    public void setIdMonstro(Integer idMonstro) {
        this.idMonstro = idMonstro;
    }

    public Bitmap getImgHabilidade() {
        return imgHabilidade;
    }

    public void setImgHabilidade(Bitmap imgHabilidade) {
        this.imgHabilidade = imgHabilidade;
    }
}
