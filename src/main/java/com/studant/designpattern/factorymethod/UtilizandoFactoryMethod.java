package com.studant.designpattern.factorymethod;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UtilizandoFactoryMethod {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo conexao...");
            Connection conexao = ComFactoryMethod.CriaConexao();

            String buscaBanco = "SELECT * FROM TABELA";

            PreparedStatement comando = conexao.prepareStatement(buscaBanco);
        }catch (Exception e){

        }
    }
}

