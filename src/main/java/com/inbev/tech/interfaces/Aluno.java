package com.inbev.tech.interfaces;

public class Aluno implements CalculoCusto, CursosFormacao{

    private int id;
    private String nome;
    private String telefone;


    public Aluno(int id, String nome, String telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public double calcularAjudaCusto() {
        return 0;
    }

    @Override
    public String verificarFormacoes() {
        return null;
    }
}
