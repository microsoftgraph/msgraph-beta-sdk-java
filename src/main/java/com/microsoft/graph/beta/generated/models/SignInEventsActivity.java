package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignInEventsActivity extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SignInEventsActivity} and sets the default values.
     */
    public SignInEventsActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SignInEventsActivity}
     */
    @jakarta.annotation.Nonnull
    public static SignInEventsActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInEventsActivity();
    }
    /**
     * Gets the activityDateTime property value. The aggregated day for which the summary applies to. This property always represents the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (gt, lt).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.backingStore.get("activityDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("signInCount", (n) -> { this.setSignInCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the signInCount property value. The number of sign-in events that occurred for this day. Supports $filter (gt, lt, eq).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSignInCount() {
        return this.backingStore.get("signInCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeIntegerValue("signInCount", this.getSignInCount());
    }
    /**
     * Sets the activityDateTime property value. The aggregated day for which the summary applies to. This property always represents the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (gt, lt).
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("activityDateTime", value);
    }
    /**
     * Sets the signInCount property value. The number of sign-in events that occurred for this day. Supports $filter (gt, lt, eq).
     * @param value Value to set for the signInCount property.
     */
    public void setSignInCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("signInCount", value);
    }
}
