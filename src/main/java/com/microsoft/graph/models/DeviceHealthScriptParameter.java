package microsoft.graph.models;

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
    /** The type property */
    private String _type;
    /**
     * Instantiates a new deviceHealthScriptParameter and sets the default values.
     * @return a void
     */
    public DeviceHealthScriptParameter() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.deviceHealthScriptParameter");
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
        return new HashMap<>(5) {{
            this.put("applyDefaultValueWhenNotAssigned", (n) -> { currentObject.setApplyDefaultValueWhenNotAssigned(n.getBooleanValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("isRequired", (n) -> { currentObject.setIsRequired(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
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
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("applyDefaultValueWhenNotAssigned", this.getApplyDefaultValueWhenNotAssigned());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getType());
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
     * Sets the applyDefaultValueWhenNotAssigned property value. Whether Apply DefaultValue When Not Assigned
     * @param value Value to set for the applyDefaultValueWhenNotAssigned property.
     * @return a void
     */
    public void setApplyDefaultValueWhenNotAssigned(@javax.annotation.Nullable final Boolean value) {
        this._applyDefaultValueWhenNotAssigned = value;
    }
    /**
     * Sets the description property value. The description of the param
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the isRequired property value. Whether the param is required
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequired = value;
    }
    /**
     * Sets the name property value. The name of the param
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
