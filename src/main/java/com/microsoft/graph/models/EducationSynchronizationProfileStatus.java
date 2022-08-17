package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationProfileStatus extends Entity implements Parsable {
    /** Number of errors during synchronization. */
    private Long _errorCount;
    /** Represents the time when most recent changes were observed in profile. */
    private OffsetDateTime _lastActivityDateTime;
    /** Represents the time of the most recent successful  synchronization. */
    private OffsetDateTime _lastSynchronizationDateTime;
    /** The status of a sync. The possible values are: paused, inProgress, success, error, validationError, quarantined, unknownFutureValue, extracting, validating. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: extracting, validating. */
    private EducationSynchronizationStatus _status;
    /** Status message for the current profile's synchronization stage. */
    private String _statusMessage;
    /**
     * Instantiates a new EducationSynchronizationProfileStatus and sets the default values.
     * @return a void
     */
    public EducationSynchronizationProfileStatus() {
        super();
        this.setOdataType("#microsoft.graph.educationSynchronizationProfileStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSynchronizationProfileStatus
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationProfileStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationProfileStatus();
    }
    /**
     * Gets the errorCount property value. Number of errors during synchronization.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getErrorCount() {
        return this._errorCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationProfileStatus currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("errorCount", (n) -> { currentObject.setErrorCount(n.getLongValue()); });
            this.put("lastActivityDateTime", (n) -> { currentObject.setLastActivityDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSynchronizationDateTime", (n) -> { currentObject.setLastSynchronizationDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(EducationSynchronizationStatus.class)); });
            this.put("statusMessage", (n) -> { currentObject.setStatusMessage(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActivityDateTime property value. Represents the time when most recent changes were observed in profile.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActivityDateTime() {
        return this._lastActivityDateTime;
    }
    /**
     * Gets the lastSynchronizationDateTime property value. Represents the time of the most recent successful  synchronization.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSynchronizationDateTime() {
        return this._lastSynchronizationDateTime;
    }
    /**
     * Gets the status property value. The status of a sync. The possible values are: paused, inProgress, success, error, validationError, quarantined, unknownFutureValue, extracting, validating. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: extracting, validating.
     * @return a educationSynchronizationStatus
     */
    @javax.annotation.Nullable
    public EducationSynchronizationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the statusMessage property value. Status message for the current profile's synchronization stage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusMessage() {
        return this._statusMessage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("errorCount", this.getErrorCount());
        writer.writeOffsetDateTimeValue("lastActivityDateTime", this.getLastActivityDateTime());
        writer.writeOffsetDateTimeValue("lastSynchronizationDateTime", this.getLastSynchronizationDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusMessage", this.getStatusMessage());
    }
    /**
     * Sets the errorCount property value. Number of errors during synchronization.
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    public void setErrorCount(@javax.annotation.Nullable final Long value) {
        this._errorCount = value;
    }
    /**
     * Sets the lastActivityDateTime property value. Represents the time when most recent changes were observed in profile.
     * @param value Value to set for the lastActivityDateTime property.
     * @return a void
     */
    public void setLastActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActivityDateTime = value;
    }
    /**
     * Sets the lastSynchronizationDateTime property value. Represents the time of the most recent successful  synchronization.
     * @param value Value to set for the lastSynchronizationDateTime property.
     * @return a void
     */
    public void setLastSynchronizationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSynchronizationDateTime = value;
    }
    /**
     * Sets the status property value. The status of a sync. The possible values are: paused, inProgress, success, error, validationError, quarantined, unknownFutureValue, extracting, validating. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: extracting, validating.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final EducationSynchronizationStatus value) {
        this._status = value;
    }
    /**
     * Sets the statusMessage property value. Status message for the current profile's synchronization stage.
     * @param value Value to set for the statusMessage property.
     * @return a void
     */
    public void setStatusMessage(@javax.annotation.Nullable final String value) {
        this._statusMessage = value;
    }
}
