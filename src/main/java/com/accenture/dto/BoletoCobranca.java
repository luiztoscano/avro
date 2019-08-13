package com.accenture.dto;

public class BoletoCobranca {
    private Object codigo_canal_origem_boleto_cobranca;
    private String numero_operador;
    private TextoDadoBeneficiarioCobranca texto_dado_beneficiario_cobranca;
    private TextoDadoBoletoCobranca texto_dado_boleto_cobranca;
    private TextoDadoCanal texto_dado_canal;
    private java.util.List<TextoDadoErroCobranca> texto_dado_erro_cobranca;

    public Object getCodigoCanalOrigemBoletoCobranca() {
        return this.codigo_canal_origem_boleto_cobranca;
    }

    public void setCodigoCanalOrigemBoletoCobranca(Object codigo_canal_origem_boleto_cobranca) {
        this.codigo_canal_origem_boleto_cobranca = codigo_canal_origem_boleto_cobranca;
    }

    public String getNumeroOperador() {
        return this.numero_operador;
    }

    public void setNumeroOperador(String numero_operador) {
        this.numero_operador = numero_operador;
    }

    public TextoDadoBeneficiarioCobranca getTextoDadoBeneficiarioCobranca() {
        return this.texto_dado_beneficiario_cobranca;
    }

    public void setTextoDadoBeneficiarioCobranca(TextoDadoBeneficiarioCobranca texto_dado_beneficiario_cobranca) {
        this.texto_dado_beneficiario_cobranca = texto_dado_beneficiario_cobranca;
    }

    public TextoDadoBoletoCobranca getTextoDadoBoletoCobranca() {
        return this.texto_dado_boleto_cobranca;
    }

    public void setTextoDadoBoletoCobranca(TextoDadoBoletoCobranca texto_dado_boleto_cobranca) {
        this.texto_dado_boleto_cobranca = texto_dado_boleto_cobranca;
    }

    public TextoDadoCanal getTextoDadoCanal() {
        return this.texto_dado_canal;
    }

    public void setTextoDadoCanal(TextoDadoCanal texto_dado_canal) {
        this.texto_dado_canal = texto_dado_canal;
    }

    public java.util.List<TextoDadoErroCobranca> getTextoDadoErroCobranca() {
        return this.texto_dado_erro_cobranca;
    }

    public void setTextoDadoErroCobranca(java.util.List<TextoDadoErroCobranca> texto_dado_erro_cobranca) {
        this.texto_dado_erro_cobranca = texto_dado_erro_cobranca;
    }
}

