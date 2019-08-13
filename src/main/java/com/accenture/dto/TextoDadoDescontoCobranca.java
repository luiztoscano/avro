package com.accenture.dto;

public class TextoDadoDescontoCobranca {
    private String codigo_tipo_desconto_cobranca;
    private java.util.List<TextoDadoDetalheDescontoCobranca> texto_dado_detalhe_desconto_cobranca;

    public String getCodigoTipoDescontoCobranca() {
        return this.codigo_tipo_desconto_cobranca;
    }

    public void setCodigoTipoDescontoCobranca(String codigo_tipo_desconto_cobranca) {
        this.codigo_tipo_desconto_cobranca = codigo_tipo_desconto_cobranca;
    }

    public java.util.List<TextoDadoDetalheDescontoCobranca> getTextoDadoDetalheDescontoCobranca() {
        return this.texto_dado_detalhe_desconto_cobranca;
    }

    public void setTextoDadoDetalheDescontoCobranca(java.util.List<TextoDadoDetalheDescontoCobranca> texto_dado_detalhe_desconto_cobranca) {
        this.texto_dado_detalhe_desconto_cobranca = texto_dado_detalhe_desconto_cobranca;
    }
}

