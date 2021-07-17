package com.studant.designpattern.observer;


//define uma relação de um para muitos entre objetos,
//de forma que, quando um objeto tem seu estado alterado,
//todos os seus dependentes são notificados e atualizados
//automaticamente

// Também conhecido como Publish/Subscribe

// Muito utilizado em interfaces para Desktop

public interface Observer{
    void update(int i);
}