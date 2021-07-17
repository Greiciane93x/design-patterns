package com.studant.designpattern.factorymethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// sem a fábrica
public class SemFactoryMethod {
    public static void main(String[] args) {
        String stringDeConexao = "jbdc://localhost:3306/database";
        String usuario = "user";
        String senha = "password";

        try {
            System.out.println("Abrindo conexão...");
            Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);

            String buscaBanco = "SELECT * FROM tabela";

            PreparedStatement comando = conexao.prepareStatement(buscaBanco);
            System.out.println("Executando comando...");
            ResultSet resultado = comando.executeQuery();
        }catch (Exception e){

        }
    }
}
// com a fábrica
