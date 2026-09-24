package com.mycompany.assistenciatecnica.view;

import com.mycompany.assistenciatecnica.model.Cliente;

public class TelaHomeCliente extends javax.swing.JFrame {

    private final Cliente cliente;

    public TelaHomeCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        jLabelBemVindo.setText("Bem-vindo, " + cliente.getNome() + "!");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelBemVindo = new javax.swing.JLabel();
        jButtonSolicitar = new javax.swing.JButton();
        jButtonMinhas = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home - Assistência Técnica");

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("Área do Cliente");

        jLabelBemVindo.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelBemVindo.setForeground(new java.awt.Color(60, 60, 60));

        jButtonSolicitar.setText("Solicitar Serviço");
        jButtonSolicitar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonSolicitar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonSolicitar.setForeground(java.awt.Color.WHITE);
        jButtonSolicitar.setFocusPainted(false);
        jButtonSolicitar.setContentAreaFilled(false);
        jButtonSolicitar.setOpaque(true);
        jButtonSolicitar.setBorderPainted(false);
        jButtonSolicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSolicitar.addActionListener(evt -> jButtonSolicitarActionPerformed(evt));

        jButtonMinhas.setText("Minhas Solicitações");
        jButtonMinhas.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonMinhas.setBackground(new java.awt.Color(0, 150, 136));
        jButtonMinhas.setForeground(java.awt.Color.WHITE);
        jButtonMinhas.setFocusPainted(false);
        jButtonMinhas.setContentAreaFilled(false);
        jButtonMinhas.setOpaque(true);
        jButtonMinhas.setBorderPainted(false);
        jButtonMinhas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMinhas.addActionListener(evt -> jButtonMinhasActionPerformed(evt));

        jButtonSair.setText("Sair");
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonSair.setBackground(new java.awt.Color(220, 80, 80));
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
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelBemVindo)
                    .addComponent(jButtonSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitulo)
                .addGap(8, 8, 8)
                .addComponent(jLabelBemVindo)
                .addGap(40, 40, 40)
                .addComponent(jButtonSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButtonMinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void jButtonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaSolicitarServico(cliente).setVisible(true);
        dispose();
    }

    private void jButtonMinhasActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaMinhasSolicitacoes(cliente).setVisible(true);
        dispose();
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHomeCliente.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaHomeCliente(new Cliente()).setVisible(true));
    }

    private javax.swing.JButton jButtonSolicitar;
    private javax.swing.JButton jButtonMinhas;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JPanel jPanel1;
}