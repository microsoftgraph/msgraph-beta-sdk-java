package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivityHistoryItem extends Entity implements Parsable {
    /**
     * The activeDurationSeconds property
     */
    private Integer activeDurationSeconds;
    /**
     * The activity property
     */
    private UserActivity activity;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The expirationDateTime property
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The lastActiveDateTime property
     */
    private OffsetDateTime lastActiveDateTime;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The startedDateTime property
     */
    private OffsetDateTime startedDateTime;
    /**
     * The status property
     */
    private Status status;
    /**
     * The userTimezone property
     */
    private String userTimezone;
    /**
     * Instantiates a new ActivityHistoryItem and sets the default values.
     */
    public ActivityHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ActivityHistoryItem
     */
    @jakarta.annotation.Nonnull
    public static ActivityHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivityHistoryItem();
    }
    /**
     * Gets the activeDurationSeconds property value. The activeDurationSeconds property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDurationSeconds() {
        return this.activeDurationSeconds;
    }
    /**
     * Gets the activity property value. The activity property
     * @return a UserActivity
     */
    @jakarta.annotation.Nullable
    public UserActivity getActivity() {
        return this.activity;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
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
        deserializerMap.put("activeDurationSeconds", (n) -> { this.setActiveDurationSeconds(n.getIntegerValue()); });
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(UserActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastActiveDateTime", (n) -> { this.setLastActiveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(Status.class)); });
        deserializerMap.put("userTimezone", (n) -> { this.setUserTimezone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActiveDateTime property value. The lastActiveDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActiveDateTime() {
        return this.lastActiveDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the startedDateTime property value. The startedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a Status
     */
    @jakarta.annotation.Nullable
    public Status getStatus() {
        return this.status;
    }
    /**
     * Gets the userTimezone property value. The userTimezone property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserTimezone() {
        return this.userTimezone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActiveDurationSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.activeDurationSeconds = value;
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final UserActivity value) {
        this.activity = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the lastActiveDateTime property value. The lastActiveDateTime property
     * @param value Value to set for the lastActiveDateTime property.
     */
    public void setLastActiveDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActiveDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. The startedDateTime property
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Status value) {
        this.status = value;
    }
    /**
     * Sets the userTimezone property value. The userTimezone property
     * @param value Value to set for the userTimezone property.
     */
    public void setUserTimezone(@jakarta.annotation.Nullable final String value) {
        this.userTimezone = value;
    }
}
