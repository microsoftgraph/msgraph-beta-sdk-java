package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosUpdateConfiguration extends DeviceConfiguration implements Parsable {
    /** Active Hours End (active hours mean the time window when updates install should not happen) */
    private LocalTime activeHoursEnd;
    /** Active Hours Start (active hours mean the time window when updates install should not happen) */
    private LocalTime activeHoursStart;
    /** If update schedule type is set to use time window scheduling, custom time windows when updates will be scheduled. This collection can contain a maximum of 20 elements. */
    private java.util.List<CustomUpdateTimeWindow> customUpdateTimeWindows;
    /** If left unspecified, devices will update to the latest version of the OS. */
    private String desiredOsVersion;
    /** Days before software updates are visible to iOS devices ranging from 0 to 90 inclusive */
    private Integer enforcedSoftwareUpdateDelayInDays;
    /** Is setting enabled in UI */
    private Boolean isEnabled;
    /** Days in week for which active hours are configured. This collection can contain a maximum of 7 elements. */
    private java.util.List<DayOfWeek> scheduledInstallDays;
    /** Updatescheduletypefor iOS software updates. */
    private IosSoftwareUpdateScheduleType updateScheduleType;
    /** UTC Time Offset indicated in minutes */
    private Integer utcTimeOffsetInMinutes;
    /**
     * Instantiates a new IosUpdateConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosUpdateConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosUpdateConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosUpdateConfiguration
     */
    @javax.annotation.Nonnull
    public static IosUpdateConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosUpdateConfiguration();
    }
    /**
     * Gets the activeHoursEnd property value. Active Hours End (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getActiveHoursEnd() {
        return this.activeHoursEnd;
    }
    /**
     * Gets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getActiveHoursStart() {
        return this.activeHoursStart;
    }
    /**
     * Gets the customUpdateTimeWindows property value. If update schedule type is set to use time window scheduling, custom time windows when updates will be scheduled. This collection can contain a maximum of 20 elements.
     * @return a customUpdateTimeWindow
     */
    @javax.annotation.Nullable
    public java.util.List<CustomUpdateTimeWindow> getCustomUpdateTimeWindows() {
        return this.customUpdateTimeWindows;
    }
    /**
     * Gets the desiredOsVersion property value. If left unspecified, devices will update to the latest version of the OS.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDesiredOsVersion() {
        return this.desiredOsVersion;
    }
    /**
     * Gets the enforcedSoftwareUpdateDelayInDays property value. Days before software updates are visible to iOS devices ranging from 0 to 90 inclusive
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnforcedSoftwareUpdateDelayInDays() {
        return this.enforcedSoftwareUpdateDelayInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public java.util.List<DayOfWeek> getScheduledInstallDays() {
        return this.scheduledInstallDays;
    }
    /**
     * Gets the updateScheduleType property value. Updatescheduletypefor iOS software updates.
     * @return a iosSoftwareUpdateScheduleType
     */
    @javax.annotation.Nullable
    public IosSoftwareUpdateScheduleType getUpdateScheduleType() {
        return this.updateScheduleType;
    }
    /**
     * Gets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUtcTimeOffsetInMinutes() {
        return this.utcTimeOffsetInMinutes;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveHoursEnd(@javax.annotation.Nullable final LocalTime value) {
        this.activeHoursEnd = value;
    }
    /**
     * Sets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @param value Value to set for the activeHoursStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveHoursStart(@javax.annotation.Nullable final LocalTime value) {
        this.activeHoursStart = value;
    }
    /**
     * Sets the customUpdateTimeWindows property value. If update schedule type is set to use time window scheduling, custom time windows when updates will be scheduled. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the customUpdateTimeWindows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomUpdateTimeWindows(@javax.annotation.Nullable final java.util.List<CustomUpdateTimeWindow> value) {
        this.customUpdateTimeWindows = value;
    }
    /**
     * Sets the desiredOsVersion property value. If left unspecified, devices will update to the latest version of the OS.
     * @param value Value to set for the desiredOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDesiredOsVersion(@javax.annotation.Nullable final String value) {
        this.desiredOsVersion = value;
    }
    /**
     * Sets the enforcedSoftwareUpdateDelayInDays property value. Days before software updates are visible to iOS devices ranging from 0 to 90 inclusive
     * @param value Value to set for the enforcedSoftwareUpdateDelayInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforcedSoftwareUpdateDelayInDays(@javax.annotation.Nullable final Integer value) {
        this.enforcedSoftwareUpdateDelayInDays = value;
    }
    /**
     * Sets the isEnabled property value. Is setting enabled in UI
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @param value Value to set for the scheduledInstallDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduledInstallDays(@javax.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this.scheduledInstallDays = value;
    }
    /**
     * Sets the updateScheduleType property value. Updatescheduletypefor iOS software updates.
     * @param value Value to set for the updateScheduleType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateScheduleType(@javax.annotation.Nullable final IosSoftwareUpdateScheduleType value) {
        this.updateScheduleType = value;
    }
    /**
     * Sets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @param value Value to set for the utcTimeOffsetInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUtcTimeOffsetInMinutes(@javax.annotation.Nullable final Integer value) {
        this.utcTimeOffsetInMinutes = value;
    }
}
