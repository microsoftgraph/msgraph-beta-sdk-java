package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Parameter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The name of the parameter. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The values of the parameter. */
    private java.util.List<String> _values;
    /** The valueType property */
    private ValueType _valueType;
    /**
     * Instantiates a new parameter and sets the default values.
     * @return a void
     */
    public Parameter() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.identityGovernance.parameter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a parameter
     */
    @javax.annotation.Nonnull
    public static Parameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Parameter();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Parameter currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("values", (n) -> { currentObject.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("valueType", (n) -> { currentObject.setValueType(n.getEnumValue(ValueType.class)); });
        }};
    }
    /**
     * Gets the name property value. The name of the parameter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the values property value. The values of the parameter.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getValues() {
        return this._values;
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a valueType
     */
    @javax.annotation.Nullable
    public ValueType getValueType() {
        return this._valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
        writer.writeEnumValue("valueType", this.getValueType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the name property value. The name of the parameter.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the values property value. The values of the parameter.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final java.util.List<String> value) {
        this._values = value;
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     * @return a void
     */
    public void setValueType(@javax.annotation.Nullable final ValueType value) {
        this._valueType = value;
    }
}
