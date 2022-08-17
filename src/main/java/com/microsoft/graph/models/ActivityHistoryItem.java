package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class ActivityHistoryItem extends Entity implements Parsable {
    /** The activeDurationSeconds property */
    private Integer _activeDurationSeconds;
    /** The activity property */
    private UserActivity _activity;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The expirationDateTime property */
    private OffsetDateTime _expirationDateTime;
    /** The lastActiveDateTime property */
    private OffsetDateTime _lastActiveDateTime;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The startedDateTime property */
    private OffsetDateTime _startedDateTime;
    /** The status property */
    private Status _status;
    /** The userTimezone property */
    private String _userTimezone;
    /**
     * Instantiates a new activityHistoryItem and sets the default values.
     * @return a void
     */
    public ActivityHistoryItem() {
        super();
        this.setOdataType("#microsoft.graph.activityHistoryItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activityHistoryItem
     */
    @javax.annotation.Nonnull
    public static ActivityHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivityHistoryItem();
    }
    /**
     * Gets the activeDurationSeconds property value. The activeDurationSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDurationSeconds() {
        return this._activeDurationSeconds;
    }
    /**
     * Gets the activity property value. The activity property
     * @return a userActivity
     */
    @javax.annotation.Nullable
    public UserActivity getActivity() {
        return this._activity;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ActivityHistoryItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeDurationSeconds", (n) -> { currentObject.setActiveDurationSeconds(n.getIntegerValue()); });
            this.put("activity", (n) -> { currentObject.setActivity(n.getObjectValue(UserActivity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastActiveDateTime", (n) -> { currentObject.setLastActiveDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("startedDateTime", (n) -> { currentObject.setStartedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(Status.class)); });
            this.put("userTimezone", (n) -> { currentObject.setUserTimezone(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActiveDateTime property value. The lastActiveDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActiveDateTime() {
        return this._lastActiveDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the startedDateTime property value. The startedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this._startedDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a status
     */
    @javax.annotation.Nullable
    public Status getStatus() {
        return this._status;
    }
    /**
     * Gets the userTimezone property value. The userTimezone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserTimezone() {
        return this._userTimezone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDurationSeconds", this.getActiveDurationSeconds());
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastActiveDateTime", this.getLastActiveDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userTimezone", this.getUserTimezone());
    }
    /**
     * Sets the activeDurationSeconds property value. The activeDurationSeconds property
     * @param value Value to set for the activeDurationSeconds property.
     * @return a void
     */
    public void setActiveDurationSeconds(@javax.annotation.Nullable final Integer value) {
        this._activeDurationSeconds = value;
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     * @return a void
     */
    public void setActivity(@javax.annotation.Nullable final UserActivity value) {
        this._activity = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the lastActiveDateTime property value. The lastActiveDateTime property
     * @param value Value to set for the lastActiveDateTime property.
     * @return a void
     */
    public void setLastActiveDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActiveDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. The startedDateTime property
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startedDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final Status value) {
        this._status = value;
    }
    /**
     * Sets the userTimezone property value. The userTimezone property
     * @param value Value to set for the userTimezone property.
     * @return a void
     */
    public void setUserTimezone(@javax.annotation.Nullable final String value) {
        this._userTimezone = value;
    }
}
