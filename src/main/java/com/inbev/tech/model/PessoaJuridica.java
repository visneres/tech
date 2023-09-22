package com.inbev.tech.model;

public class PessoaJuridica extends Pessoa {

    private long cpf;

    public PessoaJuridica(){
    }
    public PessoaJuridica(String nome, String endereco, long telefone, long cpf){
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}