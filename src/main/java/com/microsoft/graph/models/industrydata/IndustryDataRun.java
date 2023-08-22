package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.PublicError;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndustryDataRun extends Entity implements Parsable {
    /**
     * The set of activities performed during the run.
     */
    private java.util.List<IndustryDataRunActivity> activities;
    /**
     * An error object to diagnose critical failures in the run.
     */
    private PublicError blockingError;
    /**
     * The name of the run for rendering in a user interface.
     */
    private String displayName;
    /**
     * The date and time when the run finished or null if the run is still in-progress. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime endDateTime;
    /**
     * The date and time when the run started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime startDateTime;
    /**
     * The status property
     */
    private IndustryDataRunStatus status;
    /**
     * Instantiates a new industryDataRun and sets the default values.
     */
    public IndustryDataRun() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a industryDataRun
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataRun createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IndustryDataRun();
    }
    /**
     * Gets the activities property value. The set of activities performed during the run.
     * @return a industryDataRunActivity
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataRunActivity> getActivities() {
        return this.activities;
    }
    /**
     * Gets the blockingError property value. An error object to diagnose critical failures in the run.
     * @return a publicError
     */
    @jakarta.annotation.Nullable
    public PublicError getBlockingError() {
        return this.blockingError;
    }
    /**
     * Gets the displayName property value. The name of the run for rendering in a user interface.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDateTime property value. The date and time when the run finished or null if the run is still in-progress. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfObjectValues(IndustryDataRunActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("blockingError", (n) -> { this.setBlockingError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IndustryDataRunStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the startDateTime property value. The date and time when the run started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a industryDataRunStatus
     */
    @jakarta.annotation.Nullable
    public IndustryDataRunStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the activities property value. The set of activities performed during the run.
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final java.util.List<IndustryDataRunActivity> value) {
        this.activities = value;
    }
    /**
     * Sets the blockingError property value. An error object to diagnose critical failures in the run.
     * @param value Value to set for the blockingError property.
     */
    public void setBlockingError(@jakarta.annotation.Nullable final PublicError value) {
        this.blockingError = value;
    }
    /**
     * Sets the displayName property value. The name of the run for rendering in a user interface.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDateTime property value. The date and time when the run finished or null if the run is still in-progress. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the startDateTime property value. The date and time when the run started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final IndustryDataRunStatus value) {
        this.status = value;
    }
}
