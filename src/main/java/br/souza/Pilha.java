package br.souza;

public class Pilha {

    private No top;

    public Pilha(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String name){
        No newNode = new No(name);
        if(isEmpty()){
            top = newNode;
        }else{
            newNode.setProx(top);
            top = newNode;
        }
    }

    public No pop(){
        if(isEmpty()){
            return null;
        }
        No aux = top;
        top = top.getProx();
        return aux;
    }

    public String peek(){
        if(isEmpty()){
            return null;
        }
        return top.getInfo();
    }

    public String Show(){

        String out = "";
        No aux = top;

        while(aux != null){
            out += aux.getInfo() + "; " ;
            aux = aux.getProx();
        }

        return out;
    }



}