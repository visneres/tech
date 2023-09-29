package com.inbev.tech.polimorfismo;

public class Gerente extends Funcionario{

    private double salario;

    public Gerente(){
    }

    public Gerente (String nome, String endereco, String telefone, String cpf){
        super(nome, endereco, telefone, cpf);
        this.salario = salario;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
