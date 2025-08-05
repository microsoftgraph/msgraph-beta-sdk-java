package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserPasswordResetsAndChangesSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserPasswordResetsAndChangesSummary} and sets the default values.
     */
    public UserPasswordResetsAndChangesSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserPasswordResetsAndChangesSummary}
     */
    @jakarta.annotation.Nonnull
    public static UserPasswordResetsAndChangesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserPasswordResetsAndChangesSummary();
    }
    /**
     * Gets the aggregatedDateTime property value. The aggregated day for which the summary applies to. This property will always represent the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAggregatedDateTime() {
        return this.backingStore.get("aggregatedDateTime");
    }
    /**
     * Gets the changePasswordSelfServiceCount property value. The number of self-service password changes that occurred during this window.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getChangePasswordSelfServiceCount() {
        return this.backingStore.get("changePasswordSelfServiceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aggregatedDateTime", (n) -> { this.setAggregatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("changePasswordSelfServiceCount", (n) -> { this.setChangePasswordSelfServiceCount(n.getLongValue()); });
        deserializerMap.put("passwordResetsByAdminCount", (n) -> { this.setPasswordResetsByAdminCount(n.getLongValue()); });
        deserializerMap.put("passwordResetsSelfServiceCount", (n) -> { this.setPasswordResetsSelfServiceCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordResetsByAdminCount property value. The number of admin-triggered password resets that occurred during this window.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPasswordResetsByAdminCount() {
        return this.backingStore.get("passwordResetsByAdminCount");
    }
    /**
     * Gets the passwordResetsSelfServiceCount property value. The number of self-service password resets that occurred during this window.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPasswordResetsSelfServiceCount() {
        return this.backingStore.get("passwordResetsSelfServiceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("aggregatedDateTime", this.getAggregatedDateTime());
        writer.writeLongValue("changePasswordSelfServiceCount", this.getChangePasswordSelfServiceCount());
        writer.writeLongValue("passwordResetsByAdminCount", this.getPasswordResetsByAdminCount());
        writer.writeLongValue("passwordResetsSelfServiceCount", this.getPasswordResetsSelfServiceCount());
    }
    /**
     * Sets the aggregatedDateTime property value. The aggregated day for which the summary applies to. This property will always represent the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the aggregatedDateTime property.
     */
    public void setAggregatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("aggregatedDateTime", value);
    }
    /**
     * Sets the changePasswordSelfServiceCount property value. The number of self-service password changes that occurred during this window.
     * @param value Value to set for the changePasswordSelfServiceCount property.
     */
    public void setChangePasswordSelfServiceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("changePasswordSelfServiceCount", value);
    }
    /**
     * Sets the passwordResetsByAdminCount property value. The number of admin-triggered password resets that occurred during this window.
     * @param value Value to set for the passwordResetsByAdminCount property.
     */
    public void setPasswordResetsByAdminCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("passwordResetsByAdminCount", value);
    }
    /**
     * Sets the passwordResetsSelfServiceCount property value. The number of self-service password resets that occurred during this window.
     * @param value Value to set for the passwordResetsSelfServiceCount property.
     */
    public void setPasswordResetsSelfServiceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("passwordResetsSelfServiceCount", value);
    }
}
