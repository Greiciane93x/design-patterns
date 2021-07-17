package com.studant.designpattern.factorymethod;

import java.sql.Connection;
import java.sql.DriverManager;

//define uma maneira padrão de criar objetos
//bom para encapsular informações necessárias no
//momento da instanciação do objeto

//Quando há mais de um tipo de classe a ser criado, o padrão Factory Method
//é usualmente usado para definir uma interface para criar um objeto,
//deixando para subclasses decidirem qual objeto deve ser instanciado

public class ComFactoryMethod {
    public static Connection CriaConexao(){
        String stringConexao = "jdbc:mysql://localhost:3306/database";
        String usuario = "usuario";
        String senha = "password";

        Connection conexao = null;
        try{
            conexao = DriverManager.getConnection(stringConexao, usuario, senha);
        }catch(Exception e){
            e.printStackTrace();
        }
        return conexao;

    }
}
