package com.accenture.tst;

public class TextoDadoPessoaCobranca {

    private java.lang.String nome_completo_pessoa;
    private java.lang.String nome_fantasia;
    private TextoDadoTipoPessoaCobranca texto_dado_tipo_pessoa_cobranca;

    public java.lang.String getNomeCompletoPessoa() {
        return this.nome_completo_pessoa;
    }

    public java.lang.String getNomeFantasia() {
        return this.nome_fantasia;
    }

    public TextoDadoTipoPessoaCobranca getTextoDadoTipoPessoaCobranca() {
        return this.texto_dado_tipo_pessoa_cobranca;
    }

    public void setNomeCompletoPessoa(java.lang.String nome_completo_pessoa) {
        this.nome_completo_pessoa = nome_completo_pessoa;
    }

    public void setNomeFantasia(java.lang.String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public void setTextoDadoTipoPessoaCobranca(TextoDadoTipoPessoaCobranca texto_dado_tipo_pessoa_cobranca) {
        this.texto_dado_tipo_pessoa_cobranca = texto_dado_tipo_pessoa_cobranca;
    }
}

