package com.mycompany.assistenciatecnica.view;

import com.mycompany.assistenciatecnica.model.Cliente;
import com.mycompany.assistenciatecnica.dao.ClienteDao;

public class TelaCadastroCliente extends javax.swing.JFrame {

    private final ClienteDao dao = new ClienteDao();

    public TelaCadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelConfirmar = new javax.swing.JLabel();
        jPasswordFieldConfirmar = new javax.swing.JPasswordField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTitulo.setText("Cadastro de Cliente");

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelNome.setForeground(new java.awt.Color(60, 60, 60));
        jLabelNome.setText("Nome completo:");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelEmail.setForeground(new java.awt.Color(60, 60, 60));
        jLabelEmail.setText("E-mail:");

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelTelefone.setForeground(new java.awt.Color(60, 60, 60));
        jLabelTelefone.setText("Telefone:");

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelSenha.setForeground(new java.awt.Color(60, 60, 60));
        jLabelSenha.setText("Senha:");

        jLabelConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelConfirmar.setForeground(new java.awt.Color(60, 60, 60));
        jLabelConfirmar.setText("Confirmar senha:");

        jTextFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextFieldNome.setBackground(java.awt.Color.WHITE);

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextFieldEmail.setBackground(java.awt.Color.WHITE);

        jTextFieldTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextFieldTelefone.setBackground(java.awt.Color.WHITE);

        jPasswordFieldSenha.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jPasswordFieldSenha.setBackground(java.awt.Color.WHITE);

        jPasswordFieldConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jPasswordFieldConfirmar.setBackground(java.awt.Color.WHITE);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonCadastrar.setForeground(java.awt.Color.WHITE);
        jButtonCadastrar.setFocusPainted(false);
        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.setOpaque(true);
        jButtonCadastrar.setBorderPainted(false);
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(evt -> jButtonCadastrarActionPerformed(evt));

        jButtonVoltar.setText("Voltar ao Login");
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
                            .addComponent(jLabelNome)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabelConfirmar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar)
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
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmar)
                    .addComponent(jPasswordFieldConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = jTextFieldNome.getText().trim();
        String email = jTextFieldEmail.getText().trim();
        String telefone = jTextFieldTelefone.getText().trim();
        String senha = new String(jPasswordFieldSenha.getPassword());
        String confirmar = new String(jPasswordFieldConfirmar.getPassword());

        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmar.isEmpty()) {
            mostrarErro("Preencha os campos obrigatórios: nome, e-mail e senha.");
            return;
        }
        if (!email.contains("@") || !email.contains(".")) {
            mostrarErro("Informe um e-mail válido.");
            return;
        }
        if (!senha.equals(confirmar)) {
            mostrarErro("As senhas não coincidem.");
            return;
        }
        if (dao.emailJaCadastrado(email)) {
            mostrarErro("Este e-mail já está cadastrado.");
            return;
        }

        Cliente cliente = new Cliente(null, nome, email, telefone, senha);
        if (dao.cadastrar(cliente)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Cadastro realizado com sucesso!",
                    "Sucesso",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } else {
            mostrarErro("Não foi possível concluir o cadastro. Tente novamente.");
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

    private void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldTelefone.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmar.setText("");
        jTextFieldNome.requestFocusInWindow();
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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaCadastroCliente().setVisible(true));
    }

    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelConfirmar;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPasswordField jPasswordFieldConfirmar;
    private javax.swing.JPanel jPanel1;
}