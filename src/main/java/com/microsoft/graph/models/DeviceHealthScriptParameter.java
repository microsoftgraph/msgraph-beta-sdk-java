package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base properties of the script parameter.
 */
public class DeviceHealthScriptParameter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Whether Apply DefaultValue When Not Assigned */
    private Boolean applyDefaultValueWhenNotAssigned;
    /** The description of the param */
    private String description;
    /** Whether the param is required */
    private Boolean isRequired;
    /** The name of the param */
    private String name;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new deviceHealthScriptParameter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptParameter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptParameter
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptParameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceHealthScriptBooleanParameter": return new DeviceHealthScriptBooleanParameter();
                case "#microsoft.graph.deviceHealthScriptIntegerParameter": return new DeviceHealthScriptIntegerParameter();
                case "#microsoft.graph.deviceHealthScriptStringParameter": return new DeviceHealthScriptStringParameter();
            }
        }
        return new DeviceHealthScriptParameter();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the applyDefaultValueWhenNotAssigned property value. Whether Apply DefaultValue When Not Assigned
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyDefaultValueWhenNotAssigned() {
        return this.applyDefaultValueWhenNotAssigned;
    }
    /**
     * Gets the description property value. The description of the param
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("applyDefaultValueWhenNotAssigned", (n) -> { this.setApplyDefaultValueWhenNotAssigned(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. Whether the param is required
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
    }
    /**
     * Gets the name property value. The name of the param
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("applyDefaultValueWhenNotAssigned", this.getApplyDefaultValueWhenNotAssigned());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applyDefaultValueWhenNotAssigned property value. Whether Apply DefaultValue When Not Assigned
     * @param value Value to set for the applyDefaultValueWhenNotAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplyDefaultValueWhenNotAssigned(@javax.annotation.Nullable final Boolean value) {
        this.applyDefaultValueWhenNotAssigned = value;
    }
    /**
     * Sets the description property value. The description of the param
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the isRequired property value. Whether the param is required
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this.isRequired = value;
    }
    /**
     * Sets the name property value. The name of the param
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
