package com.accenture.dto;

public class TextoDadoBoletoCobranca {
    private String codigo_forma_envio_cobranca;
    private String codigo_tipo_emissao_boleto_cobranca;
    private Integer quantidade_parcela_boleto_cobranca_permitida;
    private TextoDadoProtestoBoletoCobranca texto_dado_protesto_boleto_cobranca;
    private TextoDadoNegativacaoPagador texto_dado_negativacao_pagador;
    private TextoDadoPagador texto_dado_pagador;
    private TextoDadoSacadorAvalista texto_dado_sacador_avalista;
    private String codigo_carteira_cobranca;
    private Integer codigo_tipo_vencimento_boleto_cobranca;
    private java.util.List<TextoDadoIndividualBoletoCobranca> texto_dado_individual_boleto_cobranca;
    private String codigo_especie_titulo;
    private String valor_abatimento_cobranca;
    private TextoDadoJuroCobrancaAvalista texto_dado_juro_cobranca;
    private TextoDadoMultaCobranca texto_dado_multa_cobranca;
    private TextoDadoDescontoCobranca texto_dado_desconto_cobranca;
    private java.util.List<String> texto_mensagem_cobranca;
    private Boolean indicador_desconto_expresso_contratado;
    private String texto_assunto_email;
    private String texto_mensagem_email;

    public String getCodigoFormaEnvioCobranca() {
        return this.codigo_forma_envio_cobranca;
    }

    public void setCodigoFormaEnvioCobranca(String codigo_forma_envio_cobranca) {
        this.codigo_forma_envio_cobranca = codigo_forma_envio_cobranca;
    }

    public String getCodigoTipoEmissaoBoletoCobranca() {
        return this.codigo_tipo_emissao_boleto_cobranca;
    }

    public void setCodigoTipoEmissaoBoletoCobranca(String codigo_tipo_emissao_boleto_cobranca) {
        this.codigo_tipo_emissao_boleto_cobranca = codigo_tipo_emissao_boleto_cobranca;
    }

    public Integer getQuantidadeParcelaBoletoCobrancaPermitida() {
        return this.quantidade_parcela_boleto_cobranca_permitida;
    }

    public void setQuantidadeParcelaBoletoCobrancaPermitida(Integer quantidade_parcela_boleto_cobranca_permitida) {
        this.quantidade_parcela_boleto_cobranca_permitida = quantidade_parcela_boleto_cobranca_permitida;
    }

    public TextoDadoProtestoBoletoCobranca getTextoDadoProtestoBoletoCobranca() {
        return this.texto_dado_protesto_boleto_cobranca;
    }

    public void setTextoDadoProtestoBoletoCobranca(TextoDadoProtestoBoletoCobranca texto_dado_protesto_boleto_cobranca) {
        this.texto_dado_protesto_boleto_cobranca = texto_dado_protesto_boleto_cobranca;
    }

    public TextoDadoNegativacaoPagador getTextoDadoNegativacaoPagador() {
        return this.texto_dado_negativacao_pagador;
    }

    public void setTextoDadoNegativacaoPagador(TextoDadoNegativacaoPagador texto_dado_negativacao_pagador) {
        this.texto_dado_negativacao_pagador = texto_dado_negativacao_pagador;
    }

    public TextoDadoPagador getTextoDadoPagador() {
        return this.texto_dado_pagador;
    }

    public void setTextoDadoPagador(TextoDadoPagador texto_dado_pagador) {
        this.texto_dado_pagador = texto_dado_pagador;
    }

    public TextoDadoSacadorAvalista getTextoDadoSacadorAvalista() {
        return this.texto_dado_sacador_avalista;
    }

    public void setTextoDadoSacadorAvalista(TextoDadoSacadorAvalista texto_dado_sacador_avalista) {
        this.texto_dado_sacador_avalista = texto_dado_sacador_avalista;
    }

    public String getCodigoCarteiraCobranca() {
        return this.codigo_carteira_cobranca;
    }

    public void setCodigoCarteiraCobranca(String codigo_carteira_cobranca) {
        this.codigo_carteira_cobranca = codigo_carteira_cobranca;
    }

    public Integer getCodigoTipoVencimentoBoletoCobranca() {
        return this.codigo_tipo_vencimento_boleto_cobranca;
    }

    public void setCodigoTipoVencimentoBoletoCobranca(Integer codigo_tipo_vencimento_boleto_cobranca) {
        this.codigo_tipo_vencimento_boleto_cobranca = codigo_tipo_vencimento_boleto_cobranca;
    }

    public java.util.List<TextoDadoIndividualBoletoCobranca> getTextoDadoIndividualBoletoCobranca() {
        return this.texto_dado_individual_boleto_cobranca;
    }

    public void setTextoDadoIndividualBoletoCobranca(java.util.List<TextoDadoIndividualBoletoCobranca> texto_dado_individual_boleto_cobranca) {
        this.texto_dado_individual_boleto_cobranca = texto_dado_individual_boleto_cobranca;
    }

    public String getCodigoEspecieTitulo() {
        return this.codigo_especie_titulo;
    }

    public void setCodigoEspecieTitulo(String codigo_especie_titulo) {
        this.codigo_especie_titulo = codigo_especie_titulo;
    }

    public String getValorAbatimentoCobranca() {
        return this.valor_abatimento_cobranca;
    }

    public void setValorAbatimentoCobranca(String valor_abatimento_cobranca) {
        this.valor_abatimento_cobranca = valor_abatimento_cobranca;
    }

    public TextoDadoJuroCobrancaAvalista getTextoDadoJuroCobranca() {
        return this.texto_dado_juro_cobranca;
    }

    public void setTextoDadoJuroCobranca(TextoDadoJuroCobrancaAvalista texto_dado_juro_cobranca) {
        this.texto_dado_juro_cobranca = texto_dado_juro_cobranca;
    }

    public TextoDadoMultaCobranca getTextoDadoMultaCobranca() {
        return this.texto_dado_multa_cobranca;
    }

    public void setTextoDadoMultaCobranca(TextoDadoMultaCobranca texto_dado_multa_cobranca) {
        this.texto_dado_multa_cobranca = texto_dado_multa_cobranca;
    }

    public TextoDadoDescontoCobranca getTextoDadoDescontoCobranca() {
        return this.texto_dado_desconto_cobranca;
    }

    public void setTextoDadoDescontoCobranca(TextoDadoDescontoCobranca texto_dado_desconto_cobranca) {
        this.texto_dado_desconto_cobranca = texto_dado_desconto_cobranca;
    }

    public java.util.List<String> getTextoMensagemCobranca() {
        return this.texto_mensagem_cobranca;
    }

    public void setTextoMensagemCobranca(java.util.List<String> texto_mensagem_cobranca) {
        this.texto_mensagem_cobranca = texto_mensagem_cobranca;
    }

    public Boolean getIndicadorDescontoExpressoContratado() {
        return this.indicador_desconto_expresso_contratado;
    }

    public void setIndicadorDescontoExpressoContratado(Boolean indicador_desconto_expresso_contratado) {
        this.indicador_desconto_expresso_contratado = indicador_desconto_expresso_contratado;
    }

    public String getTextoAssuntoEmail() {
        return this.texto_assunto_email;
    }

    public void setTextoAssuntoEmail(String texto_assunto_email) {
        this.texto_assunto_email = texto_assunto_email;
    }

    public String getTextoMensagemEmail() {
        return this.texto_mensagem_email;
    }

    public void setTextoMensagemEmail(String texto_mensagem_email) {
        this.texto_mensagem_email = texto_mensagem_email;
    }
}

