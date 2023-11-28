package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The windowsAutopilotSettings resource represents a Windows Autopilot Account to sync data with Windows device data sync service.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAutopilotSettings extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsAutopilotSettings and sets the default values.
     */
    public WindowsAutopilotSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsAutopilotSettings
     */
    @jakarta.annotation.Nonnull
    public static WindowsAutopilotSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastManualSyncTriggerDateTime", (n) -> { this.setLastManualSyncTriggerDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("syncStatus", (n) -> { this.setSyncStatus(n.getEnumValue(WindowsAutopilotSyncStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastManualSyncTriggerDateTime property value. Last data sync date time with DDS service.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastManualSyncTriggerDateTime() {
        return this.backingStore.get("lastManualSyncTriggerDateTime");
    }
    /**
     * Gets the lastSyncDateTime property value. Last data sync date time with DDS service.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the syncStatus property value. The syncStatus property
     * @return a WindowsAutopilotSyncStatus
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotSyncStatus getSyncStatus() {
        return this.backingStore.get("syncStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastManualSyncTriggerDateTime", this.getLastManualSyncTriggerDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeEnumValue("syncStatus", this.getSyncStatus());
    }
    /**
     * Sets the lastManualSyncTriggerDateTime property value. Last data sync date time with DDS service.
     * @param value Value to set for the lastManualSyncTriggerDateTime property.
     */
    public void setLastManualSyncTriggerDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastManualSyncTriggerDateTime", value);
    }
    /**
     * Sets the lastSyncDateTime property value. Last data sync date time with DDS service.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the syncStatus property value. The syncStatus property
     * @param value Value to set for the syncStatus property.
     */
    public void setSyncStatus(@jakarta.annotation.Nullable final WindowsAutopilotSyncStatus value) {
        this.backingStore.set("syncStatus", value);
    }
}
