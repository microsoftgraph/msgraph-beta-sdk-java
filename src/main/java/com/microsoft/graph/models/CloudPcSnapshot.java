package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSnapshot extends Entity implements Parsable {
    /**
     * The unique identifier for the Cloud PC.
     */
    private String cloudPcId;
    /**
     * The date and time at which the snapshot was taken. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The date and time when the snapshot expires. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The date and time at which the snapshot was last used to restore the Cloud PC device. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastRestoredDateTime;
    /**
     * The type of snapshot that indicates how to create the snapshot. Possible values are automatic, manual. Default value is automatic.
     */
    private CloudPcSnapshotType snapshotType;
    /**
     * The status of the Cloud PC snapshot. The possible values are: ready, unknownFutureValue.
     */
    private CloudPcSnapshotStatus status;
    /**
     * Instantiates a new cloudPcSnapshot and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcSnapshot
     */
    @jakarta.annotation.Nonnull
    public static CloudPcSnapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSnapshot();
    }
    /**
     * Gets the cloudPcId property value. The unique identifier for the Cloud PC.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCloudPcId() {
        return this.cloudPcId;
    }
    /**
     * Gets the createdDateTime property value. The date and time at which the snapshot was taken. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the expirationDateTime property value. The date and time when the snapshot expires. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudPcId", (n) -> { this.setCloudPcId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRestoredDateTime", (n) -> { this.setLastRestoredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("snapshotType", (n) -> { this.setSnapshotType(n.getEnumValue(CloudPcSnapshotType.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcSnapshotStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastRestoredDateTime property value. The date and time at which the snapshot was last used to restore the Cloud PC device. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRestoredDateTime() {
        return this.lastRestoredDateTime;
    }
    /**
     * Gets the snapshotType property value. The type of snapshot that indicates how to create the snapshot. Possible values are automatic, manual. Default value is automatic.
     * @return a cloudPcSnapshotType
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshotType getSnapshotType() {
        return this.snapshotType;
    }
    /**
     * Gets the status property value. The status of the Cloud PC snapshot. The possible values are: ready, unknownFutureValue.
     * @return a cloudPcSnapshotStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcSnapshotStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastRestoredDateTime", this.getLastRestoredDateTime());
        writer.writeEnumValue("snapshotType", this.getSnapshotType());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the cloudPcId property value. The unique identifier for the Cloud PC.
     * @param value Value to set for the cloudPcId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudPcId(@jakarta.annotation.Nullable final String value) {
        this.cloudPcId = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time at which the snapshot was taken. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. The date and time when the snapshot expires. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the lastRestoredDateTime property value. The date and time at which the snapshot was last used to restore the Cloud PC device. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastRestoredDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastRestoredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRestoredDateTime = value;
    }
    /**
     * Sets the snapshotType property value. The type of snapshot that indicates how to create the snapshot. Possible values are automatic, manual. Default value is automatic.
     * @param value Value to set for the snapshotType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSnapshotType(@jakarta.annotation.Nullable final CloudPcSnapshotType value) {
        this.snapshotType = value;
    }
    /**
     * Sets the status property value. The status of the Cloud PC snapshot. The possible values are: ready, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final CloudPcSnapshotStatus value) {
        this.status = value;
    }
}
