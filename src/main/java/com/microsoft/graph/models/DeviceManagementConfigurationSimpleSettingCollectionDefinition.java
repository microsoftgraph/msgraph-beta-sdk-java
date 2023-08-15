package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSimpleSettingCollectionDefinition extends DeviceManagementConfigurationSimpleSettingDefinition implements Parsable {
    /**
     * Maximum number of simple settings in the collection
     */
    private Integer maximumCount;
    /**
     * Minimum number of simple settings in the collection
     */
    private Integer minimumCount;
    /**
     * Instantiates a new deviceManagementConfigurationSimpleSettingCollectionDefinition and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingCollectionDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSimpleSettingCollectionDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingCollectionDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingCollectionDefinition();
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
     * Gets the maximumCount property value. Maximum number of simple settings in the collection
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumCount() {
        return this.maximumCount;
    }
    /**
     * Gets the minimumCount property value. Minimum number of simple settings in the collection
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumCount() {
        return this.minimumCount;
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
        writer.writeIntegerValue("maximumCount", this.getMaximumCount());
        writer.writeIntegerValue("minimumCount", this.getMinimumCount());
    }
    /**
     * Sets the maximumCount property value. Maximum number of simple settings in the collection
     * @param value Value to set for the maximumCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMaximumCount(@jakarta.annotation.Nullable final Integer value) {
        this.maximumCount = value;
    }
    /**
     * Sets the minimumCount property value. Minimum number of simple settings in the collection
     * @param value Value to set for the minimumCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumCount(@jakarta.annotation.Nullable final Integer value) {
        this.minimumCount = value;
    }
}
