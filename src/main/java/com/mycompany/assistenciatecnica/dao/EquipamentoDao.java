package com.mycompany.assistenciatecnica.dao;

import com.mycompany.assistenciatecnica.model.Equipamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EquipamentoDao {

    public Integer inserir(Equipamento equipamento) {
        String sql = "INSERT INTO equipamentos (cliente_id, tipo, marca, modelo, numero_serie) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, equipamento.getClienteId());
            ps.setString(2, equipamento.getTipo());
            ps.setString(3, equipamento.getMarca());
            ps.setString(4, equipamento.getModelo());
            ps.setString(5, equipamento.getNumeroSerie());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao inserir equipamento: " + e.getMessage());
        }
        return null;
    }
}