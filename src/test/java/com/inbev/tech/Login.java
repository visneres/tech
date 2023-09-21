package com.inbev.tech;

public class Login {

    public String login(String user) {
        if(user.equals("Erro")){
            return "Erro";
        }
        return "ok";
    }
}
