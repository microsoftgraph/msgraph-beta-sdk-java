package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSettingGroupCollectionDefinition extends DeviceManagementConfigurationSettingGroupDefinition implements Parsable {
    /**
     * Maximum number of setting group count in the collection. Valid values 1 to 100
     */
    private Integer maximumCount;
    /**
     * Minimum number of setting group count in the collection. Valid values 1 to 100
     */
    private Integer minimumCount;
    /**
     * Instantiates a new DeviceManagementConfigurationSettingGroupCollectionDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingGroupCollectionDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSettingGroupCollectionDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingGroupCollectionDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingGroupCollectionDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumCount", (n) -> { this.setMaximumCount(n.getIntegerValue()); });
        deserializerMap.put("minimumCount", (n) -> { this.setMinimumCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCount property value. Maximum number of setting group count in the collection. Valid values 1 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumCount() {
        return this.maximumCount;
    }
    /**
     * Gets the minimumCount property value. Minimum number of setting group count in the collection. Valid values 1 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumCount() {
        return this.minimumCount;
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
        writer.writeIntegerValue("maximumCount", this.getMaximumCount());
        writer.writeIntegerValue("minimumCount", this.getMinimumCount());
    }
    /**
     * Sets the maximumCount property value. Maximum number of setting group count in the collection. Valid values 1 to 100
     * @param value Value to set for the maximumCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumCount(@javax.annotation.Nullable final Integer value) {
        this.maximumCount = value;
    }
    /**
     * Sets the minimumCount property value. Minimum number of setting group count in the collection. Valid values 1 to 100
     * @param value Value to set for the minimumCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumCount(@javax.annotation.Nullable final Integer value) {
        this.minimumCount = value;
    }
}
