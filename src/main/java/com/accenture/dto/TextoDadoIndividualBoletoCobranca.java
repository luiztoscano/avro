package com.accenture.dto;

public class TextoDadoIndividualBoletoCobranca {
    private Object data_vencimento_cobranca;
    private String valor_nominal_cobranca;
    private String numero_seu_numero_boleto_cobranca;

    public Object getDataVencimentoCobranca() {
        return this.data_vencimento_cobranca;
    }

    public void setDataVencimentoCobranca(Object data_vencimento_cobranca) {
        this.data_vencimento_cobranca = data_vencimento_cobranca;
    }

    public String getValorNominalCobranca() {
        return this.valor_nominal_cobranca;
    }

    public void setValorNominalCobranca(String valor_nominal_cobranca) {
        this.valor_nominal_cobranca = valor_nominal_cobranca;
    }

    public String getNumeroSeuNumeroBoletoCobranca() {
        return this.numero_seu_numero_boleto_cobranca;
    }

    public void setNumeroSeuNumeroBoletoCobranca(String numero_seu_numero_boleto_cobranca) {
        this.numero_seu_numero_boleto_cobranca = numero_seu_numero_boleto_cobranca;
    }
}

