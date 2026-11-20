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
 * Verification details for an identity verification event, including the provider and temporal metadata.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerificationEventDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VerificationEventDetail} and sets the default values.
     */
    public VerificationEventDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerificationEventDetail}
     */
    @jakarta.annotation.Nonnull
    public static VerificationEventDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerificationEventDetail();
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
     * Gets the expiresDateTime property value. The date and time when this verification expires, in ISO 8601 format. Must be after verifiedDateTime. Compare this value with the current time to determine expiry. Immutable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresDateTime() {
        return this.backingStore.get("expiresDateTime");
    }
    /**
     * Gets the externalCredentialId property value. The unique credential reference in URN format, such as urn:pic:73b78a00-5b9e-4f8c-85dd-b60a08dc1123. Used for deduplication so repeated presentation of the same credential produces one event. Maximum 256 characters. Immutable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalCredentialId() {
        return this.backingStore.get("externalCredentialId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("expiresDateTime", (n) -> { this.setExpiresDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalCredentialId", (n) -> { this.setExternalCredentialId(n.getStringValue()); });
        deserializerMap.put("issuedDateTime", (n) -> { this.setIssuedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(VerificationState::forValue)); });
        deserializerMap.put("verifiedDateTime", (n) -> { this.setVerifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("verifiedIdProfileId", (n) -> { this.setVerifiedIdProfileId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuedDateTime property value. The date and time when the provider issued the underlying credential, in ISO 8601 format. Must not be in the future. Distinct from verifiedDateTime. Immutable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIssuedDateTime() {
        return this.backingStore.get("issuedDateTime");
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
     * Gets the source property value. The verification provider or attestation authority, such as Contoso Identity Services. May be null when state is issued. Maximum 200 characters. Immutable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.backingStore.get("source");
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
     * Gets the verifiedDateTime property value. The date and time when identity verification was performed, in ISO 8601 format. Must not be in the future. May be null when state is issued. Immutable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getVerifiedDateTime() {
        return this.backingStore.get("verifiedDateTime");
    }
    /**
     * Gets the verifiedIdProfileId property value. The identifier of the verified identity profile in the provider&apos;s system, in UUID format. Immutable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerifiedIdProfileId() {
        return this.backingStore.get("verifiedIdProfileId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expiresDateTime", this.getExpiresDateTime());
        writer.writeStringValue("externalCredentialId", this.getExternalCredentialId());
        writer.writeOffsetDateTimeValue("issuedDateTime", this.getIssuedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("source", this.getSource());
        writer.writeEnumValue("state", this.getState());
        writer.writeOffsetDateTimeValue("verifiedDateTime", this.getVerifiedDateTime());
        writer.writeStringValue("verifiedIdProfileId", this.getVerifiedIdProfileId());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the expiresDateTime property value. The date and time when this verification expires, in ISO 8601 format. Must be after verifiedDateTime. Compare this value with the current time to determine expiry. Immutable.
     * @param value Value to set for the expiresDateTime property.
     */
    public void setExpiresDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expiresDateTime", value);
    }
    /**
     * Sets the externalCredentialId property value. The unique credential reference in URN format, such as urn:pic:73b78a00-5b9e-4f8c-85dd-b60a08dc1123. Used for deduplication so repeated presentation of the same credential produces one event. Maximum 256 characters. Immutable.
     * @param value Value to set for the externalCredentialId property.
     */
    public void setExternalCredentialId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalCredentialId", value);
    }
    /**
     * Sets the issuedDateTime property value. The date and time when the provider issued the underlying credential, in ISO 8601 format. Must not be in the future. Distinct from verifiedDateTime. Immutable.
     * @param value Value to set for the issuedDateTime property.
     */
    public void setIssuedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("issuedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the source property value. The verification provider or attestation authority, such as Contoso Identity Services. May be null when state is issued. Maximum 200 characters. Immutable.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final VerificationState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the verifiedDateTime property value. The date and time when identity verification was performed, in ISO 8601 format. Must not be in the future. May be null when state is issued. Immutable.
     * @param value Value to set for the verifiedDateTime property.
     */
    public void setVerifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("verifiedDateTime", value);
    }
    /**
     * Sets the verifiedIdProfileId property value. The identifier of the verified identity profile in the provider&apos;s system, in UUID format. Immutable.
     * @param value Value to set for the verifiedIdProfileId property.
     */
    public void setVerifiedIdProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verifiedIdProfileId", value);
    }
}
