package com.inbev.tech.abstracaoedependencia;

public class nfEntrada {

    private long nfEntrada;
    private String cidadeOrigem;

    public nfEntrada(){
    }

    public nfEntrada(long nfEntrada, String cidadeOrigem){
        this.nfEntrada = nfEntrada;
        this.cidadeOrigem = cidadeOrigem;
    }

    public long getNfEntrada() {
        return nfEntrada;
    }

    public void setNfEntrada(long nfEntrada) {
        this.nfEntrada = nfEntrada;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }
}
