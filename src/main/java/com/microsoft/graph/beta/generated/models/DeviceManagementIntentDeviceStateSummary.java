package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents device state summary for an intent
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementIntentDeviceStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementIntentDeviceStateSummary and sets the default values.
     */
    public DeviceManagementIntentDeviceStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntentDeviceStateSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementIntentDeviceStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentDeviceStateSummary();
    }
    /**
     * Gets the conflictCount property value. Number of devices in conflict
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictCount() {
        return this.backingStore.get("conflictCount");
    }
    /**
     * Gets the errorCount property value. Number of error devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCount() {
        return this.backingStore.get("errorCount");
    }
    /**
     * Gets the failedCount property value. Number of failed devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.backingStore.get("failedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conflictCount", (n) -> { this.setConflictCount(n.getIntegerValue()); });
        deserializerMap.put("errorCount", (n) -> { this.setErrorCount(n.getIntegerValue()); });
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableCount", (n) -> { this.setNotApplicableCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicablePlatformCount", (n) -> { this.setNotApplicablePlatformCount(n.getIntegerValue()); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.backingStore.get("notApplicableCount");
    }
    /**
     * Gets the notApplicablePlatformCount property value. Number of not applicable devices due to mismatch platform and policy
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicablePlatformCount() {
        return this.backingStore.get("notApplicablePlatformCount");
    }
    /**
     * Gets the successCount property value. Number of succeeded devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessCount() {
        return this.backingStore.get("successCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("conflictCount", this.getConflictCount());
        writer.writeIntegerValue("errorCount", this.getErrorCount());
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeIntegerValue("notApplicableCount", this.getNotApplicableCount());
        writer.writeIntegerValue("notApplicablePlatformCount", this.getNotApplicablePlatformCount());
        writer.writeIntegerValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the conflictCount property value. Number of devices in conflict
     * @param value Value to set for the conflictCount property.
     */
    public void setConflictCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("conflictCount", value);
    }
    /**
     * Sets the errorCount property value. Number of error devices
     * @param value Value to set for the errorCount property.
     */
    public void setErrorCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorCount", value);
    }
    /**
     * Sets the failedCount property value. Number of failed devices
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedCount", value);
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableCount property.
     */
    public void setNotApplicableCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableCount", value);
    }
    /**
     * Sets the notApplicablePlatformCount property value. Number of not applicable devices due to mismatch platform and policy
     * @param value Value to set for the notApplicablePlatformCount property.
     */
    public void setNotApplicablePlatformCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicablePlatformCount", value);
    }
    /**
     * Sets the successCount property value. Number of succeeded devices
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successCount", value);
    }
}
