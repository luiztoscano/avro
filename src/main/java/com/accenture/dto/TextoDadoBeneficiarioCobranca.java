package com.accenture.dto;

public class TextoDadoBeneficiarioCobranca {
    private String numero_agencia;
    private String numero_conta_corrente;
    private String numero_digito_verificador;
    private String nome_beneficiario_boleto_cobranca;
    private TextoDadoPessoaCobranca texto_dado_pessoa_cobranca;
    private TextoDadoEnderecoCobranca texto_dado_endereco_cobranca;

    public String getNumeroAgencia() {
        return this.numero_agencia;
    }

    public void setNumeroAgencia(String numero_agencia) {
        this.numero_agencia = numero_agencia;
    }

    public String getNumeroContaCorrente() {
        return this.numero_conta_corrente;
    }

    public void setNumeroContaCorrente(String numero_conta_corrente) {
        this.numero_conta_corrente = numero_conta_corrente;
    }

    public String getNumeroDigitoVerificador() {
        return this.numero_digito_verificador;
    }

    public void setNumeroDigitoVerificador(String numero_digito_verificador) {
        this.numero_digito_verificador = numero_digito_verificador;
    }

    public String getNomeBeneficiarioBoletoCobranca() {
        return this.nome_beneficiario_boleto_cobranca;
    }

    public void setNomeBeneficiarioBoletoCobranca(String nome_beneficiario_boleto_cobranca) {
        this.nome_beneficiario_boleto_cobranca = nome_beneficiario_boleto_cobranca;
    }

    public TextoDadoPessoaCobranca getTextoDadoPessoaCobranca() {
        return this.texto_dado_pessoa_cobranca;
    }

    public void setTextoDadoPessoaCobranca(TextoDadoPessoaCobranca texto_dado_pessoa_cobranca) {
        this.texto_dado_pessoa_cobranca = texto_dado_pessoa_cobranca;
    }

    public TextoDadoEnderecoCobranca getTextoDadoEnderecoCobranca() {
        return this.texto_dado_endereco_cobranca;
    }

    public void setTextoDadoEnderecoCobranca(TextoDadoEnderecoCobranca texto_dado_endereco_cobranca) {
        this.texto_dado_endereco_cobranca = texto_dado_endereco_cobranca;
    }
}

