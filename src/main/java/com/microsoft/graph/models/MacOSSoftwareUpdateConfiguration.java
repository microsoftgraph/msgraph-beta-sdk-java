package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSSoftwareUpdateConfiguration extends DeviceConfiguration implements Parsable {
    /** Update behavior options for macOS software updates. */
    private MacOSSoftwareUpdateBehavior _allOtherUpdateBehavior;
    /** Update behavior options for macOS software updates. */
    private MacOSSoftwareUpdateBehavior _configDataUpdateBehavior;
    /** Update behavior options for macOS software updates. */
    private MacOSSoftwareUpdateBehavior _criticalUpdateBehavior;
    /** Custom Time windows when updates will be allowed or blocked. This collection can contain a maximum of 20 elements. */
    private java.util.List<CustomUpdateTimeWindow> _customUpdateTimeWindows;
    /** Update behavior options for macOS software updates. */
    private MacOSSoftwareUpdateBehavior _firmwareUpdateBehavior;
    /** Updatescheduletypefor macOS software updates. */
    private MacOSSoftwareUpdateScheduleType _updateScheduleType;
    /** Minutes indicating UTC offset for each update time window */
    private Integer _updateTimeWindowUtcOffsetInMinutes;
    /**
     * Instantiates a new MacOSSoftwareUpdateConfiguration and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static MacOSSoftwareUpdateConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateConfiguration();
    }
    /**
     * Gets the allOtherUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a macOSSoftwareUpdateBehavior
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getAllOtherUpdateBehavior() {
        return this._allOtherUpdateBehavior;
    }
    /**
     * Gets the configDataUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a macOSSoftwareUpdateBehavior
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getConfigDataUpdateBehavior() {
        return this._configDataUpdateBehavior;
    }
    /**
     * Gets the criticalUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a macOSSoftwareUpdateBehavior
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getCriticalUpdateBehavior() {
        return this._criticalUpdateBehavior;
    }
    /**
     * Gets the customUpdateTimeWindows property value. Custom Time windows when updates will be allowed or blocked. This collection can contain a maximum of 20 elements.
     * @return a customUpdateTimeWindow
     */
    @javax.annotation.Nullable
    public java.util.List<CustomUpdateTimeWindow> getCustomUpdateTimeWindows() {
        return this._customUpdateTimeWindows;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSSoftwareUpdateConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allOtherUpdateBehavior", (n) -> { currentObject.setAllOtherUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior.class)); });
            this.put("configDataUpdateBehavior", (n) -> { currentObject.setConfigDataUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior.class)); });
            this.put("criticalUpdateBehavior", (n) -> { currentObject.setCriticalUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior.class)); });
            this.put("customUpdateTimeWindows", (n) -> { currentObject.setCustomUpdateTimeWindows(n.getCollectionOfObjectValues(CustomUpdateTimeWindow::createFromDiscriminatorValue)); });
            this.put("firmwareUpdateBehavior", (n) -> { currentObject.setFirmwareUpdateBehavior(n.getEnumValue(MacOSSoftwareUpdateBehavior.class)); });
            this.put("updateScheduleType", (n) -> { currentObject.setUpdateScheduleType(n.getEnumValue(MacOSSoftwareUpdateScheduleType.class)); });
            this.put("updateTimeWindowUtcOffsetInMinutes", (n) -> { currentObject.setUpdateTimeWindowUtcOffsetInMinutes(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the firmwareUpdateBehavior property value. Update behavior options for macOS software updates.
     * @return a macOSSoftwareUpdateBehavior
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateBehavior getFirmwareUpdateBehavior() {
        return this._firmwareUpdateBehavior;
    }
    /**
     * Gets the updateScheduleType property value. Updatescheduletypefor macOS software updates.
     * @return a macOSSoftwareUpdateScheduleType
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateScheduleType getUpdateScheduleType() {
        return this._updateScheduleType;
    }
    /**
     * Gets the updateTimeWindowUtcOffsetInMinutes property value. Minutes indicating UTC offset for each update time window
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUpdateTimeWindowUtcOffsetInMinutes() {
        return this._updateTimeWindowUtcOffsetInMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allOtherUpdateBehavior", this.getAllOtherUpdateBehavior());
        writer.writeEnumValue("configDataUpdateBehavior", this.getConfigDataUpdateBehavior());
        writer.writeEnumValue("criticalUpdateBehavior", this.getCriticalUpdateBehavior());
        writer.writeCollectionOfObjectValues("customUpdateTimeWindows", this.getCustomUpdateTimeWindows());
        writer.writeEnumValue("firmwareUpdateBehavior", this.getFirmwareUpdateBehavior());
        writer.writeEnumValue("updateScheduleType", this.getUpdateScheduleType());
        writer.writeIntegerValue("updateTimeWindowUtcOffsetInMinutes", this.getUpdateTimeWindowUtcOffsetInMinutes());
    }
    /**
     * Sets the allOtherUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the allOtherUpdateBehavior property.
     * @return a void
     */
    public void setAllOtherUpdateBehavior(@javax.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this._allOtherUpdateBehavior = value;
    }
    /**
     * Sets the configDataUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the configDataUpdateBehavior property.
     * @return a void
     */
    public void setConfigDataUpdateBehavior(@javax.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this._configDataUpdateBehavior = value;
    }
    /**
     * Sets the criticalUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the criticalUpdateBehavior property.
     * @return a void
     */
    public void setCriticalUpdateBehavior(@javax.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this._criticalUpdateBehavior = value;
    }
    /**
     * Sets the customUpdateTimeWindows property value. Custom Time windows when updates will be allowed or blocked. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the customUpdateTimeWindows property.
     * @return a void
     */
    public void setCustomUpdateTimeWindows(@javax.annotation.Nullable final java.util.List<CustomUpdateTimeWindow> value) {
        this._customUpdateTimeWindows = value;
    }
    /**
     * Sets the firmwareUpdateBehavior property value. Update behavior options for macOS software updates.
     * @param value Value to set for the firmwareUpdateBehavior property.
     * @return a void
     */
    public void setFirmwareUpdateBehavior(@javax.annotation.Nullable final MacOSSoftwareUpdateBehavior value) {
        this._firmwareUpdateBehavior = value;
    }
    /**
     * Sets the updateScheduleType property value. Updatescheduletypefor macOS software updates.
     * @param value Value to set for the updateScheduleType property.
     * @return a void
     */
    public void setUpdateScheduleType(@javax.annotation.Nullable final MacOSSoftwareUpdateScheduleType value) {
        this._updateScheduleType = value;
    }
    /**
     * Sets the updateTimeWindowUtcOffsetInMinutes property value. Minutes indicating UTC offset for each update time window
     * @param value Value to set for the updateTimeWindowUtcOffsetInMinutes property.
     * @return a void
     */
    public void setUpdateTimeWindowUtcOffsetInMinutes(@javax.annotation.Nullable final Integer value) {
        this._updateTimeWindowUtcOffsetInMinutes = value;
    }
}
