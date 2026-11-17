package com.loiane.cursojava.exeraula25_27;


public class Lamp {

    int voltage;
    String wattage;
    String model;
    String color;
    String typeLight;
    int warrantyInMonths;
    String[] types;
    boolean lampshadeType;
    boolean turnOn;

    void turnOn() {
        turnOn = true;
  }
    void turnOff(){
        turnOn = false;
    }

    void showStatus() {
        if (turnOn) {
            System.out.println("A luz foi ligada!");
        }else{
            System.out.println("A luz foi desligada!");
        }
    }

    void changeStatus(){
        if(turnOn){
            turnOff();
        }else{
            turnOn();
        }

    }
    }

