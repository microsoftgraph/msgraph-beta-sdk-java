package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationSignInDetailedSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApplicationSignInDetailedSummary} and sets the default values.
     */
    public ApplicationSignInDetailedSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationSignInDetailedSummary}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationSignInDetailedSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationSignInDetailedSummary();
    }
    /**
     * Gets the aggregatedEventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAggregatedEventDateTime() {
        return this.backingStore.get("aggregatedEventDateTime");
    }
    /**
     * Gets the appDisplayName property value. Name of the application that the user signed in to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appId property value. ID of the application that the user signed in to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aggregatedEventDateTime", (n) -> { this.setAggregatedEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("signInCount", (n) -> { this.setSignInCount(n.getLongValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(SignInStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the signInCount property value. Count of sign-ins made by the application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSignInCount() {
        return this.backingStore.get("signInCount");
    }
    /**
     * Gets the status property value. Details of the sign-in status.
     * @return a {@link SignInStatus}
     */
    @jakarta.annotation.Nullable
    public SignInStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("aggregatedEventDateTime", this.getAggregatedEventDateTime());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeLongValue("signInCount", this.getSignInCount());
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the aggregatedEventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the aggregatedEventDateTime property.
     */
    public void setAggregatedEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("aggregatedEventDateTime", value);
    }
    /**
     * Sets the appDisplayName property value. Name of the application that the user signed in to.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appId property value. ID of the application that the user signed in to.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the signInCount property value. Count of sign-ins made by the application.
     * @param value Value to set for the signInCount property.
     */
    public void setSignInCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("signInCount", value);
    }
    /**
     * Sets the status property value. Details of the sign-in status.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SignInStatus value) {
        this.backingStore.set("status", value);
    }
}
