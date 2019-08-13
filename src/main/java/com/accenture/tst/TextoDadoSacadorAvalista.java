package com.accenture.tst;

public class TextoDadoSacadorAvalista {

    private TextoDadoEnderecoCobranca texto_dado_endereco_cobranca;
    private TextoDadoPessoaCobranca texto_dado_pessoa_cobranca;

    public TextoDadoEnderecoCobranca getTextoDadoEnderecoCobranca() {
        return this.texto_dado_endereco_cobranca;
    }

    public TextoDadoPessoaCobranca getTextoDadoPessoaCobranca() {
        return this.texto_dado_pessoa_cobranca;
    }

    public void setTextoDadoEnderecoCobranca(TextoDadoEnderecoCobranca texto_dado_endereco_cobranca) {
        this.texto_dado_endereco_cobranca = texto_dado_endereco_cobranca;
    }

    public void setTextoDadoPessoaCobranca(TextoDadoPessoaCobranca texto_dado_pessoa_cobranca) {
        this.texto_dado_pessoa_cobranca = texto_dado_pessoa_cobranca;
    }
}

