package com.inbev.tech.model;

public class PessoaFisica extends Pessoa {

    private int idade;

    public PessoaFisica(){
    }
    public PessoaFisica(String nome, String endereco, long telefone, int idade){
        super(nome, endereco, telefone);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}