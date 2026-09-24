package com.mycompany.assistenciatecnica.dao;

import com.mycompany.assistenciatecnica.model.OrdemServico;
import com.mycompany.assistenciatecnica.model.OrdemServicoView;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrdemServicoDao {

    public Integer inserir(OrdemServico os) {
        String sql = "INSERT INTO ordem_servico (cliente_id, equipamento_id, data_solicitacao, defeito, status) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, os.getClienteId());
            ps.setInt(2, os.getEquipamentoId());
            ps.setString(3, os.getDataSolicitacao());
            ps.setString(4, os.getDefeito());
            ps.setString(5, os.getStatus());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao inserir ordem de serviço: " + e.getMessage());
        }
        return null;
    }

    public java.util.List<OrdemServicoView> listarPorCliente(int clienteId) {
        java.util.List<OrdemServicoView> lista = new java.util.ArrayList<>();
        String sql = "SELECT os.id, "
                + "(e.tipo || ' ' || e.marca || ' ' || e.modelo) AS equipamento, "
                + "os.data_solicitacao, os.status "
                + "FROM ordem_servico os "
                + "JOIN equipamentos e ON e.id = os.equipamento_id "
                + "WHERE os.cliente_id = ? "
                + "ORDER BY os.id DESC";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setInt(1, clienteId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(new OrdemServicoView(
                            rs.getInt("id"),
                            rs.getString("equipamento"),
                            rs.getString("data_solicitacao"),
                            rs.getString("status")));
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar OS do cliente: " + e.getMessage());
        }
        return lista;
    }

    public java.util.List<Object[]> listarTodas() {
        java.util.List<Object[]> lista = new java.util.ArrayList<>();
        String sql = "SELECT os.id, c.nome AS cliente, "
                + "(e.tipo || ' ' || e.marca || ' ' || e.modelo) AS equipamento, "
                + "os.status "
                + "FROM ordem_servico os "
                + "JOIN clientes c ON c.id = os.cliente_id "
                + "JOIN equipamentos e ON e.id = os.equipamento_id "
                + "ORDER BY os.id DESC";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("cliente"),
                    rs.getString("equipamento"),
                    rs.getString("status")
                });
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar OS: " + e.getMessage());
        }
        return lista;
    }

    public boolean atualizarStatus(int osId, String status) {
        String sql = "UPDATE ordem_servico SET status = ? WHERE id = ?";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, status);
            ps.setInt(2, osId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar status: " + e.getMessage());
            return false;
        }
    }

    public boolean excluir(int osId) {
        String sql = "DELETE FROM ordem_servico WHERE id = ?";
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setInt(1, osId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao excluir ordem de serviço: " + e.getMessage());
            return false;
        }
    }

}
