package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents device setting state summary for an intent
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementIntentDeviceSettingStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementIntentDeviceSettingStateSummary and sets the default values.
     */
    public DeviceManagementIntentDeviceSettingStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntentDeviceSettingStateSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementIntentDeviceSettingStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentDeviceSettingStateSummary();
    }
    /**
     * Gets the compliantCount property value. Number of compliant devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantCount() {
        return this.BackingStore.get("compliantCount");
    }
    /**
     * Gets the conflictCount property value. Number of devices in conflict
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictCount() {
        return this.BackingStore.get("conflictCount");
    }
    /**
     * Gets the errorCount property value. Number of error devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCount() {
        return this.BackingStore.get("errorCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantCount", (n) -> { this.setCompliantCount(n.getIntegerValue()); });
        deserializerMap.put("conflictCount", (n) -> { this.setConflictCount(n.getIntegerValue()); });
        deserializerMap.put("errorCount", (n) -> { this.setErrorCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantCount", (n) -> { this.setNonCompliantCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableCount", (n) -> { this.setNotApplicableCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedCount", (n) -> { this.setRemediatedCount(n.getIntegerValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nonCompliantCount property value. Number of non compliant devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantCount() {
        return this.BackingStore.get("nonCompliantCount");
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.BackingStore.get("notApplicableCount");
    }
    /**
     * Gets the remediatedCount property value. Number of remediated devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedCount() {
        return this.BackingStore.get("remediatedCount");
    }
    /**
     * Gets the settingName property value. Name of a setting
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.BackingStore.get("settingName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("compliantCount", this.getCompliantCount());
        writer.writeIntegerValue("conflictCount", this.getConflictCount());
        writer.writeIntegerValue("errorCount", this.getErrorCount());
        writer.writeIntegerValue("nonCompliantCount", this.getNonCompliantCount());
        writer.writeIntegerValue("notApplicableCount", this.getNotApplicableCount());
        writer.writeIntegerValue("remediatedCount", this.getRemediatedCount());
        writer.writeStringValue("settingName", this.getSettingName());
    }
    /**
     * Sets the compliantCount property value. Number of compliant devices
     * @param value Value to set for the compliantCount property.
     */
    public void setCompliantCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("compliantCount", value);
    }
    /**
     * Sets the conflictCount property value. Number of devices in conflict
     * @param value Value to set for the conflictCount property.
     */
    public void setConflictCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("conflictCount", value);
    }
    /**
     * Sets the errorCount property value. Number of error devices
     * @param value Value to set for the errorCount property.
     */
    public void setErrorCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("errorCount", value);
    }
    /**
     * Sets the nonCompliantCount property value. Number of non compliant devices
     * @param value Value to set for the nonCompliantCount property.
     */
    public void setNonCompliantCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("nonCompliantCount", value);
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableCount property.
     */
    public void setNotApplicableCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("notApplicableCount", value);
    }
    /**
     * Sets the remediatedCount property value. Number of remediated devices
     * @param value Value to set for the remediatedCount property.
     */
    public void setRemediatedCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("remediatedCount", value);
    }
    /**
     * Sets the settingName property value. Name of a setting
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("settingName", value);
    }
}
