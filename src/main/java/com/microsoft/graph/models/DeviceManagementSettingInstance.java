package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base type for a setting instance
 */
public class DeviceManagementSettingInstance extends Entity implements Parsable {
    /**
     * The ID of the setting definition for this instance
     */
    private String definitionId;
    /**
     * JSON representation of the value
     */
    private String valueJson;
    /**
     * Instantiates a new deviceManagementSettingInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementSettingInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementAbstractComplexSettingInstance": return new DeviceManagementAbstractComplexSettingInstance();
                case "#microsoft.graph.deviceManagementBooleanSettingInstance": return new DeviceManagementBooleanSettingInstance();
                case "#microsoft.graph.deviceManagementCollectionSettingInstance": return new DeviceManagementCollectionSettingInstance();
                case "#microsoft.graph.deviceManagementComplexSettingInstance": return new DeviceManagementComplexSettingInstance();
                case "#microsoft.graph.deviceManagementIntegerSettingInstance": return new DeviceManagementIntegerSettingInstance();
                case "#microsoft.graph.deviceManagementStringSettingInstance": return new DeviceManagementStringSettingInstance();
            }
        }
        return new DeviceManagementSettingInstance();
    }
    /**
     * Gets the definitionId property value. The ID of the setting definition for this instance
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefinitionId() {
        return this.definitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definitionId", (n) -> { this.setDefinitionId(n.getStringValue()); });
        deserializerMap.put("valueJson", (n) -> { this.setValueJson(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the valueJson property value. JSON representation of the value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueJson() {
        return this.valueJson;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("definitionId", this.getDefinitionId());
        writer.writeStringValue("valueJson", this.getValueJson());
    }
    /**
     * Sets the definitionId property value. The ID of the setting definition for this instance
     * @param value Value to set for the definitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionId(@javax.annotation.Nullable final String value) {
        this.definitionId = value;
    }
    /**
     * Sets the valueJson property value. JSON representation of the value
     * @param value Value to set for the valueJson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueJson(@javax.annotation.Nullable final String value) {
        this.valueJson = value;
    }
}
