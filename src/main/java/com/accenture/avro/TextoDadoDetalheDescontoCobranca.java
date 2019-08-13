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
public class TextoDadoDetalheDescontoCobranca extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4810647397238356386L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TextoDadoDetalheDescontoCobranca\",\"namespace\":\"com.accenture.avro\",\"fields\":[{\"name\":\"data_limite_desconto_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"valor_desconto_concedido_cobranca\",\"type\":[\"null\",\"string\"]},{\"name\":\"percentual_desconto_concedido_cobranca\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TextoDadoDetalheDescontoCobranca> ENCODER =
      new BinaryMessageEncoder<TextoDadoDetalheDescontoCobranca>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TextoDadoDetalheDescontoCobranca> DECODER =
      new BinaryMessageDecoder<TextoDadoDetalheDescontoCobranca>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TextoDadoDetalheDescontoCobranca> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TextoDadoDetalheDescontoCobranca> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TextoDadoDetalheDescontoCobranca>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TextoDadoDetalheDescontoCobranca to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TextoDadoDetalheDescontoCobranca from a ByteBuffer. */
  public static TextoDadoDetalheDescontoCobranca fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence data_limite_desconto_cobranca;
   private java.lang.CharSequence valor_desconto_concedido_cobranca;
   private java.lang.CharSequence percentual_desconto_concedido_cobranca;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TextoDadoDetalheDescontoCobranca() {}

  /**
   * All-args constructor.
   * @param data_limite_desconto_cobranca The new value for data_limite_desconto_cobranca
   * @param valor_desconto_concedido_cobranca The new value for valor_desconto_concedido_cobranca
   * @param percentual_desconto_concedido_cobranca The new value for percentual_desconto_concedido_cobranca
   */
  public TextoDadoDetalheDescontoCobranca(java.lang.CharSequence data_limite_desconto_cobranca, java.lang.CharSequence valor_desconto_concedido_cobranca, java.lang.CharSequence percentual_desconto_concedido_cobranca) {
    this.data_limite_desconto_cobranca = data_limite_desconto_cobranca;
    this.valor_desconto_concedido_cobranca = valor_desconto_concedido_cobranca;
    this.percentual_desconto_concedido_cobranca = percentual_desconto_concedido_cobranca;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return data_limite_desconto_cobranca;
    case 1: return valor_desconto_concedido_cobranca;
    case 2: return percentual_desconto_concedido_cobranca;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: data_limite_desconto_cobranca = (java.lang.CharSequence)value$; break;
    case 1: valor_desconto_concedido_cobranca = (java.lang.CharSequence)value$; break;
    case 2: percentual_desconto_concedido_cobranca = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'data_limite_desconto_cobranca' field.
   * @return The value of the 'data_limite_desconto_cobranca' field.
   */
  public java.lang.CharSequence getDataLimiteDescontoCobranca() {
    return data_limite_desconto_cobranca;
  }

  /**
   * Sets the value of the 'data_limite_desconto_cobranca' field.
   * @param value the value to set.
   */
  public void setDataLimiteDescontoCobranca(java.lang.CharSequence value) {
    this.data_limite_desconto_cobranca = value;
  }

  /**
   * Gets the value of the 'valor_desconto_concedido_cobranca' field.
   * @return The value of the 'valor_desconto_concedido_cobranca' field.
   */
  public java.lang.CharSequence getValorDescontoConcedidoCobranca() {
    return valor_desconto_concedido_cobranca;
  }

  /**
   * Sets the value of the 'valor_desconto_concedido_cobranca' field.
   * @param value the value to set.
   */
  public void setValorDescontoConcedidoCobranca(java.lang.CharSequence value) {
    this.valor_desconto_concedido_cobranca = value;
  }

  /**
   * Gets the value of the 'percentual_desconto_concedido_cobranca' field.
   * @return The value of the 'percentual_desconto_concedido_cobranca' field.
   */
  public java.lang.CharSequence getPercentualDescontoConcedidoCobranca() {
    return percentual_desconto_concedido_cobranca;
  }

  /**
   * Sets the value of the 'percentual_desconto_concedido_cobranca' field.
   * @param value the value to set.
   */
  public void setPercentualDescontoConcedidoCobranca(java.lang.CharSequence value) {
    this.percentual_desconto_concedido_cobranca = value;
  }

  /**
   * Creates a new TextoDadoDetalheDescontoCobranca RecordBuilder.
   * @return A new TextoDadoDetalheDescontoCobranca RecordBuilder
   */
  public static com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder newBuilder() {
    return new com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder();
  }

  /**
   * Creates a new TextoDadoDetalheDescontoCobranca RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TextoDadoDetalheDescontoCobranca RecordBuilder
   */
  public static com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder newBuilder(com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder other) {
    return new com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder(other);
  }

  /**
   * Creates a new TextoDadoDetalheDescontoCobranca RecordBuilder by copying an existing TextoDadoDetalheDescontoCobranca instance.
   * @param other The existing instance to copy.
   * @return A new TextoDadoDetalheDescontoCobranca RecordBuilder
   */
  public static com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder newBuilder(com.accenture.avro.TextoDadoDetalheDescontoCobranca other) {
    return new com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder(other);
  }

  /**
   * RecordBuilder for TextoDadoDetalheDescontoCobranca instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TextoDadoDetalheDescontoCobranca>
    implements org.apache.avro.data.RecordBuilder<TextoDadoDetalheDescontoCobranca> {

    private java.lang.CharSequence data_limite_desconto_cobranca;
    private java.lang.CharSequence valor_desconto_concedido_cobranca;
    private java.lang.CharSequence percentual_desconto_concedido_cobranca;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.data_limite_desconto_cobranca)) {
        this.data_limite_desconto_cobranca = data().deepCopy(fields()[0].schema(), other.data_limite_desconto_cobranca);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.valor_desconto_concedido_cobranca)) {
        this.valor_desconto_concedido_cobranca = data().deepCopy(fields()[1].schema(), other.valor_desconto_concedido_cobranca);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.percentual_desconto_concedido_cobranca)) {
        this.percentual_desconto_concedido_cobranca = data().deepCopy(fields()[2].schema(), other.percentual_desconto_concedido_cobranca);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TextoDadoDetalheDescontoCobranca instance
     * @param other The existing instance to copy.
     */
    private Builder(com.accenture.avro.TextoDadoDetalheDescontoCobranca other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.data_limite_desconto_cobranca)) {
        this.data_limite_desconto_cobranca = data().deepCopy(fields()[0].schema(), other.data_limite_desconto_cobranca);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.valor_desconto_concedido_cobranca)) {
        this.valor_desconto_concedido_cobranca = data().deepCopy(fields()[1].schema(), other.valor_desconto_concedido_cobranca);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.percentual_desconto_concedido_cobranca)) {
        this.percentual_desconto_concedido_cobranca = data().deepCopy(fields()[2].schema(), other.percentual_desconto_concedido_cobranca);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'data_limite_desconto_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getDataLimiteDescontoCobranca() {
      return data_limite_desconto_cobranca;
    }

    /**
      * Sets the value of the 'data_limite_desconto_cobranca' field.
      * @param value The value of 'data_limite_desconto_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder setDataLimiteDescontoCobranca(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.data_limite_desconto_cobranca = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'data_limite_desconto_cobranca' field has been set.
      * @return True if the 'data_limite_desconto_cobranca' field has been set, false otherwise.
      */
    public boolean hasDataLimiteDescontoCobranca() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'data_limite_desconto_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder clearDataLimiteDescontoCobranca() {
      data_limite_desconto_cobranca = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'valor_desconto_concedido_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getValorDescontoConcedidoCobranca() {
      return valor_desconto_concedido_cobranca;
    }

    /**
      * Sets the value of the 'valor_desconto_concedido_cobranca' field.
      * @param value The value of 'valor_desconto_concedido_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder setValorDescontoConcedidoCobranca(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.valor_desconto_concedido_cobranca = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'valor_desconto_concedido_cobranca' field has been set.
      * @return True if the 'valor_desconto_concedido_cobranca' field has been set, false otherwise.
      */
    public boolean hasValorDescontoConcedidoCobranca() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'valor_desconto_concedido_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder clearValorDescontoConcedidoCobranca() {
      valor_desconto_concedido_cobranca = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'percentual_desconto_concedido_cobranca' field.
      * @return The value.
      */
    public java.lang.CharSequence getPercentualDescontoConcedidoCobranca() {
      return percentual_desconto_concedido_cobranca;
    }

    /**
      * Sets the value of the 'percentual_desconto_concedido_cobranca' field.
      * @param value The value of 'percentual_desconto_concedido_cobranca'.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder setPercentualDescontoConcedidoCobranca(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.percentual_desconto_concedido_cobranca = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'percentual_desconto_concedido_cobranca' field has been set.
      * @return True if the 'percentual_desconto_concedido_cobranca' field has been set, false otherwise.
      */
    public boolean hasPercentualDescontoConcedidoCobranca() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'percentual_desconto_concedido_cobranca' field.
      * @return This builder.
      */
    public com.accenture.avro.TextoDadoDetalheDescontoCobranca.Builder clearPercentualDescontoConcedidoCobranca() {
      percentual_desconto_concedido_cobranca = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TextoDadoDetalheDescontoCobranca build() {
      try {
        TextoDadoDetalheDescontoCobranca record = new TextoDadoDetalheDescontoCobranca();
        record.data_limite_desconto_cobranca = fieldSetFlags()[0] ? this.data_limite_desconto_cobranca : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.valor_desconto_concedido_cobranca = fieldSetFlags()[1] ? this.valor_desconto_concedido_cobranca : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.percentual_desconto_concedido_cobranca = fieldSetFlags()[2] ? this.percentual_desconto_concedido_cobranca : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TextoDadoDetalheDescontoCobranca>
    WRITER$ = (org.apache.avro.io.DatumWriter<TextoDadoDetalheDescontoCobranca>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TextoDadoDetalheDescontoCobranca>
    READER$ = (org.apache.avro.io.DatumReader<TextoDadoDetalheDescontoCobranca>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}