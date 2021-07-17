package com.studant.designpattern.observer;

public class ArCondicionado implements Observer{

    private boolean ligado;
    private Observable sensor;

    public ArCondicionado(Observable sensor) {
        this.sensor = sensor;
        this.sensor.register(this);
        this.ligado = false;
    }

    @Override
    public void update(int i) {
        if( i > 24 && !ligado){
            System.out.println("Temperatura: " + i
            + ">>> Ligando o ar condicionado <<<");
        }else if( i <= 18 && ligado){
            System.out.println("Temperatura: " + i
            + ">>> Desligando o ar condicionado <<<" );
            this.ligado = false;
        }
    }
}
