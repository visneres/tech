package com.inbev.tech.composicao;

public class Produto {

        private int id;
        private String descricao;
        private double valor;
        private Tipo tipo;

        public Produto (int id, String descricao, double valor, Tipo tipo){
                this.id = id;
                this.descricao = descricao;
                this.valor = valor;
                this.tipo = tipo;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public double getValor() {
                return valor;
        }

        public void setValor(double valor) {
                this.valor = valor;
        }

        public String toString(){
                return "PRODUTO \nid: " + id + "\nDescrição: " + descricao + "\nValor: R$ " + valor + "\nTipo: " + tipo;
        }
}
