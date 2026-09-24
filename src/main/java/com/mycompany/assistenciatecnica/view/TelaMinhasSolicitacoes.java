package com.mycompany.assistenciatecnica.view;

import com.mycompany.assistenciatecnica.dao.OrdemServicoDao;
import com.mycompany.assistenciatecnica.model.Cliente;
import com.mycompany.assistenciatecnica.model.OrdemServicoView;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaMinhasSolicitacoes extends javax.swing.JFrame {

    private final Cliente cliente;
    private final OrdemServicoDao ordemServicoDao = new OrdemServicoDao();

    public TelaMinhasSolicitacoes(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        carregarSolicitacoes();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSolicitacoes = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minhas Solicitações - Assistência Técnica");

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("Minhas Solicitações");

        jTableSolicitacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] { "Nº da OS", "Equipamento", "Data", "Status" }
        ) {
            boolean[] canEdit = new boolean[] { false, false, false, false };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTableSolicitacoes.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jTableSolicitacoes.setRowHeight(28);
        jScrollPane1.setViewportView(jTableSolicitacoes);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jButtonVoltar.setBackground(new java.awt.Color(200, 200, 200));
        jButtonVoltar.setForeground(new java.awt.Color(40, 40, 40));
        jButtonVoltar.setFocusPainted(false);
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.setOpaque(true);
        jButtonVoltar.setBorderPainted(false);
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(evt -> jButtonVoltarActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void carregarSolicitacoes() {
        List<OrdemServicoView> lista = ordemServicoDao.listarPorCliente(cliente.getId());
        DefaultTableModel model = (DefaultTableModel) jTableSolicitacoes.getModel();
        model.setRowCount(0);
        for (OrdemServicoView os : lista) {
            model.addRow(new Object[] {
                os.getId(),
                os.getEquipamento(),
                os.getDataSolicitacao(),
                os.getStatus()
            });
        }
    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaHomeCliente(cliente).setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(TelaMinhasSolicitacoes.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaMinhasSolicitacoes(
                new Cliente(1, "Cliente Teste", "teste@teste.com", "", "")).setVisible(true));
    }

    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSolicitacoes;
}