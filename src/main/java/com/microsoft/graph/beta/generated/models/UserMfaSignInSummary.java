package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserMfaSignInSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserMfaSignInSummary} and sets the default values.
     */
    public UserMfaSignInSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserMfaSignInSummary}
     */
    @jakarta.annotation.Nonnull
    public static UserMfaSignInSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserMfaSignInSummary();
    }
    /**
     * Gets the createdDateTime property value. The date and time (UTC) for when the summary was aggregated for. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("multiFactorSignIns", (n) -> { this.setMultiFactorSignIns(n.getLongValue()); });
        deserializerMap.put("singleFactorSignIns", (n) -> { this.setSingleFactorSignIns(n.getLongValue()); });
        deserializerMap.put("totalSignIns", (n) -> { this.setTotalSignIns(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the multiFactorSignIns property value. The total number of MFA sign-ins for the given day.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMultiFactorSignIns() {
        return this.backingStore.get("multiFactorSignIns");
    }
    /**
     * Gets the singleFactorSignIns property value. The total number of non-MFA sign ins for the given day.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSingleFactorSignIns() {
        return this.backingStore.get("singleFactorSignIns");
    }
    /**
     * Gets the totalSignIns property value. The total number of sign-ins for the given day.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalSignIns() {
        return this.backingStore.get("totalSignIns");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeLongValue("multiFactorSignIns", this.getMultiFactorSignIns());
        writer.writeLongValue("singleFactorSignIns", this.getSingleFactorSignIns());
        writer.writeLongValue("totalSignIns", this.getTotalSignIns());
    }
    /**
     * Sets the createdDateTime property value. The date and time (UTC) for when the summary was aggregated for. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the multiFactorSignIns property value. The total number of MFA sign-ins for the given day.
     * @param value Value to set for the multiFactorSignIns property.
     */
    public void setMultiFactorSignIns(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("multiFactorSignIns", value);
    }
    /**
     * Sets the singleFactorSignIns property value. The total number of non-MFA sign ins for the given day.
     * @param value Value to set for the singleFactorSignIns property.
     */
    public void setSingleFactorSignIns(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("singleFactorSignIns", value);
    }
    /**
     * Sets the totalSignIns property value. The total number of sign-ins for the given day.
     * @param value Value to set for the totalSignIns property.
     */
    public void setTotalSignIns(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalSignIns", value);
    }
}
