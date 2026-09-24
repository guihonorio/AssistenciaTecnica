package com.mycompany.assistenciatecnica.view;

public class TelaLoginAdmin extends javax.swing.JFrame {

   
    private static final String ADMIN_USUARIO = "admin";
    private static final String ADMIN_SENHA = "admin123";

    public TelaLoginAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Administrador - Assistência Técnica");

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 26));
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("Login Administrador");

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelUsuario.setForeground(new java.awt.Color(60, 60, 60));
        jLabelUsuario.setText("Usuário:");

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelSenha.setForeground(new java.awt.Color(60, 60, 60));
        jLabelSenha.setText("Senha:");

        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextFieldUsuario.setBackground(java.awt.Color.WHITE);

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
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButtonVoltar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelTitulo)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String usuario = jTextFieldUsuario.getText().trim();
        String senha = new String(jPasswordFieldSenha.getPassword());

        if (usuario.isEmpty() || senha.isEmpty()) {
            mostrarErro("Informe usuário e senha.");
            return;
        }

        if (usuario.equals(ADMIN_USUARIO) && senha.equals(ADMIN_SENHA)) {
            new TelaPainelAdmin().setVisible(true);
            dispose();
        } else {
            mostrarErro("Usuário ou senha incorretos.");
        }
    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaLogin().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaLoginAdmin.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaLoginAdmin().setVisible(true));
    }

    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPanel jPanel1;
}