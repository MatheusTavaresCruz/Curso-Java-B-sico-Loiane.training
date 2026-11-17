package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {

        int[] grade = new int[10];

        Random random = new Random();

        for (int i = 0; i < grade.length; i++) {
            grade[i] = random.nextInt(10);
        }

        for (int i = 0; i < grade.length; i++) {
            int gradesx = grade [i];
            System.out.println("notas: " + gradesx);
        }

        System.out.println("Utilizando o ForEach");

        for (int grades : grade){

            System.out.println(grades);

        }

        //Exemplo 2: ()

        System.out.println("Arrays Multidimencionais \n");
        double [] [] gradeStudent = new double[3][4];

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

        for(double [] gradeStudents:gradeStudent){
            for (double gradE : gradeStudents) {
                System.out.println(gradE + " ");
            }
        }
        System.out.println();

    }
}
