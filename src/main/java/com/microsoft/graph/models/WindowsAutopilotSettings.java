package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsAutopilotSettings extends Entity implements Parsable {
    /** Last data sync date time with DDS service. */
    private OffsetDateTime lastManualSyncTriggerDateTime;
    /** Last data sync date time with DDS service. */
    private OffsetDateTime lastSyncDateTime;
    /** The syncStatus property */
    private WindowsAutopilotSyncStatus syncStatus;
    /**
     * Instantiates a new windowsAutopilotSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsAutopilotSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsAutopilotSettings
     */
    @javax.annotation.Nonnull
    public static WindowsAutopilotSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastManualSyncTriggerDateTime", (n) -> { this.setLastManualSyncTriggerDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("syncStatus", (n) -> { this.setSyncStatus(n.getEnumValue(WindowsAutopilotSyncStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastManualSyncTriggerDateTime property value. Last data sync date time with DDS service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastManualSyncTriggerDateTime() {
        return this.lastManualSyncTriggerDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. Last data sync date time with DDS service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the syncStatus property value. The syncStatus property
     * @return a WindowsAutopilotSyncStatus
     */
    @javax.annotation.Nullable
    public WindowsAutopilotSyncStatus getSyncStatus() {
        return this.syncStatus;
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
        writer.writeOffsetDateTimeValue("lastManualSyncTriggerDateTime", this.getLastManualSyncTriggerDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeEnumValue("syncStatus", this.getSyncStatus());
    }
    /**
     * Sets the lastManualSyncTriggerDateTime property value. Last data sync date time with DDS service.
     * @param value Value to set for the lastManualSyncTriggerDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastManualSyncTriggerDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastManualSyncTriggerDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last data sync date time with DDS service.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the syncStatus property value. The syncStatus property
     * @param value Value to set for the syncStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSyncStatus(@javax.annotation.Nullable final WindowsAutopilotSyncStatus value) {
        this.syncStatus = value;
    }
}
