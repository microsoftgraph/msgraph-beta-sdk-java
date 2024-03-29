package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base type for a setting instance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingInstance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementSettingInstance} and sets the default values.
     */
    public DeviceManagementSettingInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementSettingInstance}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefinitionId() {
        return this.backingStore.get("definitionId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definitionId", (n) -> { this.setDefinitionId(n.getStringValue()); });
        deserializerMap.put("valueJson", (n) -> { this.setValueJson(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the valueJson property value. JSON representation of the value
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValueJson() {
        return this.backingStore.get("valueJson");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("definitionId", this.getDefinitionId());
        writer.writeStringValue("valueJson", this.getValueJson());
    }
    /**
     * Sets the definitionId property value. The ID of the setting definition for this instance
     * @param value Value to set for the definitionId property.
     */
    public void setDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("definitionId", value);
    }
    /**
     * Sets the valueJson property value. JSON representation of the value
     * @param value Value to set for the valueJson property.
     */
    public void setValueJson(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("valueJson", value);
    }
}
