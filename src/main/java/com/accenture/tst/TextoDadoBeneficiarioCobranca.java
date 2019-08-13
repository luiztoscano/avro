package com.accenture.tst;

public class TextoDadoBeneficiarioCobranca {

    private java.lang.String numero_agencia;
    private java.lang.String numero_conta_corrente;
    private java.lang.String numero_digito_verificador;
    private java.lang.String nome_beneficiario_boleto_cobranca;
    private TextoDadoPessoaCobranca texto_dado_pessoa_cobranca;
    private TextoDadoEnderecoCobranca texto_dado_endereco_cobranca;

    public java.lang.String getNumeroAgencia() {
        return this.numero_agencia;
    }

    public java.lang.String getNumeroContaCorrente() {
        return this.numero_conta_corrente;
    }

    public java.lang.String getNumeroDigitoVerificador() {
        return this.numero_digito_verificador;
    }

    public java.lang.String getNomeBeneficiarioBoletoCobranca() {
        return this.nome_beneficiario_boleto_cobranca;
    }

    public TextoDadoPessoaCobranca getTextoDadoPessoaCobranca() {
        return this.texto_dado_pessoa_cobranca;
    }

    public TextoDadoEnderecoCobranca getTextoDadoEnderecoCobranca() {
        return this.texto_dado_endereco_cobranca;
    }

    public void setNumeroAgencia(java.lang.String numero_agencia) {
        this.numero_agencia = numero_agencia;
    }

    public void setNumeroContaCorrente(java.lang.String numero_conta_corrente) {
        this.numero_conta_corrente = numero_conta_corrente;
    }

    public void setNumeroDigitoVerificador(java.lang.String numero_digito_verificador) {
        this.numero_digito_verificador = numero_digito_verificador;
    }

    public void setNomeBeneficiarioBoletoCobranca(java.lang.String nome_beneficiario_boleto_cobranca) {
        this.nome_beneficiario_boleto_cobranca = nome_beneficiario_boleto_cobranca;
    }

    public void setTextoDadoPessoaCobranca(TextoDadoPessoaCobranca texto_dado_pessoa_cobranca) {
        this.texto_dado_pessoa_cobranca = texto_dado_pessoa_cobranca;
    }

    public void setTextoDadoEnderecoCobranca(TextoDadoEnderecoCobranca texto_dado_endereco_cobranca) {
        this.texto_dado_endereco_cobranca = texto_dado_endereco_cobranca;
    }
}

