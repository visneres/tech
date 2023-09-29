package com.inbev.tech.abstracaoedependencia;

public class ProdutoTransferencia extends nfEntrada{

    private String cidadeDestino;

    public ProdutoTransferencia(){
    }

    public ProdutoTransferencia(long nfEntrada, String cidadeOrigem, String cidadeDestino){
        super(nfEntrada, cidadeOrigem);
        this.cidadeDestino = cidadeDestino;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }
}
