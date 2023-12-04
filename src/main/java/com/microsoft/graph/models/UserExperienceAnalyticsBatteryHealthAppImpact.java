package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health app impact entity contains battery usage related information at an app level for the tenant.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsBatteryHealthAppImpact extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthAppImpact and sets the default values.
     */
    public UserExperienceAnalyticsBatteryHealthAppImpact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthAppImpact
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthAppImpact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthAppImpact();
    }
    /**
     * Gets the activeDevices property value. Number of active devices for using that app over a 14-day period. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDevices() {
        return this.backingStore.get("activeDevices");
    }
    /**
     * Gets the appDisplayName property value. User friendly display name for the app. Eg: Outlook
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appName property value. App name. Eg: oltk.exe
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppName() {
        return this.backingStore.get("appName");
    }
    /**
     * Gets the appPublisher property value. App publisher. Eg: Microsoft Corporation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppPublisher() {
        return this.backingStore.get("appPublisher");
    }
    /**
     * Gets the batteryUsagePercentage property value. The percent of total battery power used by this application when the device was not plugged into AC power, over 14 days computed across all devices in the tenant. Unit in percentage. Valid values 0 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getBatteryUsagePercentage() {
        return this.backingStore.get("batteryUsagePercentage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDevices", (n) -> { this.setActiveDevices(n.getIntegerValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("batteryUsagePercentage", (n) -> { this.setBatteryUsagePercentage(n.getDoubleValue()); });
        deserializerMap.put("isForegroundApp", (n) -> { this.setIsForegroundApp(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isForegroundApp property value. true if the user had active interaction with the app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsForegroundApp() {
        return this.backingStore.get("isForegroundApp");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDevices", this.getActiveDevices());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeDoubleValue("batteryUsagePercentage", this.getBatteryUsagePercentage());
        writer.writeBooleanValue("isForegroundApp", this.getIsForegroundApp());
    }
    /**
     * Sets the activeDevices property value. Number of active devices for using that app over a 14-day period. Valid values 0 to 2147483647
     * @param value Value to set for the activeDevices property.
     */
    public void setActiveDevices(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeDevices", value);
    }
    /**
     * Sets the appDisplayName property value. User friendly display name for the app. Eg: Outlook
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appName property value. App name. Eg: oltk.exe
     * @param value Value to set for the appName property.
     */
    public void setAppName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appName", value);
    }
    /**
     * Sets the appPublisher property value. App publisher. Eg: Microsoft Corporation
     * @param value Value to set for the appPublisher property.
     */
    public void setAppPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appPublisher", value);
    }
    /**
     * Sets the batteryUsagePercentage property value. The percent of total battery power used by this application when the device was not plugged into AC power, over 14 days computed across all devices in the tenant. Unit in percentage. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the batteryUsagePercentage property.
     */
    public void setBatteryUsagePercentage(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("batteryUsagePercentage", value);
    }
    /**
     * Sets the isForegroundApp property value. true if the user had active interaction with the app.
     * @param value Value to set for the isForegroundApp property.
     */
    public void setIsForegroundApp(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isForegroundApp", value);
    }
}
