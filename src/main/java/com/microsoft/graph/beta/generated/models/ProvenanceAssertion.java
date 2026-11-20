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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvenanceAssertion implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ProvenanceAssertion} and sets the default values.
     */
    public ProvenanceAssertion() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProvenanceAssertion}
     */
    @jakarta.annotation.Nonnull
    public static ProvenanceAssertion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvenanceAssertion();
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
     * Gets the attestationReason property value. The reason supplied for a manual attestation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttestationReason() {
        return this.backingStore.get("attestationReason");
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
     * Gets the eventDateTime property value. The date and time of the provenance event represented by this assertion.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("attestationReason", (n) -> { this.setAttestationReason(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("provenanceType", (n) -> { this.setProvenanceType(n.getEnumValue(ProvenanceAssertionType::forValue)); });
        deserializerMap.put("sourceCredentialId", (n) -> { this.setSourceCredentialId(n.getStringValue()); });
        deserializerMap.put("sourceCredentialType", (n) -> { this.setSourceCredentialType(n.getStringValue()); });
        deserializerMap.put("verificationEventId", (n) -> { this.setVerificationEventId(n.getStringValue()); });
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
     * Gets the provenanceType property value. The provenanceType property
     * @return a {@link ProvenanceAssertionType}
     */
    @jakarta.annotation.Nullable
    public ProvenanceAssertionType getProvenanceType() {
        return this.backingStore.get("provenanceType");
    }
    /**
     * Gets the sourceCredentialId property value. The identifier of the credential from which this credential was derived.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceCredentialId() {
        return this.backingStore.get("sourceCredentialId");
    }
    /**
     * Gets the sourceCredentialType property value. The type of credential from which this credential was derived.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceCredentialType() {
        return this.backingStore.get("sourceCredentialType");
    }
    /**
     * Gets the verificationEventId property value. The identifier of the identityVerificationEvent that supports this assertion.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerificationEventId() {
        return this.backingStore.get("verificationEventId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("attestationReason", this.getAttestationReason());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("provenanceType", this.getProvenanceType());
        writer.writeStringValue("sourceCredentialId", this.getSourceCredentialId());
        writer.writeStringValue("sourceCredentialType", this.getSourceCredentialType());
        writer.writeStringValue("verificationEventId", this.getVerificationEventId());
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
     * Sets the attestationReason property value. The reason supplied for a manual attestation.
     * @param value Value to set for the attestationReason property.
     */
    public void setAttestationReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attestationReason", value);
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
     * Sets the eventDateTime property value. The date and time of the provenance event represented by this assertion.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the provenanceType property value. The provenanceType property
     * @param value Value to set for the provenanceType property.
     */
    public void setProvenanceType(@jakarta.annotation.Nullable final ProvenanceAssertionType value) {
        this.backingStore.set("provenanceType", value);
    }
    /**
     * Sets the sourceCredentialId property value. The identifier of the credential from which this credential was derived.
     * @param value Value to set for the sourceCredentialId property.
     */
    public void setSourceCredentialId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceCredentialId", value);
    }
    /**
     * Sets the sourceCredentialType property value. The type of credential from which this credential was derived.
     * @param value Value to set for the sourceCredentialType property.
     */
    public void setSourceCredentialType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceCredentialType", value);
    }
    /**
     * Sets the verificationEventId property value. The identifier of the identityVerificationEvent that supports this assertion.
     * @param value Value to set for the verificationEventId property.
     */
    public void setVerificationEventId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verificationEventId", value);
    }
}
