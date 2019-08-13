package com.accenture.dto;

public class TextoDadoPessoaCobranca {
    private String nome_completo_pessoa;
    private String nome_fantasia;
    private TextoDadoTipoPessoaCobranca texto_dado_tipo_pessoa_cobranca;

    public String getNomeCompletoPessoa() {
        return this.nome_completo_pessoa;
    }

    public void setNomeCompletoPessoa(String nome_completo_pessoa) {
        this.nome_completo_pessoa = nome_completo_pessoa;
    }

    public String getNomeFantasia() {
        return this.nome_fantasia;
    }

    public void setNomeFantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public TextoDadoTipoPessoaCobranca getTextoDadoTipoPessoaCobranca() {
        return this.texto_dado_tipo_pessoa_cobranca;
    }

    public void setTextoDadoTipoPessoaCobranca(TextoDadoTipoPessoaCobranca texto_dado_tipo_pessoa_cobranca) {
        this.texto_dado_tipo_pessoa_cobranca = texto_dado_tipo_pessoa_cobranca;
    }
}

