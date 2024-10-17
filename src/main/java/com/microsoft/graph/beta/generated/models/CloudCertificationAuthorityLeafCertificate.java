package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents a leaf certificate issued by a cloud certification authority.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudCertificationAuthorityLeafCertificate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudCertificationAuthorityLeafCertificate} and sets the default values.
     */
    public CloudCertificationAuthorityLeafCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudCertificationAuthorityLeafCertificate}
     */
    @jakarta.annotation.Nonnull
    public static CloudCertificationAuthorityLeafCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudCertificationAuthorityLeafCertificate();
    }
    /**
     * Gets the certificateStatus property value. Enum type of possible leaf certificate statuses. These statuses indicate whether certificates are active and usable or unusable if they have been revoked or expired.
     * @return a {@link CloudCertificationAuthorityLeafCertificateStatus}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityLeafCertificateStatus getCertificateStatus() {
        return this.backingStore.get("certificateStatus");
    }
    /**
     * Gets the certificationAuthorityIssuerUri property value. The URI of the certification authority that issued the certificate. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificationAuthorityIssuerUri() {
        return this.backingStore.get("certificationAuthorityIssuerUri");
    }
    /**
     * Gets the crlDistributionPointUrl property value. URL to find the relevant Certificate Revocation List for this certificate. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCrlDistributionPointUrl() {
        return this.backingStore.get("crlDistributionPointUrl");
    }
    /**
     * Gets the deviceId property value. The unique identifier of the managed device for which the certificate was created. This ID is assigned at device enrollment time. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. Name of the device for which the certificate was created. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the devicePlatform property value. The platform of the device for which the certificate was created. Possible values are: Android, AndroidForWork, iOS, MacOS, WindowsPhone81, Windows81AndLater, Windows10AndLater, AndroidWorkProfile, Unknown, AndroidAOSP, AndroidMobileApplicationManagement, iOSMobileApplicationManagement. Default value: Unknown. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDevicePlatform() {
        return this.backingStore.get("devicePlatform");
    }
    /**
     * Gets the extendedKeyUsages property value. Certificate extensions that further define the purpose of the public key contained in a certificate. Data is formatted as a comma-separated list of object identifiers (OID). For example a possible value is '1.3.6.1.5.5.7.3.2'. Read-only. Nullable.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExtendedKeyUsages() {
        return this.backingStore.get("extendedKeyUsages");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateStatus", (n) -> { this.setCertificateStatus(n.getEnumValue(CloudCertificationAuthorityLeafCertificateStatus::forValue)); });
        deserializerMap.put("certificationAuthorityIssuerUri", (n) -> { this.setCertificationAuthorityIssuerUri(n.getStringValue()); });
        deserializerMap.put("crlDistributionPointUrl", (n) -> { this.setCrlDistributionPointUrl(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("devicePlatform", (n) -> { this.setDevicePlatform(n.getStringValue()); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("issuerId", (n) -> { this.setIssuerId(n.getStringValue()); });
        deserializerMap.put("issuerName", (n) -> { this.setIssuerName(n.getStringValue()); });
        deserializerMap.put("keyUsages", (n) -> { this.setKeyUsages(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ocspResponderUri", (n) -> { this.setOcspResponderUri(n.getStringValue()); });
        deserializerMap.put("revocationDateTime", (n) -> { this.setRevocationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("subjectName", (n) -> { this.setSubjectName(n.getStringValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("validityEndDateTime", (n) -> { this.setValidityEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("validityStartDateTime", (n) -> { this.setValidityStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuerId property value. The globally unique identifier of the certification authority that issued the leaf certificate. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerId() {
        return this.backingStore.get("issuerId");
    }
    /**
     * Gets the issuerName property value. The name of the certification authority that issued the leaf certificate. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerName() {
        return this.backingStore.get("issuerName");
    }
    /**
     * Gets the keyUsages property value. Certificate extensions that define the purpose of the public key contained in a certificate. For example possible values are 'Key Encipherment' and 'Digital Signature'. Read-only. Nullable.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKeyUsages() {
        return this.backingStore.get("keyUsages");
    }
    /**
     * Gets the ocspResponderUri property value. The Online Certificate Status Protocol (OCSP) responder URI that can be used to determine certificate status. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOcspResponderUri() {
        return this.backingStore.get("ocspResponderUri");
    }
    /**
     * Gets the revocationDateTime property value. The date and time a certificate was revoked. If the certificate was not revoked, this will be null. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRevocationDateTime() {
        return this.backingStore.get("revocationDateTime");
    }
    /**
     * Gets the serialNumber property value. The serial number used to uniquely identify a certificate with its issuing certification authority. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the subjectName property value. The subject name of the certificate. The subject is the target or intended beneficiary of the security being provided, such as a user or device. Read-only. Supports $select and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectName() {
        return this.backingStore.get("subjectName");
    }
    /**
     * Gets the thumbprint property value. Secure Hash Algorithm 1 digest of the certificate that can be used to identify it. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbprint() {
        return this.backingStore.get("thumbprint");
    }
    /**
     * Gets the userId property value. The unique identifier of the user for which the certificate was created. Null for userless devices. This is an Intune user ID. Nullable. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. User principal name of the user for which the certificate was created. Null for userless devices. Nullable. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the validityEndDateTime property value. The end date time of the validity period of a certificate. Certificates cannot be used after this date time as they are longer valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Nullable. Read-only. Supports $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getValidityEndDateTime() {
        return this.backingStore.get("validityEndDateTime");
    }
    /**
     * Gets the validityStartDateTime property value. The start date time of the validity period of a certificate. Certificates cannot be used before this date time as they are not yet valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Nullable. Read-only. Supports $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getValidityStartDateTime() {
        return this.backingStore.get("validityStartDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateStatus", this.getCertificateStatus());
        writer.writeStringValue("certificationAuthorityIssuerUri", this.getCertificationAuthorityIssuerUri());
        writer.writeStringValue("crlDistributionPointUrl", this.getCrlDistributionPointUrl());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("devicePlatform", this.getDevicePlatform());
        writer.writeCollectionOfPrimitiveValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeStringValue("issuerId", this.getIssuerId());
        writer.writeStringValue("issuerName", this.getIssuerName());
        writer.writeCollectionOfPrimitiveValues("keyUsages", this.getKeyUsages());
        writer.writeStringValue("ocspResponderUri", this.getOcspResponderUri());
        writer.writeOffsetDateTimeValue("revocationDateTime", this.getRevocationDateTime());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("subjectName", this.getSubjectName());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeOffsetDateTimeValue("validityEndDateTime", this.getValidityEndDateTime());
        writer.writeOffsetDateTimeValue("validityStartDateTime", this.getValidityStartDateTime());
    }
    /**
     * Sets the certificateStatus property value. Enum type of possible leaf certificate statuses. These statuses indicate whether certificates are active and usable or unusable if they have been revoked or expired.
     * @param value Value to set for the certificateStatus property.
     */
    public void setCertificateStatus(@jakarta.annotation.Nullable final CloudCertificationAuthorityLeafCertificateStatus value) {
        this.backingStore.set("certificateStatus", value);
    }
    /**
     * Sets the certificationAuthorityIssuerUri property value. The URI of the certification authority that issued the certificate. Read-only.
     * @param value Value to set for the certificationAuthorityIssuerUri property.
     */
    public void setCertificationAuthorityIssuerUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificationAuthorityIssuerUri", value);
    }
    /**
     * Sets the crlDistributionPointUrl property value. URL to find the relevant Certificate Revocation List for this certificate. Read-only.
     * @param value Value to set for the crlDistributionPointUrl property.
     */
    public void setCrlDistributionPointUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("crlDistributionPointUrl", value);
    }
    /**
     * Sets the deviceId property value. The unique identifier of the managed device for which the certificate was created. This ID is assigned at device enrollment time. Read-only. Supports $select.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. Name of the device for which the certificate was created. Read-only. Supports $select.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the devicePlatform property value. The platform of the device for which the certificate was created. Possible values are: Android, AndroidForWork, iOS, MacOS, WindowsPhone81, Windows81AndLater, Windows10AndLater, AndroidWorkProfile, Unknown, AndroidAOSP, AndroidMobileApplicationManagement, iOSMobileApplicationManagement. Default value: Unknown. Read-only. Supports $select.
     * @param value Value to set for the devicePlatform property.
     */
    public void setDevicePlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("devicePlatform", value);
    }
    /**
     * Sets the extendedKeyUsages property value. Certificate extensions that further define the purpose of the public key contained in a certificate. Data is formatted as a comma-separated list of object identifiers (OID). For example a possible value is '1.3.6.1.5.5.7.3.2'. Read-only. Nullable.
     * @param value Value to set for the extendedKeyUsages property.
     */
    public void setExtendedKeyUsages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("extendedKeyUsages", value);
    }
    /**
     * Sets the issuerId property value. The globally unique identifier of the certification authority that issued the leaf certificate. Read-only.
     * @param value Value to set for the issuerId property.
     */
    public void setIssuerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuerId", value);
    }
    /**
     * Sets the issuerName property value. The name of the certification authority that issued the leaf certificate. Read-only.
     * @param value Value to set for the issuerName property.
     */
    public void setIssuerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuerName", value);
    }
    /**
     * Sets the keyUsages property value. Certificate extensions that define the purpose of the public key contained in a certificate. For example possible values are 'Key Encipherment' and 'Digital Signature'. Read-only. Nullable.
     * @param value Value to set for the keyUsages property.
     */
    public void setKeyUsages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("keyUsages", value);
    }
    /**
     * Sets the ocspResponderUri property value. The Online Certificate Status Protocol (OCSP) responder URI that can be used to determine certificate status. Read-only.
     * @param value Value to set for the ocspResponderUri property.
     */
    public void setOcspResponderUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ocspResponderUri", value);
    }
    /**
     * Sets the revocationDateTime property value. The date and time a certificate was revoked. If the certificate was not revoked, this will be null. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Nullable. Read-only.
     * @param value Value to set for the revocationDateTime property.
     */
    public void setRevocationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("revocationDateTime", value);
    }
    /**
     * Sets the serialNumber property value. The serial number used to uniquely identify a certificate with its issuing certification authority. Read-only. Supports $select.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the subjectName property value. The subject name of the certificate. The subject is the target or intended beneficiary of the security being provided, such as a user or device. Read-only. Supports $select and $orderby.
     * @param value Value to set for the subjectName property.
     */
    public void setSubjectName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectName", value);
    }
    /**
     * Sets the thumbprint property value. Secure Hash Algorithm 1 digest of the certificate that can be used to identify it. Read-only. Supports $select.
     * @param value Value to set for the thumbprint property.
     */
    public void setThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbprint", value);
    }
    /**
     * Sets the userId property value. The unique identifier of the user for which the certificate was created. Null for userless devices. This is an Intune user ID. Nullable. Read-only. Supports $select.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. User principal name of the user for which the certificate was created. Null for userless devices. Nullable. Read-only. Supports $select.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the validityEndDateTime property value. The end date time of the validity period of a certificate. Certificates cannot be used after this date time as they are longer valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Nullable. Read-only. Supports $orderby.
     * @param value Value to set for the validityEndDateTime property.
     */
    public void setValidityEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("validityEndDateTime", value);
    }
    /**
     * Sets the validityStartDateTime property value. The start date time of the validity period of a certificate. Certificates cannot be used before this date time as they are not yet valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Nullable. Read-only. Supports $orderby.
     * @param value Value to set for the validityStartDateTime property.
     */
    public void setValidityStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("validityStartDateTime", value);
    }
}
