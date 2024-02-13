package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationProfileStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationSynchronizationProfileStatus} and sets the default values.
     */
    public EducationSynchronizationProfileStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationSynchronizationProfileStatus}
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationProfileStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationProfileStatus();
    }
    /**
     * Gets the errorCount property value. Number of errors during synchronization.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getErrorCount() {
        return this.backingStore.get("errorCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCount", (n) -> { this.setErrorCount(n.getLongValue()); });
        deserializerMap.put("lastActivityDateTime", (n) -> { this.setLastActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSynchronizationDateTime", (n) -> { this.setLastSynchronizationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EducationSynchronizationStatus::forValue)); });
        deserializerMap.put("statusMessage", (n) -> { this.setStatusMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActivityDateTime property value. Date and time when most recent changes were observed in the profile.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActivityDateTime() {
        return this.backingStore.get("lastActivityDateTime");
    }
    /**
     * Gets the lastSynchronizationDateTime property value. Date and time of the most recent successful synchronization.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSynchronizationDateTime() {
        return this.backingStore.get("lastSynchronizationDateTime");
    }
    /**
     * Gets the status property value. The status of a sync. The possible values are: paused, inProgress, success, error, validationError, quarantined, unknownFutureValue, extracting, validating. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: extracting, validating.
     * @return a {@link EducationSynchronizationStatus}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the statusMessage property value. Status message for the synchronization stage of the current profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusMessage() {
        return this.backingStore.get("statusMessage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setErrorCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("errorCount", value);
    }
    /**
     * Sets the lastActivityDateTime property value. Date and time when most recent changes were observed in the profile.
     * @param value Value to set for the lastActivityDateTime property.
     */
    public void setLastActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActivityDateTime", value);
    }
    /**
     * Sets the lastSynchronizationDateTime property value. Date and time of the most recent successful synchronization.
     * @param value Value to set for the lastSynchronizationDateTime property.
     */
    public void setLastSynchronizationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSynchronizationDateTime", value);
    }
    /**
     * Sets the status property value. The status of a sync. The possible values are: paused, inProgress, success, error, validationError, quarantined, unknownFutureValue, extracting, validating. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: extracting, validating.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final EducationSynchronizationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the statusMessage property value. Status message for the synchronization stage of the current profile.
     * @param value Value to set for the statusMessage property.
     */
    public void setStatusMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statusMessage", value);
    }
}
