package com.mycompany.assistenciatecnica.view;

import com.mycompany.assistenciatecnica.dao.ClienteDao;
import com.mycompany.assistenciatecnica.model.Cliente;

public class TelaLogin extends javax.swing.JFrame {

    private final ClienteDao dao = new ClienteDao();

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Assistência Técnica");

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 26));
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("Login");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelEmail.setForeground(new java.awt.Color(60, 60, 60));
        jLabelEmail.setText("E-mail:");

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelSenha.setForeground(new java.awt.Color(60, 60, 60));
        jLabelSenha.setText("Senha:");

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextFieldEmail.setBackground(java.awt.Color.WHITE);

        jPasswordFieldSenha.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jPasswordFieldSenha.setBackground(java.awt.Color.WHITE);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonEntrar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonEntrar.setForeground(java.awt.Color.WHITE);
        jButtonEntrar.setFocusPainted(false);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setOpaque(true);
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(evt -> jButtonEntrarActionPerformed(evt));

        jButtonCadastrar.setText("Cadastre-se");
        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jButtonCadastrar.setBackground(new java.awt.Color(200, 200, 200));
        jButtonCadastrar.setForeground(new java.awt.Color(40, 40, 40));
        jButtonCadastrar.setFocusPainted(false);
        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.setOpaque(true);
        jButtonCadastrar.setBorderPainted(false);
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(evt -> jButtonCadastrarActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButtonCadastrar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelTitulo)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        String email = jTextFieldEmail.getText().trim();
        String senha = new String(jPasswordFieldSenha.getPassword());

        if (email.isEmpty() || senha.isEmpty()) {
            mostrarErro("Informe e-mail e senha.");
            return;
        }

        Cliente cliente = dao.buscarPorEmailESenha(email, senha);
        if (cliente == null) {
            mostrarErro("E-mail ou senha incorretos.");
            return;
        }

        new TelaHomeCliente(cliente).setVisible(true);
        dispose();
    }

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaCadastroCliente().setVisible(true);
        dispose();
    }

    private void mostrarErro(String mensagem) {
        javax.swing.JOptionPane.showMessageDialog(this,
                mensagem,
                "Atenção",
                javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    private void limparCampos() {
        jTextFieldEmail.setText("");
        jPasswordFieldSenha.setText("");
        jTextFieldEmail.requestFocusInWindow();
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }

    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPanel jPanel1;
}