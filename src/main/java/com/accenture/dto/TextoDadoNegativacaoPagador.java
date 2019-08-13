package com.accenture.dto;

public class TextoDadoNegativacaoPagador {
    private Boolean indicador_servico_negativacao_pagador;
    private Integer quantidade_dia_negativacao;

    public Boolean getIndicadorServicoNegativacaoPagador() {
        return this.indicador_servico_negativacao_pagador;
    }

    public void setIndicadorServicoNegativacaoPagador(Boolean indicador_servico_negativacao_pagador) {
        this.indicador_servico_negativacao_pagador = indicador_servico_negativacao_pagador;
    }

    public Integer getQuantidadeDiaNegativacao() {
        return this.quantidade_dia_negativacao;
    }

    public void setQuantidadeDiaNegativacao(Integer quantidade_dia_negativacao) {
        this.quantidade_dia_negativacao = quantidade_dia_negativacao;
    }
}

