package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A single identity verification event with its verification, lifecycle, and optional override details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityVerificationEvent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityVerificationEvent} and sets the default values.
     */
    public IdentityVerificationEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityVerificationEvent}
     */
    @jakarta.annotation.Nonnull
    public static IdentityVerificationEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityVerificationEvent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lifecycle", (n) -> { this.setLifecycle(n.getObjectValue(VerificationEventLifecycle::createFromDiscriminatorValue)); });
        deserializerMap.put("overrideDetails", (n) -> { this.setOverrideDetails(n.getObjectValue(VerificationEventOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("verification", (n) -> { this.setVerification(n.getObjectValue(VerificationEventDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycle property value. The source and current lifecycle state of the event.
     * @return a {@link VerificationEventLifecycle}
     */
    @jakarta.annotation.Nullable
    public VerificationEventLifecycle getLifecycle() {
        return this.backingStore.get("lifecycle");
    }
    /**
     * Gets the overrideDetails property value. The administrative or programmatic override applied to the event. null when no override was applied.
     * @return a {@link VerificationEventOverride}
     */
    @jakarta.annotation.Nullable
    public VerificationEventOverride getOverrideDetails() {
        return this.backingStore.get("overrideDetails");
    }
    /**
     * Gets the verification property value. The verification state, provider, credential identifiers, and timestamps.
     * @return a {@link VerificationEventDetail}
     */
    @jakarta.annotation.Nullable
    public VerificationEventDetail getVerification() {
        return this.backingStore.get("verification");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("lifecycle", this.getLifecycle());
        writer.writeObjectValue("overrideDetails", this.getOverrideDetails());
        writer.writeObjectValue("verification", this.getVerification());
    }
    /**
     * Sets the lifecycle property value. The source and current lifecycle state of the event.
     * @param value Value to set for the lifecycle property.
     */
    public void setLifecycle(@jakarta.annotation.Nullable final VerificationEventLifecycle value) {
        this.backingStore.set("lifecycle", value);
    }
    /**
     * Sets the overrideDetails property value. The administrative or programmatic override applied to the event. null when no override was applied.
     * @param value Value to set for the overrideDetails property.
     */
    public void setOverrideDetails(@jakarta.annotation.Nullable final VerificationEventOverride value) {
        this.backingStore.set("overrideDetails", value);
    }
    /**
     * Sets the verification property value. The verification state, provider, credential identifiers, and timestamps.
     * @param value Value to set for the verification property.
     */
    public void setVerification(@jakarta.annotation.Nullable final VerificationEventDetail value) {
        this.backingStore.set("verification", value);
    }
}
