package com.inbev.tech.abstracaoedependencia;

import java.util.Date;

public class Produto {
    private int id;
    private String nome;
    private Date dataFabricacao;
    private int tempoValidade;

    public Produto(){
    }

    public Produto(int id, String nome, Date dataFabricacao, int tempoValidade){
        this.id = id;
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.tempoValidade = tempoValidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getTempoValidade() {
        return tempoValidade;
    }

    public void setTempoValidade(int tempoValidade) {
        this.tempoValidade = tempoValidade;
    }
}
