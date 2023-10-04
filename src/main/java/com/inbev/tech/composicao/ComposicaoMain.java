package com.inbev.tech.composicao;


public class ComposicaoMain {
    public static void main(String[] args){
        Tipo tipo1 = new Tipo(1, "Porcelana");
        Produto produto1 = new Produto(1, "Prato", 30.90, tipo1);

        System.out.println(produto1);
    }
}
