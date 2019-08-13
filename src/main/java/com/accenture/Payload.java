package com.accenture;

import com.accenture.dto.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Payload {
    public static void main(String[] args) {

        TextoDadoEnderecoCobranca textoDadoEnderecoCobranca = new TextoDadoEnderecoCobranca();
        textoDadoEnderecoCobranca.setNomeBairroEnderecoCobranca("Moema");
        textoDadoEnderecoCobranca.setNomeCidadeEnderecoCobranca("Sao Paulo");
        textoDadoEnderecoCobranca.setNomeComplementoEnderecoCobranca("Ap 1101, Bloco A");
        textoDadoEnderecoCobranca.setNomeLogradouroEnderecoCobranca("Avenida Jamaris");
        textoDadoEnderecoCobranca.setNumeroLogradouroEnderecoCobranca("100");
        textoDadoEnderecoCobranca.setCodigoCodigoEnderecamentoPostalCobranca("04050-000");
        textoDadoEnderecoCobranca.setSiglaUnidadeFederacaoCobranca("SP");

        TextoDadoTipoPessoaCobranca textoDadoTipoPessoaCobranca = new TextoDadoTipoPessoaCobranca();
        textoDadoTipoPessoaCobranca.setCodigoTipoPessoa("F");
        textoDadoTipoPessoaCobranca.setNumeroCadastroPessoaFisica("1234");

        TextoDadoPessoaCobranca textoDadoPessoaCobranca = new TextoDadoPessoaCobranca();
        textoDadoPessoaCobranca.setNomeCompletoPessoa("Luiz Toscano");
        textoDadoPessoaCobranca.setNomeFantasia("Toscano");
        textoDadoPessoaCobranca.setTextoDadoTipoPessoaCobranca(textoDadoTipoPessoaCobranca);

        TextoDadoBeneficiarioCobranca textoDadoBeneficiarioCobranca = new TextoDadoBeneficiarioCobranca();
        textoDadoBeneficiarioCobranca.setNomeBeneficiarioBoletoCobranca("Luiz Toscano");
        textoDadoBeneficiarioCobranca.setNumeroAgencia("01");
        textoDadoBeneficiarioCobranca.setNumeroContaCorrente("010203");
        textoDadoBeneficiarioCobranca.setNumeroDigitoVerificador("9");
        textoDadoBeneficiarioCobranca.setTextoDadoEnderecoCobranca(textoDadoEnderecoCobranca);
        textoDadoBeneficiarioCobranca.setTextoDadoPessoaCobranca(textoDadoPessoaCobranca);

        TextoDadoDetalheDescontoCobranca textoDadoDetalheDescontoCobranca = new TextoDadoDetalheDescontoCobranca();
        textoDadoDetalheDescontoCobranca.setDataLimiteDescontoCobranca("01/01/2021");
        textoDadoDetalheDescontoCobranca.setPercentualDescontoConcedidoCobranca("10");
        textoDadoDetalheDescontoCobranca.setValorDescontoConcedidoCobranca("100");

        List<TextoDadoDetalheDescontoCobranca> detalhes = new ArrayList<>();
        detalhes.add(textoDadoDetalheDescontoCobranca);

        TextoDadoDescontoCobranca textoDadoDescontoCobranca = new TextoDadoDescontoCobranca();
        textoDadoDescontoCobranca.setCodigoTipoDescontoCobranca("1");
        textoDadoDescontoCobranca.setTextoDadoDetalheDescontoCobranca(detalhes);

        TextoDadoIndividualBoletoCobranca textoDadoIndividualBoletoCobranca = new TextoDadoIndividualBoletoCobranca();
        textoDadoIndividualBoletoCobranca.setDataVencimentoCobranca("01/01/2021");
        textoDadoIndividualBoletoCobranca.setNumeroSeuNumeroBoletoCobranca("12345");
        textoDadoIndividualBoletoCobranca.setValorNominalCobranca("1000");

        List<TextoDadoIndividualBoletoCobranca> individuais = new ArrayList<>();
        individuais.add(textoDadoIndividualBoletoCobranca);

        TextoDadoJuroCobrancaAvalista textoDadoJuroCobrancaAvalista = new TextoDadoJuroCobrancaAvalista();
        textoDadoJuroCobrancaAvalista.setCodigoTipoJuroCobranca("1");
        textoDadoJuroCobrancaAvalista.setDataIncidenciaJuroCobranca("01/01/2021");
        textoDadoJuroCobrancaAvalista.setPercentualJuroIncidenteCobranca("10");
        textoDadoJuroCobrancaAvalista.setValorJuroIncidenteCobranca("100");

        TextoDadoMultaCobranca textoDadoMultaCobranca = new TextoDadoMultaCobranca();
        textoDadoMultaCobranca.setCodigoTipoMultaCobranca("1");
        textoDadoMultaCobranca.setDataIncidenciaMultaCobranca("01/01/2021");
        textoDadoMultaCobranca.setPercentualMultaIncidenteCobranca("10");
        textoDadoMultaCobranca.setValorMultaIncidenteCobranca("100");

        TextoDadoNegativacaoPagador textoDadoNegativacaoPagador = new TextoDadoNegativacaoPagador();
        textoDadoNegativacaoPagador.setIndicadorServicoNegativacaoPagador(true);
        textoDadoNegativacaoPagador.setQuantidadeDiaNegativacao(10);

        TextoDadoPagador textoDadoPagador = new TextoDadoPagador();
        textoDadoPagador.setNomeEnderecoEmail("toscano@email.com");
        textoDadoPagador.setTextoDadoEnderecoCobranca(textoDadoEnderecoCobranca);
        textoDadoPagador.setTextoDadoPessoaCobranca(textoDadoPessoaCobranca);

        TextoDadoSacadorAvalista textoDadoSacadorAvalista = new TextoDadoSacadorAvalista();
        textoDadoSacadorAvalista.setTextoDadoEnderecoCobranca(textoDadoEnderecoCobranca);
        textoDadoSacadorAvalista.setTextoDadoPessoaCobranca(textoDadoPessoaCobranca);

        List<String> mensagens = new ArrayList<>();
        mensagens.add("Cobranca");

        TextoDadoBoletoCobranca textoDadoBoletoCobranca = new TextoDadoBoletoCobranca();
        textoDadoBoletoCobranca.setCodigoCarteiraCobranca("1");
        textoDadoBoletoCobranca.setCodigoEspecieTitulo("1");
        textoDadoBoletoCobranca.setCodigoFormaEnvioCobranca("email");
        textoDadoBoletoCobranca.setCodigoTipoEmissaoBoletoCobranca("1");
        textoDadoBoletoCobranca.setCodigoTipoVencimentoBoletoCobranca(1);
        textoDadoBoletoCobranca.setIndicadorDescontoExpressoContratado(false);
        textoDadoBoletoCobranca.setQuantidadeParcelaBoletoCobrancaPermitida(1);
        textoDadoBoletoCobranca.setTextoAssuntoEmail("Cobranca");
        textoDadoBoletoCobranca.setTextoDadoDescontoCobranca(textoDadoDescontoCobranca);
        textoDadoBoletoCobranca.setTextoDadoIndividualBoletoCobranca(individuais);
        textoDadoBoletoCobranca.setTextoDadoJuroCobranca(textoDadoJuroCobrancaAvalista);
        textoDadoBoletoCobranca.setTextoDadoMultaCobranca(textoDadoMultaCobranca);
        textoDadoBoletoCobranca.setTextoDadoNegativacaoPagador(textoDadoNegativacaoPagador);
        textoDadoBoletoCobranca.setTextoDadoPagador(textoDadoPagador);
        textoDadoBoletoCobranca.setTextoDadoSacadorAvalista(textoDadoSacadorAvalista);
        textoDadoBoletoCobranca.setTextoMensagemCobranca(mensagens);
        textoDadoBoletoCobranca.setTextoMensagemEmail("toscano@email.com");

        TextoDadoCanal textoDadoCanal = new TextoDadoCanal();
        textoDadoCanal.setCodigoRetornoCanal("200");
        textoDadoCanal.setNumeroIdentificacaoMaquina("1");

        TextoDadoErroCobranca textoDadoErroCobranca = new TextoDadoErroCobranca();
        textoDadoErroCobranca.setCodigoErroCobranca("500");
        textoDadoErroCobranca.setDescricaoErroCobranca("Erro");

        List<TextoDadoErroCobranca> erros = new ArrayList<>();
        erros.add(textoDadoErroCobranca);

        BoletoCobranca boletoCobranca = new BoletoCobranca();
        boletoCobranca.setCodigoCanalOrigemBoletoCobranca("1");
        boletoCobranca.setNumeroOperador("1");
        boletoCobranca.setTextoDadoBeneficiarioCobranca(textoDadoBeneficiarioCobranca);
        boletoCobranca.setTextoDadoBoletoCobranca(textoDadoBoletoCobranca);
        boletoCobranca.setTextoDadoCanal(textoDadoCanal);
        boletoCobranca.setTextoDadoErroCobranca(erros);

        BoletoNaoSimulado boletoNaoSimulado = new BoletoNaoSimulado();
        boletoNaoSimulado.setEventversion("1");
        boletoNaoSimulado.setDatacontenttype("application/json");
        boletoNaoSimulado.setId("123");
        boletoNaoSimulado.setData(boletoCobranca);
        boletoNaoSimulado.setSource("canal");
        boletoNaoSimulado.setSpecversion("1.0");
        boletoNaoSimulado.setTime((new Date()).toString());
        boletoNaoSimulado.setTransactionid("12345");
        boletoNaoSimulado.setType("BoletoNaoSimulado");


        try {
            ObjectMapper mapper = new ObjectMapper();
            System.out.println(mapper.writeValueAsString(boletoNaoSimulado));


        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
