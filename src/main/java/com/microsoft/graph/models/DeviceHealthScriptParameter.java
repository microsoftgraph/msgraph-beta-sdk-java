package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceHealthScriptBooleanParameter;
import com.microsoft.graph.models.DeviceHealthScriptIntegerParameter;
import com.microsoft.graph.models.DeviceHealthScriptStringParameter;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Base properties of the script parameter. */
public class DeviceHealthScriptParameter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Whether Apply DefaultValue When Not Assigned */
    private Boolean _applyDefaultValueWhenNotAssigned;
    /** The description of the param */
    private String _description;
    /** Whether the param is required */
    private Boolean _isRequired;
    /** The name of the param */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deviceHealthScriptParameter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptParameter() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceHealthScriptParameter");
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
        return this._additionalData;
    }
    /**
     * Gets the applyDefaultValueWhenNotAssigned property value. Whether Apply DefaultValue When Not Assigned
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyDefaultValueWhenNotAssigned() {
        return this._applyDefaultValueWhenNotAssigned;
    }
    /**
     * Gets the description property value. The description of the param
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptParameter currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("applyDefaultValueWhenNotAssigned", (n) -> { currentObject.setApplyDefaultValueWhenNotAssigned(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("isRequired", (n) -> { currentObject.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the isRequired property value. Whether the param is required
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this._isRequired;
    }
    /**
     * Gets the name property value. The name of the param
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
        this._additionalData = value;
    }
    /**
     * Sets the applyDefaultValueWhenNotAssigned property value. Whether Apply DefaultValue When Not Assigned
     * @param value Value to set for the applyDefaultValueWhenNotAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplyDefaultValueWhenNotAssigned(@javax.annotation.Nullable final Boolean value) {
        this._applyDefaultValueWhenNotAssigned = value;
    }
    /**
     * Sets the description property value. The description of the param
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the isRequired property value. Whether the param is required
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequired = value;
    }
    /**
     * Sets the name property value. The name of the param
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
