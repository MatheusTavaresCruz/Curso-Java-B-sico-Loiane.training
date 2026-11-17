package com.loiane.cursojava.exeraula28_33;

public class Lamp {

    private int voltage;
    private String wattage;
    private String model;
    private String color;
    private String typeLight;
    private int warrantyInMonths;
    private String[] types;
    private boolean lampshadeType;
    private boolean turnOn;
    private boolean turnOff;

    public Lamp(boolean turnOff) {
        this.turnOff = turnOff;
    }

    public boolean TurnOnn(Boolean select){
        if(select){
            select = true;
        }else{
            System.out.println("A lampada já esta desligada");
        }
        return select;
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public boolean getTurnOff() {
        return turnOff;
    }

    public void setTurnOff(boolean turnOff) {
        this.turnOff = turnOff;
    }
}
