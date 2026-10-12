package com.loiane.cursojava.aula13;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado = falso & falso;
        boolean resultado2 = falso && verdadeiro;
        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
