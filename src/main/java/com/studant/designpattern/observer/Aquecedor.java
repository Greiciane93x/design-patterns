package com.studant.designpattern.observer;

public class Aquecedor implements  Observer{
    private Observable sensor;
    private boolean ligado;

    public Aquecedor(Observable sensor) {
        this.sensor = sensor;
        this.sensor.register(this);
        this.ligado = ligado;
    }

    @Override
    public void update(int i) {
        if(i <= 23 && !ligado){
            System.out.println("Temperatura: " + i
            + ">>> Ligando o aquecedor <<<");
            this.ligado = true;
        }else if(i > 23 && ligado){
            System.out.println("Temperatura: " + i
            + ">>> Desligando o aquecedor <<<");
            this.ligado = false;
        }
    }
}
