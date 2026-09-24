package com.mycompany.assistenciatecnica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    private static final String URL = "jdbc:sqlite:assistenciatecnica.db";
    private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(URL);
            } catch (SQLException e) {
                System.err.println("Erro ao conectar no banco: " + e.getMessage());
            }
        }
        return conexao;
    }

    public static void inicializarBanco() {
        try (Statement stmt = getConexao().createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS clientes ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "nome TEXT NOT NULL, "
                    + "email TEXT NOT NULL UNIQUE, "
                    + "telefone TEXT, "
                    + "senha TEXT NOT NULL)");

            stmt.execute("CREATE TABLE IF NOT EXISTS equipamentos ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "cliente_id INTEGER NOT NULL, "
                    + "tipo TEXT NOT NULL, "
                    + "marca TEXT NOT NULL, "
                    + "modelo TEXT NOT NULL, "
                    + "numero_serie TEXT, "
                    + "FOREIGN KEY (cliente_id) REFERENCES clientes(id))");

            stmt.execute("CREATE TABLE IF NOT EXISTS ordem_servico ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "cliente_id INTEGER NOT NULL, "
                    + "equipamento_id INTEGER NOT NULL, "
                    + "data_solicitacao TEXT NOT NULL, "
                    + "defeito TEXT NOT NULL, "
                    + "status TEXT NOT NULL DEFAULT 'Aberta', "
                    + "FOREIGN KEY (cliente_id) REFERENCES clientes(id), "
                    + "FOREIGN KEY (equipamento_id) REFERENCES equipamentos(id))");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }
}