package com.inbev.tech.composicao;

public class Tipo {

    private int id;
    private String descricao;

    public Tipo(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return "id do tipo = " + id + ", descrição = " + descricao;
    }

}
