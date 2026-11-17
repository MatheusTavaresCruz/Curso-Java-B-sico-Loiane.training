package com.loiane.cursojava.exeraula25_27.exerfeitotrabalho;

import java.util.Scanner;

public class Exer03 {

    static void main() {

        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite seu nome: ");
        String name = scan.nextLine();

        System.out.println("Digite sua matricula: ");
        int registration = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu curso: ");
        String course = scan.nextLine();

        System.out.println("Digite sua disciplina1: ");
        String disciplina1 = scan.nextLine();
        System.out.println("Digite sua disciplina2: ");
        String disciplina2 = scan.nextLine();
        System.out.println("Digite sua disciplina3: ");
        String disciplina3 = scan.nextLine();

        System.out.println("Digite sua nota1");
        double note1 = scan.nextDouble();
        System.out.println("Digite sua nota2");
        double note2 = scan.nextDouble();
        System.out.println("Digite sua nota3");
        double note3 = scan.nextDouble();
        scan.nextLine();

        student.discipline(disciplina1,disciplina2,disciplina3, note1, note2, note3);
        student.register(name, registration, course);


        System.out.println("Digite o nome da disciplina que deseja verificar:");
        String disciplineConsult = scan.nextLine();

        boolean verifyApproved = student.approved(disciplineConsult);

        if(verifyApproved){
            System.out.printf("\n Você está aprovado na disciplina: %s \n",disciplineConsult);
        }else{
            System.out.println("Você está reprovado na disciplina (Ou disciplina digitada não existe)");
        }

        System.out.printf("\n Suas disciplinas são:\n %s nota = %s \n %s nota = %s \n %s nota = %s \n", disciplina1,note1, disciplina2,note2,disciplina3, note3 );

    }
}
