package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAllDeviceCertificateState extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedAllDeviceCertificateState and sets the default values.
     */
    public ManagedAllDeviceCertificateState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedAllDeviceCertificateState
     */
    @jakarta.annotation.Nonnull
    public static ManagedAllDeviceCertificateState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAllDeviceCertificateState();
    }
    /**
     * Gets the certificateExpirationDateTime property value. Certificate expiry date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateExpirationDateTime() {
        return this.backingStore.get("certificateExpirationDateTime");
    }
    /**
     * Gets the certificateExtendedKeyUsages property value. Enhanced Key Usage
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateExtendedKeyUsages() {
        return this.backingStore.get("certificateExtendedKeyUsages");
    }
    /**
     * Gets the certificateIssuanceDateTime property value. Issuance date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateIssuanceDateTime() {
        return this.backingStore.get("certificateIssuanceDateTime");
    }
    /**
     * Gets the certificateIssuerName property value. Issuer
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateIssuerName() {
        return this.backingStore.get("certificateIssuerName");
    }
    /**
     * Gets the certificateKeyUsages property value. Key Usage
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateKeyUsages() {
        return this.backingStore.get("certificateKeyUsages");
    }
    /**
     * Gets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @return a CertificateRevocationStatus
     */
    @jakarta.annotation.Nullable
    public CertificateRevocationStatus getCertificateRevokeStatus() {
        return this.backingStore.get("certificateRevokeStatus");
    }
    /**
     * Gets the certificateRevokeStatusLastChangeDateTime property value. The time the revoke status was last changed
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateRevokeStatusLastChangeDateTime() {
        return this.backingStore.get("certificateRevokeStatusLastChangeDateTime");
    }
    /**
     * Gets the certificateSerialNumber property value. Serial number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this.backingStore.get("certificateSerialNumber");
    }
    /**
     * Gets the certificateSubjectName property value. Certificate subject name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateSubjectName() {
        return this.backingStore.get("certificateSubjectName");
    }
    /**
     * Gets the certificateThumbprint property value. Thumbprint
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateThumbprint() {
        return this.backingStore.get("certificateThumbprint");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateExpirationDateTime", (n) -> { this.setCertificateExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateExtendedKeyUsages", (n) -> { this.setCertificateExtendedKeyUsages(n.getStringValue()); });
        deserializerMap.put("certificateIssuanceDateTime", (n) -> { this.setCertificateIssuanceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateIssuerName", (n) -> { this.setCertificateIssuerName(n.getStringValue()); });
        deserializerMap.put("certificateKeyUsages", (n) -> { this.setCertificateKeyUsages(n.getIntegerValue()); });
        deserializerMap.put("certificateRevokeStatus", (n) -> { this.setCertificateRevokeStatus(n.getEnumValue(CertificateRevocationStatus::forValue)); });
        deserializerMap.put("certificateRevokeStatusLastChangeDateTime", (n) -> { this.setCertificateRevokeStatusLastChangeDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateSerialNumber", (n) -> { this.setCertificateSerialNumber(n.getStringValue()); });
        deserializerMap.put("certificateSubjectName", (n) -> { this.setCertificateSubjectName(n.getStringValue()); });
        deserializerMap.put("certificateThumbprint", (n) -> { this.setCertificateThumbprint(n.getStringValue()); });
        deserializerMap.put("managedDeviceDisplayName", (n) -> { this.setManagedDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceDisplayName property value. Device display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceDisplayName() {
        return this.backingStore.get("managedDeviceDisplayName");
    }
    /**
     * Gets the userPrincipalName property value. User principal name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("certificateExpirationDateTime", this.getCertificateExpirationDateTime());
        writer.writeStringValue("certificateExtendedKeyUsages", this.getCertificateExtendedKeyUsages());
        writer.writeOffsetDateTimeValue("certificateIssuanceDateTime", this.getCertificateIssuanceDateTime());
        writer.writeStringValue("certificateIssuerName", this.getCertificateIssuerName());
        writer.writeIntegerValue("certificateKeyUsages", this.getCertificateKeyUsages());
        writer.writeEnumValue("certificateRevokeStatus", this.getCertificateRevokeStatus());
        writer.writeOffsetDateTimeValue("certificateRevokeStatusLastChangeDateTime", this.getCertificateRevokeStatusLastChangeDateTime());
        writer.writeStringValue("certificateSerialNumber", this.getCertificateSerialNumber());
        writer.writeStringValue("certificateSubjectName", this.getCertificateSubjectName());
        writer.writeStringValue("certificateThumbprint", this.getCertificateThumbprint());
        writer.writeStringValue("managedDeviceDisplayName", this.getManagedDeviceDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the certificateExpirationDateTime property value. Certificate expiry date
     * @param value Value to set for the certificateExpirationDateTime property.
     */
    public void setCertificateExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("certificateExpirationDateTime", value);
    }
    /**
     * Sets the certificateExtendedKeyUsages property value. Enhanced Key Usage
     * @param value Value to set for the certificateExtendedKeyUsages property.
     */
    public void setCertificateExtendedKeyUsages(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateExtendedKeyUsages", value);
    }
    /**
     * Sets the certificateIssuanceDateTime property value. Issuance date
     * @param value Value to set for the certificateIssuanceDateTime property.
     */
    public void setCertificateIssuanceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("certificateIssuanceDateTime", value);
    }
    /**
     * Sets the certificateIssuerName property value. Issuer
     * @param value Value to set for the certificateIssuerName property.
     */
    public void setCertificateIssuerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateIssuerName", value);
    }
    /**
     * Sets the certificateKeyUsages property value. Key Usage
     * @param value Value to set for the certificateKeyUsages property.
     */
    public void setCertificateKeyUsages(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("certificateKeyUsages", value);
    }
    /**
     * Sets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @param value Value to set for the certificateRevokeStatus property.
     */
    public void setCertificateRevokeStatus(@jakarta.annotation.Nullable final CertificateRevocationStatus value) {
        this.backingStore.set("certificateRevokeStatus", value);
    }
    /**
     * Sets the certificateRevokeStatusLastChangeDateTime property value. The time the revoke status was last changed
     * @param value Value to set for the certificateRevokeStatusLastChangeDateTime property.
     */
    public void setCertificateRevokeStatusLastChangeDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("certificateRevokeStatusLastChangeDateTime", value);
    }
    /**
     * Sets the certificateSerialNumber property value. Serial number
     * @param value Value to set for the certificateSerialNumber property.
     */
    public void setCertificateSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSerialNumber", value);
    }
    /**
     * Sets the certificateSubjectName property value. Certificate subject name
     * @param value Value to set for the certificateSubjectName property.
     */
    public void setCertificateSubjectName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSubjectName", value);
    }
    /**
     * Sets the certificateThumbprint property value. Thumbprint
     * @param value Value to set for the certificateThumbprint property.
     */
    public void setCertificateThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateThumbprint", value);
    }
    /**
     * Sets the managedDeviceDisplayName property value. Device display name
     * @param value Value to set for the managedDeviceDisplayName property.
     */
    public void setManagedDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceDisplayName", value);
    }
    /**
     * Sets the userPrincipalName property value. User principal name
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
