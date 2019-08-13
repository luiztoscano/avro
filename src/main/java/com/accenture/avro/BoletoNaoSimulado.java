/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.accenture.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BoletoNaoSimulado extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2377687213346310951L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BoletoNaoSimulado\",\"namespace\":\"com.accenture.avro\",\"fields\":[{\"name\":\"specversion\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\",\"default\":\"com.accenture.avro\"},{\"name\":\"source\",\"type\":\"string\",\"default\":\"urn:ep9:boleto\"},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"string\"},{\"name\":\"eventversion\",\"type\":\"string\"},{\"name\":\"transactionid\",\"type\":\"string\"},{\"name\":\"datacontenttype\",\"type\":\"string\",\"default\":\"application/avro\"},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"BoletoCobranca\",\"fields\":[{\"name\":\"codigo_canal_origem_boleto_cobranca\",\"type\":[\"string\"]},{\"name\":\"numero_operador\",\"type\":[\"null\",\"string\"]},{\"name\":\"texto_dado_beneficiario_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoBeneficiarioCobranca\",\"fields\":[{\"name\":\"numero_agencia\",\"type\":\"string\",\"doc\":\"Numero da agencia do cliente da cobranca.\"},{\"name\":\"numero_conta_corrente\",\"type\":\"string\",\"doc\":\"Numero da Conta-Corrente do cliente da cobranca.\"},{\"name\":\"numero_digito_verificador\",\"type\":\"string\",\"doc\":\"Número do Digito Verificador do numero da conta\"},{\"name\":\"nome_beneficiario_boleto_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"texto_dado_pessoa_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoPessoaCobranca\",\"fields\":[{\"name\":\"nome_completo_pessoa\",\"type\":\"string\"},{\"name\":\"nome_fantasia\",\"type\":[\"null\",\"string\"]},{\"name\":\"texto_dado_tipo_pessoa_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoTipoPessoaCobranca\",\"fields\":[{\"name\":\"codigo_tipo_pessoa\",\"type\":\"string\",\"doc\":\"Symbols: F,J\"},{\"name\":\"numero_cadastro_pessoa_fisica\",\"type\":[\"null\",\"string\"]},{\"name\":\"numero_cadastro_nacional_pessoa_juridica\",\"type\":[\"null\",\"string\"]}]}}]}},{\"name\":\"texto_dado_endereco_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoEnderecoCobranca\",\"fields\":[{\"name\":\"nome_logradouro_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"numero_logradouro_endereco_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"nome_complemento_endereco_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"nome_bairro_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"nome_cidade_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"sigla_unidade_federacao_cobranca\",\"type\":\"string\"},{\"name\":\"codigo_codigo_enderecamento_postal_cobranca\",\"type\":\"string\"}]}}]}},{\"name\":\"texto_dado_boleto_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoBoletoCobranca\",\"fields\":[{\"name\":\"codigo_forma_envio_cobranca\",\"type\":[\"null\",\"string\"],\"doc\":\"Symbols: impressão, postagem, email\"},{\"name\":\"codigo_tipo_emissao_boleto_cobranca\",\"type\":\"string\",\"doc\":\"Symbols: a vista, proposta, parcelado\"},{\"name\":\"quantidade_parcela_boleto_cobranca_permitida\",\"type\":[\"null\",\"int\"]},{\"name\":\"texto_dado_protesto_boleto_cobranca\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TextoDadoProtestoBoletoCobranca\",\"fields\":[{\"name\":\"indicador_protesto_boleto_cobranca\",\"type\":\"boolean\"},{\"name\":\"quantidade_dia_protesto_boleto_cobranca\",\"type\":[\"null\",\"int\"]}]}]},{\"name\":\"texto_dado_negativacao_pagador\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TextoDadoNegativacaoPagador\",\"fields\":[{\"name\":\"indicador_servico_negativacao_pagador\",\"type\":\"boolean\"},{\"name\":\"quantidade_dia_negativacao\",\"type\":[\"null\",\"int\"]}]}]},{\"name\":\"texto_dado_pagador\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoPagador\",\"fields\":[{\"name\":\"texto_dado_pessoa_cobranca\",\"type\":\"TextoDadoPessoaCobranca\"},{\"name\":\"texto_dado_endereco_cobranca\",\"type\":\"TextoDadoEnderecoCobranca\"},{\"name\":\"nome_endereco_email\",\"type\":[\"null\",\"string\"]}]}},{\"name\":\"texto_dado_sacador_avalista\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TextoDadoSacadorAvalista\",\"fields\":[{\"name\":\"texto_dado_endereco_cobranca\",\"type\":\"TextoDadoEnderecoCobranca\"},{\"name\":\"texto_dado_pessoa_cobranca\",\"type\":\"TextoDadoPessoaCobranca\"}]}]},{\"name\":\"codigo_carteira_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"codigo_tipo_vencimento_boleto_cobranca\",\"type\":\"int\",\"doc\":\"Symbols: 1,3\"},{\"name\":\"texto_dado_individual_boleto_cobranca\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TextoDadoIndividualBoletoCobranca\",\"fields\":[{\"name\":\"data_vencimento_cobranca\",\"type\":[\"string\"]},{\"name\":\"valor_nominal_cobranca\",\"type\":\"string\"},{\"name\":\"numero_seu_numero_boleto_cobranca\",\"type\":[\"null\",\"string\"]}]}}},{\"name\":\"codigo_especie_titulo\",\"type\":\"string\",\"doc\":\"Symbols: 01,02,03,04,05,06,07,08,09,13,15,16,17,18,88,89,90,91,92,93,94,95,96,97,98,99\"},{\"name\":\"valor_abatimento_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"texto_dado_juro_cobranca\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TextoDadoJuroCobrancaAvalista\",\"fields\":[{\"name\":\"data_incidencia_juro_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"codigo_tipo_juro_cobranca\",\"type\":\"string\",\"doc\":\"Symbols: 01,02,03,04,05,06,07,08,09,90\"},{\"name\":\"valor_juro_incidente_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"percentual_juro_incidente_cobranca\",\"type\":[\"null\",\"string\"]}]}]},{\"name\":\"texto_dado_multa_cobranca\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TextoDadoMultaCobranca\",\"fields\":[{\"name\":\"data_incidencia_multa_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"codigo_tipo_multa_cobranca\",\"type\":\"string\",\"doc\":\"Symbols: 01,02,03\"},{\"name\":\"valor_multa_incidente_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"percentual_multa_incidente_cobranca\",\"type\":[\"null\",\"string\"]}]}]},{\"name\":\"texto_dado_desconto_cobranca\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TextoDadoDescontoCobranca\",\"fields\":[{\"name\":\"codigo_tipo_desconto_cobranca\",\"type\":\"string\",\"doc\":\"Symbols: 00,01,02,03,04,05,06,90\"},{\"name\":\"texto_dado_detalhe_desconto_cobranca\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TextoDadoDetalheDescontoCobranca\",\"fields\":[{\"name\":\"data_limite_desconto_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"valor_desconto_concedido_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"percentual_desconto_concedido_cobranca\",\"type\":[\"null\",\"string\"]}]}}}]}]},{\"name\":\"texto_mensagem_cobranca\",\"type\":[\"null\",{\"type\":\"array\",\"items\":[\"null\",\"string\"]}]},{\"name\":\"indicador_desconto_expresso_contratado\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"texto_assunto_email\",\"type\":[\"null\",\"string\"]},{\"name\":\"texto_mensagem_email\",\"type\":[\"null\",\"string\"]}]}},{\"name\":\"texto_dado_canal\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoCanal\",\"fields\":[{\"name\":\"numero_identificacao_maquina\",\"type\":\"string\"},{\"name\":\"codigo_retorno_canal\",\"type\":[\"null\",\"string\"]}]}},{\"name\":\"texto_dado_erro_cobranca\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TextoDadoErroCobranca\",\"fields\":[{\"name\":\"codigo_erro_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"descricao_erro_cobranca\",\"type\":[\"null\",\"string\"]}]}}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BoletoNaoSimulado> ENCODER =
      new BinaryMessageEncoder<BoletoNaoSimulado>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BoletoNaoSimulado> DECODER =
      new BinaryMessageDecoder<BoletoNaoSimulado>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BoletoNaoSimulado> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BoletoNaoSimulado> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BoletoNaoSimulado>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BoletoNaoSimulado to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BoletoNaoSimulado from a ByteBuffer. */
  public static BoletoNaoSimulado fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence specversion;
   private java.lang.CharSequence type;
   private java.lang.CharSequence source;
   private java.lang.CharSequence id;
   private java.lang.CharSequence time;
   private java.lang.CharSequence eventversion;
   private java.lang.CharSequence transactionid;
   private java.lang.CharSequence datacontenttype;
   private com.accenture.avro.BoletoCobranca data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BoletoNaoSimulado() {}

  /**
   * All-args constructor.
   * @param specversion The new value for specversion
   * @param type The new value for type
   * @param source The new value for source
   * @param id The new value for id
   * @param time The new value for time
   * @param eventversion The new value for eventversion
   * @param transactionid The new value for transactionid
   * @param datacontenttype The new value for datacontenttype
   * @param data The new value for data
   */
  public BoletoNaoSimulado(java.lang.CharSequence specversion, java.lang.CharSequence type, java.lang.CharSequence source, java.lang.CharSequence id, java.lang.CharSequence time, java.lang.CharSequence eventversion, java.lang.CharSequence transactionid, java.lang.CharSequence datacontenttype, com.accenture.avro.BoletoCobranca data) {
    this.specversion = specversion;
    this.type = type;
    this.source = source;
    this.id = id;
    this.time = time;
    this.eventversion = eventversion;
    this.transactionid = transactionid;
    this.datacontenttype = datacontenttype;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return specversion;
    case 1: return type;
    case 2: return source;
    case 3: return id;
    case 4: return time;
    case 5: return eventversion;
    case 6: return transactionid;
    case 7: return datacontenttype;
    case 8: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: specversion = (java.lang.CharSequence)value$; break;
    case 1: type = (java.lang.CharSequence)value$; break;
    case 2: source = (java.lang.CharSequence)value$; break;
    case 3: id = (java.lang.CharSequence)value$; break;
    case 4: time = (java.lang.CharSequence)value$; break;
    case 5: eventversion = (java.lang.CharSequence)value$; break;
    case 6: transactionid = (java.lang.CharSequence)value$; break;
    case 7: datacontenttype = (java.lang.CharSequence)value$; break;
    case 8: data = (com.accenture.avro.BoletoCobranca)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'specversion' field.
   * @return The value of the 'specversion' field.
   */
  public java.lang.CharSequence getSpecversion() {
    return specversion;
  }

  /**
   * Sets the value of the 'specversion' field.
   * @param value the value to set.
   */
  public void setSpecversion(java.lang.CharSequence value) {
    this.specversion = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public java.lang.CharSequence getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(java.lang.CharSequence value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return The value of the 'time' field.
   */
  public java.lang.CharSequence getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * @param value the value to set.
   */
  public void setTime(java.lang.CharSequence value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'eventversion' field.
   * @return The value of the 'eventversion' field.
   */
  public java.lang.CharSequence getEventversion() {
    return eventversion;
  }

  /**
   * Sets the value of the 'eventversion' field.
   * @param value the value to set.
   */
  public void setEventversion(java.lang.CharSequence value) {
    this.eventversion = value;
  }

  /**
   * Gets the value of the 'transactionid' field.
   * @return The value of the 'transactionid' field.
   */
  public java.lang.CharSequence getTransactionid() {
    return transactionid;
  }

  /**
   * Sets the value of the 'transactionid' field.
   * @param value the value to set.
   */
  public void setTransactionid(java.lang.CharSequence value) {
    this.transactionid = value;
  }

  /**
   * Gets the value of the 'datacontenttype' field.
   * @return The value of the 'datacontenttype' field.
   */
  public java.lang.CharSequence getDatacontenttype() {
    return datacontenttype;
  }

  /**
   * Sets the value of the 'datacontenttype' field.
   * @param value the value to set.
   */
  public void setDatacontenttype(java.lang.CharSequence value) {
    this.datacontenttype = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public com.accenture.avro.BoletoCobranca getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(com.accenture.avro.BoletoCobranca value) {
    this.data = value;
  }

  /**
   * Creates a new BoletoNaoSimulado RecordBuilder.
   * @return A new BoletoNaoSimulado RecordBuilder
   */
  public static com.accenture.avro.BoletoNaoSimulado.Builder newBuilder() {
    return new com.accenture.avro.BoletoNaoSimulado.Builder();
  }

  /**
   * Creates a new BoletoNaoSimulado RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BoletoNaoSimulado RecordBuilder
   */
  public static com.accenture.avro.BoletoNaoSimulado.Builder newBuilder(com.accenture.avro.BoletoNaoSimulado.Builder other) {
    return new com.accenture.avro.BoletoNaoSimulado.Builder(other);
  }

  /**
   * Creates a new BoletoNaoSimulado RecordBuilder by copying an existing BoletoNaoSimulado instance.
   * @param other The existing instance to copy.
   * @return A new BoletoNaoSimulado RecordBuilder
   */
  public static com.accenture.avro.BoletoNaoSimulado.Builder newBuilder(com.accenture.avro.BoletoNaoSimulado other) {
    return new com.accenture.avro.BoletoNaoSimulado.Builder(other);
  }

  /**
   * RecordBuilder for BoletoNaoSimulado instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BoletoNaoSimulado>
    implements org.apache.avro.data.RecordBuilder<BoletoNaoSimulado> {

    private java.lang.CharSequence specversion;
    private java.lang.CharSequence type;
    private java.lang.CharSequence source;
    private java.lang.CharSequence id;
    private java.lang.CharSequence time;
    private java.lang.CharSequence eventversion;
    private java.lang.CharSequence transactionid;
    private java.lang.CharSequence datacontenttype;
    private com.accenture.avro.BoletoCobranca data;
    private com.accenture.avro.BoletoCobranca.Builder dataBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.accenture.avro.BoletoNaoSimulado.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.specversion)) {
        this.specversion = data().deepCopy(fields()[0].schema(), other.specversion);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.id)) {
        this.id = data().deepCopy(fields()[3].schema(), other.id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.time)) {
        this.time = data().deepCopy(fields()[4].schema(), other.time);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.eventversion)) {
        this.eventversion = data().deepCopy(fields()[5].schema(), other.eventversion);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.transactionid)) {
        this.transactionid = data().deepCopy(fields()[6].schema(), other.transactionid);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.datacontenttype)) {
        this.datacontenttype = data().deepCopy(fields()[7].schema(), other.datacontenttype);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.data)) {
        this.data = data().deepCopy(fields()[8].schema(), other.data);
        fieldSetFlags()[8] = true;
      }
      if (other.hasDataBuilder()) {
        this.dataBuilder = com.accenture.avro.BoletoCobranca.newBuilder(other.getDataBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing BoletoNaoSimulado instance
     * @param other The existing instance to copy.
     */
    private Builder(com.accenture.avro.BoletoNaoSimulado other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.specversion)) {
        this.specversion = data().deepCopy(fields()[0].schema(), other.specversion);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.id)) {
        this.id = data().deepCopy(fields()[3].schema(), other.id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.time)) {
        this.time = data().deepCopy(fields()[4].schema(), other.time);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.eventversion)) {
        this.eventversion = data().deepCopy(fields()[5].schema(), other.eventversion);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.transactionid)) {
        this.transactionid = data().deepCopy(fields()[6].schema(), other.transactionid);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.datacontenttype)) {
        this.datacontenttype = data().deepCopy(fields()[7].schema(), other.datacontenttype);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.data)) {
        this.data = data().deepCopy(fields()[8].schema(), other.data);
        fieldSetFlags()[8] = true;
      }
      this.dataBuilder = null;
    }

    /**
      * Gets the value of the 'specversion' field.
      * @return The value.
      */
    public java.lang.CharSequence getSpecversion() {
      return specversion;
    }

    /**
      * Sets the value of the 'specversion' field.
      * @param value The value of 'specversion'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setSpecversion(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.specversion = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'specversion' field has been set.
      * @return True if the 'specversion' field has been set, false otherwise.
      */
    public boolean hasSpecversion() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'specversion' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearSpecversion() {
      specversion = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public java.lang.CharSequence getSource() {
      return source;
    }

    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setSource(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.source = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearSource() {
      source = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.id = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearId() {
      id = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * @return The value.
      */
    public java.lang.CharSequence getTime() {
      return time;
    }

    /**
      * Sets the value of the 'time' field.
      * @param value The value of 'time'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setTime(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.time = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'time' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearTime() {
      time = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventversion' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventversion() {
      return eventversion;
    }

    /**
      * Sets the value of the 'eventversion' field.
      * @param value The value of 'eventversion'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setEventversion(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.eventversion = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'eventversion' field has been set.
      * @return True if the 'eventversion' field has been set, false otherwise.
      */
    public boolean hasEventversion() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'eventversion' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearEventversion() {
      eventversion = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'transactionid' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionid() {
      return transactionid;
    }

    /**
      * Sets the value of the 'transactionid' field.
      * @param value The value of 'transactionid'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setTransactionid(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.transactionid = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'transactionid' field has been set.
      * @return True if the 'transactionid' field has been set, false otherwise.
      */
    public boolean hasTransactionid() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'transactionid' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearTransactionid() {
      transactionid = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'datacontenttype' field.
      * @return The value.
      */
    public java.lang.CharSequence getDatacontenttype() {
      return datacontenttype;
    }

    /**
      * Sets the value of the 'datacontenttype' field.
      * @param value The value of 'datacontenttype'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setDatacontenttype(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.datacontenttype = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'datacontenttype' field has been set.
      * @return True if the 'datacontenttype' field has been set, false otherwise.
      */
    public boolean hasDatacontenttype() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'datacontenttype' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearDatacontenttype() {
      datacontenttype = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public com.accenture.avro.BoletoCobranca getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder setData(com.accenture.avro.BoletoCobranca value) {
      validate(fields()[8], value);
      this.dataBuilder = null;
      this.data = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'data' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.accenture.avro.BoletoCobranca.Builder getDataBuilder() {
      if (dataBuilder == null) {
        if (hasData()) {
          setDataBuilder(com.accenture.avro.BoletoCobranca.newBuilder(data));
        } else {
          setDataBuilder(com.accenture.avro.BoletoCobranca.newBuilder());
        }
      }
      return dataBuilder;
    }

    /**
     * Sets the Builder instance for the 'data' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.accenture.avro.BoletoNaoSimulado.Builder setDataBuilder(com.accenture.avro.BoletoCobranca.Builder value) {
      clearData();
      dataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'data' field has an active Builder instance
     * @return True if the 'data' field has an active Builder instance
     */
    public boolean hasDataBuilder() {
      return dataBuilder != null;
    }

    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public com.accenture.avro.BoletoNaoSimulado.Builder clearData() {
      data = null;
      dataBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BoletoNaoSimulado build() {
      try {
        BoletoNaoSimulado record = new BoletoNaoSimulado();
        record.specversion = fieldSetFlags()[0] ? this.specversion : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.source = fieldSetFlags()[2] ? this.source : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.id = fieldSetFlags()[3] ? this.id : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.time = fieldSetFlags()[4] ? this.time : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.eventversion = fieldSetFlags()[5] ? this.eventversion : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.transactionid = fieldSetFlags()[6] ? this.transactionid : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.datacontenttype = fieldSetFlags()[7] ? this.datacontenttype : (java.lang.CharSequence) defaultValue(fields()[7]);
        if (dataBuilder != null) {
          record.data = this.dataBuilder.build();
        } else {
          record.data = fieldSetFlags()[8] ? this.data : (com.accenture.avro.BoletoCobranca) defaultValue(fields()[8]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BoletoNaoSimulado>
    WRITER$ = (org.apache.avro.io.DatumWriter<BoletoNaoSimulado>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BoletoNaoSimulado>
    READER$ = (org.apache.avro.io.DatumReader<BoletoNaoSimulado>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}