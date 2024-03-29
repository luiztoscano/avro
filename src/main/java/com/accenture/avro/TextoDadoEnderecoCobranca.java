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
public class TextoDadoEnderecoCobranca extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3946216194308845175L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TextoDadoEnderecoCobranca\",\"namespace\":\"com.accenture.avro\",\"fields\":[{\"name\":\"nome_logradouro_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"numero_logradouro_endereco_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"nome_complemento_endereco_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"nome_bairro_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"nome_cidade_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"sigla_unidade_federacao_cobranca\",\"type\":\"string\"},{\"name\":\"codigo_codigo_enderecamento_postal_cobranca\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TextoDadoEnderecoCobranca> ENCODER =
      new BinaryMessageEncoder<TextoDadoEnderecoCobranca>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TextoDadoEnderecoCobranca> DECODER =
      new BinaryMessageDecoder<TextoDadoEnderecoCobranca>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TextoDadoEnderecoCobranca> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TextoDadoEnderecoCobranca> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TextoDadoEnderecoCobranca>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TextoDadoEnderecoCobranca to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TextoDadoEnderecoCobranca from a ByteBuffer. */
  public static TextoDadoEnderecoCobranca fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence nome_logradouro_endereco_cobranca;
   private java.lang.CharSequence numero_logradouro_endereco_cobranca;
   private java.lang.CharSequence nome_complemento_endereco_cobranca;
   private java.lang.CharSequence nome_bairro_endereco_cobranca;
   private java.lang.CharSequence nome_cidade_endereco_cobranca;
   private java.lang.CharSequence sigla_unidade_federacao_cobranca;
   private java.lang.CharSequence codigo_codigo_enderecamento_postal_cobranca;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TextoDadoEnderecoCobranca() {}

  /**
   * All-args constructor.
   * @param nome_logradouro_endereco_cobranca The new value for nome_logradouro_endereco_cobranca
   * @param numero_logradouro_endereco_cobranca The new value for numero_logradouro_endereco_cobranca
   * @param nome_complemento_endereco_cobranca The new value for nome_complemento_endereco_cobranca
   * @param nome_bairro_endereco_cobranca The new value for nome_bairro_endereco_cobranca
   * @param nome_cidade_endereco_cobranca The new value for nome_cidade_endereco_cobranca
   * @param sigla_unidade_federacao_cobranca The new value for sigla_unidade_federacao_cobranca
   * @param codigo_codigo_enderecamento_postal_cobranca The new value for codigo_codigo_enderecamento_postal_cobranca
   */
  public TextoDadoEnderecoCobranca(java.lang.CharSequence nome_logradouro_endereco_cobranca, java.lang.CharSequence numero_logradouro_endereco_cobranca, java.lang.CharSequence nome_complemento_endereco_cobranca, java.lang.CharSequence nome_bairro_endereco_cobranca, java.lang.CharSequence nome_cidade_endereco_cobranca, java.lang.CharSequence sigla_unidade_federacao_cobranca, java.lang.CharSequence codigo_codigo_enderecamento_postal_cobranca) {
    this.nome_logradouro_endereco_cobranca = nome_logradouro_endereco_cobranca;
    this.numero_logradouro_endereco_cobranca = numero_logradouro_endereco_cobranca;
    this.nome_complemento_endereco_cobranca = nome_complemento_endereco_cobranca;
    this.nome_bairro_endereco_cobranca = nome_bairro_endereco_cobranca;
    this.nome_cidade_endereco_cobranca = nome_cidade_endereco_cobranca;
    this.sigla_unidade_federacao_cobranca = sigla_unidade_federacao_cobranca;
    this.codigo_codigo_enderecamento_postal_cobranca = codigo_codigo_enderecamento_postal_cobranca;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nome_logradouro_endereco_cobranca;
    case 1: return numero_logradouro_endereco_cobranca;
    case 2: return nome_complemento_endereco_cobranca;
    case 3: return nome_bairro_endereco_cobranca;
    case 4: return nome_cidade_endereco_cobranca;
    case 5: return sigla_unidade_federacao_cobranca;
    case 6: return codigo_codigo_enderecamento_postal_cobranca;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nome_logradouro_endereco_cobranca = (java.lang.CharSequence)value$; break;
    case 1: numero_logradouro_endereco_cobranca = (java.lang.CharSequence)value$; break;
    case 2: nome_complemento_endereco_cobranca = (java.lang.CharSequence)value$; break;
    case 3: nome_bairro_endereco_cobranca = (java.lang.CharSequence)value$; break;
    case 4: nome_cidade_endereco_cobranca = (java.lang.CharSequence)value$; break;
    case 5: sigla_unidade_federacao_cobranca = (java.lang.CharSequence)value$; break;
    case 6: codigo_codigo_enderecamento_postal_cobranca = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nome_logradouro_endereco_cobranca' field.
   * @return The value of the 'nome_logradouro_endereco_cobranca' field.
   */
  public java.lang.CharSequence getNomeLogradouroEnderecoCobranca() {
    return nome_logradouro_endereco_cobranca;
  }

  /**
   * Sets the value of the 'nome_logradouro_endereco_cobranca' field.
   * @param value the value to set.
   */
  public void setNomeLogradouroEnderecoCobranca(java.lang.CharSequence value) {
    this.nome_logradouro_endereco_cobranca = value;
  }

  /**
   * Gets the value of the 'numero_logradouro_endereco_cobranca' field.
   * @return The value of the 'numero_logradouro_endereco_cobranca' field.
   */
  public java.lang.CharSequence getNumeroLogradouroEnderecoCobranca() {
    return numero_logradouro_endereco_cobranca;
  }

  /**
   * Sets the value of the 'numero_logradouro_endereco_cobranca' field.
   * @param value the value to set.
   */
  public void setNumeroLogradouroEnderecoCobranca(java.lang.CharSequence value) {
    this.numero_logradouro_endereco_cobranca = value;
  }

  /**
   * Gets the value of the 'nome_complemento_endereco_cobranca' field.
   * @return The value of the 'nome_complemento_endereco_cobranca' field.
   */
  public java.lang.CharSequence getNomeComplementoEnderecoCobranca() {
    return nome_complemento_endereco_cobranca;
  }

  /**
   * Sets the value of the 'nome_complemento_endereco_cobranca' field.
   * @param value the value to set.
   */
  public void setNomeComplementoEnderecoCobranca(java.lang.CharSequence value) {
    this.nome_complemento_endereco_cobranca = value;
  }

  /**
   * Gets the value of the 'nome_bairro_endereco_cobranca' field.
   * @return The value of the 'nome_bairro_endereco_cobranca' field.
   */
  public java.lang.CharSequence getNomeBairroEnderecoCobranca() {
    return nome_bairro_endereco_cobranca;
  }

  /**
   * Sets the value of the 'nome_bairro_endereco_cobranca' field.
   * @param value the value to set.
   */
  public void setNomeBairroEnderecoCobranca(java.lang.CharSequence value) {
    this.nome_bairro_endereco_cobranca = value;
  }

  /**
   * Gets the value of the 'nome_cidade_endereco_cobranca' field.
   * @return The value of the 'nome_cidade_endereco_cobranca' field.
   */
  public java.lang.CharSequence getNomeCidadeEnderecoCobranca() {
    return nome_cidade_endereco_cobranca;
  }

  /**
   * Sets the value of the 'nome_cidade_endereco_cobranca' field.
   * @param value the value to set.
   */
  public void setNomeCidadeEnderecoCobranca(java.lang.CharSequence value) {
    this.nome_cidade_endereco_cobranca = value;
  }

  /**
   * Gets the value of the 'sigla_unidade_federacao_cobranca' field.
   * @return The value of the 'sigla_unidade_federacao_cobranca' field.
   */
  public java.lang.CharSequence getSiglaUnidadeFederacaoCobranca() {
    return sigla_unidade_federacao_cobranca;
  }

  /**
   * Sets the value of the 'sigla_unidade_federacao_cobranca' field.
   * @param value the value to set.
   */
  public void setSiglaUnidadeFederacaoCobranca(java.lang.CharSequence value) {
    this.sigla_unidade_federacao_cobranca = value;
  }

  /**
   * Gets the value of the 'codigo_codigo_enderecamento_postal_cobranca' field.
   * @return The value of the 'codigo_codigo_enderecamento_postal_cobranca' field.
   */
  public java.lang.CharSequence getCodigoCodigoEnderecamentoPostalCobranca() {
    return codigo_codigo_enderecamento_postal_cobranca;
  }

  /**
   * Sets the value of the 'codigo_codigo_enderecamento_postal_cobranca' field.
   * @param value the value to set.
   */
  public void setCodigoCodigoEnderecamentoPostalCobranca(java.lang.CharSequence value) {
    this.codigo_codigo_enderecamento_postal_cobranca = value;
  }

  /**
   * Creates a new TextoDadoEnderecoCobranca RecordBuilder.
   * @return A new TextoDadoEnderecoCobranca RecordBuilder
   */
  public static com.accenture.avro.TextoDadoEnderecoCobranca.Builder newBuilder() {
    return new com.accenture.avro.TextoDadoEnderecoCobranca.Builder();
  }

  /**
   * Creates a new TextoDadoEnderecoCobranca RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TextoDadoEnderecoCobranca RecordBuilder
   */
  public static com.accenture.avro.TextoDadoEnderecoCobranca.Builder newBuilder(com.accenture.avro.TextoDadoEnderecoCobranca.Builder other) {
    return new com.accenture.avro.TextoDadoEnderecoCobranca.Builder(other);
  }

  /**
   * Creates a new TextoDadoEnderecoCobranca RecordBuilder by copying an existing TextoDadoEnderecoCobranca instance.
   * @param other The existing instance to copy.
   * @return A new TextoDadoEnderecoCobranca RecordBuilder
   */
  public static com.accenture.avro.TextoDadoEnderecoCobranca.Builder newBuilder(com.accenture.avro.TextoDadoEnderecoCobranca other) {
    return new com.accenture.avro.TextoDadoEnderecoCobranca.Builder(other);
  }

  /**
   * RecordBuilder for TextoDadoEnderecoCobranca instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TextoDadoEnderecoCobranca>
    implements org.apache.avro.data.RecordBuilder<TextoDadoEnderecoCobranca> {

    private java.lang.CharSequence nome_logradouro_endereco_cobranca;
    private java.lang.CharSequence numero_logradouro_endereco_cobranca;
    private java.lang.CharSequence nome_complemento_endereco_cobranca;
    private java.lang.CharSequence nome_bairro_endereco_cobranca;
    private java.lang.CharSequence nome_cidade_endereco_cobranca;
    private java.lang.CharSequence sigla_unidade_federacao_cobranca;
    private java.lang.CharSequence codigo_codigo_enderecamento_postal_cobranca;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.accenture.avro.TextoDadoEnderecoCobranca.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nome_logradouro_endereco_cobranca)) {
        this.nome_logradouro_endereco_cobranca = data().deepCopy(fields()[0].schema(), other.nome_logradouro_endereco_cobranca);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numero_logradouro_endereco_cobranca)) {
        this.numero_logradouro_endereco_cobranca = data().deepCopy(fields()[1].schema(), other.numero_logradouro_endereco_cobranca);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nome_complemento_endereco_cobranca)) {
        this.nome_complemento_endereco_cobranca = data().deepCopy(fields()[2].schema(), other.nome_complemento_endereco_cobranca);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.nome_bairro_endereco_cobranca)) {
        this.nome_bairro_endereco_cobranca = data().deepCopy(fields()[3].schema(), other.nome_bairro_endereco_cobranca);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.nome_cidade_endereco_cobranca)) {
        this.nome_cidade_endereco_cobranca = data().deepCopy(fields()[4].schema(), other.nome_cidade_endereco_cobranca);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.sigla_unidade_federacao_cobranca)) {
        this.sigla_unidade_federacao_cobranca = data().deepCopy(fields()[5].schema(), other.sigla_unidade_federacao_cobranca);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.codigo_codigo_enderecamento_postal_cobranca)) {
        this.codigo_codigo_enderecamento_postal_cobranca = data().deepCopy(fields()[6].schema(), other.codigo_codigo_enderecamento_postal_cobranca);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TextoDadoEnderecoCobranca instance
     * @param other The existing instance to copy.
     */
    private Builder(com.accenture.avro.TextoDadoEnderecoCobranca other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.nome_logradouro_endereco_cobranca)) {
        this.nome_logradouro_endereco_cobranca = data().deepCopy(fields()[0].schema(), other.nome_logradouro_endereco_cobranca);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numero_logradouro_endereco_cobranca)) {
        this.numero_logradouro_endereco_cobranca = data().deepCopy(fields()[1].schema(), other.numero_logradouro_endereco_cobranca);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nome_complemento_endereco_cobranca)) {
        this.nome_complemento_endereco_cobranca = data().deepCopy(fields()[2].schema(), other.nome_complemento_endereco_cobranca);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.nome_bairro_endereco_cobranca)) {
        this.nome_bairro_endereco_cobranca = data().deepCopy(fields()[3].schema(), other.nome_bairro_endereco_cobranca);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.nome_cidade_endereco_cobranca)) {
        this.nome_cidade_endereco_cobranca = data().deepCopy(fields()[4].schema(), other.nome_cidade_endereco_cobranca);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.sigla_unidade_federacao_cobranca)) {
        this.sigla_unidade_federacao_cobranca = data().deepCopy(fields()[5].schema(), other.sigla_unidade_federacao_cobranca);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.codigo_codigo_enderecamento_postal_cobranca)) {
        this.codigo_codigo_enderecamento_postal_cobranca = data().deepCopy(fields()[6].schema(), other.codigo_codigo_enderecamento_postal_cobranca);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'nome_logradouro_endereco_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getNomeLogradouroEnderecoCobranca() {
      return nome_logradouro_endereco_cobranca;
    }

    /**
      * Sets the value of the 'nome_logradouro_endereco_cobranca' field.
      * @param value The value of 'nome_logradouro_endereco_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder setNomeLogradouroEnderecoCobranca(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.nome_logradouro_endereco_cobranca = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nome_logradouro_endereco_cobranca' field has been set.
      * @return True if the 'nome_logradouro_endereco_cobranca' field has been set, false otherwise.
      */
    public boolean hasNomeLogradouroEnderecoCobranca() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nome_logradouro_endereco_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder clearNomeLogradouroEnderecoCobranca() {
      nome_logradouro_endereco_cobranca = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'numero_logradouro_endereco_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getNumeroLogradouroEnderecoCobranca() {
      return numero_logradouro_endereco_cobranca;
    }

    /**
      * Sets the value of the 'numero_logradouro_endereco_cobranca' field.
      * @param value The value of 'numero_logradouro_endereco_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder setNumeroLogradouroEnderecoCobranca(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.numero_logradouro_endereco_cobranca = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'numero_logradouro_endereco_cobranca' field has been set.
      * @return True if the 'numero_logradouro_endereco_cobranca' field has been set, false otherwise.
      */
    public boolean hasNumeroLogradouroEnderecoCobranca() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'numero_logradouro_endereco_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder clearNumeroLogradouroEnderecoCobranca() {
      numero_logradouro_endereco_cobranca = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'nome_complemento_endereco_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getNomeComplementoEnderecoCobranca() {
      return nome_complemento_endereco_cobranca;
    }

    /**
      * Sets the value of the 'nome_complemento_endereco_cobranca' field.
      * @param value The value of 'nome_complemento_endereco_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder setNomeComplementoEnderecoCobranca(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.nome_complemento_endereco_cobranca = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'nome_complemento_endereco_cobranca' field has been set.
      * @return True if the 'nome_complemento_endereco_cobranca' field has been set, false otherwise.
      */
    public boolean hasNomeComplementoEnderecoCobranca() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'nome_complemento_endereco_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder clearNomeComplementoEnderecoCobranca() {
      nome_complemento_endereco_cobranca = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'nome_bairro_endereco_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getNomeBairroEnderecoCobranca() {
      return nome_bairro_endereco_cobranca;
    }

    /**
      * Sets the value of the 'nome_bairro_endereco_cobranca' field.
      * @param value The value of 'nome_bairro_endereco_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder setNomeBairroEnderecoCobranca(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.nome_bairro_endereco_cobranca = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'nome_bairro_endereco_cobranca' field has been set.
      * @return True if the 'nome_bairro_endereco_cobranca' field has been set, false otherwise.
      */
    public boolean hasNomeBairroEnderecoCobranca() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'nome_bairro_endereco_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder clearNomeBairroEnderecoCobranca() {
      nome_bairro_endereco_cobranca = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'nome_cidade_endereco_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getNomeCidadeEnderecoCobranca() {
      return nome_cidade_endereco_cobranca;
    }

    /**
      * Sets the value of the 'nome_cidade_endereco_cobranca' field.
      * @param value The value of 'nome_cidade_endereco_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder setNomeCidadeEnderecoCobranca(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.nome_cidade_endereco_cobranca = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'nome_cidade_endereco_cobranca' field has been set.
      * @return True if the 'nome_cidade_endereco_cobranca' field has been set, false otherwise.
      */
    public boolean hasNomeCidadeEnderecoCobranca() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'nome_cidade_endereco_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder clearNomeCidadeEnderecoCobranca() {
      nome_cidade_endereco_cobranca = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'sigla_unidade_federacao_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getSiglaUnidadeFederacaoCobranca() {
      return sigla_unidade_federacao_cobranca;
    }

    /**
      * Sets the value of the 'sigla_unidade_federacao_cobranca' field.
      * @param value The value of 'sigla_unidade_federacao_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder setSiglaUnidadeFederacaoCobranca(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.sigla_unidade_federacao_cobranca = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'sigla_unidade_federacao_cobranca' field has been set.
      * @return True if the 'sigla_unidade_federacao_cobranca' field has been set, false otherwise.
      */
    public boolean hasSiglaUnidadeFederacaoCobranca() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'sigla_unidade_federacao_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder clearSiglaUnidadeFederacaoCobranca() {
      sigla_unidade_federacao_cobranca = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'codigo_codigo_enderecamento_postal_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getCodigoCodigoEnderecamentoPostalCobranca() {
      return codigo_codigo_enderecamento_postal_cobranca;
    }

    /**
      * Sets the value of the 'codigo_codigo_enderecamento_postal_cobranca' field.
      * @param value The value of 'codigo_codigo_enderecamento_postal_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder setCodigoCodigoEnderecamentoPostalCobranca(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.codigo_codigo_enderecamento_postal_cobranca = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'codigo_codigo_enderecamento_postal_cobranca' field has been set.
      * @return True if the 'codigo_codigo_enderecamento_postal_cobranca' field has been set, false otherwise.
      */
    public boolean hasCodigoCodigoEnderecamentoPostalCobranca() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'codigo_codigo_enderecamento_postal_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder clearCodigoCodigoEnderecamentoPostalCobranca() {
      codigo_codigo_enderecamento_postal_cobranca = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TextoDadoEnderecoCobranca build() {
      try {
        TextoDadoEnderecoCobranca record = new TextoDadoEnderecoCobranca();
        record.nome_logradouro_endereco_cobranca = fieldSetFlags()[0] ? this.nome_logradouro_endereco_cobranca : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.numero_logradouro_endereco_cobranca = fieldSetFlags()[1] ? this.numero_logradouro_endereco_cobranca : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.nome_complemento_endereco_cobranca = fieldSetFlags()[2] ? this.nome_complemento_endereco_cobranca : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.nome_bairro_endereco_cobranca = fieldSetFlags()[3] ? this.nome_bairro_endereco_cobranca : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.nome_cidade_endereco_cobranca = fieldSetFlags()[4] ? this.nome_cidade_endereco_cobranca : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.sigla_unidade_federacao_cobranca = fieldSetFlags()[5] ? this.sigla_unidade_federacao_cobranca : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.codigo_codigo_enderecamento_postal_cobranca = fieldSetFlags()[6] ? this.codigo_codigo_enderecamento_postal_cobranca : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TextoDadoEnderecoCobranca>
    WRITER$ = (org.apache.avro.io.DatumWriter<TextoDadoEnderecoCobranca>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TextoDadoEnderecoCobranca>
    READER$ = (org.apache.avro.io.DatumReader<TextoDadoEnderecoCobranca>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
