package com.loiane.cursojava.exeraula25_27.exerfeitotrabalho;

public class Student {

    String name;
    int registration;
    String course;
    String discipline1;
    String discipline2;
    String discipline3;
    double noteDiscipline1;
    double noteDiscipline2;
    double noteDiscipline3;

    boolean approved(String disciplineConsult) {
        if (disciplineConsult.equalsIgnoreCase(discipline1)) {
            return noteDiscipline1 >=7;
        }else if(disciplineConsult.equalsIgnoreCase(discipline2)){
            return noteDiscipline2 >= 7;
        }else if(disciplineConsult.equalsIgnoreCase(discipline3)){
            return noteDiscipline3 >= 7 ;
        } else{
            System.out.println("Disciplina não encntrada");
            return false;
        }
    }

    void register(String name,int registration, String course){

        this.name = name;
        this.registration = registration;
        this.course = course;

        System.out.printf("Seus dados são:\n nome: %s \n matricula: %s \n curso: %s\n", this.name, this.registration,this.course);
    }
    void discipline(String courseDiscipline1,String courseDiscipline2, String courseDiscipline3, double note1, double note2, double note3){
        discipline1 = courseDiscipline1;
        discipline2 = courseDiscipline2;
        discipline3 = courseDiscipline3;
        noteDiscipline1 = note1;
        noteDiscipline2 = note2;
        noteDiscipline3 = note3;
    }



}
