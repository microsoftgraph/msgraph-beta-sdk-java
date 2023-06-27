package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAllDeviceCertificateState extends Entity implements Parsable {
    /**
     * Certificate expiry date
     */
    private OffsetDateTime certificateExpirationDateTime;
    /**
     * Enhanced Key Usage
     */
    private String certificateExtendedKeyUsages;
    /**
     * Issuance date
     */
    private OffsetDateTime certificateIssuanceDateTime;
    /**
     * Issuer
     */
    private String certificateIssuerName;
    /**
     * Key Usage
     */
    private Integer certificateKeyUsages;
    /**
     * Certificate Revocation Status.
     */
    private CertificateRevocationStatus certificateRevokeStatus;
    /**
     * The time the revoke status was last changed
     */
    private OffsetDateTime certificateRevokeStatusLastChangeDateTime;
    /**
     * Serial number
     */
    private String certificateSerialNumber;
    /**
     * Certificate subject name
     */
    private String certificateSubjectName;
    /**
     * Thumbprint
     */
    private String certificateThumbprint;
    /**
     * Device display name
     */
    private String managedDeviceDisplayName;
    /**
     * User principal name
     */
    private String userPrincipalName;
    /**
     * Instantiates a new ManagedAllDeviceCertificateState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAllDeviceCertificateState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedAllDeviceCertificateState
     */
    @javax.annotation.Nonnull
    public static ManagedAllDeviceCertificateState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAllDeviceCertificateState();
    }
    /**
     * Gets the certificateExpirationDateTime property value. Certificate expiry date
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateExpirationDateTime() {
        return this.certificateExpirationDateTime;
    }
    /**
     * Gets the certificateExtendedKeyUsages property value. Enhanced Key Usage
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateExtendedKeyUsages() {
        return this.certificateExtendedKeyUsages;
    }
    /**
     * Gets the certificateIssuanceDateTime property value. Issuance date
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateIssuanceDateTime() {
        return this.certificateIssuanceDateTime;
    }
    /**
     * Gets the certificateIssuerName property value. Issuer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateIssuerName() {
        return this.certificateIssuerName;
    }
    /**
     * Gets the certificateKeyUsages property value. Key Usage
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateKeyUsages() {
        return this.certificateKeyUsages;
    }
    /**
     * Gets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @return a CertificateRevocationStatus
     */
    @javax.annotation.Nullable
    public CertificateRevocationStatus getCertificateRevokeStatus() {
        return this.certificateRevokeStatus;
    }
    /**
     * Gets the certificateRevokeStatusLastChangeDateTime property value. The time the revoke status was last changed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateRevokeStatusLastChangeDateTime() {
        return this.certificateRevokeStatusLastChangeDateTime;
    }
    /**
     * Gets the certificateSerialNumber property value. Serial number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }
    /**
     * Gets the certificateSubjectName property value. Certificate subject name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSubjectName() {
        return this.certificateSubjectName;
    }
    /**
     * Gets the certificateThumbprint property value. Thumbprint
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateThumbprint() {
        return this.certificateThumbprint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateExpirationDateTime", (n) -> { this.setCertificateExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateExtendedKeyUsages", (n) -> { this.setCertificateExtendedKeyUsages(n.getStringValue()); });
        deserializerMap.put("certificateIssuanceDateTime", (n) -> { this.setCertificateIssuanceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateIssuerName", (n) -> { this.setCertificateIssuerName(n.getStringValue()); });
        deserializerMap.put("certificateKeyUsages", (n) -> { this.setCertificateKeyUsages(n.getIntegerValue()); });
        deserializerMap.put("certificateRevokeStatus", (n) -> { this.setCertificateRevokeStatus(n.getEnumValue(CertificateRevocationStatus.class)); });
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceDisplayName() {
        return this.managedDeviceDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. User principal name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.certificateExpirationDateTime = value;
    }
    /**
     * Sets the certificateExtendedKeyUsages property value. Enhanced Key Usage
     * @param value Value to set for the certificateExtendedKeyUsages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateExtendedKeyUsages(@javax.annotation.Nullable final String value) {
        this.certificateExtendedKeyUsages = value;
    }
    /**
     * Sets the certificateIssuanceDateTime property value. Issuance date
     * @param value Value to set for the certificateIssuanceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateIssuanceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.certificateIssuanceDateTime = value;
    }
    /**
     * Sets the certificateIssuerName property value. Issuer
     * @param value Value to set for the certificateIssuerName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateIssuerName(@javax.annotation.Nullable final String value) {
        this.certificateIssuerName = value;
    }
    /**
     * Sets the certificateKeyUsages property value. Key Usage
     * @param value Value to set for the certificateKeyUsages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateKeyUsages(@javax.annotation.Nullable final Integer value) {
        this.certificateKeyUsages = value;
    }
    /**
     * Sets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @param value Value to set for the certificateRevokeStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateRevokeStatus(@javax.annotation.Nullable final CertificateRevocationStatus value) {
        this.certificateRevokeStatus = value;
    }
    /**
     * Sets the certificateRevokeStatusLastChangeDateTime property value. The time the revoke status was last changed
     * @param value Value to set for the certificateRevokeStatusLastChangeDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateRevokeStatusLastChangeDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.certificateRevokeStatusLastChangeDateTime = value;
    }
    /**
     * Sets the certificateSerialNumber property value. Serial number
     * @param value Value to set for the certificateSerialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSerialNumber(@javax.annotation.Nullable final String value) {
        this.certificateSerialNumber = value;
    }
    /**
     * Sets the certificateSubjectName property value. Certificate subject name
     * @param value Value to set for the certificateSubjectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSubjectName(@javax.annotation.Nullable final String value) {
        this.certificateSubjectName = value;
    }
    /**
     * Sets the certificateThumbprint property value. Thumbprint
     * @param value Value to set for the certificateThumbprint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateThumbprint(@javax.annotation.Nullable final String value) {
        this.certificateThumbprint = value;
    }
    /**
     * Sets the managedDeviceDisplayName property value. Device display name
     * @param value Value to set for the managedDeviceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this.managedDeviceDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
