package br.souza;

public class Lista {

    private No first;

    public Lista(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void addEnd(final String name) {
        final No newNode = new No(name);
        if(isEmpty()){
        first = newNode;
        }else{
            No aux = first;
            while(aux.getProx() != null){

                aux = aux.getProx();

            }
            aux.setProx(newNode);
        }
    }

    public void addStart(String name){
        No newNode = new No(name);
        if(isEmpty()){
            first = newNode;
        }else{
            newNode.setProx(first);
            first = newNode;
        }
    }

    public No removeStart(){
        if(isEmpty()){
            return null;
        }
        No aux = first;
        first = first.getProx();
        return aux;
    }

    public No removeEnd(){
        if(isEmpty()){
            return null;
        }
        No aux = first;
        No previus = null;

        while(aux.getProx() != null){
            previus = aux;
            aux = aux.getProx();
        }

        if(previus != null){
            previus.setProx(null);
        }else{
            first = null;
        }

        return aux;
    }

    public String Show(){

        String out = "";
        No aux = first;

        while(aux != null){
            out += aux.getInfo() + "; " ;
            aux = aux.getProx();
        }

        return out;
    }



}