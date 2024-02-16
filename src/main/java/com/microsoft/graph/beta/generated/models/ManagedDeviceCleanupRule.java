package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Define the rule when the admin wants the devices to be cleaned up.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceCleanupRule extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagedDeviceCleanupRule} and sets the default values.
     */
    public ManagedDeviceCleanupRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedDeviceCleanupRule}
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceCleanupRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCleanupRule();
    }
    /**
     * Gets the description property value. Indicates the description for the device clean up rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceCleanupRulePlatformType property value. Define the platform type for which the admin wants to create the device clean up rule
     * @return a {@link DeviceCleanupRulePlatformType}
     */
    @jakarta.annotation.Nullable
    public DeviceCleanupRulePlatformType getDeviceCleanupRulePlatformType() {
        return this.backingStore.get("deviceCleanupRulePlatformType");
    }
    /**
     * Gets the deviceInactivityBeforeRetirementInDays property value. Indicates the number of days when the device has not contacted Intune. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceInactivityBeforeRetirementInDays() {
        return this.backingStore.get("deviceInactivityBeforeRetirementInDays");
    }
    /**
     * Gets the displayName property value. Indicates the display name of the device cleanup rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceCleanupRulePlatformType", (n) -> { this.setDeviceCleanupRulePlatformType(n.getEnumValue(DeviceCleanupRulePlatformType::forValue)); });
        deserializerMap.put("deviceInactivityBeforeRetirementInDays", (n) -> { this.setDeviceInactivityBeforeRetirementInDays(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Indicates the date and time when the device cleanup rule was last modified. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("deviceCleanupRulePlatformType", this.getDeviceCleanupRulePlatformType());
        writer.writeIntegerValue("deviceInactivityBeforeRetirementInDays", this.getDeviceInactivityBeforeRetirementInDays());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the description property value. Indicates the description for the device clean up rule.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceCleanupRulePlatformType property value. Define the platform type for which the admin wants to create the device clean up rule
     * @param value Value to set for the deviceCleanupRulePlatformType property.
     */
    public void setDeviceCleanupRulePlatformType(@jakarta.annotation.Nullable final DeviceCleanupRulePlatformType value) {
        this.backingStore.set("deviceCleanupRulePlatformType", value);
    }
    /**
     * Sets the deviceInactivityBeforeRetirementInDays property value. Indicates the number of days when the device has not contacted Intune. Valid values 0 to 2147483647
     * @param value Value to set for the deviceInactivityBeforeRetirementInDays property.
     */
    public void setDeviceInactivityBeforeRetirementInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceInactivityBeforeRetirementInDays", value);
    }
    /**
     * Sets the displayName property value. Indicates the display name of the device cleanup rule.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Indicates the date and time when the device cleanup rule was last modified. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
}
