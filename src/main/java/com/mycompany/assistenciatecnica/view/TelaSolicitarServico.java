package com.mycompany.assistenciatecnica.view;

import com.mycompany.assistenciatecnica.dao.EquipamentoDao;
import com.mycompany.assistenciatecnica.dao.OrdemServicoDao;
import com.mycompany.assistenciatecnica.model.Cliente;
import com.mycompany.assistenciatecnica.model.Equipamento;
import com.mycompany.assistenciatecnica.model.OrdemServico;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TelaSolicitarServico extends javax.swing.JFrame {

    private final Cliente cliente;
    private final EquipamentoDao equipamentoDao = new EquipamentoDao();
    private final OrdemServicoDao ordemServicoDao = new OrdemServicoDao();

    public TelaSolicitarServico(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelNumeroSerie = new javax.swing.JLabel();
        jTextFieldNumeroSerie = new javax.swing.JTextField();
        jLabelDefeito = new javax.swing.JLabel();
        jScrollPaneDefeito = new javax.swing.JScrollPane();
        jTextAreaDefeito = new javax.swing.JTextArea();
        jButtonSolicitar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solicitar Serviço - Assistência Técnica");

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("Solicitar Serviço");

        jLabelTipo.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelTipo.setForeground(new java.awt.Color(60, 60, 60));
        jLabelTipo.setText("Equipamento (tipo):");

        jLabelMarca.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelMarca.setForeground(new java.awt.Color(60, 60, 60));
        jLabelMarca.setText("Marca:");

        jLabelModelo.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelModelo.setForeground(new java.awt.Color(60, 60, 60));
        jLabelModelo.setText("Modelo:");

        jLabelNumeroSerie.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelNumeroSerie.setForeground(new java.awt.Color(60, 60, 60));
        jLabelNumeroSerie.setText("Nº de série (opcional):");

        jLabelDefeito.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelDefeito.setForeground(new java.awt.Color(60, 60, 60));
        jLabelDefeito.setText("Defeito relatado:");

        java.awt.Font campo = new java.awt.Font("Segoe UI", 0, 14);
        jTextFieldTipo.setFont(campo);
        jTextFieldTipo.setBackground(java.awt.Color.WHITE);
        jTextFieldMarca.setFont(campo);
        jTextFieldMarca.setBackground(java.awt.Color.WHITE);
        jTextFieldModelo.setFont(campo);
        jTextFieldModelo.setBackground(java.awt.Color.WHITE);
        jTextFieldNumeroSerie.setFont(campo);
        jTextFieldNumeroSerie.setBackground(java.awt.Color.WHITE);

        jTextAreaDefeito.setFont(campo);
        jTextAreaDefeito.setLineWrap(true);
        jTextAreaDefeito.setWrapStyleWord(true);
        jScrollPaneDefeito.setViewportView(jTextAreaDefeito);

        jButtonSolicitar.setText("Solicitar");
        jButtonSolicitar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonSolicitar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonSolicitar.setForeground(java.awt.Color.WHITE);
        jButtonSolicitar.setFocusPainted(false);
        jButtonSolicitar.setContentAreaFilled(false);
        jButtonSolicitar.setOpaque(true);
        jButtonSolicitar.setBorderPainted(false);
        jButtonSolicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSolicitar.addActionListener(evt -> jButtonSolicitarActionPerformed(evt));

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTipo)
                            .addComponent(jLabelMarca)
                            .addComponent(jLabelModelo)
                            .addComponent(jLabelNumeroSerie)
                            .addComponent(jLabelDefeito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSolicitar)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroSerie)
                    .addComponent(jTextFieldNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDefeito)
                    .addComponent(jScrollPaneDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButtonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {
        String tipo = jTextFieldTipo.getText().trim();
        String marca = jTextFieldMarca.getText().trim();
        String modelo = jTextFieldModelo.getText().trim();
        String numeroSerie = jTextFieldNumeroSerie.getText().trim();
        String defeito = jTextAreaDefeito.getText().trim();

        if (tipo.isEmpty() || marca.isEmpty() || modelo.isEmpty() || defeito.isEmpty()) {
            mostrarErro("Preencha equipamento (tipo), marca, modelo e defeito relatado.");
            return;
        }

        Equipamento equipamento = new Equipamento(null, cliente.getId(), tipo, marca, modelo, numeroSerie);
        Integer equipamentoId = equipamentoDao.inserir(equipamento);
        if (equipamentoId == null) {
            mostrarErro("Não foi possível registrar o equipamento.");
            return;
        }

        OrdemServico os = new OrdemServico(null, cliente.getId(), equipamentoId,
                new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()),
                defeito, "Aberta");

        Integer osId = ordemServicoDao.inserir(os);
        if (osId == null) {
            mostrarErro("Não foi possível registrar a solicitação.");
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this,
                "Ordem de Serviço nº " + osId + " criada com sucesso!\n\n"
                + "Equipamento: " + tipo + " " + marca + " " + modelo + "\n"
                + "Defeito: " + defeito + "\n"
                + "Status: Aberta",
                "Solicitação enviada",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        new TelaHomeCliente(cliente).setVisible(true);
        dispose();
    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaHomeCliente(cliente).setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(TelaSolicitarServico.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaSolicitarServico(
                new Cliente(1, "Cliente Teste", "teste@teste.com", "", "")).setVisible(true));
    }

    private javax.swing.JButton jButtonSolicitar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelNumeroSerie;
    private javax.swing.JLabel jLabelDefeito;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNumeroSerie;
    private javax.swing.JScrollPane jScrollPaneDefeito;
    private javax.swing.JTextArea jTextAreaDefeito;
    private javax.swing.JPanel jPanel1;
}