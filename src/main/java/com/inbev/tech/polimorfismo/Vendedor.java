package com.inbev.tech.polimorfismo;

public class Vendedor extends Funcionario{

    private double totalVenda;

    public Vendedor(){
    }

    public Vendedor(String nome, String endereco, String telefone, String cpf){
        super(nome, endereco, telefone, cpf);
        this.totalVenda = totalVenda;
    }

    @Override
    public double calcularBonus() {
        return totalVenda * 0.1;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
}
