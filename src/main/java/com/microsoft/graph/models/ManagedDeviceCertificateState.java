package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedDeviceCertificateState extends Entity implements Parsable {
    /**
     * Extended key usage
     */
    private String certificateEnhancedKeyUsage;
    /**
     * Error code
     */
    private Integer certificateErrorCode;
    /**
     * Certificate expiry date
     */
    private OffsetDateTime certificateExpirationDateTime;
    /**
     * Issuance date
     */
    private OffsetDateTime certificateIssuanceDateTime;
    /**
     * Certificate Issuance State Options.
     */
    private CertificateIssuanceStates certificateIssuanceState;
    /**
     * Issuer
     */
    private String certificateIssuer;
    /**
     * Key length
     */
    private Integer certificateKeyLength;
    /**
     * Key Storage Provider (KSP) Import Options.
     */
    private KeyStorageProviderOption certificateKeyStorageProvider;
    /**
     * Key Usage Options.
     */
    private KeyUsages certificateKeyUsage;
    /**
     * Last certificate issuance state change
     */
    private OffsetDateTime certificateLastIssuanceStateChangedDateTime;
    /**
     * Certificate profile display name
     */
    private String certificateProfileDisplayName;
    /**
     * Certificate Revocation Status.
     */
    private CertificateRevocationStatus certificateRevokeStatus;
    /**
     * Serial number
     */
    private String certificateSerialNumber;
    /**
     * Subject Alternative Name Options.
     */
    private SubjectAlternativeNameType certificateSubjectAlternativeNameFormat;
    /**
     * Subject alternative name format string for custom formats
     */
    private String certificateSubjectAlternativeNameFormatString;
    /**
     * Subject Name Format Options.
     */
    private SubjectNameFormat certificateSubjectNameFormat;
    /**
     * Subject name format string for custom subject name formats
     */
    private String certificateSubjectNameFormatString;
    /**
     * Thumbprint
     */
    private String certificateThumbprint;
    /**
     * Validity period
     */
    private Integer certificateValidityPeriod;
    /**
     * Certificate Validity Period Options.
     */
    private CertificateValidityPeriodScale certificateValidityPeriodUnits;
    /**
     * Device display name
     */
    private String deviceDisplayName;
    /**
     * Supported platform types.
     */
    private DevicePlatformType devicePlatform;
    /**
     * Last certificate issuance state change
     */
    private OffsetDateTime lastCertificateStateChangeDateTime;
    /**
     * User display name
     */
    private String userDisplayName;
    /**
     * Instantiates a new managedDeviceCertificateState and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceCertificateState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceCertificateState
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceCertificateState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCertificateState();
    }
    /**
     * Gets the certificateEnhancedKeyUsage property value. Extended key usage
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateEnhancedKeyUsage() {
        return this.certificateEnhancedKeyUsage;
    }
    /**
     * Gets the certificateErrorCode property value. Error code
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateErrorCode() {
        return this.certificateErrorCode;
    }
    /**
     * Gets the certificateExpirationDateTime property value. Certificate expiry date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateExpirationDateTime() {
        return this.certificateExpirationDateTime;
    }
    /**
     * Gets the certificateIssuanceDateTime property value. Issuance date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateIssuanceDateTime() {
        return this.certificateIssuanceDateTime;
    }
    /**
     * Gets the certificateIssuanceState property value. Certificate Issuance State Options.
     * @return a certificateIssuanceStates
     */
    @jakarta.annotation.Nullable
    public CertificateIssuanceStates getCertificateIssuanceState() {
        return this.certificateIssuanceState;
    }
    /**
     * Gets the certificateIssuer property value. Issuer
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateIssuer() {
        return this.certificateIssuer;
    }
    /**
     * Gets the certificateKeyLength property value. Key length
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateKeyLength() {
        return this.certificateKeyLength;
    }
    /**
     * Gets the certificateKeyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a keyStorageProviderOption
     */
    @jakarta.annotation.Nullable
    public KeyStorageProviderOption getCertificateKeyStorageProvider() {
        return this.certificateKeyStorageProvider;
    }
    /**
     * Gets the certificateKeyUsage property value. Key Usage Options.
     * @return a keyUsages
     */
    @jakarta.annotation.Nullable
    public KeyUsages getCertificateKeyUsage() {
        return this.certificateKeyUsage;
    }
    /**
     * Gets the certificateLastIssuanceStateChangedDateTime property value. Last certificate issuance state change
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificateLastIssuanceStateChangedDateTime() {
        return this.certificateLastIssuanceStateChangedDateTime;
    }
    /**
     * Gets the certificateProfileDisplayName property value. Certificate profile display name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateProfileDisplayName() {
        return this.certificateProfileDisplayName;
    }
    /**
     * Gets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @return a certificateRevocationStatus
     */
    @jakarta.annotation.Nullable
    public CertificateRevocationStatus getCertificateRevokeStatus() {
        return this.certificateRevokeStatus;
    }
    /**
     * Gets the certificateSerialNumber property value. Serial number
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }
    /**
     * Gets the certificateSubjectAlternativeNameFormat property value. Subject Alternative Name Options.
     * @return a subjectAlternativeNameType
     */
    @jakarta.annotation.Nullable
    public SubjectAlternativeNameType getCertificateSubjectAlternativeNameFormat() {
        return this.certificateSubjectAlternativeNameFormat;
    }
    /**
     * Gets the certificateSubjectAlternativeNameFormatString property value. Subject alternative name format string for custom formats
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateSubjectAlternativeNameFormatString() {
        return this.certificateSubjectAlternativeNameFormatString;
    }
    /**
     * Gets the certificateSubjectNameFormat property value. Subject Name Format Options.
     * @return a subjectNameFormat
     */
    @jakarta.annotation.Nullable
    public SubjectNameFormat getCertificateSubjectNameFormat() {
        return this.certificateSubjectNameFormat;
    }
    /**
     * Gets the certificateSubjectNameFormatString property value. Subject name format string for custom subject name formats
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateSubjectNameFormatString() {
        return this.certificateSubjectNameFormatString;
    }
    /**
     * Gets the certificateThumbprint property value. Thumbprint
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateThumbprint() {
        return this.certificateThumbprint;
    }
    /**
     * Gets the certificateValidityPeriod property value. Validity period
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateValidityPeriod() {
        return this.certificateValidityPeriod;
    }
    /**
     * Gets the certificateValidityPeriodUnits property value. Certificate Validity Period Options.
     * @return a certificateValidityPeriodScale
     */
    @jakarta.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodUnits() {
        return this.certificateValidityPeriodUnits;
    }
    /**
     * Gets the deviceDisplayName property value. Device display name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * Gets the devicePlatform property value. Supported platform types.
     * @return a devicePlatformType
     */
    @jakarta.annotation.Nullable
    public DevicePlatformType getDevicePlatform() {
        return this.devicePlatform;
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
        deserializerMap.put("certificateIssuanceState", (n) -> { this.setCertificateIssuanceState(n.getEnumValue(CertificateIssuanceStates.class)); });
        deserializerMap.put("certificateIssuer", (n) -> { this.setCertificateIssuer(n.getStringValue()); });
        deserializerMap.put("certificateKeyLength", (n) -> { this.setCertificateKeyLength(n.getIntegerValue()); });
        deserializerMap.put("certificateKeyStorageProvider", (n) -> { this.setCertificateKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption.class)); });
        deserializerMap.put("certificateKeyUsage", (n) -> { this.setCertificateKeyUsage(n.getEnumValue(KeyUsages.class)); });
        deserializerMap.put("certificateLastIssuanceStateChangedDateTime", (n) -> { this.setCertificateLastIssuanceStateChangedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateProfileDisplayName", (n) -> { this.setCertificateProfileDisplayName(n.getStringValue()); });
        deserializerMap.put("certificateRevokeStatus", (n) -> { this.setCertificateRevokeStatus(n.getEnumValue(CertificateRevocationStatus.class)); });
        deserializerMap.put("certificateSerialNumber", (n) -> { this.setCertificateSerialNumber(n.getStringValue()); });
        deserializerMap.put("certificateSubjectAlternativeNameFormat", (n) -> { this.setCertificateSubjectAlternativeNameFormat(n.getEnumValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("certificateSubjectAlternativeNameFormatString", (n) -> { this.setCertificateSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("certificateSubjectNameFormat", (n) -> { this.setCertificateSubjectNameFormat(n.getEnumValue(SubjectNameFormat.class)); });
        deserializerMap.put("certificateSubjectNameFormatString", (n) -> { this.setCertificateSubjectNameFormatString(n.getStringValue()); });
        deserializerMap.put("certificateThumbprint", (n) -> { this.setCertificateThumbprint(n.getStringValue()); });
        deserializerMap.put("certificateValidityPeriod", (n) -> { this.setCertificateValidityPeriod(n.getIntegerValue()); });
        deserializerMap.put("certificateValidityPeriodUnits", (n) -> { this.setCertificateValidityPeriodUnits(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("devicePlatform", (n) -> { this.setDevicePlatform(n.getEnumValue(DevicePlatformType.class)); });
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
        return this.lastCertificateStateChangeDateTime;
    }
    /**
     * Gets the userDisplayName property value. User display name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
        writer.writeEnumValue("certificateKeyUsage", this.getCertificateKeyUsage());
        writer.writeOffsetDateTimeValue("certificateLastIssuanceStateChangedDateTime", this.getCertificateLastIssuanceStateChangedDateTime());
        writer.writeStringValue("certificateProfileDisplayName", this.getCertificateProfileDisplayName());
        writer.writeEnumValue("certificateRevokeStatus", this.getCertificateRevokeStatus());
        writer.writeStringValue("certificateSerialNumber", this.getCertificateSerialNumber());
        writer.writeEnumValue("certificateSubjectAlternativeNameFormat", this.getCertificateSubjectAlternativeNameFormat());
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateEnhancedKeyUsage(@jakarta.annotation.Nullable final String value) {
        this.certificateEnhancedKeyUsage = value;
    }
    /**
     * Sets the certificateErrorCode property value. Error code
     * @param value Value to set for the certificateErrorCode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.certificateErrorCode = value;
    }
    /**
     * Sets the certificateExpirationDateTime property value. Certificate expiry date
     * @param value Value to set for the certificateExpirationDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.certificateExpirationDateTime = value;
    }
    /**
     * Sets the certificateIssuanceDateTime property value. Issuance date
     * @param value Value to set for the certificateIssuanceDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateIssuanceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.certificateIssuanceDateTime = value;
    }
    /**
     * Sets the certificateIssuanceState property value. Certificate Issuance State Options.
     * @param value Value to set for the certificateIssuanceState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateIssuanceState(@jakarta.annotation.Nullable final CertificateIssuanceStates value) {
        this.certificateIssuanceState = value;
    }
    /**
     * Sets the certificateIssuer property value. Issuer
     * @param value Value to set for the certificateIssuer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateIssuer(@jakarta.annotation.Nullable final String value) {
        this.certificateIssuer = value;
    }
    /**
     * Sets the certificateKeyLength property value. Key length
     * @param value Value to set for the certificateKeyLength property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateKeyLength(@jakarta.annotation.Nullable final Integer value) {
        this.certificateKeyLength = value;
    }
    /**
     * Sets the certificateKeyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the certificateKeyStorageProvider property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateKeyStorageProvider(@jakarta.annotation.Nullable final KeyStorageProviderOption value) {
        this.certificateKeyStorageProvider = value;
    }
    /**
     * Sets the certificateKeyUsage property value. Key Usage Options.
     * @param value Value to set for the certificateKeyUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateKeyUsage(@jakarta.annotation.Nullable final KeyUsages value) {
        this.certificateKeyUsage = value;
    }
    /**
     * Sets the certificateLastIssuanceStateChangedDateTime property value. Last certificate issuance state change
     * @param value Value to set for the certificateLastIssuanceStateChangedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateLastIssuanceStateChangedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.certificateLastIssuanceStateChangedDateTime = value;
    }
    /**
     * Sets the certificateProfileDisplayName property value. Certificate profile display name
     * @param value Value to set for the certificateProfileDisplayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateProfileDisplayName(@jakarta.annotation.Nullable final String value) {
        this.certificateProfileDisplayName = value;
    }
    /**
     * Sets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @param value Value to set for the certificateRevokeStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateRevokeStatus(@jakarta.annotation.Nullable final CertificateRevocationStatus value) {
        this.certificateRevokeStatus = value;
    }
    /**
     * Sets the certificateSerialNumber property value. Serial number
     * @param value Value to set for the certificateSerialNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.certificateSerialNumber = value;
    }
    /**
     * Sets the certificateSubjectAlternativeNameFormat property value. Subject Alternative Name Options.
     * @param value Value to set for the certificateSubjectAlternativeNameFormat property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateSubjectAlternativeNameFormat(@jakarta.annotation.Nullable final SubjectAlternativeNameType value) {
        this.certificateSubjectAlternativeNameFormat = value;
    }
    /**
     * Sets the certificateSubjectAlternativeNameFormatString property value. Subject alternative name format string for custom formats
     * @param value Value to set for the certificateSubjectAlternativeNameFormatString property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateSubjectAlternativeNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.certificateSubjectAlternativeNameFormatString = value;
    }
    /**
     * Sets the certificateSubjectNameFormat property value. Subject Name Format Options.
     * @param value Value to set for the certificateSubjectNameFormat property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateSubjectNameFormat(@jakarta.annotation.Nullable final SubjectNameFormat value) {
        this.certificateSubjectNameFormat = value;
    }
    /**
     * Sets the certificateSubjectNameFormatString property value. Subject name format string for custom subject name formats
     * @param value Value to set for the certificateSubjectNameFormatString property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateSubjectNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.certificateSubjectNameFormatString = value;
    }
    /**
     * Sets the certificateThumbprint property value. Thumbprint
     * @param value Value to set for the certificateThumbprint property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateThumbprint(@jakarta.annotation.Nullable final String value) {
        this.certificateThumbprint = value;
    }
    /**
     * Sets the certificateValidityPeriod property value. Validity period
     * @param value Value to set for the certificateValidityPeriod property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateValidityPeriod(@jakarta.annotation.Nullable final Integer value) {
        this.certificateValidityPeriod = value;
    }
    /**
     * Sets the certificateValidityPeriodUnits property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodUnits property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateValidityPeriodUnits(@jakarta.annotation.Nullable final CertificateValidityPeriodScale value) {
        this.certificateValidityPeriodUnits = value;
    }
    /**
     * Sets the deviceDisplayName property value. Device display name
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the devicePlatform property value. Supported platform types.
     * @param value Value to set for the devicePlatform property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDevicePlatform(@jakarta.annotation.Nullable final DevicePlatformType value) {
        this.devicePlatform = value;
    }
    /**
     * Sets the lastCertificateStateChangeDateTime property value. Last certificate issuance state change
     * @param value Value to set for the lastCertificateStateChangeDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastCertificateStateChangeDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastCertificateStateChangeDateTime = value;
    }
    /**
     * Sets the userDisplayName property value. User display name
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
}
