package com.mycompany.assistenciatecnica;

import com.mycompany.assistenciatecnica.dao.Conexao;
import com.mycompany.assistenciatecnica.view.TelaLogin;

public class AssistenciaTecnica {

    public static void main(String[] args) {
        Conexao.inicializarBanco();
        new TelaLogin().setVisible(true);
    }
}