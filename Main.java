package com.company;

public class Main {


    static Fila filaA = new Fila();
    static Fila filaB = new Fila();
    public static void main(String[] args) {

        filaA.inicializa(2);
        filaB.inicializa(3);

        filaA.insere(1);
        filaA.insere(2);
        filaB.insere(1);
        filaB.insere(4);
        filaB.insere(5);


        System.out.print("Fila A\n");
        filaA.imprime();
        System.out.print("Fila B\n");
        filaB.imprime();

        System.out.print("MERGE\n");
        new Merge(filaA, filaB, 6);




    }
}
