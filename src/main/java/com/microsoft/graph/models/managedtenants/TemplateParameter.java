package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TemplateParameter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description for the template parameter. Optional. Read-only.
     */
    private String description;
    /**
     * The display name for the template parameter. Required. Read-only.
     */
    private String displayName;
    /**
     * The allowed values for the template parameter represented by a serialized string of JSON. Optional. Read-only.
     */
    private String jsonAllowedValues;
    /**
     * The default value for the template parameter represented by a serialized string of JSON. Required. Read-only.
     */
    private String jsonDefaultValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The valueType property
     */
    private ManagementParameterValueType valueType;
    /**
     * Instantiates a new templateParameter and sets the default values.
     */
    public TemplateParameter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a templateParameter
     */
    @jakarta.annotation.Nonnull
    public static TemplateParameter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TemplateParameter();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the description property value. The description for the template parameter. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for the template parameter. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("jsonAllowedValues", (n) -> { this.setJsonAllowedValues(n.getStringValue()); });
        deserializerMap.put("jsonDefaultValue", (n) -> { this.setJsonDefaultValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("valueType", (n) -> { this.setValueType(n.getEnumValue(ManagementParameterValueType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the jsonAllowedValues property value. The allowed values for the template parameter represented by a serialized string of JSON. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJsonAllowedValues() {
        return this.jsonAllowedValues;
    }
    /**
     * Gets the jsonDefaultValue property value. The default value for the template parameter represented by a serialized string of JSON. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJsonDefaultValue() {
        return this.jsonDefaultValue;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a managementParameterValueType
     */
    @jakarta.annotation.Nullable
    public ManagementParameterValueType getValueType() {
        return this.valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("jsonAllowedValues", this.getJsonAllowedValues());
        writer.writeStringValue("jsonDefaultValue", this.getJsonDefaultValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("valueType", this.getValueType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the description property value. The description for the template parameter. Optional. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for the template parameter. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the jsonAllowedValues property value. The allowed values for the template parameter represented by a serialized string of JSON. Optional. Read-only.
     * @param value Value to set for the jsonAllowedValues property.
     */
    public void setJsonAllowedValues(@jakarta.annotation.Nullable final String value) {
        this.jsonAllowedValues = value;
    }
    /**
     * Sets the jsonDefaultValue property value. The default value for the template parameter represented by a serialized string of JSON. Required. Read-only.
     * @param value Value to set for the jsonDefaultValue property.
     */
    public void setJsonDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.jsonDefaultValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     */
    public void setValueType(@jakarta.annotation.Nullable final ManagementParameterValueType value) {
        this.valueType = value;
    }
}
