package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingCollectionDefinition extends DeviceManagementConfigurationChoiceSettingDefinition implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationChoiceSettingCollectionDefinition} and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingCollectionDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationChoiceSettingCollectionDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingCollectionDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingCollectionDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumCount", (n) -> { this.setMaximumCount(n.getIntegerValue()); });
        deserializerMap.put("minimumCount", (n) -> { this.setMinimumCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumCount property value. Maximum number of choices in the collection. Valid values 1 to 100
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumCount() {
        return this.backingStore.get("maximumCount");
    }
    /**
     * Gets the minimumCount property value. Minimum number of choices in the collection. Valid values 1 to 100
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumCount() {
        return this.backingStore.get("minimumCount");
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
     * Sets the maximumCount property value. Maximum number of choices in the collection. Valid values 1 to 100
     * @param value Value to set for the maximumCount property.
     */
    public void setMaximumCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumCount", value);
    }
    /**
     * Sets the minimumCount property value. Minimum number of choices in the collection. Valid values 1 to 100
     * @param value Value to set for the minimumCount property.
     */
    public void setMinimumCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumCount", value);
    }
}
