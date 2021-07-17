package com.studant.designpattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

//O objetivo do padrão adapter é converter a interface
//de uma classe para uma outra interface que o
//sistema espera;

//É utilizado quando mudanças diretas feitas na interface
//das classes não podem (ou não devem) ser feitas, então o
//Adapter é necessário para que as duas classes possam interagir
//entre si.

// Também conhecido como Wrapper

public class Adapter implements Iterator {


    private Enumeration colecao;

    public Adapter(Enumeration colecao) {
        this.colecao = colecao;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
