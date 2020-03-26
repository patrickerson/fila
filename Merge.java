package com.company;

public class Merge {
    Fila A;
    Fila B;
    Fila C = new Fila();

    private int atual_a;
    private int atual_b;

    Merge(Fila a, Fila b, int n){
        this.A = a;
        this.B = b;
        this.atual_a = A.remove();
        this.atual_b = B.remove();
        C.inicializa(n);

        System.out.println("Merge");
        for (int i = 0; i < n; i++) {
            if(!(A.vazia() || B.vazia())){
                add_smaller();
            }else{
                if(A.vazia()){
                    add_rest(B);
                }else {
                    add_rest(A);
                }
            }

        }
        System.out.println("Fila C");
        C.imprime();
    }

    void add_smaller(){
        C.imprime();
        if(atual_a<atual_b){
            C.insere(atual_a);
            atual_a = A.remove();
        } else if(atual_a==atual_b){
            C.insere(atual_a);
            C.insere(atual_b);
            atual_a = A.remove();
            atual_b = B.remove();
        }
        else{
            System.out.print(atual_b);
            C.insere(atual_b);
            atual_b = B.remove();
        }
    }

    void add_rest(Fila restante){

        while (atual_b < 9999 || atual_a < 9999){
            System.out.println("rest");
            add_smaller();
        }
    }

}
