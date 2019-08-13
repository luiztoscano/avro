package com.accenture.tst;

public class TextoDadoPagador {

    private TextoDadoPessoaCobranca texto_dado_pessoa_cobranca;
    private TextoDadoEnderecoCobranca texto_dado_endereco_cobranca;
    private java.lang.String nome_endereco_email;

    public TextoDadoPessoaCobranca getTextoDadoPessoaCobranca() {
        return this.texto_dado_pessoa_cobranca;
    }

    public TextoDadoEnderecoCobranca getTextoDadoEnderecoCobranca() {
        return this.texto_dado_endereco_cobranca;
    }

    public java.lang.String getNomeEnderecoEmail() {
        return this.nome_endereco_email;
    }

    public void setTextoDadoPessoaCobranca(TextoDadoPessoaCobranca texto_dado_pessoa_cobranca) {
        this.texto_dado_pessoa_cobranca = texto_dado_pessoa_cobranca;
    }

    public void setTextoDadoEnderecoCobranca(TextoDadoEnderecoCobranca texto_dado_endereco_cobranca) {
        this.texto_dado_endereco_cobranca = texto_dado_endereco_cobranca;
    }

    public void setNomeEnderecoEmail(java.lang.String nome_endereco_email) {
        this.nome_endereco_email = nome_endereco_email;
    }
}

