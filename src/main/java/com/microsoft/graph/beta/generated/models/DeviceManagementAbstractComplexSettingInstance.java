package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A setting instance representing a complex value for an abstract setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementAbstractComplexSettingInstance extends DeviceManagementSettingInstance implements Parsable {
    /**
     * Instantiates a new DeviceManagementAbstractComplexSettingInstance and sets the default values.
     */
    public DeviceManagementAbstractComplexSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementAbstractComplexSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementAbstractComplexSettingInstance
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementAbstractComplexSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementAbstractComplexSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("implementationId", (n) -> { this.setImplementationId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the implementationId property value. The definition ID for the chosen implementation of this complex setting
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImplementationId() {
        return this.backingStore.get("implementationId");
    }
    /**
     * Gets the value property value. The values that make up the complex setting
     * @return a java.util.List<DeviceManagementSettingInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("implementationId", this.getImplementationId());
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the implementationId property value. The definition ID for the chosen implementation of this complex setting
     * @param value Value to set for the implementationId property.
     */
    public void setImplementationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("implementationId", value);
    }
    /**
     * Sets the value property value. The values that make up the complex setting
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.backingStore.set("value", value);
    }
}
