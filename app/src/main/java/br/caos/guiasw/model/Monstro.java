package br.caos.guiasw.model;

import android.graphics.Bitmap;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class Monstro {

    private Integer id;
    private String nome;
    private Integer vida;
    private Integer ataque;
    private Integer defesa;
    private Integer velocidade;
    private Integer chanceCritico;
    private Integer danoCritico;
    private Integer resistencia;
    private Integer precisao;

    private Bitmap imgPequena;
    private Bitmap imgGrande;

    public Monstro() {
    }

    public Monstro(Integer id, String nome, Integer vida, Integer ataque, Integer defesa, Integer velocidade, Integer chanceCritico, Integer danoCritico, Integer resistencia, Integer precisao) {
        this.id = id;
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.chanceCritico = chanceCritico;
        this.danoCritico = danoCritico;
        this.resistencia = resistencia;
        this.precisao = precisao;
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

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getChanceCritico() {
        return chanceCritico;
    }

    public void setChanceCritico(Integer chanceCritico) {
        this.chanceCritico = chanceCritico;
    }

    public Integer getDanoCritico() {
        return danoCritico;
    }

    public void setDanoCritico(Integer danoCritico) {
        this.danoCritico = danoCritico;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getPrecisao() {
        return precisao;
    }

    public void setPrecisao(Integer precisao) {
        this.precisao = precisao;
    }

    public Bitmap getImgPequena() {
        return imgPequena;
    }

    public void setImgPequena(Bitmap imgPequena) {
        this.imgPequena = imgPequena;
    }

    public Bitmap getImgGrande() {
        return imgGrande;
    }

    public void setImgGrande(Bitmap imgGrande) {
        this.imgGrande = imgGrande;
    }
}
