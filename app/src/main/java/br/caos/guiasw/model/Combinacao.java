package br.caos.guiasw.model;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class Combinacao {

    private Integer id;
    private Integer idMonstro;

    private String runa1;
    private String runa2;
    private String runa3;

    private String tiporuna1;
    private String tiporuna2;
    private String tiporuna3;

    public Combinacao() {
    }

    public Combinacao(Integer id, Integer idMonstro, String runa1, String runa2, String runa3, String tiporuna1, String tiporuna2, String tiporuna3) {
        this.id = id;
        this.idMonstro = idMonstro;
        this.runa1 = runa1;
        this.runa2 = runa2;
        this.runa3 = runa3;
        this.tiporuna1 = tiporuna1;
        this.tiporuna2 = tiporuna2;
        this.tiporuna3 = tiporuna3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdMonstro() {
        return idMonstro;
    }

    public void setIdMonstro(Integer idMonstro) {
        this.idMonstro = idMonstro;
    }

    public String getRuna1() {
        return runa1;
    }

    public void setRuna1(String runa1) {
        this.runa1 = runa1;
    }

    public String getRuna2() {
        return runa2;
    }

    public void setRuna2(String runa2) {
        this.runa2 = runa2;
    }

    public String getRuna3() {
        return runa3;
    }

    public void setRuna3(String runa3) {
        this.runa3 = runa3;
    }

    public String getTiporuna1() {
        return tiporuna1;
    }

    public void setTiporuna1(String tiporuna1) {
        this.tiporuna1 = tiporuna1;
    }

    public String getTiporuna2() {
        return tiporuna2;
    }

    public void setTiporuna2(String tiporuna2) {
        this.tiporuna2 = tiporuna2;
    }

    public String getTiporuna3() {
        return tiporuna3;
    }

    public void setTiporuna3(String tiporuna3) {
        this.tiporuna3 = tiporuna3;
    }

}
