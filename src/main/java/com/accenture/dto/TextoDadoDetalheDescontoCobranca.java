package com.accenture.dto;

public class TextoDadoDetalheDescontoCobranca {
    private String data_limite_desconto_cobranca;
    private String valor_desconto_concedido_cobranca;
    private String percentual_desconto_concedido_cobranca;

    public String getDataLimiteDescontoCobranca() {
        return this.data_limite_desconto_cobranca;
    }

    public void setDataLimiteDescontoCobranca(String data_limite_desconto_cobranca) {
        this.data_limite_desconto_cobranca = data_limite_desconto_cobranca;
    }

    public String getValorDescontoConcedidoCobranca() {
        return this.valor_desconto_concedido_cobranca;
    }

    public void setValorDescontoConcedidoCobranca(String valor_desconto_concedido_cobranca) {
        this.valor_desconto_concedido_cobranca = valor_desconto_concedido_cobranca;
    }

    public String getPercentualDescontoConcedidoCobranca() {
        return this.percentual_desconto_concedido_cobranca;
    }

    public void setPercentualDescontoConcedidoCobranca(String percentual_desconto_concedido_cobranca) {
        this.percentual_desconto_concedido_cobranca = percentual_desconto_concedido_cobranca;
    }
}

