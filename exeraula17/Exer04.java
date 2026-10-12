package com.loiane.cursojava.exeraula17;

public class Exer04 {

    public static void main(String[] args) {


        boolean validar = false;
        double habitantesA = 80000;
        double habitantesB = 200000;
        double crescimentoA = 3;
        double crescimentoB = 1.5;
        int contador = 0;
        double novaPopulacaoA;
        double novaPopulacaoB;



        do{
            novaPopulacaoA=(habitantesA*(crescimentoA/100));
            novaPopulacaoB=(habitantesB*(crescimentoB/100));

            habitantesA=novaPopulacaoA+habitantesA;
            habitantesB=novaPopulacaoB+habitantesB;
            contador++;

            if (habitantesA >= habitantesB){
                validar = true;

            }else{
                System.out.println("Habitantes A:" +habitantesA);
                System.out.println("Habitantes B:" +habitantesB);
                System.out.println("O numero de A é menor que B");
            }

        }while(!validar);

        System.out.println("A população A: " + habitantesA + " demorou "+ contador+" Anos para ultrapassar ou se igualar a população B; " + habitantesB);
    }

}
