package com.mycompany.assistenciatecnica.model;

public class OrdemServico {

    private Integer id;
    private Integer clienteId;
    private Integer equipamentoId;
    private String dataSolicitacao;
    private String defeito;
    private String status;

    public OrdemServico() {
    }

    public OrdemServico(Integer id, Integer clienteId, Integer equipamentoId,
                        String dataSolicitacao, String defeito, String status) {
        this.id = id;
        this.clienteId = clienteId;
        this.equipamentoId = equipamentoId;
        this.dataSolicitacao = dataSolicitacao;
        this.defeito = defeito;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Integer equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}