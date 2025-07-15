package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationJobProgressEvent extends SharePointMigrationEvent implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationJobProgressEvent} and sets the default values.
     */
    public SharePointMigrationJobProgressEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationJobProgressEvent}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationJobProgressEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationJobProgressEvent();
    }
    /**
     * Gets the bytesProcessed property value. The bytesProcessed property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getBytesProcessed() {
        return this.backingStore.get("bytesProcessed");
    }
    /**
     * Gets the bytesProcessedOnlyCurrentVersion property value. The bytesProcessedOnlyCurrentVersion property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getBytesProcessedOnlyCurrentVersion() {
        return this.backingStore.get("bytesProcessedOnlyCurrentVersion");
    }
    /**
     * Gets the cpuDurationMs property value. The cpuDurationMs property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCpuDurationMs() {
        return this.backingStore.get("cpuDurationMs");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bytesProcessed", (n) -> { this.setBytesProcessed(n.getLongValue()); });
        deserializerMap.put("bytesProcessedOnlyCurrentVersion", (n) -> { this.setBytesProcessedOnlyCurrentVersion(n.getLongValue()); });
        deserializerMap.put("cpuDurationMs", (n) -> { this.setCpuDurationMs(n.getLongValue()); });
        deserializerMap.put("filesProcessed", (n) -> { this.setFilesProcessed(n.getLongValue()); });
        deserializerMap.put("filesProcessedOnlyCurrentVersion", (n) -> { this.setFilesProcessedOnlyCurrentVersion(n.getLongValue()); });
        deserializerMap.put("isCompleted", (n) -> { this.setIsCompleted(n.getBooleanValue()); });
        deserializerMap.put("lastProcessedObjectId", (n) -> { this.setLastProcessedObjectId(n.getStringValue()); });
        deserializerMap.put("objectsProcessed", (n) -> { this.setObjectsProcessed(n.getLongValue()); });
        deserializerMap.put("sqlDurationMs", (n) -> { this.setSqlDurationMs(n.getLongValue()); });
        deserializerMap.put("sqlQueryCount", (n) -> { this.setSqlQueryCount(n.getLongValue()); });
        deserializerMap.put("totalDurationMs", (n) -> { this.setTotalDurationMs(n.getLongValue()); });
        deserializerMap.put("totalErrors", (n) -> { this.setTotalErrors(n.getLongValue()); });
        deserializerMap.put("totalExpectedBytes", (n) -> { this.setTotalExpectedBytes(n.getLongValue()); });
        deserializerMap.put("totalExpectedObjects", (n) -> { this.setTotalExpectedObjects(n.getLongValue()); });
        deserializerMap.put("totalRetryCount", (n) -> { this.setTotalRetryCount(n.getIntegerValue()); });
        deserializerMap.put("totalWarnings", (n) -> { this.setTotalWarnings(n.getLongValue()); });
        deserializerMap.put("waitTimeOnSqlThrottlingMs", (n) -> { this.setWaitTimeOnSqlThrottlingMs(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filesProcessed property value. The filesProcessed property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFilesProcessed() {
        return this.backingStore.get("filesProcessed");
    }
    /**
     * Gets the filesProcessedOnlyCurrentVersion property value. The filesProcessedOnlyCurrentVersion property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFilesProcessedOnlyCurrentVersion() {
        return this.backingStore.get("filesProcessedOnlyCurrentVersion");
    }
    /**
     * Gets the isCompleted property value. The isCompleted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCompleted() {
        return this.backingStore.get("isCompleted");
    }
    /**
     * Gets the lastProcessedObjectId property value. The lastProcessedObjectId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastProcessedObjectId() {
        return this.backingStore.get("lastProcessedObjectId");
    }
    /**
     * Gets the objectsProcessed property value. The objectsProcessed property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getObjectsProcessed() {
        return this.backingStore.get("objectsProcessed");
    }
    /**
     * Gets the sqlDurationMs property value. The sqlDurationMs property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSqlDurationMs() {
        return this.backingStore.get("sqlDurationMs");
    }
    /**
     * Gets the sqlQueryCount property value. The sqlQueryCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSqlQueryCount() {
        return this.backingStore.get("sqlQueryCount");
    }
    /**
     * Gets the totalDurationMs property value. The totalDurationMs property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalDurationMs() {
        return this.backingStore.get("totalDurationMs");
    }
    /**
     * Gets the totalErrors property value. The totalErrors property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalErrors() {
        return this.backingStore.get("totalErrors");
    }
    /**
     * Gets the totalExpectedBytes property value. The totalExpectedBytes property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalExpectedBytes() {
        return this.backingStore.get("totalExpectedBytes");
    }
    /**
     * Gets the totalExpectedObjects property value. The totalExpectedObjects property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalExpectedObjects() {
        return this.backingStore.get("totalExpectedObjects");
    }
    /**
     * Gets the totalRetryCount property value. The totalRetryCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalRetryCount() {
        return this.backingStore.get("totalRetryCount");
    }
    /**
     * Gets the totalWarnings property value. The totalWarnings property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalWarnings() {
        return this.backingStore.get("totalWarnings");
    }
    /**
     * Gets the waitTimeOnSqlThrottlingMs property value. The waitTimeOnSqlThrottlingMs property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getWaitTimeOnSqlThrottlingMs() {
        return this.backingStore.get("waitTimeOnSqlThrottlingMs");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("bytesProcessed", this.getBytesProcessed());
        writer.writeLongValue("bytesProcessedOnlyCurrentVersion", this.getBytesProcessedOnlyCurrentVersion());
        writer.writeLongValue("cpuDurationMs", this.getCpuDurationMs());
        writer.writeLongValue("filesProcessed", this.getFilesProcessed());
        writer.writeLongValue("filesProcessedOnlyCurrentVersion", this.getFilesProcessedOnlyCurrentVersion());
        writer.writeBooleanValue("isCompleted", this.getIsCompleted());
        writer.writeStringValue("lastProcessedObjectId", this.getLastProcessedObjectId());
        writer.writeLongValue("objectsProcessed", this.getObjectsProcessed());
        writer.writeLongValue("sqlDurationMs", this.getSqlDurationMs());
        writer.writeLongValue("sqlQueryCount", this.getSqlQueryCount());
        writer.writeLongValue("totalDurationMs", this.getTotalDurationMs());
        writer.writeLongValue("totalErrors", this.getTotalErrors());
        writer.writeLongValue("totalExpectedBytes", this.getTotalExpectedBytes());
        writer.writeLongValue("totalExpectedObjects", this.getTotalExpectedObjects());
        writer.writeIntegerValue("totalRetryCount", this.getTotalRetryCount());
        writer.writeLongValue("totalWarnings", this.getTotalWarnings());
        writer.writeLongValue("waitTimeOnSqlThrottlingMs", this.getWaitTimeOnSqlThrottlingMs());
    }
    /**
     * Sets the bytesProcessed property value. The bytesProcessed property
     * @param value Value to set for the bytesProcessed property.
     */
    public void setBytesProcessed(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("bytesProcessed", value);
    }
    /**
     * Sets the bytesProcessedOnlyCurrentVersion property value. The bytesProcessedOnlyCurrentVersion property
     * @param value Value to set for the bytesProcessedOnlyCurrentVersion property.
     */
    public void setBytesProcessedOnlyCurrentVersion(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("bytesProcessedOnlyCurrentVersion", value);
    }
    /**
     * Sets the cpuDurationMs property value. The cpuDurationMs property
     * @param value Value to set for the cpuDurationMs property.
     */
    public void setCpuDurationMs(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("cpuDurationMs", value);
    }
    /**
     * Sets the filesProcessed property value. The filesProcessed property
     * @param value Value to set for the filesProcessed property.
     */
    public void setFilesProcessed(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("filesProcessed", value);
    }
    /**
     * Sets the filesProcessedOnlyCurrentVersion property value. The filesProcessedOnlyCurrentVersion property
     * @param value Value to set for the filesProcessedOnlyCurrentVersion property.
     */
    public void setFilesProcessedOnlyCurrentVersion(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("filesProcessedOnlyCurrentVersion", value);
    }
    /**
     * Sets the isCompleted property value. The isCompleted property
     * @param value Value to set for the isCompleted property.
     */
    public void setIsCompleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCompleted", value);
    }
    /**
     * Sets the lastProcessedObjectId property value. The lastProcessedObjectId property
     * @param value Value to set for the lastProcessedObjectId property.
     */
    public void setLastProcessedObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastProcessedObjectId", value);
    }
    /**
     * Sets the objectsProcessed property value. The objectsProcessed property
     * @param value Value to set for the objectsProcessed property.
     */
    public void setObjectsProcessed(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("objectsProcessed", value);
    }
    /**
     * Sets the sqlDurationMs property value. The sqlDurationMs property
     * @param value Value to set for the sqlDurationMs property.
     */
    public void setSqlDurationMs(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sqlDurationMs", value);
    }
    /**
     * Sets the sqlQueryCount property value. The sqlQueryCount property
     * @param value Value to set for the sqlQueryCount property.
     */
    public void setSqlQueryCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sqlQueryCount", value);
    }
    /**
     * Sets the totalDurationMs property value. The totalDurationMs property
     * @param value Value to set for the totalDurationMs property.
     */
    public void setTotalDurationMs(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalDurationMs", value);
    }
    /**
     * Sets the totalErrors property value. The totalErrors property
     * @param value Value to set for the totalErrors property.
     */
    public void setTotalErrors(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalErrors", value);
    }
    /**
     * Sets the totalExpectedBytes property value. The totalExpectedBytes property
     * @param value Value to set for the totalExpectedBytes property.
     */
    public void setTotalExpectedBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalExpectedBytes", value);
    }
    /**
     * Sets the totalExpectedObjects property value. The totalExpectedObjects property
     * @param value Value to set for the totalExpectedObjects property.
     */
    public void setTotalExpectedObjects(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalExpectedObjects", value);
    }
    /**
     * Sets the totalRetryCount property value. The totalRetryCount property
     * @param value Value to set for the totalRetryCount property.
     */
    public void setTotalRetryCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalRetryCount", value);
    }
    /**
     * Sets the totalWarnings property value. The totalWarnings property
     * @param value Value to set for the totalWarnings property.
     */
    public void setTotalWarnings(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalWarnings", value);
    }
    /**
     * Sets the waitTimeOnSqlThrottlingMs property value. The waitTimeOnSqlThrottlingMs property
     * @param value Value to set for the waitTimeOnSqlThrottlingMs property.
     */
    public void setWaitTimeOnSqlThrottlingMs(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("waitTimeOnSqlThrottlingMs", value);
    }
}
