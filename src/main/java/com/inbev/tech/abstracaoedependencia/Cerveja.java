package com.inbev.tech.abstracaoedependencia;

import java.util.Date;

public class Cerveja extends Produto{

    private String cidadeFabricacao;

    public Cerveja(){

    }
    public Cerveja(int id, String nome, Date dataFabricacao, int tempoValidade, String cidadeFabricacao){
        super(id, nome, dataFabricacao, tempoValidade);
        this.cidadeFabricacao = cidadeFabricacao;
    }

    public String getCidadeFabricacao() {
        return cidadeFabricacao;
    }

    public void setCidadeFabricacao(String cidadeFabricacao) {
        this.cidadeFabricacao = cidadeFabricacao;
    }
}
