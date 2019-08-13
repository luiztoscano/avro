package com.accenture.dto;

public class TextoDadoMultaCobranca {
    private String data_incidencia_multa_cobranca;
    private String codigo_tipo_multa_cobranca;
    private String valor_multa_incidente_cobranca;
    private String percentual_multa_incidente_cobranca;

    public String getDataIncidenciaMultaCobranca() {
        return this.data_incidencia_multa_cobranca;
    }

    public void setDataIncidenciaMultaCobranca(String data_incidencia_multa_cobranca) {
        this.data_incidencia_multa_cobranca = data_incidencia_multa_cobranca;
    }

    public String getCodigoTipoMultaCobranca() {
        return this.codigo_tipo_multa_cobranca;
    }

    public void setCodigoTipoMultaCobranca(String codigo_tipo_multa_cobranca) {
        this.codigo_tipo_multa_cobranca = codigo_tipo_multa_cobranca;
    }

    public String getValorMultaIncidenteCobranca() {
        return this.valor_multa_incidente_cobranca;
    }

    public void setValorMultaIncidenteCobranca(String valor_multa_incidente_cobranca) {
        this.valor_multa_incidente_cobranca = valor_multa_incidente_cobranca;
    }

    public String getPercentualMultaIncidenteCobranca() {
        return this.percentual_multa_incidente_cobranca;
    }

    public void setPercentualMultaIncidenteCobranca(String percentual_multa_incidente_cobranca) {
        this.percentual_multa_incidente_cobranca = percentual_multa_incidente_cobranca;
    }
}

