package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Per-user singleton tracking identity verification state and bounded event history.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityVerificationStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityVerificationStatus} and sets the default values.
     */
    public IdentityVerificationStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityVerificationStatus}
     */
    @jakarta.annotation.Nonnull
    public static IdentityVerificationStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityVerificationStatus();
    }
    /**
     * Gets the expiryDateTime property value. The effective expiry of the user&apos;s overall verified state, computed as the latest expiresDateTime across active verification events. null when no active event has an expiry. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiryDateTime() {
        return this.backingStore.get("expiryDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expiryDateTime", (n) -> { this.setExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastVerifiedDateTime", (n) -> { this.setLastVerifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(VerificationState::forValue)); });
        deserializerMap.put("verificationEvents", (n) -> { this.setVerificationEvents(n.getCollectionOfObjectValues(IdentityVerificationEvent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastVerifiedDateTime property value. The date and time of the most recent successful identity verification. null when state is unverified. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastVerifiedDateTime() {
        return this.backingStore.get("lastVerifiedDateTime");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link VerificationState}
     */
    @jakarta.annotation.Nullable
    public VerificationState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the verificationEvents property value. The user&apos;s recent verification events, automatically included when the status is retrieved. Contains up to 10 events, ordered by recency. Older events are removed when the limit is reached.
     * @return a {@link java.util.List<IdentityVerificationEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityVerificationEvent> getVerificationEvents() {
        return this.backingStore.get("verificationEvents");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("verificationEvents", this.getVerificationEvents());
    }
    /**
     * Sets the expiryDateTime property value. The effective expiry of the user&apos;s overall verified state, computed as the latest expiresDateTime across active verification events. null when no active event has an expiry. Read-only.
     * @param value Value to set for the expiryDateTime property.
     */
    public void setExpiryDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expiryDateTime", value);
    }
    /**
     * Sets the lastVerifiedDateTime property value. The date and time of the most recent successful identity verification. null when state is unverified. Read-only.
     * @param value Value to set for the lastVerifiedDateTime property.
     */
    public void setLastVerifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastVerifiedDateTime", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final VerificationState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the verificationEvents property value. The user&apos;s recent verification events, automatically included when the status is retrieved. Contains up to 10 events, ordered by recency. Older events are removed when the limit is reached.
     * @param value Value to set for the verificationEvents property.
     */
    public void setVerificationEvents(@jakarta.annotation.Nullable final java.util.List<IdentityVerificationEvent> value) {
        this.backingStore.set("verificationEvents", value);
    }
}
