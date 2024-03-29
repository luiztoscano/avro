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
public class TextoDadoSacadorAvalista extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4989437919553622248L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TextoDadoSacadorAvalista\",\"namespace\":\"com.accenture.avro\",\"fields\":[{\"name\":\"texto_dado_endereco_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoEnderecoCobranca\",\"fields\":[{\"name\":\"nome_logradouro_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"numero_logradouro_endereco_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"nome_complemento_endereco_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"nome_bairro_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"nome_cidade_endereco_cobranca\",\"type\":\"string\"},{\"name\":\"sigla_unidade_federacao_cobranca\",\"type\":\"string\"},{\"name\":\"codigo_codigo_enderecamento_postal_cobranca\",\"type\":\"string\"}]}},{\"name\":\"texto_dado_pessoa_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoPessoaCobranca\",\"fields\":[{\"name\":\"nome_completo_pessoa\",\"type\":\"string\"},{\"name\":\"nome_fantasia\",\"type\":[\"null\",\"string\"]},{\"name\":\"texto_dado_tipo_pessoa_cobranca\",\"type\":{\"type\":\"record\",\"name\":\"TextoDadoTipoPessoaCobranca\",\"fields\":[{\"name\":\"codigo_tipo_pessoa\",\"type\":\"string\",\"doc\":\"Symbols: F,J\"},{\"name\":\"numero_cadastro_pessoa_fisica\",\"type\":[\"null\",\"string\"]},{\"name\":\"numero_cadastro_nacional_pessoa_juridica\",\"type\":[\"null\",\"string\"]}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TextoDadoSacadorAvalista> ENCODER =
      new BinaryMessageEncoder<TextoDadoSacadorAvalista>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TextoDadoSacadorAvalista> DECODER =
      new BinaryMessageDecoder<TextoDadoSacadorAvalista>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TextoDadoSacadorAvalista> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TextoDadoSacadorAvalista> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TextoDadoSacadorAvalista>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TextoDadoSacadorAvalista to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TextoDadoSacadorAvalista from a ByteBuffer. */
  public static TextoDadoSacadorAvalista fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private com.accenture.avro.TextoDadoEnderecoCobranca texto_dado_endereco_cobranca;
   private com.accenture.avro.TextoDadoPessoaCobranca texto_dado_pessoa_cobranca;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TextoDadoSacadorAvalista() {}

  /**
   * All-args constructor.
   * @param texto_dado_endereco_cobranca The new value for texto_dado_endereco_cobranca
   * @param texto_dado_pessoa_cobranca The new value for texto_dado_pessoa_cobranca
   */
  public TextoDadoSacadorAvalista(com.accenture.avro.TextoDadoEnderecoCobranca texto_dado_endereco_cobranca, com.accenture.avro.TextoDadoPessoaCobranca texto_dado_pessoa_cobranca) {
    this.texto_dado_endereco_cobranca = texto_dado_endereco_cobranca;
    this.texto_dado_pessoa_cobranca = texto_dado_pessoa_cobranca;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return texto_dado_endereco_cobranca;
    case 1: return texto_dado_pessoa_cobranca;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: texto_dado_endereco_cobranca = (com.accenture.avro.TextoDadoEnderecoCobranca)value$; break;
    case 1: texto_dado_pessoa_cobranca = (com.accenture.avro.TextoDadoPessoaCobranca)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'texto_dado_endereco_cobranca' field.
   * @return The value of the 'texto_dado_endereco_cobranca' field.
   */
  public com.accenture.avro.TextoDadoEnderecoCobranca getTextoDadoEnderecoCobranca() {
    return texto_dado_endereco_cobranca;
  }

  /**
   * Sets the value of the 'texto_dado_endereco_cobranca' field.
   * @param value the value to set.
   */
  public void setTextoDadoEnderecoCobranca(com.accenture.avro.TextoDadoEnderecoCobranca value) {
    this.texto_dado_endereco_cobranca = value;
  }

  /**
   * Gets the value of the 'texto_dado_pessoa_cobranca' field.
   * @return The value of the 'texto_dado_pessoa_cobranca' field.
   */
  public com.accenture.avro.TextoDadoPessoaCobranca getTextoDadoPessoaCobranca() {
    return texto_dado_pessoa_cobranca;
  }

  /**
   * Sets the value of the 'texto_dado_pessoa_cobranca' field.
   * @param value the value to set.
   */
  public void setTextoDadoPessoaCobranca(com.accenture.avro.TextoDadoPessoaCobranca value) {
    this.texto_dado_pessoa_cobranca = value;
  }

  /**
   * Creates a new TextoDadoSacadorAvalista RecordBuilder.
   * @return A new TextoDadoSacadorAvalista RecordBuilder
   */
  public static com.accenture.avro.TextoDadoSacadorAvalista.Builder newBuilder() {
    return new com.accenture.avro.TextoDadoSacadorAvalista.Builder();
  }

  /**
   * Creates a new TextoDadoSacadorAvalista RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TextoDadoSacadorAvalista RecordBuilder
   */
  public static com.accenture.avro.TextoDadoSacadorAvalista.Builder newBuilder(com.accenture.avro.TextoDadoSacadorAvalista.Builder other) {
    return new com.accenture.avro.TextoDadoSacadorAvalista.Builder(other);
  }

  /**
   * Creates a new TextoDadoSacadorAvalista RecordBuilder by copying an existing TextoDadoSacadorAvalista instance.
   * @param other The existing instance to copy.
   * @return A new TextoDadoSacadorAvalista RecordBuilder
   */
  public static com.accenture.avro.TextoDadoSacadorAvalista.Builder newBuilder(com.accenture.avro.TextoDadoSacadorAvalista other) {
    return new com.accenture.avro.TextoDadoSacadorAvalista.Builder(other);
  }

  /**
   * RecordBuilder for TextoDadoSacadorAvalista instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TextoDadoSacadorAvalista>
    implements org.apache.avro.data.RecordBuilder<TextoDadoSacadorAvalista> {

    private com.accenture.avro.TextoDadoEnderecoCobranca texto_dado_endereco_cobranca;
    private com.accenture.avro.TextoDadoEnderecoCobranca.Builder texto_dado_endereco_cobrancaBuilder;
    private com.accenture.avro.TextoDadoPessoaCobranca texto_dado_pessoa_cobranca;
    private com.accenture.avro.TextoDadoPessoaCobranca.Builder texto_dado_pessoa_cobrancaBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.accenture.avro.TextoDadoSacadorAvalista.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.texto_dado_endereco_cobranca)) {
        this.texto_dado_endereco_cobranca = data().deepCopy(fields()[0].schema(), other.texto_dado_endereco_cobranca);
        fieldSetFlags()[0] = true;
      }
      if (other.hasTextoDadoEnderecoCobrancaBuilder()) {
        this.texto_dado_endereco_cobrancaBuilder = com.accenture.avro.TextoDadoEnderecoCobranca.newBuilder(other.getTextoDadoEnderecoCobrancaBuilder());
      }
      if (isValidValue(fields()[1], other.texto_dado_pessoa_cobranca)) {
        this.texto_dado_pessoa_cobranca = data().deepCopy(fields()[1].schema(), other.texto_dado_pessoa_cobranca);
        fieldSetFlags()[1] = true;
      }
      if (other.hasTextoDadoPessoaCobrancaBuilder()) {
        this.texto_dado_pessoa_cobrancaBuilder = com.accenture.avro.TextoDadoPessoaCobranca.newBuilder(other.getTextoDadoPessoaCobrancaBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing TextoDadoSacadorAvalista instance
     * @param other The existing instance to copy.
     */
    private Builder(com.accenture.avro.TextoDadoSacadorAvalista other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.texto_dado_endereco_cobranca)) {
        this.texto_dado_endereco_cobranca = data().deepCopy(fields()[0].schema(), other.texto_dado_endereco_cobranca);
        fieldSetFlags()[0] = true;
      }
      this.texto_dado_endereco_cobrancaBuilder = null;
      if (isValidValue(fields()[1], other.texto_dado_pessoa_cobranca)) {
        this.texto_dado_pessoa_cobranca = data().deepCopy(fields()[1].schema(), other.texto_dado_pessoa_cobranca);
        fieldSetFlags()[1] = true;
      }
      this.texto_dado_pessoa_cobrancaBuilder = null;
    }

    /**
      * Gets the value of the 'texto_dado_endereco_cobranca' field.
      * @return The value.
      */
    public com.accenture.avro.TextoDadoEnderecoCobranca getTextoDadoEnderecoCobranca() {
      return texto_dado_endereco_cobranca;
    }

    /**
      * Sets the value of the 'texto_dado_endereco_cobranca' field.
      * @param value The value of 'texto_dado_endereco_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoSacadorAvalista.Builder setTextoDadoEnderecoCobranca(com.accenture.avro.TextoDadoEnderecoCobranca value) {
      validate(fields()[0], value);
      this.texto_dado_endereco_cobrancaBuilder = null;
      this.texto_dado_endereco_cobranca = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'texto_dado_endereco_cobranca' field has been set.
      * @return True if the 'texto_dado_endereco_cobranca' field has been set, false otherwise.
      */
    public boolean hasTextoDadoEnderecoCobranca() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'texto_dado_endereco_cobranca' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.accenture.avro.TextoDadoEnderecoCobranca.Builder getTextoDadoEnderecoCobrancaBuilder() {
      if (texto_dado_endereco_cobrancaBuilder == null) {
        if (hasTextoDadoEnderecoCobranca()) {
          setTextoDadoEnderecoCobrancaBuilder(com.accenture.avro.TextoDadoEnderecoCobranca.newBuilder(texto_dado_endereco_cobranca));
        } else {
          setTextoDadoEnderecoCobrancaBuilder(com.accenture.avro.TextoDadoEnderecoCobranca.newBuilder());
        }
      }
      return texto_dado_endereco_cobrancaBuilder;
    }

    /**
     * Sets the Builder instance for the 'texto_dado_endereco_cobranca' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.accenture.avro.TextoDadoSacadorAvalista.Builder setTextoDadoEnderecoCobrancaBuilder(com.accenture.avro.TextoDadoEnderecoCobranca.Builder value) {
      clearTextoDadoEnderecoCobranca();
      texto_dado_endereco_cobrancaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'texto_dado_endereco_cobranca' field has an active Builder instance
     * @return True if the 'texto_dado_endereco_cobranca' field has an active Builder instance
     */
    public boolean hasTextoDadoEnderecoCobrancaBuilder() {
      return texto_dado_endereco_cobrancaBuilder != null;
    }

    /**
      * Clears the value of the 'texto_dado_endereco_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoSacadorAvalista.Builder clearTextoDadoEnderecoCobranca() {
      texto_dado_endereco_cobranca = null;
      texto_dado_endereco_cobrancaBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'texto_dado_pessoa_cobranca' field.
      * @return The value.
      */
    public com.accenture.avro.TextoDadoPessoaCobranca getTextoDadoPessoaCobranca() {
      return texto_dado_pessoa_cobranca;
    }

    /**
      * Sets the value of the 'texto_dado_pessoa_cobranca' field.
      * @param value The value of 'texto_dado_pessoa_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoSacadorAvalista.Builder setTextoDadoPessoaCobranca(com.accenture.avro.TextoDadoPessoaCobranca value) {
      validate(fields()[1], value);
      this.texto_dado_pessoa_cobrancaBuilder = null;
      this.texto_dado_pessoa_cobranca = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'texto_dado_pessoa_cobranca' field has been set.
      * @return True if the 'texto_dado_pessoa_cobranca' field has been set, false otherwise.
      */
    public boolean hasTextoDadoPessoaCobranca() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'texto_dado_pessoa_cobranca' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.accenture.avro.TextoDadoPessoaCobranca.Builder getTextoDadoPessoaCobrancaBuilder() {
      if (texto_dado_pessoa_cobrancaBuilder == null) {
        if (hasTextoDadoPessoaCobranca()) {
          setTextoDadoPessoaCobrancaBuilder(com.accenture.avro.TextoDadoPessoaCobranca.newBuilder(texto_dado_pessoa_cobranca));
        } else {
          setTextoDadoPessoaCobrancaBuilder(com.accenture.avro.TextoDadoPessoaCobranca.newBuilder());
        }
      }
      return texto_dado_pessoa_cobrancaBuilder;
    }

    /**
     * Sets the Builder instance for the 'texto_dado_pessoa_cobranca' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.accenture.avro.TextoDadoSacadorAvalista.Builder setTextoDadoPessoaCobrancaBuilder(com.accenture.avro.TextoDadoPessoaCobranca.Builder value) {
      clearTextoDadoPessoaCobranca();
      texto_dado_pessoa_cobrancaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'texto_dado_pessoa_cobranca' field has an active Builder instance
     * @return True if the 'texto_dado_pessoa_cobranca' field has an active Builder instance
     */
    public boolean hasTextoDadoPessoaCobrancaBuilder() {
      return texto_dado_pessoa_cobrancaBuilder != null;
    }

    /**
      * Clears the value of the 'texto_dado_pessoa_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoSacadorAvalista.Builder clearTextoDadoPessoaCobranca() {
      texto_dado_pessoa_cobranca = null;
      texto_dado_pessoa_cobrancaBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TextoDadoSacadorAvalista build() {
      try {
        TextoDadoSacadorAvalista record = new TextoDadoSacadorAvalista();
        if (texto_dado_endereco_cobrancaBuilder != null) {
          record.texto_dado_endereco_cobranca = this.texto_dado_endereco_cobrancaBuilder.build();
        } else {
          record.texto_dado_endereco_cobranca = fieldSetFlags()[0] ? this.texto_dado_endereco_cobranca : (com.accenture.avro.TextoDadoEnderecoCobranca) defaultValue(fields()[0]);
        }
        if (texto_dado_pessoa_cobrancaBuilder != null) {
          record.texto_dado_pessoa_cobranca = this.texto_dado_pessoa_cobrancaBuilder.build();
        } else {
          record.texto_dado_pessoa_cobranca = fieldSetFlags()[1] ? this.texto_dado_pessoa_cobranca : (com.accenture.avro.TextoDadoPessoaCobranca) defaultValue(fields()[1]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TextoDadoSacadorAvalista>
    WRITER$ = (org.apache.avro.io.DatumWriter<TextoDadoSacadorAvalista>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TextoDadoSacadorAvalista>
    READER$ = (org.apache.avro.io.DatumReader<TextoDadoSacadorAvalista>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
