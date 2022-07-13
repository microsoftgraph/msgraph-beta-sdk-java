package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSnapshot extends Entity implements Parsable {
    /** The unique identifier for the Cloud PC. */
    private String _cloudPcId;
    /** The date and time at which the snapshot was taken. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _createdDateTime;
    /** The date and time at which the snapshot was last used to restore the Cloud PC device. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _lastRestoredDateTime;
    /** The status of the Cloud PC snapshot. The possible values are: ready, unknownFutureValue. */
    private CloudPcSnapshotStatus _status;
    /**
     * Instantiates a new CloudPcSnapshot and sets the default values.
     * @return a void
     */
    public CloudPcSnapshot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcSnapshot
     */
    @javax.annotation.Nonnull
    public static CloudPcSnapshot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSnapshot();
    }
    /**
     * Gets the cloudPcId property value. The unique identifier for the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcId() {
        return this._cloudPcId;
    }
    /**
     * Gets the createdDateTime property value. The date and time at which the snapshot was taken. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcSnapshot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cloudPcId", (n) -> { currentObject.setCloudPcId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastRestoredDateTime", (n) -> { currentObject.setLastRestoredDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CloudPcSnapshotStatus.class)); });
        }};
    }
    /**
     * Gets the lastRestoredDateTime property value. The date and time at which the snapshot was last used to restore the Cloud PC device. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRestoredDateTime() {
        return this._lastRestoredDateTime;
    }
    /**
     * Gets the status property value. The status of the Cloud PC snapshot. The possible values are: ready, unknownFutureValue.
     * @return a cloudPcSnapshotStatus
     */
    @javax.annotation.Nullable
    public CloudPcSnapshotStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastRestoredDateTime", this.getLastRestoredDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the cloudPcId property value. The unique identifier for the Cloud PC.
     * @param value Value to set for the cloudPcId property.
     * @return a void
     */
    public void setCloudPcId(@javax.annotation.Nullable final String value) {
        this._cloudPcId = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time at which the snapshot was taken. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastRestoredDateTime property value. The date and time at which the snapshot was last used to restore the Cloud PC device. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastRestoredDateTime property.
     * @return a void
     */
    public void setLastRestoredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRestoredDateTime = value;
    }
    /**
     * Sets the status property value. The status of the Cloud PC snapshot. The possible values are: ready, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CloudPcSnapshotStatus value) {
        this._status = value;
    }
}
