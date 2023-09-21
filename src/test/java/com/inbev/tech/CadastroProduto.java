package com.inbev.tech;

public class CadastroProduto {
    public String cadastrar(String cafe){
        if(cafe.equals("erro")){
            return "erro";
        }
        return "cadastrado";
    }
}
