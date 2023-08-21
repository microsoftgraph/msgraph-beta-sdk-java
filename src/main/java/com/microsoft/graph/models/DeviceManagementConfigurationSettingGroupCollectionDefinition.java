package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSettingGroupCollectionDefinition extends DeviceManagementConfigurationSettingGroupDefinition implements Parsable {
    /**
     * Maximum number of setting group count in the collection
     */
    private Integer maximumCount;
    /**
     * Minimum number of setting group count in the collection
     */
    private Integer minimumCount;
    /**
     * Instantiates a new deviceManagementConfigurationSettingGroupCollectionDefinition and sets the default values.
     */
    public DeviceManagementConfigurationSettingGroupCollectionDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingGroupCollectionDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingGroupCollectionDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingGroupCollectionDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumCount", (n) -> { this.setMaximumCount(n.getIntegerValue()); });
        deserializerMap.put("minimumCount", (n) -> { this.setMinimumCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCount property value. Maximum number of setting group count in the collection
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumCount() {
        return this.maximumCount;
    }
    /**
     * Gets the minimumCount property value. Minimum number of setting group count in the collection
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumCount() {
        return this.minimumCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumCount", this.getMaximumCount());
        writer.writeIntegerValue("minimumCount", this.getMinimumCount());
    }
    /**
     * Sets the maximumCount property value. Maximum number of setting group count in the collection
     * @param value Value to set for the maximumCount property.
     */
    public void setMaximumCount(@jakarta.annotation.Nullable final Integer value) {
        this.maximumCount = value;
    }
    /**
     * Sets the minimumCount property value. Minimum number of setting group count in the collection
     * @param value Value to set for the minimumCount property.
     */
    public void setMinimumCount(@jakarta.annotation.Nullable final Integer value) {
        this.minimumCount = value;
    }
}
