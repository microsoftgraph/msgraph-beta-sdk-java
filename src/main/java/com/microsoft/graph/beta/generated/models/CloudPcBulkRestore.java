package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkRestore extends CloudPcBulkAction implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkRestore} and sets the default values.
     */
    public CloudPcBulkRestore() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkRestore");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkRestore}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkRestore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkRestore();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ignoreUnhealthySnapshots", (n) -> { this.setIgnoreUnhealthySnapshots(n.getBooleanValue()); });
        deserializerMap.put("restorePointDateTime", (n) -> { this.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timeRange", (n) -> { this.setTimeRange(n.getEnumValue(RestoreTimeRange::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreUnhealthySnapshots property value. True indicates that snapshots of unhealthy Cloud PCs are ignored. If no healthy snapshot exists within the selected timeRange, the healthy snapshot closest to the restorePointDateTime is used. False indicates that the snapshot within the selected timeRange and closest to the restorePointDateTime is used. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreUnhealthySnapshots() {
        return this.backingStore.get("ignoreUnhealthySnapshots");
    }
    /**
     * Gets the restorePointDateTime property value. The date and time point for the selected Cloud PCs to restore. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this.backingStore.get("restorePointDateTime");
    }
    /**
     * Gets the timeRange property value. The timeRange property
     * @return a {@link RestoreTimeRange}
     */
    @jakarta.annotation.Nullable
    public RestoreTimeRange getTimeRange() {
        return this.backingStore.get("timeRange");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("ignoreUnhealthySnapshots", this.getIgnoreUnhealthySnapshots());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeEnumValue("timeRange", this.getTimeRange());
    }
    /**
     * Sets the ignoreUnhealthySnapshots property value. True indicates that snapshots of unhealthy Cloud PCs are ignored. If no healthy snapshot exists within the selected timeRange, the healthy snapshot closest to the restorePointDateTime is used. False indicates that the snapshot within the selected timeRange and closest to the restorePointDateTime is used. The default value is false.
     * @param value Value to set for the ignoreUnhealthySnapshots property.
     */
    public void setIgnoreUnhealthySnapshots(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ignoreUnhealthySnapshots", value);
    }
    /**
     * Sets the restorePointDateTime property value. The date and time point for the selected Cloud PCs to restore. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the restorePointDateTime property.
     */
    public void setRestorePointDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restorePointDateTime", value);
    }
    /**
     * Sets the timeRange property value. The timeRange property
     * @param value Value to set for the timeRange property.
     */
    public void setTimeRange(@jakarta.annotation.Nullable final RestoreTimeRange value) {
        this.backingStore.set("timeRange", value);
    }
}
