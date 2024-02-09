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
public class VerifiedCustomDomainCertificatesMetadata implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VerifiedCustomDomainCertificatesMetadata} and sets the default values.
     */
    public VerifiedCustomDomainCertificatesMetadata() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerifiedCustomDomainCertificatesMetadata}
     */
    @jakarta.annotation.Nonnull
    public static VerifiedCustomDomainCertificatesMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedCustomDomainCertificatesMetadata();
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
     * Gets the expiryDate property value. The expiry date of the custom domain certificate. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiryDate() {
        return this.backingStore.get("expiryDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("expiryDate", (n) -> { this.setExpiryDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issueDate", (n) -> { this.setIssueDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issuerName", (n) -> { this.setIssuerName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("subjectName", (n) -> { this.setSubjectName(n.getStringValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issueDate property value. The issue date of the custom domain. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIssueDate() {
        return this.backingStore.get("issueDate");
    }
    /**
     * Gets the issuerName property value. The issuer name of the custom domain certificate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerName() {
        return this.backingStore.get("issuerName");
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
     * Gets the subjectName property value. The subject name of the custom domain certificate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectName() {
        return this.backingStore.get("subjectName");
    }
    /**
     * Gets the thumbprint property value. The thumbprint associated with the custom domain certificate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbprint() {
        return this.backingStore.get("thumbprint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expiryDate", this.getExpiryDate());
        writer.writeOffsetDateTimeValue("issueDate", this.getIssueDate());
        writer.writeStringValue("issuerName", this.getIssuerName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("subjectName", this.getSubjectName());
        writer.writeStringValue("thumbprint", this.getThumbprint());
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
     * Sets the expiryDate property value. The expiry date of the custom domain certificate. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expiryDate property.
     */
    public void setExpiryDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expiryDate", value);
    }
    /**
     * Sets the issueDate property value. The issue date of the custom domain. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the issueDate property.
     */
    public void setIssueDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("issueDate", value);
    }
    /**
     * Sets the issuerName property value. The issuer name of the custom domain certificate.
     * @param value Value to set for the issuerName property.
     */
    public void setIssuerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuerName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the subjectName property value. The subject name of the custom domain certificate.
     * @param value Value to set for the subjectName property.
     */
    public void setSubjectName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectName", value);
    }
    /**
     * Sets the thumbprint property value. The thumbprint associated with the custom domain certificate.
     * @param value Value to set for the thumbprint property.
     */
    public void setThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbprint", value);
    }
}
