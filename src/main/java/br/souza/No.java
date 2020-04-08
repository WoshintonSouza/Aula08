package br.souza;

import java.util.*;

public class No {

    private String info;
    private No prox;

    public No(String name){

        info = name;
        prox = null;

    }

    public String getInfo(){
        return info;
    }

    public No getProx() {
            return prox;
    }

    public void setProx(No no) {
        this.prox = no;
    }

    
}