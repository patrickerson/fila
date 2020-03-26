package com.company;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;


    Fila(){
        this.primeiro = -1;
        this.ultimo = -1;
    }
    boolean cheia(){
        if(ultimo+1== dados.length){
            System.out.println("Cheia");
            return true;
        }
        else{

            return false;
        }
    }

    boolean vazia(){
        if(ultimo  == primeiro || ultimo == -1){
            return true;
        }
        else {
            return false;
        }
    }

    void insere(int e){

        if(cheia()){
        }else {
            ultimo++;
            dados[ultimo] = e;

        }
    }

    int remove(){
        if(vazia()){
            return 99999;
        }
        else {
            primeiro++;
            return dados[primeiro];
        }
    }

    void imprime(){
        for(int i=primeiro+1; i<=ultimo;i++){
            System.out.println(dados[i]);
        }
    }

    void inicializa(int n){
        this.dados = new int[n];
    }
}
