package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceCertificateState extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedDeviceCertificateState and sets the default values.
     */
    public ManagedDeviceCertificateState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceCertificateState
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceCertificateState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCertificateState();
    }
    /**
     * Gets the certificateEnhancedKeyUsage property value. Extended key usage
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateEnhancedKeyUsage() {
        return this.backingStore.get("certificateEnhancedKeyUsage");
    }
    /**
     * Gets the certificateErrorCode property value. Error code
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateErrorCode() {
        return this.backingStore.get("certificateErrorCode");
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
     * Gets the certificateIssuanceDateTime property value. Issuance date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateIssuanceDateTime() {
        return this.backingStore.get("certificateIssuanceDateTime");
    }
    /**
     * Gets the certificateIssuanceState property value. Certificate Issuance State Options.
     * @return a CertificateIssuanceStates
     */
    @jakarta.annotation.Nullable
    public CertificateIssuanceStates getCertificateIssuanceState() {
        return this.backingStore.get("certificateIssuanceState");
    }
    /**
     * Gets the certificateIssuer property value. Issuer
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateIssuer() {
        return this.backingStore.get("certificateIssuer");
    }
    /**
     * Gets the certificateKeyLength property value. Key length
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateKeyLength() {
        return this.backingStore.get("certificateKeyLength");
    }
    /**
     * Gets the certificateKeyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a KeyStorageProviderOption
     */
    @jakarta.annotation.Nullable
    public KeyStorageProviderOption getCertificateKeyStorageProvider() {
        return this.backingStore.get("certificateKeyStorageProvider");
    }
    /**
     * Gets the certificateKeyUsage property value. Key Usage Options.
     * @return a EnumSet<KeyUsages>
     */
    @jakarta.annotation.Nullable
    public EnumSet<KeyUsages> getCertificateKeyUsage() {
        return this.backingStore.get("certificateKeyUsage");
    }
    /**
     * Gets the certificateLastIssuanceStateChangedDateTime property value. Last certificate issuance state change
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateLastIssuanceStateChangedDateTime() {
        return this.backingStore.get("certificateLastIssuanceStateChangedDateTime");
    }
    /**
     * Gets the certificateProfileDisplayName property value. Certificate profile display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateProfileDisplayName() {
        return this.backingStore.get("certificateProfileDisplayName");
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
     * Gets the certificateSerialNumber property value. Serial number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this.backingStore.get("certificateSerialNumber");
    }
    /**
     * Gets the certificateSubjectAlternativeNameFormat property value. Subject Alternative Name Options.
     * @return a EnumSet<SubjectAlternativeNameType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<SubjectAlternativeNameType> getCertificateSubjectAlternativeNameFormat() {
        return this.backingStore.get("certificateSubjectAlternativeNameFormat");
    }
    /**
     * Gets the certificateSubjectAlternativeNameFormatString property value. Subject alternative name format string for custom formats
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateSubjectAlternativeNameFormatString() {
        return this.backingStore.get("certificateSubjectAlternativeNameFormatString");
    }
    /**
     * Gets the certificateSubjectNameFormat property value. Subject Name Format Options.
     * @return a SubjectNameFormat
     */
    @jakarta.annotation.Nullable
    public SubjectNameFormat getCertificateSubjectNameFormat() {
        return this.backingStore.get("certificateSubjectNameFormat");
    }
    /**
     * Gets the certificateSubjectNameFormatString property value. Subject name format string for custom subject name formats
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateSubjectNameFormatString() {
        return this.backingStore.get("certificateSubjectNameFormatString");
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
     * Gets the certificateValidityPeriod property value. Validity period
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateValidityPeriod() {
        return this.backingStore.get("certificateValidityPeriod");
    }
    /**
     * Gets the certificateValidityPeriodUnits property value. Certificate Validity Period Options.
     * @return a CertificateValidityPeriodScale
     */
    @jakarta.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodUnits() {
        return this.backingStore.get("certificateValidityPeriodUnits");
    }
    /**
     * Gets the deviceDisplayName property value. Device display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.backingStore.get("deviceDisplayName");
    }
    /**
     * Gets the devicePlatform property value. Supported platform types.
     * @return a DevicePlatformType
     */
    @jakarta.annotation.Nullable
    public DevicePlatformType getDevicePlatform() {
        return this.backingStore.get("devicePlatform");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateEnhancedKeyUsage", (n) -> { this.setCertificateEnhancedKeyUsage(n.getStringValue()); });
        deserializerMap.put("certificateErrorCode", (n) -> { this.setCertificateErrorCode(n.getIntegerValue()); });
        deserializerMap.put("certificateExpirationDateTime", (n) -> { this.setCertificateExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateIssuanceDateTime", (n) -> { this.setCertificateIssuanceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateIssuanceState", (n) -> { this.setCertificateIssuanceState(n.getEnumValue(CertificateIssuanceStates::forValue)); });
        deserializerMap.put("certificateIssuer", (n) -> { this.setCertificateIssuer(n.getStringValue()); });
        deserializerMap.put("certificateKeyLength", (n) -> { this.setCertificateKeyLength(n.getIntegerValue()); });
        deserializerMap.put("certificateKeyStorageProvider", (n) -> { this.setCertificateKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption::forValue)); });
        deserializerMap.put("certificateKeyUsage", (n) -> { this.setCertificateKeyUsage(n.getEnumSetValue(KeyUsages::forValue)); });
        deserializerMap.put("certificateLastIssuanceStateChangedDateTime", (n) -> { this.setCertificateLastIssuanceStateChangedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateProfileDisplayName", (n) -> { this.setCertificateProfileDisplayName(n.getStringValue()); });
        deserializerMap.put("certificateRevokeStatus", (n) -> { this.setCertificateRevokeStatus(n.getEnumValue(CertificateRevocationStatus::forValue)); });
        deserializerMap.put("certificateSerialNumber", (n) -> { this.setCertificateSerialNumber(n.getStringValue()); });
        deserializerMap.put("certificateSubjectAlternativeNameFormat", (n) -> { this.setCertificateSubjectAlternativeNameFormat(n.getEnumSetValue(SubjectAlternativeNameType::forValue)); });
        deserializerMap.put("certificateSubjectAlternativeNameFormatString", (n) -> { this.setCertificateSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("certificateSubjectNameFormat", (n) -> { this.setCertificateSubjectNameFormat(n.getEnumValue(SubjectNameFormat::forValue)); });
        deserializerMap.put("certificateSubjectNameFormatString", (n) -> { this.setCertificateSubjectNameFormatString(n.getStringValue()); });
        deserializerMap.put("certificateThumbprint", (n) -> { this.setCertificateThumbprint(n.getStringValue()); });
        deserializerMap.put("certificateValidityPeriod", (n) -> { this.setCertificateValidityPeriod(n.getIntegerValue()); });
        deserializerMap.put("certificateValidityPeriodUnits", (n) -> { this.setCertificateValidityPeriodUnits(n.getEnumValue(CertificateValidityPeriodScale::forValue)); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("devicePlatform", (n) -> { this.setDevicePlatform(n.getEnumValue(DevicePlatformType::forValue)); });
        deserializerMap.put("lastCertificateStateChangeDateTime", (n) -> { this.setLastCertificateStateChangeDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastCertificateStateChangeDateTime property value. Last certificate issuance state change
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCertificateStateChangeDateTime() {
        return this.backingStore.get("lastCertificateStateChangeDateTime");
    }
    /**
     * Gets the userDisplayName property value. User display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificateEnhancedKeyUsage", this.getCertificateEnhancedKeyUsage());
        writer.writeIntegerValue("certificateErrorCode", this.getCertificateErrorCode());
        writer.writeOffsetDateTimeValue("certificateExpirationDateTime", this.getCertificateExpirationDateTime());
        writer.writeOffsetDateTimeValue("certificateIssuanceDateTime", this.getCertificateIssuanceDateTime());
        writer.writeEnumValue("certificateIssuanceState", this.getCertificateIssuanceState());
        writer.writeStringValue("certificateIssuer", this.getCertificateIssuer());
        writer.writeIntegerValue("certificateKeyLength", this.getCertificateKeyLength());
        writer.writeEnumValue("certificateKeyStorageProvider", this.getCertificateKeyStorageProvider());
        writer.writeEnumSetValue("certificateKeyUsage", this.getCertificateKeyUsage());
        writer.writeOffsetDateTimeValue("certificateLastIssuanceStateChangedDateTime", this.getCertificateLastIssuanceStateChangedDateTime());
        writer.writeStringValue("certificateProfileDisplayName", this.getCertificateProfileDisplayName());
        writer.writeEnumValue("certificateRevokeStatus", this.getCertificateRevokeStatus());
        writer.writeStringValue("certificateSerialNumber", this.getCertificateSerialNumber());
        writer.writeEnumSetValue("certificateSubjectAlternativeNameFormat", this.getCertificateSubjectAlternativeNameFormat());
        writer.writeStringValue("certificateSubjectAlternativeNameFormatString", this.getCertificateSubjectAlternativeNameFormatString());
        writer.writeEnumValue("certificateSubjectNameFormat", this.getCertificateSubjectNameFormat());
        writer.writeStringValue("certificateSubjectNameFormatString", this.getCertificateSubjectNameFormatString());
        writer.writeStringValue("certificateThumbprint", this.getCertificateThumbprint());
        writer.writeIntegerValue("certificateValidityPeriod", this.getCertificateValidityPeriod());
        writer.writeEnumValue("certificateValidityPeriodUnits", this.getCertificateValidityPeriodUnits());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeEnumValue("devicePlatform", this.getDevicePlatform());
        writer.writeOffsetDateTimeValue("lastCertificateStateChangeDateTime", this.getLastCertificateStateChangeDateTime());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
    }
    /**
     * Sets the certificateEnhancedKeyUsage property value. Extended key usage
     * @param value Value to set for the certificateEnhancedKeyUsage property.
     */
    public void setCertificateEnhancedKeyUsage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateEnhancedKeyUsage", value);
    }
    /**
     * Sets the certificateErrorCode property value. Error code
     * @param value Value to set for the certificateErrorCode property.
     */
    public void setCertificateErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("certificateErrorCode", value);
    }
    /**
     * Sets the certificateExpirationDateTime property value. Certificate expiry date
     * @param value Value to set for the certificateExpirationDateTime property.
     */
    public void setCertificateExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("certificateExpirationDateTime", value);
    }
    /**
     * Sets the certificateIssuanceDateTime property value. Issuance date
     * @param value Value to set for the certificateIssuanceDateTime property.
     */
    public void setCertificateIssuanceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("certificateIssuanceDateTime", value);
    }
    /**
     * Sets the certificateIssuanceState property value. Certificate Issuance State Options.
     * @param value Value to set for the certificateIssuanceState property.
     */
    public void setCertificateIssuanceState(@jakarta.annotation.Nullable final CertificateIssuanceStates value) {
        this.backingStore.set("certificateIssuanceState", value);
    }
    /**
     * Sets the certificateIssuer property value. Issuer
     * @param value Value to set for the certificateIssuer property.
     */
    public void setCertificateIssuer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateIssuer", value);
    }
    /**
     * Sets the certificateKeyLength property value. Key length
     * @param value Value to set for the certificateKeyLength property.
     */
    public void setCertificateKeyLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("certificateKeyLength", value);
    }
    /**
     * Sets the certificateKeyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the certificateKeyStorageProvider property.
     */
    public void setCertificateKeyStorageProvider(@jakarta.annotation.Nullable final KeyStorageProviderOption value) {
        this.backingStore.set("certificateKeyStorageProvider", value);
    }
    /**
     * Sets the certificateKeyUsage property value. Key Usage Options.
     * @param value Value to set for the certificateKeyUsage property.
     */
    public void setCertificateKeyUsage(@jakarta.annotation.Nullable final EnumSet<KeyUsages> value) {
        this.backingStore.set("certificateKeyUsage", value);
    }
    /**
     * Sets the certificateLastIssuanceStateChangedDateTime property value. Last certificate issuance state change
     * @param value Value to set for the certificateLastIssuanceStateChangedDateTime property.
     */
    public void setCertificateLastIssuanceStateChangedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("certificateLastIssuanceStateChangedDateTime", value);
    }
    /**
     * Sets the certificateProfileDisplayName property value. Certificate profile display name
     * @param value Value to set for the certificateProfileDisplayName property.
     */
    public void setCertificateProfileDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateProfileDisplayName", value);
    }
    /**
     * Sets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @param value Value to set for the certificateRevokeStatus property.
     */
    public void setCertificateRevokeStatus(@jakarta.annotation.Nullable final CertificateRevocationStatus value) {
        this.backingStore.set("certificateRevokeStatus", value);
    }
    /**
     * Sets the certificateSerialNumber property value. Serial number
     * @param value Value to set for the certificateSerialNumber property.
     */
    public void setCertificateSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSerialNumber", value);
    }
    /**
     * Sets the certificateSubjectAlternativeNameFormat property value. Subject Alternative Name Options.
     * @param value Value to set for the certificateSubjectAlternativeNameFormat property.
     */
    public void setCertificateSubjectAlternativeNameFormat(@jakarta.annotation.Nullable final EnumSet<SubjectAlternativeNameType> value) {
        this.backingStore.set("certificateSubjectAlternativeNameFormat", value);
    }
    /**
     * Sets the certificateSubjectAlternativeNameFormatString property value. Subject alternative name format string for custom formats
     * @param value Value to set for the certificateSubjectAlternativeNameFormatString property.
     */
    public void setCertificateSubjectAlternativeNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSubjectAlternativeNameFormatString", value);
    }
    /**
     * Sets the certificateSubjectNameFormat property value. Subject Name Format Options.
     * @param value Value to set for the certificateSubjectNameFormat property.
     */
    public void setCertificateSubjectNameFormat(@jakarta.annotation.Nullable final SubjectNameFormat value) {
        this.backingStore.set("certificateSubjectNameFormat", value);
    }
    /**
     * Sets the certificateSubjectNameFormatString property value. Subject name format string for custom subject name formats
     * @param value Value to set for the certificateSubjectNameFormatString property.
     */
    public void setCertificateSubjectNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSubjectNameFormatString", value);
    }
    /**
     * Sets the certificateThumbprint property value. Thumbprint
     * @param value Value to set for the certificateThumbprint property.
     */
    public void setCertificateThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateThumbprint", value);
    }
    /**
     * Sets the certificateValidityPeriod property value. Validity period
     * @param value Value to set for the certificateValidityPeriod property.
     */
    public void setCertificateValidityPeriod(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("certificateValidityPeriod", value);
    }
    /**
     * Sets the certificateValidityPeriodUnits property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodUnits property.
     */
    public void setCertificateValidityPeriodUnits(@jakarta.annotation.Nullable final CertificateValidityPeriodScale value) {
        this.backingStore.set("certificateValidityPeriodUnits", value);
    }
    /**
     * Sets the deviceDisplayName property value. Device display name
     * @param value Value to set for the deviceDisplayName property.
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceDisplayName", value);
    }
    /**
     * Sets the devicePlatform property value. Supported platform types.
     * @param value Value to set for the devicePlatform property.
     */
    public void setDevicePlatform(@jakarta.annotation.Nullable final DevicePlatformType value) {
        this.backingStore.set("devicePlatform", value);
    }
    /**
     * Sets the lastCertificateStateChangeDateTime property value. Last certificate issuance state change
     * @param value Value to set for the lastCertificateStateChangeDateTime property.
     */
    public void setLastCertificateStateChangeDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCertificateStateChangeDateTime", value);
    }
    /**
     * Sets the userDisplayName property value. User display name
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
}
