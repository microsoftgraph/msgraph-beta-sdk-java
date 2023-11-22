package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents user state summary for an intent
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementIntentUserStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementIntentUserStateSummary and sets the default values.
     */
    public DeviceManagementIntentUserStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntentUserStateSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementIntentUserStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentUserStateSummary();
    }
    /**
     * Gets the conflictCount property value. Number of users in conflict
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictCount() {
        return this.backingStore.get("conflictCount");
    }
    /**
     * Gets the errorCount property value. Number of error users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCount() {
        return this.backingStore.get("errorCount");
    }
    /**
     * Gets the failedCount property value. Number of failed users
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
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.backingStore.get("notApplicableCount");
    }
    /**
     * Gets the successCount property value. Number of succeeded users
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
        writer.writeIntegerValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the conflictCount property value. Number of users in conflict
     * @param value Value to set for the conflictCount property.
     */
    public void setConflictCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("conflictCount", value);
    }
    /**
     * Sets the errorCount property value. Number of error users
     * @param value Value to set for the errorCount property.
     */
    public void setErrorCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorCount", value);
    }
    /**
     * Sets the failedCount property value. Number of failed users
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedCount", value);
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable users
     * @param value Value to set for the notApplicableCount property.
     */
    public void setNotApplicableCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableCount", value);
    }
    /**
     * Sets the successCount property value. Number of succeeded users
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successCount", value);
    }
}
