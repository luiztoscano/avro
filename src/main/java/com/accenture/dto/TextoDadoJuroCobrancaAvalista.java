package com.accenture.dto;

public class TextoDadoJuroCobrancaAvalista {
    private String data_incidencia_juro_cobranca;
    private String codigo_tipo_juro_cobranca;
    private String valor_juro_incidente_cobranca;
    private String percentual_juro_incidente_cobranca;

    public String getDataIncidenciaJuroCobranca() {
        return this.data_incidencia_juro_cobranca;
    }

    public void setDataIncidenciaJuroCobranca(String data_incidencia_juro_cobranca) {
        this.data_incidencia_juro_cobranca = data_incidencia_juro_cobranca;
    }

    public String getCodigoTipoJuroCobranca() {
        return this.codigo_tipo_juro_cobranca;
    }

    public void setCodigoTipoJuroCobranca(String codigo_tipo_juro_cobranca) {
        this.codigo_tipo_juro_cobranca = codigo_tipo_juro_cobranca;
    }

    public String getValorJuroIncidenteCobranca() {
        return this.valor_juro_incidente_cobranca;
    }

    public void setValorJuroIncidenteCobranca(String valor_juro_incidente_cobranca) {
        this.valor_juro_incidente_cobranca = valor_juro_incidente_cobranca;
    }

    public String getPercentualJuroIncidenteCobranca() {
        return this.percentual_juro_incidente_cobranca;
    }

    public void setPercentualJuroIncidenteCobranca(String percentual_juro_incidente_cobranca) {
        this.percentual_juro_incidente_cobranca = percentual_juro_incidente_cobranca;
    }
}

