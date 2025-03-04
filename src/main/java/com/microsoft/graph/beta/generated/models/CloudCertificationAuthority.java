package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents a collection of metadata of a cloud certification authority.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudCertificationAuthority extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudCertificationAuthority} and sets the default values.
     */
    public CloudCertificationAuthority() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudCertificationAuthority}
     */
    @jakarta.annotation.Nonnull
    public static CloudCertificationAuthority createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudCertificationAuthority();
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
     * Gets the certificateKeySize property value. Enum of possible cloud certification authority certificate cryptography and key size combinations.
     * @return a {@link CloudCertificationAuthorityCertificateKeySize}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityCertificateKeySize getCertificateKeySize() {
        return this.backingStore.get("certificateKeySize");
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
     * Gets the certificationAuthorityIssuerId property value. Issuer (parent) certification authority identifier. Nullable. Read-only. Supports $orderby and $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificationAuthorityIssuerId() {
        return this.backingStore.get("certificationAuthorityIssuerId");
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
     * Gets the certificationAuthorityStatus property value. Enum type of possible certification authority statuses. These statuses indicate whether a certification authority is currently able to issue certificates or temporarily paused or permanently revoked.
     * @return a {@link CloudCertificationAuthorityStatus}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityStatus getCertificationAuthorityStatus() {
        return this.backingStore.get("certificationAuthorityStatus");
    }
    /**
     * Gets the cloudCertificationAuthorityHashingAlgorithm property value. Enum type of possible certificate hashing algorithms used by the certification authority to create certificates.
     * @return a {@link CloudCertificationAuthorityHashingAlgorithm}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityHashingAlgorithm getCloudCertificationAuthorityHashingAlgorithm() {
        return this.backingStore.get("cloudCertificationAuthorityHashingAlgorithm");
    }
    /**
     * Gets the cloudCertificationAuthorityLeafCertificate property value. Required OData property to expose leaf certificate API.
     * @return a {@link java.util.List<CloudCertificationAuthorityLeafCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudCertificationAuthorityLeafCertificate> getCloudCertificationAuthorityLeafCertificate() {
        return this.backingStore.get("cloudCertificationAuthorityLeafCertificate");
    }
    /**
     * Gets the cloudCertificationAuthorityType property value. Enum type of possible certificate authority types. This feature supports a two-tier certification authority model with a root certification authority and one or more child issuing (intermediate) certification authorities.
     * @return a {@link CloudCertificationAuthorityType}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityType getCloudCertificationAuthorityType() {
        return this.backingStore.get("cloudCertificationAuthorityType");
    }
    /**
     * Gets the commonName property value. The common name of the certificate subject name, which must be unique. This property is a relative distinguished name used to compose the certificate subject name. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommonName() {
        return this.backingStore.get("commonName");
    }
    /**
     * Gets the countryName property value. The country name that is used to compose the subject name of a certification authority certificate in the form &apos;C=&apos;. Nullable. Example: US. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryName() {
        return this.backingStore.get("countryName");
    }
    /**
     * Gets the createdDateTime property value. Creation date of this cloud certification authority entity instance. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The certification authority description displayed in the Intune admin console. Nullable. Read/write. Returns null if not set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The certification authority display name the Intune admin console. Read/write. Supports $select and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the eTag property value. ETag for optimistic concurrency control. Read/write.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getETag() {
        return this.backingStore.get("eTag");
    }
    /**
     * Gets the extendedKeyUsages property value. The certificate extended key usages, which specify the usage capabilities of the certificate. Read-only.
     * @return a {@link java.util.List<ExtendedKeyUsage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this.backingStore.get("extendedKeyUsages");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateDownloadUrl", (n) -> { this.setCertificateDownloadUrl(n.getStringValue()); });
        deserializerMap.put("certificateKeySize", (n) -> { this.setCertificateKeySize(n.getEnumValue(CloudCertificationAuthorityCertificateKeySize::forValue)); });
        deserializerMap.put("certificateRevocationListUrl", (n) -> { this.setCertificateRevocationListUrl(n.getStringValue()); });
        deserializerMap.put("certificateSigningRequest", (n) -> { this.setCertificateSigningRequest(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityIssuerId", (n) -> { this.setCertificationAuthorityIssuerId(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityIssuerUri", (n) -> { this.setCertificationAuthorityIssuerUri(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityStatus", (n) -> { this.setCertificationAuthorityStatus(n.getEnumValue(CloudCertificationAuthorityStatus::forValue)); });
        deserializerMap.put("cloudCertificationAuthorityHashingAlgorithm", (n) -> { this.setCloudCertificationAuthorityHashingAlgorithm(n.getEnumValue(CloudCertificationAuthorityHashingAlgorithm::forValue)); });
        deserializerMap.put("cloudCertificationAuthorityLeafCertificate", (n) -> { this.setCloudCertificationAuthorityLeafCertificate(n.getCollectionOfObjectValues(CloudCertificationAuthorityLeafCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudCertificationAuthorityType", (n) -> { this.setCloudCertificationAuthorityType(n.getEnumValue(CloudCertificationAuthorityType::forValue)); });
        deserializerMap.put("commonName", (n) -> { this.setCommonName(n.getStringValue()); });
        deserializerMap.put("countryName", (n) -> { this.setCountryName(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("eTag", (n) -> { this.setETag(n.getStringValue()); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("issuerCommonName", (n) -> { this.setIssuerCommonName(n.getStringValue()); });
        deserializerMap.put("keyPlatform", (n) -> { this.setKeyPlatform(n.getEnumValue(CloudCertificationAuthorityKeyPlatformType::forValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localityName", (n) -> { this.setLocalityName(n.getStringValue()); });
        deserializerMap.put("ocspResponderUri", (n) -> { this.setOcspResponderUri(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("organizationUnit", (n) -> { this.setOrganizationUnit(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("rootCertificateCommonName", (n) -> { this.setRootCertificateCommonName(n.getStringValue()); });
        deserializerMap.put("scepServerUrl", (n) -> { this.setScepServerUrl(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("stateName", (n) -> { this.setStateName(n.getStringValue()); });
        deserializerMap.put("subjectName", (n) -> { this.setSubjectName(n.getStringValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        deserializerMap.put("validityEndDateTime", (n) -> { this.setValidityEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("validityPeriodInYears", (n) -> { this.setValidityPeriodInYears(n.getIntegerValue()); });
        deserializerMap.put("validityStartDateTime", (n) -> { this.setValidityStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuerCommonName property value. The issuerCommonName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerCommonName() {
        return this.backingStore.get("issuerCommonName");
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
     * Gets the lastModifiedDateTime property value. Last modification date and time of this certification authority entity instance. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read/write.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the localityName property value. The locality (town, city, etc.) name that is used to compose the subject name of a certification authority certificate in the form &apos;L=&apos;. This is Nullable. Example: Redmond. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalityName() {
        return this.backingStore.get("localityName");
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
     * Gets the organizationName property value. The organization name that is used as a distinguished name in the subject name of a certification authority certificate in the form &apos;O=&apos;. Nullable. Example: Microsoft. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.backingStore.get("organizationName");
    }
    /**
     * Gets the organizationUnit property value. The organization unit name that is used as a distinguished name in the subject name of a certification authority certificate in the form &apos;OU=&apos;. Nullable. Example: Security. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationUnit() {
        return this.backingStore.get("organizationUnit");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this entity instance. Scope tags limit access to an entity instance. Nullable. Read/write.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the rootCertificateCommonName property value. The common name of the certificate subject name of the certification authority issuer. This property can be used to identify the certification authority that issued the current certification authority. For issuing certification authorities, this is the common name of the certificate subject name of the root certification authority to which it is anchored. For externally signed certification authorities, this is the common name of the certificate subject name of the signing certification authority. For root certification authorities, this is the common name of the certification authority&apos;s own certificate subject name. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRootCertificateCommonName() {
        return this.backingStore.get("rootCertificateCommonName");
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
     * Gets the serialNumber property value. The serial number used to uniquely identify a certificate with its issuing certification authority. Read-only. Supports $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the stateName property value. The state or province name that is used to compose the subject name of a certification authority certificate in the form &apos;ST=&apos;. Nullable. Example: Washington. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStateName() {
        return this.backingStore.get("stateName");
    }
    /**
     * Gets the subjectName property value. The subject name of the certificate. The subject is the target or intended beneficiary of the security being provided, such as a company or government entity. Read-only. Supports $orderby and $select.
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
     * Gets the validityEndDateTime property value. The end date time of the validity period of a certification authority certificate. Certificates cannot be used after this date time as they are longer valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only. Supports $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getValidityEndDateTime() {
        return this.backingStore.get("validityEndDateTime");
    }
    /**
     * Gets the validityPeriodInYears property value. The certification authority validity period in years configured by admins.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getValidityPeriodInYears() {
        return this.backingStore.get("validityPeriodInYears");
    }
    /**
     * Gets the validityStartDateTime property value. The start date time of the validity period of a certification authority certificate. Certificates cannot be used before this date time as they are not yet valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only. Supports $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getValidityStartDateTime() {
        return this.backingStore.get("validityStartDateTime");
    }
    /**
     * Gets the versionNumber property value. The certification authority version, which is incremented each time the certification authority is renewed. Read-only.
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
        writer.writeEnumValue("certificateKeySize", this.getCertificateKeySize());
        writer.writeStringValue("certificateRevocationListUrl", this.getCertificateRevocationListUrl());
        writer.writeStringValue("certificateSigningRequest", this.getCertificateSigningRequest());
        writer.writeStringValue("certificationAuthorityIssuerId", this.getCertificationAuthorityIssuerId());
        writer.writeStringValue("certificationAuthorityIssuerUri", this.getCertificationAuthorityIssuerUri());
        writer.writeEnumValue("certificationAuthorityStatus", this.getCertificationAuthorityStatus());
        writer.writeEnumValue("cloudCertificationAuthorityHashingAlgorithm", this.getCloudCertificationAuthorityHashingAlgorithm());
        writer.writeCollectionOfObjectValues("cloudCertificationAuthorityLeafCertificate", this.getCloudCertificationAuthorityLeafCertificate());
        writer.writeEnumValue("cloudCertificationAuthorityType", this.getCloudCertificationAuthorityType());
        writer.writeStringValue("commonName", this.getCommonName());
        writer.writeStringValue("countryName", this.getCountryName());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("eTag", this.getETag());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeStringValue("issuerCommonName", this.getIssuerCommonName());
        writer.writeEnumValue("keyPlatform", this.getKeyPlatform());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("localityName", this.getLocalityName());
        writer.writeStringValue("ocspResponderUri", this.getOcspResponderUri());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeStringValue("organizationUnit", this.getOrganizationUnit());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeStringValue("rootCertificateCommonName", this.getRootCertificateCommonName());
        writer.writeStringValue("scepServerUrl", this.getScepServerUrl());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("stateName", this.getStateName());
        writer.writeStringValue("subjectName", this.getSubjectName());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeOffsetDateTimeValue("validityEndDateTime", this.getValidityEndDateTime());
        writer.writeIntegerValue("validityPeriodInYears", this.getValidityPeriodInYears());
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
     * Sets the certificateKeySize property value. Enum of possible cloud certification authority certificate cryptography and key size combinations.
     * @param value Value to set for the certificateKeySize property.
     */
    public void setCertificateKeySize(@jakarta.annotation.Nullable final CloudCertificationAuthorityCertificateKeySize value) {
        this.backingStore.set("certificateKeySize", value);
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
     * Sets the certificationAuthorityIssuerId property value. Issuer (parent) certification authority identifier. Nullable. Read-only. Supports $orderby and $select.
     * @param value Value to set for the certificationAuthorityIssuerId property.
     */
    public void setCertificationAuthorityIssuerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificationAuthorityIssuerId", value);
    }
    /**
     * Sets the certificationAuthorityIssuerUri property value. The URI of the issuing certification authority of a subordinate certification authority. Returns null if a root certification authority. Nullable. Read-only.
     * @param value Value to set for the certificationAuthorityIssuerUri property.
     */
    public void setCertificationAuthorityIssuerUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificationAuthorityIssuerUri", value);
    }
    /**
     * Sets the certificationAuthorityStatus property value. Enum type of possible certification authority statuses. These statuses indicate whether a certification authority is currently able to issue certificates or temporarily paused or permanently revoked.
     * @param value Value to set for the certificationAuthorityStatus property.
     */
    public void setCertificationAuthorityStatus(@jakarta.annotation.Nullable final CloudCertificationAuthorityStatus value) {
        this.backingStore.set("certificationAuthorityStatus", value);
    }
    /**
     * Sets the cloudCertificationAuthorityHashingAlgorithm property value. Enum type of possible certificate hashing algorithms used by the certification authority to create certificates.
     * @param value Value to set for the cloudCertificationAuthorityHashingAlgorithm property.
     */
    public void setCloudCertificationAuthorityHashingAlgorithm(@jakarta.annotation.Nullable final CloudCertificationAuthorityHashingAlgorithm value) {
        this.backingStore.set("cloudCertificationAuthorityHashingAlgorithm", value);
    }
    /**
     * Sets the cloudCertificationAuthorityLeafCertificate property value. Required OData property to expose leaf certificate API.
     * @param value Value to set for the cloudCertificationAuthorityLeafCertificate property.
     */
    public void setCloudCertificationAuthorityLeafCertificate(@jakarta.annotation.Nullable final java.util.List<CloudCertificationAuthorityLeafCertificate> value) {
        this.backingStore.set("cloudCertificationAuthorityLeafCertificate", value);
    }
    /**
     * Sets the cloudCertificationAuthorityType property value. Enum type of possible certificate authority types. This feature supports a two-tier certification authority model with a root certification authority and one or more child issuing (intermediate) certification authorities.
     * @param value Value to set for the cloudCertificationAuthorityType property.
     */
    public void setCloudCertificationAuthorityType(@jakarta.annotation.Nullable final CloudCertificationAuthorityType value) {
        this.backingStore.set("cloudCertificationAuthorityType", value);
    }
    /**
     * Sets the commonName property value. The common name of the certificate subject name, which must be unique. This property is a relative distinguished name used to compose the certificate subject name. Read-only. Supports $select.
     * @param value Value to set for the commonName property.
     */
    public void setCommonName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commonName", value);
    }
    /**
     * Sets the countryName property value. The country name that is used to compose the subject name of a certification authority certificate in the form &apos;C=&apos;. Nullable. Example: US. Read-only.
     * @param value Value to set for the countryName property.
     */
    public void setCountryName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("countryName", value);
    }
    /**
     * Sets the createdDateTime property value. Creation date of this cloud certification authority entity instance. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The certification authority description displayed in the Intune admin console. Nullable. Read/write. Returns null if not set.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The certification authority display name the Intune admin console. Read/write. Supports $select and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the eTag property value. ETag for optimistic concurrency control. Read/write.
     * @param value Value to set for the eTag property.
     */
    public void setETag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eTag", value);
    }
    /**
     * Sets the extendedKeyUsages property value. The certificate extended key usages, which specify the usage capabilities of the certificate. Read-only.
     * @param value Value to set for the extendedKeyUsages property.
     */
    public void setExtendedKeyUsages(@jakarta.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.backingStore.set("extendedKeyUsages", value);
    }
    /**
     * Sets the issuerCommonName property value. The issuerCommonName property
     * @param value Value to set for the issuerCommonName property.
     */
    public void setIssuerCommonName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuerCommonName", value);
    }
    /**
     * Sets the keyPlatform property value. Enum type of possible key platforms used by the certification authority.
     * @param value Value to set for the keyPlatform property.
     */
    public void setKeyPlatform(@jakarta.annotation.Nullable final CloudCertificationAuthorityKeyPlatformType value) {
        this.backingStore.set("keyPlatform", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification date and time of this certification authority entity instance. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read/write.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the localityName property value. The locality (town, city, etc.) name that is used to compose the subject name of a certification authority certificate in the form &apos;L=&apos;. This is Nullable. Example: Redmond. Read-only.
     * @param value Value to set for the localityName property.
     */
    public void setLocalityName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localityName", value);
    }
    /**
     * Sets the ocspResponderUri property value. The Online Certificate Status Protocol (OCSP) responder URI that can be used to determine certificate status. Read-only.
     * @param value Value to set for the ocspResponderUri property.
     */
    public void setOcspResponderUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ocspResponderUri", value);
    }
    /**
     * Sets the organizationName property value. The organization name that is used as a distinguished name in the subject name of a certification authority certificate in the form &apos;O=&apos;. Nullable. Example: Microsoft. Read-only.
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationName", value);
    }
    /**
     * Sets the organizationUnit property value. The organization unit name that is used as a distinguished name in the subject name of a certification authority certificate in the form &apos;OU=&apos;. Nullable. Example: Security. Read-only.
     * @param value Value to set for the organizationUnit property.
     */
    public void setOrganizationUnit(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationUnit", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this entity instance. Scope tags limit access to an entity instance. Nullable. Read/write.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the rootCertificateCommonName property value. The common name of the certificate subject name of the certification authority issuer. This property can be used to identify the certification authority that issued the current certification authority. For issuing certification authorities, this is the common name of the certificate subject name of the root certification authority to which it is anchored. For externally signed certification authorities, this is the common name of the certificate subject name of the signing certification authority. For root certification authorities, this is the common name of the certification authority&apos;s own certificate subject name. Read-only.
     * @param value Value to set for the rootCertificateCommonName property.
     */
    public void setRootCertificateCommonName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rootCertificateCommonName", value);
    }
    /**
     * Sets the scepServerUrl property value. The SCEP server URL for device SCEP connections to request certificates. Read-only.
     * @param value Value to set for the scepServerUrl property.
     */
    public void setScepServerUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scepServerUrl", value);
    }
    /**
     * Sets the serialNumber property value. The serial number used to uniquely identify a certificate with its issuing certification authority. Read-only. Supports $select.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the stateName property value. The state or province name that is used to compose the subject name of a certification authority certificate in the form &apos;ST=&apos;. Nullable. Example: Washington. Read-only.
     * @param value Value to set for the stateName property.
     */
    public void setStateName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("stateName", value);
    }
    /**
     * Sets the subjectName property value. The subject name of the certificate. The subject is the target or intended beneficiary of the security being provided, such as a company or government entity. Read-only. Supports $orderby and $select.
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
     * Sets the validityEndDateTime property value. The end date time of the validity period of a certification authority certificate. Certificates cannot be used after this date time as they are longer valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only. Supports $orderby.
     * @param value Value to set for the validityEndDateTime property.
     */
    public void setValidityEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("validityEndDateTime", value);
    }
    /**
     * Sets the validityPeriodInYears property value. The certification authority validity period in years configured by admins.
     * @param value Value to set for the validityPeriodInYears property.
     */
    public void setValidityPeriodInYears(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("validityPeriodInYears", value);
    }
    /**
     * Sets the validityStartDateTime property value. The start date time of the validity period of a certification authority certificate. Certificates cannot be used before this date time as they are not yet valid. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Nullable. Read-only. Supports $orderby.
     * @param value Value to set for the validityStartDateTime property.
     */
    public void setValidityStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("validityStartDateTime", value);
    }
    /**
     * Sets the versionNumber property value. The certification authority version, which is incremented each time the certification authority is renewed. Read-only.
     * @param value Value to set for the versionNumber property.
     */
    public void setVersionNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("versionNumber", value);
    }
}
