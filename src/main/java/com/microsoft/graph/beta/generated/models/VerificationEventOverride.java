package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Details of an administrative or programmatic override applied to a verification event.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerificationEventOverride implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VerificationEventOverride} and sets the default values.
     */
    public VerificationEventOverride() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerificationEventOverride}
     */
    @jakarta.annotation.Nonnull
    public static VerificationEventOverride createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerificationEventOverride();
    }
    /**
     * Gets the actorId property value. The object ID of the actor who applied the override. Set by the service from the caller&apos;s identity. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorId() {
        return this.backingStore.get("actorId");
    }
    /**
     * Gets the actorType property value. The actorType property
     * @return a {@link VerificationActorType}
     */
    @jakarta.annotation.Nullable
    public VerificationActorType getActorType() {
        return this.backingStore.get("actorType");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("actorId", (n) -> { this.setActorId(n.getStringValue()); });
        deserializerMap.put("actorType", (n) -> { this.setActorType(n.getEnumValue(VerificationActorType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("overriddenDateTime", (n) -> { this.setOverriddenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the overriddenDateTime property value. The date and time when the override was applied. Set by the service. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOverriddenDateTime() {
        return this.backingStore.get("overriddenDateTime");
    }
    /**
     * Gets the reason property value. The explanation for the override, such as In-person identity proofing confirmed by help desk. Maximum 500 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actorType", this.getActorType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("reason", this.getReason());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actorId property value. The object ID of the actor who applied the override. Set by the service from the caller&apos;s identity. Read-only.
     * @param value Value to set for the actorId property.
     */
    public void setActorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actorId", value);
    }
    /**
     * Sets the actorType property value. The actorType property
     * @param value Value to set for the actorType property.
     */
    public void setActorType(@jakarta.annotation.Nullable final VerificationActorType value) {
        this.backingStore.set("actorType", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the overriddenDateTime property value. The date and time when the override was applied. Set by the service. Read-only.
     * @param value Value to set for the overriddenDateTime property.
     */
    public void setOverriddenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("overriddenDateTime", value);
    }
    /**
     * Sets the reason property value. The explanation for the override, such as In-person identity proofing confirmed by help desk. Maximum 500 characters.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reason", value);
    }
}
