package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents version-specific properties of a cloud certification authority.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudCertificationAuthorityVersion extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudCertificationAuthorityVersion} and sets the default values.
     */
    public CloudCertificationAuthorityVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudCertificationAuthorityVersion}
     */
    @jakarta.annotation.Nonnull
    public static CloudCertificationAuthorityVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudCertificationAuthorityVersion();
    }
    /**
     * Gets the certificateDownloadUrl property value. The URL to download the certification authority certificate. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificateDownloadUrl() {
        return this.backingStore.get("certificateDownloadUrl");
    }
    /**
     * Gets the certificateRevocationListUrl property value. The cloud certification authority&apos;s Certificate Revocation List URL that can be used to determine revocation status. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificateRevocationListUrl() {
        return this.backingStore.get("certificateRevocationListUrl");
    }
    /**
     * Gets the certificateSigningRequest property value. The certificate signing request used to create an issuing certification authority with a root certification authority external to Microsoft Cloud PKI. The based-64 encoded certificate signing request can be downloaded through this property. After downloading the certificate signing request, it must be signed by the external root certifcation authority. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificateSigningRequest() {
        return this.backingStore.get("certificateSigningRequest");
    }
    /**
     * Gets the certificationAuthorityId property value. The certification authority identifier. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificationAuthorityId() {
        return this.backingStore.get("certificationAuthorityId");
    }
    /**
     * Gets the certificationAuthorityIssuerUri property value. The URI of the issuing certification authority of a subordinate certification authority. Returns null if a root certification authority. Nullable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificationAuthorityIssuerUri() {
        return this.backingStore.get("certificationAuthorityIssuerUri");
    }
    /**
     * Gets the certificationAuthorityVersionStatus property value. Enum type of possible certification authority version statuses. These statuses indicate the lifecycle state of a certification authority version, including whether it is currently active, staged for renewal, retired, or in other states.
     * @return a {@link CloudCertificationAuthorityVersionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityVersionStatus getCertificationAuthorityVersionStatus() {
        return this.backingStore.get("certificationAuthorityVersionStatus");
    }
    /**
     * Gets the decommissionDateTime property value. The date and time when the certification authority version is scheduled to be decommissioned. Only applicable for staged certification authority versions. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDecommissionDateTime() {
        return this.backingStore.get("decommissionDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateDownloadUrl", (n) -> { this.setCertificateDownloadUrl(n.getStringValue()); });
        deserializerMap.put("certificateRevocationListUrl", (n) -> { this.setCertificateRevocationListUrl(n.getStringValue()); });
        deserializerMap.put("certificateSigningRequest", (n) -> { this.setCertificateSigningRequest(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityId", (n) -> { this.setCertificationAuthorityId(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityIssuerUri", (n) -> { this.setCertificationAuthorityIssuerUri(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityVersionStatus", (n) -> { this.setCertificationAuthorityVersionStatus(n.getEnumValue(CloudCertificationAuthorityVersionStatus::forValue)); });
        deserializerMap.put("decommissionDateTime", (n) -> { this.setDecommissionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("keyPlatform", (n) -> { this.setKeyPlatform(n.getEnumValue(CloudCertificationAuthorityKeyPlatformType::forValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ocspResponderUri", (n) -> { this.setOcspResponderUri(n.getStringValue()); });
        deserializerMap.put("scepServerUrl", (n) -> { this.setScepServerUrl(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("subjectName", (n) -> { this.setSubjectName(n.getStringValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getObjectValue(CloudCertificationAuthorityVersionUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("validityEndDateTime", (n) -> { this.setValidityEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("validityStartDateTime", (n) -> { this.setValidityStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyPlatform property value. Enum type of possible key platforms used by the certification authority.
     * @return a {@link CloudCertificationAuthorityKeyPlatformType}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityKeyPlatformType getKeyPlatform() {
        return this.backingStore.get("keyPlatform");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification date and time of this certification authority entity instance. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
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
     * Gets the scepServerUrl property value. The SCEP server URL for device SCEP connections to request certificates. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScepServerUrl() {
        return this.backingStore.get("scepServerUrl");
    }
    /**
     * Gets the serialNumber property value. The serial number used to uniquely identify a certificate with its issuing certification authority. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the subjectName property value. The subject name of the certificate. The subject is the target or intended beneficiary of the security being provided, such as a company or government entity. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectName() {
        return this.backingStore.get("subjectName");
    }
    /**
     * Gets the thumbprint property value. Secure Hash Algorithm 1 digest of the certificate that can be used to identify it. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbprint() {
        return this.backingStore.get("thumbprint");
    }
    /**
     * Gets the usage property value. The usage details associated with this certification authority version, including reporting data such as the number of leaf certificates issued during the staged period. Read-only.
     * @return a {@link CloudCertificationAuthorityVersionUsage}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityVersionUsage getUsage() {
        return this.backingStore.get("usage");
    }
    /**
     * Gets the validityEndDateTime property value. The end date time of the validity period of a certification authority certificate. Certificates cannot be used after this date time as they are longer valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getValidityEndDateTime() {
        return this.backingStore.get("validityEndDateTime");
    }
    /**
     * Gets the validityStartDateTime property value. The start date time of the validity period of a certification authority certificate. Certificates cannot be used before this date time as they are not yet valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getValidityStartDateTime() {
        return this.backingStore.get("validityStartDateTime");
    }
    /**
     * Gets the versionNumber property value. The version number assigned to this specific certification authority version entity. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersionNumber() {
        return this.backingStore.get("versionNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificateDownloadUrl", this.getCertificateDownloadUrl());
        writer.writeStringValue("certificateRevocationListUrl", this.getCertificateRevocationListUrl());
        writer.writeStringValue("certificateSigningRequest", this.getCertificateSigningRequest());
        writer.writeStringValue("certificationAuthorityId", this.getCertificationAuthorityId());
        writer.writeStringValue("certificationAuthorityIssuerUri", this.getCertificationAuthorityIssuerUri());
        writer.writeEnumValue("certificationAuthorityVersionStatus", this.getCertificationAuthorityVersionStatus());
        writer.writeOffsetDateTimeValue("decommissionDateTime", this.getDecommissionDateTime());
        writer.writeEnumValue("keyPlatform", this.getKeyPlatform());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("ocspResponderUri", this.getOcspResponderUri());
        writer.writeStringValue("scepServerUrl", this.getScepServerUrl());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("subjectName", this.getSubjectName());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeObjectValue("usage", this.getUsage());
        writer.writeOffsetDateTimeValue("validityEndDateTime", this.getValidityEndDateTime());
        writer.writeOffsetDateTimeValue("validityStartDateTime", this.getValidityStartDateTime());
        writer.writeIntegerValue("versionNumber", this.getVersionNumber());
    }
    /**
     * Sets the certificateDownloadUrl property value. The URL to download the certification authority certificate. Read-only.
     * @param value Value to set for the certificateDownloadUrl property.
     */
    public void setCertificateDownloadUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateDownloadUrl", value);
    }
    /**
     * Sets the certificateRevocationListUrl property value. The cloud certification authority&apos;s Certificate Revocation List URL that can be used to determine revocation status. Read-only.
     * @param value Value to set for the certificateRevocationListUrl property.
     */
    public void setCertificateRevocationListUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateRevocationListUrl", value);
    }
    /**
     * Sets the certificateSigningRequest property value. The certificate signing request used to create an issuing certification authority with a root certification authority external to Microsoft Cloud PKI. The based-64 encoded certificate signing request can be downloaded through this property. After downloading the certificate signing request, it must be signed by the external root certifcation authority. Read-only.
     * @param value Value to set for the certificateSigningRequest property.
     */
    public void setCertificateSigningRequest(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSigningRequest", value);
    }
    /**
     * Sets the certificationAuthorityId property value. The certification authority identifier. Read-only.
     * @param value Value to set for the certificationAuthorityId property.
     */
    public void setCertificationAuthorityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificationAuthorityId", value);
    }
    /**
     * Sets the certificationAuthorityIssuerUri property value. The URI of the issuing certification authority of a subordinate certification authority. Returns null if a root certification authority. Nullable. Read-only.
     * @param value Value to set for the certificationAuthorityIssuerUri property.
     */
    public void setCertificationAuthorityIssuerUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificationAuthorityIssuerUri", value);
    }
    /**
     * Sets the certificationAuthorityVersionStatus property value. Enum type of possible certification authority version statuses. These statuses indicate the lifecycle state of a certification authority version, including whether it is currently active, staged for renewal, retired, or in other states.
     * @param value Value to set for the certificationAuthorityVersionStatus property.
     */
    public void setCertificationAuthorityVersionStatus(@jakarta.annotation.Nullable final CloudCertificationAuthorityVersionStatus value) {
        this.backingStore.set("certificationAuthorityVersionStatus", value);
    }
    /**
     * Sets the decommissionDateTime property value. The date and time when the certification authority version is scheduled to be decommissioned. Only applicable for staged certification authority versions. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @param value Value to set for the decommissionDateTime property.
     */
    public void setDecommissionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("decommissionDateTime", value);
    }
    /**
     * Sets the keyPlatform property value. Enum type of possible key platforms used by the certification authority.
     * @param value Value to set for the keyPlatform property.
     */
    public void setKeyPlatform(@jakarta.annotation.Nullable final CloudCertificationAuthorityKeyPlatformType value) {
        this.backingStore.set("keyPlatform", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification date and time of this certification authority entity instance. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the ocspResponderUri property value. The Online Certificate Status Protocol (OCSP) responder URI that can be used to determine certificate status. Read-only.
     * @param value Value to set for the ocspResponderUri property.
     */
    public void setOcspResponderUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ocspResponderUri", value);
    }
    /**
     * Sets the scepServerUrl property value. The SCEP server URL for device SCEP connections to request certificates. Read-only.
     * @param value Value to set for the scepServerUrl property.
     */
    public void setScepServerUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scepServerUrl", value);
    }
    /**
     * Sets the serialNumber property value. The serial number used to uniquely identify a certificate with its issuing certification authority. Read-only.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the subjectName property value. The subject name of the certificate. The subject is the target or intended beneficiary of the security being provided, such as a company or government entity. Read-only.
     * @param value Value to set for the subjectName property.
     */
    public void setSubjectName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectName", value);
    }
    /**
     * Sets the thumbprint property value. Secure Hash Algorithm 1 digest of the certificate that can be used to identify it. Read-only.
     * @param value Value to set for the thumbprint property.
     */
    public void setThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbprint", value);
    }
    /**
     * Sets the usage property value. The usage details associated with this certification authority version, including reporting data such as the number of leaf certificates issued during the staged period. Read-only.
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final CloudCertificationAuthorityVersionUsage value) {
        this.backingStore.set("usage", value);
    }
    /**
     * Sets the validityEndDateTime property value. The end date time of the validity period of a certification authority certificate. Certificates cannot be used after this date time as they are longer valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @param value Value to set for the validityEndDateTime property.
     */
    public void setValidityEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("validityEndDateTime", value);
    }
    /**
     * Sets the validityStartDateTime property value. The start date time of the validity period of a certification authority certificate. Certificates cannot be used before this date time as they are not yet valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @param value Value to set for the validityStartDateTime property.
     */
    public void setValidityStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("validityStartDateTime", value);
    }
    /**
     * Sets the versionNumber property value. The version number assigned to this specific certification authority version entity. Read-only.
     * @param value Value to set for the versionNumber property.
     */
    public void setVersionNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("versionNumber", value);
    }
}
