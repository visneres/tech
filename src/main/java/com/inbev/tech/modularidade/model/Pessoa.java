package com.inbev.tech.modularidade.model;

 public class Pessoa {

    private String nome;
    private String endereco;
    private long telefone;

    public Pessoa(){

    }
    public Pessoa(String nome, String endereco, long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}