package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health runtime history entity contains the trend of runtime of a device over a period of 30 days
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory and sets the default values.
     */
    public UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory();
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device, Intune DeviceID or SCCM device id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEstimatedRuntimeInMinutes() {
        return this.backingStore.get("estimatedRuntimeInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("estimatedRuntimeInMinutes", (n) -> { this.setEstimatedRuntimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("runtimeDateTime", (n) -> { this.setRuntimeDateTime(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the runtimeDateTime property value. The datetime for the instance of runtime history.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRuntimeDateTime() {
        return this.backingStore.get("runtimeDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeIntegerValue("estimatedRuntimeInMinutes", this.getEstimatedRuntimeInMinutes());
        writer.writeStringValue("runtimeDateTime", this.getRuntimeDateTime());
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device, Intune DeviceID or SCCM device id.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values 0 to 2147483647
     * @param value Value to set for the estimatedRuntimeInMinutes property.
     */
    public void setEstimatedRuntimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("estimatedRuntimeInMinutes", value);
    }
    /**
     * Sets the runtimeDateTime property value. The datetime for the instance of runtime history.
     * @param value Value to set for the runtimeDateTime property.
     */
    public void setRuntimeDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("runtimeDateTime", value);
    }
}
