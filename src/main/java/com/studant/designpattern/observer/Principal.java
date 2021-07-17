package com.studant.designpattern.observer;

public class Principal {
    public static void main(String[] args) {
        SensorDeTemperatura sensor = new SensorDeTemperatura();
        Observer ar = new ArCondicionado(sensor);
        Observer aquecedor = new Aquecedor(sensor);

        sensor.setTemperatura(22);
        sensor.setTemperatura(29);
        sensor.setTemperatura(15);
        sensor.setTemperatura(22);

    }
}
