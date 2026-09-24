package com.mycompany.assistenciatecnica.view;

import com.mycompany.assistenciatecnica.dao.ClienteDao;
import com.mycompany.assistenciatecnica.dao.OrdemServicoDao;
import com.mycompany.assistenciatecnica.model.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaPainelAdmin extends javax.swing.JFrame {

    private final ClienteDao clienteDao = new ClienteDao();
    private final OrdemServicoDao ordemServicoDao = new OrdemServicoDao();
    private boolean modoClientes = true; 

    public TelaPainelAdmin() {
        initComponents();
        mostrarClientes();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonClientes = new javax.swing.JButton();
        jButtonOrdens = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Administrativo - Assistência Técnica");

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22));
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("Painel Administrativo");

        jButtonClientes.setText("Clientes");
        jButtonClientes.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonClientes.setBackground(new java.awt.Color(0, 102, 255));
        jButtonClientes.setForeground(java.awt.Color.WHITE);
        jButtonClientes.setFocusPainted(false);
        jButtonClientes.setContentAreaFilled(false);
        jButtonClientes.setOpaque(true);
        jButtonClientes.setBorderPainted(false);
        jButtonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClientes.addActionListener(evt -> jButtonClientesActionPerformed(evt));

        jButtonOrdens.setText("Ordens de Serviço");
        jButtonOrdens.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonOrdens.setBackground(new java.awt.Color(0, 150, 136));
        jButtonOrdens.setForeground(java.awt.Color.WHITE);
        jButtonOrdens.setFocusPainted(false);
        jButtonOrdens.setContentAreaFilled(false);
        jButtonOrdens.setOpaque(true);
        jButtonOrdens.setBorderPainted(false);
        jButtonOrdens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOrdens.addActionListener(evt -> jButtonOrdensActionPerformed(evt));

        jTableAdmin.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jTableAdmin.setRowHeight(28);
        jScrollPane1.setViewportView(jTableAdmin);

        jButtonExcluir.setText("Excluir Selecionado");
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonExcluir.setBackground(new java.awt.Color(220, 80, 80));
        jButtonExcluir.setForeground(java.awt.Color.WHITE);
        jButtonExcluir.setFocusPainted(false);
        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.setOpaque(true);
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.addActionListener(evt -> jButtonExcluirActionPerformed(evt));

        jButtonSair.setText("Sair");
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonSair.setBackground(new java.awt.Color(120, 120, 120));
        jButtonSair.setForeground(java.awt.Color.WHITE);
        jButtonSair.setFocusPainted(false);
        jButtonSair.setContentAreaFilled(false);
        jButtonSair.setOpaque(true);
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(evt -> jButtonSairActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonClientes)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonOrdens))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonExcluir)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrdens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    private void mostrarClientes() {
        modoClientes = true;
        List<Cliente> lista = clienteDao.listarTodos();
        DefaultTableModel model = new DefaultTableModel(
            new Object[][] {},
            new String[] { "ID", "Nome", "E-mail", "Telefone" }
        ) {
            boolean[] canEdit = new boolean[] { false, false, false, false };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        for (Cliente c : lista) {
            model.addRow(new Object[] { c.getId(), c.getNome(), c.getEmail(), c.getTelefone() });
        }
        jTableAdmin.setModel(model);
    }

    private void mostrarOrdens() {
        modoClientes = false;
        List<Object[]> lista = ordemServicoDao.listarTodas();
        DefaultTableModel model = new DefaultTableModel(
            new Object[][] {},
            new String[] { "Nº OS", "Cliente", "Equipamento", "Status" }
        ) {
            boolean[] canEdit = new boolean[] { false, false, false, true };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        for (Object[] os : lista) {
            model.addRow(os);
        }
        jTableAdmin.setModel(model);
        model.addTableModelListener(e -> {
            if (e.getType() == javax.swing.event.TableModelEvent.UPDATE) {
                int row = e.getFirstRow();
                int col = e.getColumn();
                if (col == 3) {
                    int osId = ((Number) model.getValueAt(row, 0)).intValue();
                    String novoStatus = (String) model.getValueAt(row, 3);
                    if (ordemServicoDao.atualizarStatus(osId, novoStatus)) {
                        javax.swing.JOptionPane.showMessageDialog(this,
                                "Status da OS nº " + osId + " atualizado para: " + novoStatus,
                                "Atualizado",
                                javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        mostrarErro("Não foi possível atualizar o status da OS nº " + osId + ".");
                    }
                }
            }
        });
    }

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarClientes();
    }

    private void jButtonOrdensActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarOrdens();
    }

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        int linha = jTableAdmin.getSelectedRow();
        if (linha == -1) {
            mostrarErro("Selecione um registro na tabela para excluir.");
            return;
        }

        int id = ((Number) jTableAdmin.getValueAt(linha, 0)).intValue();
        String descricaoTipo = modoClientes ? "cliente" : "ordem de serviço";

        int opcao = javax.swing.JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir o " + descricaoTipo + " de ID " + id + "?",
                "Confirmar exclusão",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.WARNING_MESSAGE);
        if (opcao != javax.swing.JOptionPane.YES_OPTION) {
            return;
        }

        boolean ok = modoClientes ? clienteDao.excluir(id) : ordemServicoDao.excluir(id);

        if (ok) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Cliente de ID " + id + " excluído com sucesso."
                    + (modoClientes ? "\nAs ordens de serviço e equipamentos deste cliente também foram removidos." : ""),
                    "Excluído",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if (modoClientes) {
                mostrarClientes();
            } else {
                mostrarOrdens();
            }
        } else {
            mostrarErro("Não foi possível excluir o " + descricaoTipo + " de ID " + id + ".");
        }
    }

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {
        int opcao = javax.swing.JOptionPane.showConfirmDialog(this,
                "Deseja realmente sair?",
                "Sair",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        if (opcao == javax.swing.JOptionPane.YES_OPTION) {
            new TelaLogin().setVisible(true);
            dispose();
        }
    }

    private void mostrarErro(String mensagem) {
        javax.swing.JOptionPane.showMessageDialog(this,
                mensagem,
                "Atenção",
                javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPainelAdmin.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaPainelAdmin().setVisible(true));
    }

    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonOrdens;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAdmin;
}