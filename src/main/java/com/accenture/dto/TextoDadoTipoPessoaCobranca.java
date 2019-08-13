package com.accenture.dto;

public class TextoDadoTipoPessoaCobranca {
    private String codigo_tipo_pessoa;
    private String numero_cadastro_pessoa_fisica;
    private String numero_cadastro_nacional_pessoa_juridica;

    public String getCodigoTipoPessoa() {
        return this.codigo_tipo_pessoa;
    }

    public void setCodigoTipoPessoa(String codigo_tipo_pessoa) {
        this.codigo_tipo_pessoa = codigo_tipo_pessoa;
    }

    public String getNumeroCadastroPessoaFisica() {
        return this.numero_cadastro_pessoa_fisica;
    }

    public void setNumeroCadastroPessoaFisica(String numero_cadastro_pessoa_fisica) {
        this.numero_cadastro_pessoa_fisica = numero_cadastro_pessoa_fisica;
    }

    public String getNumeroCadastroNacionalPessoaJuridica() {
        return this.numero_cadastro_nacional_pessoa_juridica;
    }

    public void setNumeroCadastroNacionalPessoaJuridica(String numero_cadastro_nacional_pessoa_juridica) {
        this.numero_cadastro_nacional_pessoa_juridica = numero_cadastro_nacional_pessoa_juridica;
    }
}

