package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS Software Update Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSSoftwareUpdateConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new MacOSSoftwareUpdateConfiguration and sets the default values.
     */
    public MacOSSoftwareUpdateConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSSoftwareUpdateConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSSoftwareUpdateConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSSoftwareUpdateConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateConfiguration();
    }
    /**
     * Gets the allOtherUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a MacOSSoftwareUpdateBehavior
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getAllOtherUpdateBehavior() {
        return this.backingStore.get("allOtherUpdateBehavior");
    }
    /**
     * Gets the configDataUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a MacOSSoftwareUpdateBehavior
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getConfigDataUpdateBehavior() {
        return this.backingStore.get("configDataUpdateBehavior");
    }
    /**
     * Gets the criticalUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a MacOSSoftwareUpdateBehavior
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getCriticalUpdateBehavior() {
        return this.backingStore.get("criticalUpdateBehavior");
    }
    /**
     * Gets the customUpdateTimeWindows property value. Custom Time windows when updates will be allowed or blocked. This collection can contain a maximum of 20 elements.
     * @return a java.util.List<CustomUpdateTimeWindow>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomUpdateTimeWindow> getCustomUpdateTimeWindows() {
        return this.backingStore.get("customUpdateTimeWindows");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allOtherUpdateBehavior", (n) -> { this.setAllOtherUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior::forValue)); });
        deserializerMap.put("configDataUpdateBehavior", (n) -> { this.setConfigDataUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior::forValue)); });
        deserializerMap.put("criticalUpdateBehavior", (n) -> { this.setCriticalUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior::forValue)); });
        deserializerMap.put("customUpdateTimeWindows", (n) -> { this.setCustomUpdateTimeWindows(n.getCollectionOfObjectValues(CustomUpdateTimeWindow::createFromDiscriminatorValue)); });
        deserializerMap.put("firmwareUpdateBehavior", (n) -> { this.setFirmwareUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior::forValue)); });
        deserializerMap.put("maxUserDeferralsCount", (n) -> { this.setMaxUserDeferralsCount(n.getIntegerValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(MacOSSoftwareUpdateConfigurationPriority::forValue)); });
        deserializerMap.put("updateScheduleType", (n) -> { this.setUpdateScheduleType(n.getEnumValue(MacOSSoftwareUpdateScheduleType::forValue)); });
        deserializerMap.put("updateTimeWindowUtcOffsetInMinutes", (n) -> { this.setUpdateTimeWindowUtcOffsetInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firmwareUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a MacOSSoftwareUpdateBehavior
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getFirmwareUpdateBehavior() {
        return this.backingStore.get("firmwareUpdateBehavior");
    }
    /**
     * Gets the maxUserDeferralsCount property value. The maximum number of times the system allows the user to postpone an update before its installed. Supported values: 0 - 366. Valid values 0 to 365
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxUserDeferralsCount() {
        return this.backingStore.get("maxUserDeferralsCount");
    }
    /**
     * Gets the priority property value. The scheduling priority for downloading and preparing the requested update. Default: Low. Possible values: Null, Low, High. Possible values are: low, high, unknownFutureValue.
     * @return a MacOSSoftwareUpdateConfigurationPriority
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateConfigurationPriority getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the updateScheduleType property value. Updatescheduletypefor macOS software updates.
     * @return a MacOSSoftwareUpdateScheduleType
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateScheduleType getUpdateScheduleType() {
        return this.backingStore.get("updateScheduleType");
    }
    /**
     * Gets the updateTimeWindowUtcOffsetInMinutes property value. Minutes indicating UTC offset for each update time window
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUpdateTimeWindowUtcOffsetInMinutes() {
        return this.backingStore.get("updateTimeWindowUtcOffsetInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allOtherUpdateBehavior", this.getAllOtherUpdateBehavior());
        writer.writeEnumValue("configDataUpdateBehavior", this.getConfigDataUpdateBehavior());
        writer.writeEnumValue("criticalUpdateBehavior", this.getCriticalUpdateBehavior());
        writer.writeCollectionOfObjectValues("customUpdateTimeWindows", this.getCustomUpdateTimeWindows());
        writer.writeEnumValue("firmwareUpdateBehavior", this.getFirmwareUpdateBehavior());
        writer.writeIntegerValue("maxUserDeferralsCount", this.getMaxUserDeferralsCount());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeEnumValue("updateScheduleType", this.getUpdateScheduleType());
        writer.writeIntegerValue("updateTimeWindowUtcOffsetInMinutes", this.getUpdateTimeWindowUtcOffsetInMinutes());
    }
    /**
     * Sets the allOtherUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the allOtherUpdateBehavior property.
     */
    public void setAllOtherUpdateBehavior(@jakarta.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this.backingStore.set("allOtherUpdateBehavior", value);
    }
    /**
     * Sets the configDataUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the configDataUpdateBehavior property.
     */
    public void setConfigDataUpdateBehavior(@jakarta.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this.backingStore.set("configDataUpdateBehavior", value);
    }
    /**
     * Sets the criticalUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the criticalUpdateBehavior property.
     */
    public void setCriticalUpdateBehavior(@jakarta.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this.backingStore.set("criticalUpdateBehavior", value);
    }
    /**
     * Sets the customUpdateTimeWindows property value. Custom Time windows when updates will be allowed or blocked. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the customUpdateTimeWindows property.
     */
    public void setCustomUpdateTimeWindows(@jakarta.annotation.Nullable final java.util.List<CustomUpdateTimeWindow> value) {
        this.backingStore.set("customUpdateTimeWindows", value);
    }
    /**
     * Sets the firmwareUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the firmwareUpdateBehavior property.
     */
    public void setFirmwareUpdateBehavior(@jakarta.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this.backingStore.set("firmwareUpdateBehavior", value);
    }
    /**
     * Sets the maxUserDeferralsCount property value. The maximum number of times the system allows the user to postpone an update before its installed. Supported values: 0 - 366. Valid values 0 to 365
     * @param value Value to set for the maxUserDeferralsCount property.
     */
    public void setMaxUserDeferralsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maxUserDeferralsCount", value);
    }
    /**
     * Sets the priority property value. The scheduling priority for downloading and preparing the requested update. Default: Low. Possible values: Null, Low, High. Possible values are: low, high, unknownFutureValue.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final MacOSSoftwareUpdateConfigurationPriority value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the updateScheduleType property value. Updatescheduletypefor macOS software updates.
     * @param value Value to set for the updateScheduleType property.
     */
    public void setUpdateScheduleType(@jakarta.annotation.Nullable final MacOSSoftwareUpdateScheduleType value) {
        this.backingStore.set("updateScheduleType", value);
    }
    /**
     * Sets the updateTimeWindowUtcOffsetInMinutes property value. Minutes indicating UTC offset for each update time window
     * @param value Value to set for the updateTimeWindowUtcOffsetInMinutes property.
     */
    public void setUpdateTimeWindowUtcOffsetInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("updateTimeWindowUtcOffsetInMinutes", value);
    }
}
