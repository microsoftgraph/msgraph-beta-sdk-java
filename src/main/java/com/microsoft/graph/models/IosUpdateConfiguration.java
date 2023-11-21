package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * IOS Update Configuration, allows you to configure time window within week to install iOS updates
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosUpdateConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new IosUpdateConfiguration and sets the default values.
     */
    public IosUpdateConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosUpdateConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosUpdateConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosUpdateConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosUpdateConfiguration();
    }
    /**
     * Gets the activeHoursEnd property value. Active Hours End (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getActiveHoursEnd() {
        return this.backingStore.get("activeHoursEnd");
    }
    /**
     * Gets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getActiveHoursStart() {
        return this.backingStore.get("activeHoursStart");
    }
    /**
     * Gets the customUpdateTimeWindows property value. If update schedule type is set to use time window scheduling, custom time windows when updates will be scheduled. This collection can contain a maximum of 20 elements.
     * @return a java.util.List<CustomUpdateTimeWindow>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomUpdateTimeWindow> getCustomUpdateTimeWindows() {
        return this.backingStore.get("customUpdateTimeWindows");
    }
    /**
     * Gets the desiredOsVersion property value. If left unspecified, devices will update to the latest version of the OS.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDesiredOsVersion() {
        return this.backingStore.get("desiredOsVersion");
    }
    /**
     * Gets the enforcedSoftwareUpdateDelayInDays property value. Days before software updates are visible to iOS devices ranging from 0 to 90 inclusive
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnforcedSoftwareUpdateDelayInDays() {
        return this.backingStore.get("enforcedSoftwareUpdateDelayInDays");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeHoursEnd", (n) -> { this.setActiveHoursEnd(n.getLocalTimeValue()); });
        deserializerMap.put("activeHoursStart", (n) -> { this.setActiveHoursStart(n.getLocalTimeValue()); });
        deserializerMap.put("customUpdateTimeWindows", (n) -> { this.setCustomUpdateTimeWindows(n.getCollectionOfObjectValues(CustomUpdateTimeWindow::createFromDiscriminatorValue)); });
        deserializerMap.put("desiredOsVersion", (n) -> { this.setDesiredOsVersion(n.getStringValue()); });
        deserializerMap.put("enforcedSoftwareUpdateDelayInDays", (n) -> { this.setEnforcedSoftwareUpdateDelayInDays(n.getIntegerValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("scheduledInstallDays", (n) -> { this.setScheduledInstallDays(n.getCollectionOfEnumValues(DayOfWeek.class)); });
        deserializerMap.put("updateScheduleType", (n) -> { this.setUpdateScheduleType(n.getEnumValue(IosSoftwareUpdateScheduleType.class)); });
        deserializerMap.put("utcTimeOffsetInMinutes", (n) -> { this.setUtcTimeOffsetInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Is setting enabled in UI
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @return a java.util.List<DayOfWeek>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DayOfWeek> getScheduledInstallDays() {
        return this.backingStore.get("scheduledInstallDays");
    }
    /**
     * Gets the updateScheduleType property value. Updatescheduletypefor iOS software updates.
     * @return a IosSoftwareUpdateScheduleType
     */
    @jakarta.annotation.Nullable
    public IosSoftwareUpdateScheduleType getUpdateScheduleType() {
        return this.backingStore.get("updateScheduleType");
    }
    /**
     * Gets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUtcTimeOffsetInMinutes() {
        return this.backingStore.get("utcTimeOffsetInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalTimeValue("activeHoursEnd", this.getActiveHoursEnd());
        writer.writeLocalTimeValue("activeHoursStart", this.getActiveHoursStart());
        writer.writeCollectionOfObjectValues("customUpdateTimeWindows", this.getCustomUpdateTimeWindows());
        writer.writeStringValue("desiredOsVersion", this.getDesiredOsVersion());
        writer.writeIntegerValue("enforcedSoftwareUpdateDelayInDays", this.getEnforcedSoftwareUpdateDelayInDays());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfEnumValues("scheduledInstallDays", this.getScheduledInstallDays());
        writer.writeEnumValue("updateScheduleType", this.getUpdateScheduleType());
        writer.writeIntegerValue("utcTimeOffsetInMinutes", this.getUtcTimeOffsetInMinutes());
    }
    /**
     * Sets the activeHoursEnd property value. Active Hours End (active hours mean the time window when updates install should not happen)
     * @param value Value to set for the activeHoursEnd property.
     */
    public void setActiveHoursEnd(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("activeHoursEnd", value);
    }
    /**
     * Sets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @param value Value to set for the activeHoursStart property.
     */
    public void setActiveHoursStart(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("activeHoursStart", value);
    }
    /**
     * Sets the customUpdateTimeWindows property value. If update schedule type is set to use time window scheduling, custom time windows when updates will be scheduled. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the customUpdateTimeWindows property.
     */
    public void setCustomUpdateTimeWindows(@jakarta.annotation.Nullable final java.util.List<CustomUpdateTimeWindow> value) {
        this.backingStore.set("customUpdateTimeWindows", value);
    }
    /**
     * Sets the desiredOsVersion property value. If left unspecified, devices will update to the latest version of the OS.
     * @param value Value to set for the desiredOsVersion property.
     */
    public void setDesiredOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("desiredOsVersion", value);
    }
    /**
     * Sets the enforcedSoftwareUpdateDelayInDays property value. Days before software updates are visible to iOS devices ranging from 0 to 90 inclusive
     * @param value Value to set for the enforcedSoftwareUpdateDelayInDays property.
     */
    public void setEnforcedSoftwareUpdateDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("enforcedSoftwareUpdateDelayInDays", value);
    }
    /**
     * Sets the isEnabled property value. Is setting enabled in UI
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @param value Value to set for the scheduledInstallDays property.
     */
    public void setScheduledInstallDays(@jakarta.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this.backingStore.set("scheduledInstallDays", value);
    }
    /**
     * Sets the updateScheduleType property value. Updatescheduletypefor iOS software updates.
     * @param value Value to set for the updateScheduleType property.
     */
    public void setUpdateScheduleType(@jakarta.annotation.Nullable final IosSoftwareUpdateScheduleType value) {
        this.backingStore.set("updateScheduleType", value);
    }
    /**
     * Sets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @param value Value to set for the utcTimeOffsetInMinutes property.
     */
    public void setUtcTimeOffsetInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("utcTimeOffsetInMinutes", value);
    }
}
