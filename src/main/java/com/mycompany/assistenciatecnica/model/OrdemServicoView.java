package com.mycompany.assistenciatecnica.model;

public class OrdemServicoView {

    private Integer id;
    private String equipamento;
    private String dataSolicitacao;
    private String status;

    public OrdemServicoView() {
    }

    public OrdemServicoView(Integer id, String equipamento, String dataSolicitacao, String status) {
        this.id = id;
        this.equipamento = equipamento;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}