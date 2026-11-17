package com.loiane.cursojava.exeraula25_27.exerfeitotrabalho;

public class Lamp {

    boolean turnOn;

    void turnOn(){
        turnOn = true;
    }

    void turnOff(){
        turnOn = false;
    }

    void showStatus(){
        if(turnOn) {
            System.out.println("Lampada esta ligada!");
        }else{
            System.out.println("A lampada foi desligada!");
        }
    }
    void changeStatus(){
        if (turnOn){
            System.out.println("A lampada foi desligada!");
        }else {
            System.out.println("A lampada foi ligada!");
        }

    }
}
