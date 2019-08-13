package com.accenture.dto;

public class TextoDadoProtestoBoletoCobranca {
    private Boolean indicador_protesto_boleto_cobranca;
    private Integer quantidade_dia_protesto_boleto_cobranca;

    public Boolean getIndicadorProtestoBoletoCobranca() {
        return this.indicador_protesto_boleto_cobranca;
    }

    public void setIndicadorProtestoBoletoCobranca(Boolean indicador_protesto_boleto_cobranca) {
        this.indicador_protesto_boleto_cobranca = indicador_protesto_boleto_cobranca;
    }

    public Integer getQuantidadeDiaProtestoBoletoCobranca() {
        return this.quantidade_dia_protesto_boleto_cobranca;
    }

    public void setQuantidadeDiaProtestoBoletoCobranca(Integer quantidade_dia_protesto_boleto_cobranca) {
        this.quantidade_dia_protesto_boleto_cobranca = quantidade_dia_protesto_boleto_cobranca;
    }
}

