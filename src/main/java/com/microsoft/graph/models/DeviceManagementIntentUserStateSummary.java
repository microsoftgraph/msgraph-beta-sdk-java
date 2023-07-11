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
public class DeviceManagementIntentUserStateSummary extends Entity implements Parsable {
    /**
     * Number of users in conflict
     */
    private Integer conflictCount;
    /**
     * Number of error users
     */
    private Integer errorCount;
    /**
     * Number of failed users
     */
    private Integer failedCount;
    /**
     * Number of not applicable users
     */
    private Integer notApplicableCount;
    /**
     * Number of succeeded users
     */
    private Integer successCount;
    /**
     * Instantiates a new deviceManagementIntentUserStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementIntentUserStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementIntentUserStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceManagementIntentUserStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentUserStateSummary();
    }
    /**
     * Gets the conflictCount property value. Number of users in conflict
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictCount() {
        return this.conflictCount;
    }
    /**
     * Gets the errorCount property value. Number of error users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCount() {
        return this.errorCount;
    }
    /**
     * Gets the failedCount property value. Number of failed users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedCount() {
        return this.failedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.notApplicableCount;
    }
    /**
     * Gets the successCount property value. Number of succeeded users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessCount() {
        return this.successCount;
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
        writer.writeIntegerValue("conflictCount", this.getConflictCount());
        writer.writeIntegerValue("errorCount", this.getErrorCount());
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeIntegerValue("notApplicableCount", this.getNotApplicableCount());
        writer.writeIntegerValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the conflictCount property value. Number of users in conflict
     * @param value Value to set for the conflictCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictCount(@javax.annotation.Nullable final Integer value) {
        this.conflictCount = value;
    }
    /**
     * Sets the errorCount property value. Number of error users
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCount(@javax.annotation.Nullable final Integer value) {
        this.errorCount = value;
    }
    /**
     * Sets the failedCount property value. Number of failed users
     * @param value Value to set for the failedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedCount(@javax.annotation.Nullable final Integer value) {
        this.failedCount = value;
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable users
     * @param value Value to set for the notApplicableCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotApplicableCount(@javax.annotation.Nullable final Integer value) {
        this.notApplicableCount = value;
    }
    /**
     * Sets the successCount property value. Number of succeeded users
     * @param value Value to set for the successCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessCount(@javax.annotation.Nullable final Integer value) {
        this.successCount = value;
    }
}
