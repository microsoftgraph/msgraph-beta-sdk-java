package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeMappingParameterSchema implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The given parameter can be provided multiple times (for example, multiple input strings in the Concatenate(string,string,...) function). */
    private Boolean _allowMultipleOccurrences;
    /** Parameter name. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** true if the parameter is required; otherwise false. */
    private Boolean _required;
    /** The type property */
    private AttributeType _type;
    /**
     * Instantiates a new attributeMappingParameterSchema and sets the default values.
     * @return a void
     */
    public AttributeMappingParameterSchema() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.attributeMappingParameterSchema");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeMappingParameterSchema
     */
    @javax.annotation.Nonnull
    public static AttributeMappingParameterSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMappingParameterSchema();
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
     * Gets the allowMultipleOccurrences property value. The given parameter can be provided multiple times (for example, multiple input strings in the Concatenate(string,string,...) function).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMultipleOccurrences() {
        return this._allowMultipleOccurrences;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttributeMappingParameterSchema currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("allowMultipleOccurrences", (n) -> { currentObject.setAllowMultipleOccurrences(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(AttributeType.class)); });
        }};
    }
    /**
     * Gets the name property value. Parameter name.
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
     * Gets the required property value. true if the parameter is required; otherwise false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Gets the type property value. The type property
     * @return a attributeType
     */
    @javax.annotation.Nullable
    public AttributeType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleOccurrences", this.getAllowMultipleOccurrences());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the allowMultipleOccurrences property value. The given parameter can be provided multiple times (for example, multiple input strings in the Concatenate(string,string,...) function).
     * @param value Value to set for the allowMultipleOccurrences property.
     * @return a void
     */
    public void setAllowMultipleOccurrences(@javax.annotation.Nullable final Boolean value) {
        this._allowMultipleOccurrences = value;
    }
    /**
     * Sets the name property value. Parameter name.
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
     * Sets the required property value. true if the parameter is required; otherwise false.
     * @param value Value to set for the required property.
     * @return a void
     */
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final AttributeType value) {
        this._type = value;
    }
}
