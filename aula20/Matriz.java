package com.loiane.cursojava.aula20;

public class Matriz {

    public static void main(String[] args) {

        double [] [] gradeStudent = new double[30][4];

        gradeStudent [0] [0] = 10;
        gradeStudent [0] [1] = 9;
        gradeStudent [0] [2] = 8;
        gradeStudent [0] [3] = 7;


        gradeStudent [1] [0] = 7;
        gradeStudent [1] [1] = 6;
        gradeStudent [1] [2] = 7;
        gradeStudent [1] [3] = 9;


        gradeStudent [2] [0] = 10;
        gradeStudent [2] [1] = 10;
        gradeStudent [2] [2] = 7;
        gradeStudent [2] [3] = 7;


        gradeStudent [3] [0] = 10;
        gradeStudent [3] [1] = 9;
        gradeStudent [3] [2] = 10;
        gradeStudent [3] [3] = 9.5;


        for (int i = 0; i< gradeStudent.length; i++){

            System.out.println("As notas de joão, helena, gustavo e davi são respectivamente postas em ordem:  "+ (i+1) + " = " + gradeStudent[i][i]);
        }
    }
}
