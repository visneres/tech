package com.inbev.tech.abstracaoedependencia;

import java.util.Date;

public class Refrigerante extends Produto{


    private boolean temAcucar;

    public Refrigerante(){

    }
    public Refrigerante(int id, String nome, Date dataFabricacao, int tempoValidade, boolean temAcucar){
        super(id, nome, dataFabricacao, tempoValidade);
        this.temAcucar = temAcucar;
    }


    public boolean getTemAcucar() {
        return temAcucar;
    }

    public void setTemAcucar(boolean temAcucar) {
        this.temAcucar = temAcucar;
    }

}
