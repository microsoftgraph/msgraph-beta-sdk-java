package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A setting instance representing a collection of values
 */
public class DeviceManagementCollectionSettingInstance extends DeviceManagementSettingInstance implements Parsable {
    /**
     * The collection of values
     */
    private java.util.List<DeviceManagementSettingInstance> value;
    /**
     * Instantiates a new deviceManagementCollectionSettingInstance and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementCollectionSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementCollectionSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementCollectionSettingInstance
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementCollectionSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementCollectionSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The collection of values
     * @return a deviceManagementSettingInstance
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The collection of values
     * @param value Value to set for the value property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValue(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.value = value;
    }
}
