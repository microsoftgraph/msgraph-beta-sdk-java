package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class ManagedDeviceCertificateState extends Entity implements Parsable {
    /** Extended key usage */
    private String _certificateEnhancedKeyUsage;
    /** Error code */
    private Integer _certificateErrorCode;
    /** Certificate expiry date */
    private OffsetDateTime _certificateExpirationDateTime;
    /** Issuance date */
    private OffsetDateTime _certificateIssuanceDateTime;
    /** Certificate Issuance State Options. */
    private CertificateIssuanceStates _certificateIssuanceState;
    /** Issuer */
    private String _certificateIssuer;
    /** Key length */
    private Integer _certificateKeyLength;
    /** Key Storage Provider (KSP) Import Options. */
    private KeyStorageProviderOption _certificateKeyStorageProvider;
    /** Key Usage Options. */
    private KeyUsages _certificateKeyUsage;
    /** Last certificate issuance state change */
    private OffsetDateTime _certificateLastIssuanceStateChangedDateTime;
    /** Certificate profile display name */
    private String _certificateProfileDisplayName;
    /** Certificate Revocation Status. */
    private CertificateRevocationStatus _certificateRevokeStatus;
    /** Serial number */
    private String _certificateSerialNumber;
    /** Subject Alternative Name Options. */
    private SubjectAlternativeNameType _certificateSubjectAlternativeNameFormat;
    /** Subject alternative name format string for custom formats */
    private String _certificateSubjectAlternativeNameFormatString;
    /** Subject Name Format Options. */
    private SubjectNameFormat _certificateSubjectNameFormat;
    /** Subject name format string for custom subject name formats */
    private String _certificateSubjectNameFormatString;
    /** Thumbprint */
    private String _certificateThumbprint;
    /** Validity period */
    private Integer _certificateValidityPeriod;
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale _certificateValidityPeriodUnits;
    /** Device display name */
    private String _deviceDisplayName;
    /** Supported platform types. */
    private DevicePlatformType _devicePlatform;
    /** Last certificate issuance state change */
    private OffsetDateTime _lastCertificateStateChangeDateTime;
    /** User display name */
    private String _userDisplayName;
    /**
     * Instantiates a new managedDeviceCertificateState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceCertificateState() {
        super();
        this.setOdataType("#microsoft.graph.managedDeviceCertificateState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceCertificateState
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceCertificateState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCertificateState();
    }
    /**
     * Gets the certificateEnhancedKeyUsage property value. Extended key usage
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateEnhancedKeyUsage() {
        return this._certificateEnhancedKeyUsage;
    }
    /**
     * Gets the certificateErrorCode property value. Error code
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateErrorCode() {
        return this._certificateErrorCode;
    }
    /**
     * Gets the certificateExpirationDateTime property value. Certificate expiry date
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateExpirationDateTime() {
        return this._certificateExpirationDateTime;
    }
    /**
     * Gets the certificateIssuanceDateTime property value. Issuance date
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateIssuanceDateTime() {
        return this._certificateIssuanceDateTime;
    }
    /**
     * Gets the certificateIssuanceState property value. Certificate Issuance State Options.
     * @return a certificateIssuanceStates
     */
    @javax.annotation.Nullable
    public CertificateIssuanceStates getCertificateIssuanceState() {
        return this._certificateIssuanceState;
    }
    /**
     * Gets the certificateIssuer property value. Issuer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateIssuer() {
        return this._certificateIssuer;
    }
    /**
     * Gets the certificateKeyLength property value. Key length
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateKeyLength() {
        return this._certificateKeyLength;
    }
    /**
     * Gets the certificateKeyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a keyStorageProviderOption
     */
    @javax.annotation.Nullable
    public KeyStorageProviderOption getCertificateKeyStorageProvider() {
        return this._certificateKeyStorageProvider;
    }
    /**
     * Gets the certificateKeyUsage property value. Key Usage Options.
     * @return a keyUsages
     */
    @javax.annotation.Nullable
    public KeyUsages getCertificateKeyUsage() {
        return this._certificateKeyUsage;
    }
    /**
     * Gets the certificateLastIssuanceStateChangedDateTime property value. Last certificate issuance state change
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateLastIssuanceStateChangedDateTime() {
        return this._certificateLastIssuanceStateChangedDateTime;
    }
    /**
     * Gets the certificateProfileDisplayName property value. Certificate profile display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateProfileDisplayName() {
        return this._certificateProfileDisplayName;
    }
    /**
     * Gets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @return a certificateRevocationStatus
     */
    @javax.annotation.Nullable
    public CertificateRevocationStatus getCertificateRevokeStatus() {
        return this._certificateRevokeStatus;
    }
    /**
     * Gets the certificateSerialNumber property value. Serial number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this._certificateSerialNumber;
    }
    /**
     * Gets the certificateSubjectAlternativeNameFormat property value. Subject Alternative Name Options.
     * @return a subjectAlternativeNameType
     */
    @javax.annotation.Nullable
    public SubjectAlternativeNameType getCertificateSubjectAlternativeNameFormat() {
        return this._certificateSubjectAlternativeNameFormat;
    }
    /**
     * Gets the certificateSubjectAlternativeNameFormatString property value. Subject alternative name format string for custom formats
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSubjectAlternativeNameFormatString() {
        return this._certificateSubjectAlternativeNameFormatString;
    }
    /**
     * Gets the certificateSubjectNameFormat property value. Subject Name Format Options.
     * @return a subjectNameFormat
     */
    @javax.annotation.Nullable
    public SubjectNameFormat getCertificateSubjectNameFormat() {
        return this._certificateSubjectNameFormat;
    }
    /**
     * Gets the certificateSubjectNameFormatString property value. Subject name format string for custom subject name formats
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSubjectNameFormatString() {
        return this._certificateSubjectNameFormatString;
    }
    /**
     * Gets the certificateThumbprint property value. Thumbprint
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateThumbprint() {
        return this._certificateThumbprint;
    }
    /**
     * Gets the certificateValidityPeriod property value. Validity period
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateValidityPeriod() {
        return this._certificateValidityPeriod;
    }
    /**
     * Gets the certificateValidityPeriodUnits property value. Certificate Validity Period Options.
     * @return a certificateValidityPeriodScale
     */
    @javax.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodUnits() {
        return this._certificateValidityPeriodUnits;
    }
    /**
     * Gets the deviceDisplayName property value. Device display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this._deviceDisplayName;
    }
    /**
     * Gets the devicePlatform property value. Supported platform types.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getDevicePlatform() {
        return this._devicePlatform;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceCertificateState currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateEnhancedKeyUsage", (n) -> { currentObject.setCertificateEnhancedKeyUsage(n.getStringValue()); });
        deserializerMap.put("certificateErrorCode", (n) -> { currentObject.setCertificateErrorCode(n.getIntegerValue()); });
        deserializerMap.put("certificateExpirationDateTime", (n) -> { currentObject.setCertificateExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateIssuanceDateTime", (n) -> { currentObject.setCertificateIssuanceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateIssuanceState", (n) -> { currentObject.setCertificateIssuanceState(n.getEnumValue(CertificateIssuanceStates.class)); });
        deserializerMap.put("certificateIssuer", (n) -> { currentObject.setCertificateIssuer(n.getStringValue()); });
        deserializerMap.put("certificateKeyLength", (n) -> { currentObject.setCertificateKeyLength(n.getIntegerValue()); });
        deserializerMap.put("certificateKeyStorageProvider", (n) -> { currentObject.setCertificateKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption.class)); });
        deserializerMap.put("certificateKeyUsage", (n) -> { currentObject.setCertificateKeyUsage(n.getEnumValue(KeyUsages.class)); });
        deserializerMap.put("certificateLastIssuanceStateChangedDateTime", (n) -> { currentObject.setCertificateLastIssuanceStateChangedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("certificateProfileDisplayName", (n) -> { currentObject.setCertificateProfileDisplayName(n.getStringValue()); });
        deserializerMap.put("certificateRevokeStatus", (n) -> { currentObject.setCertificateRevokeStatus(n.getEnumValue(CertificateRevocationStatus.class)); });
        deserializerMap.put("certificateSerialNumber", (n) -> { currentObject.setCertificateSerialNumber(n.getStringValue()); });
        deserializerMap.put("certificateSubjectAlternativeNameFormat", (n) -> { currentObject.setCertificateSubjectAlternativeNameFormat(n.getEnumValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("certificateSubjectAlternativeNameFormatString", (n) -> { currentObject.setCertificateSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("certificateSubjectNameFormat", (n) -> { currentObject.setCertificateSubjectNameFormat(n.getEnumValue(SubjectNameFormat.class)); });
        deserializerMap.put("certificateSubjectNameFormatString", (n) -> { currentObject.setCertificateSubjectNameFormatString(n.getStringValue()); });
        deserializerMap.put("certificateThumbprint", (n) -> { currentObject.setCertificateThumbprint(n.getStringValue()); });
        deserializerMap.put("certificateValidityPeriod", (n) -> { currentObject.setCertificateValidityPeriod(n.getIntegerValue()); });
        deserializerMap.put("certificateValidityPeriodUnits", (n) -> { currentObject.setCertificateValidityPeriodUnits(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("devicePlatform", (n) -> { currentObject.setDevicePlatform(n.getEnumValue(DevicePlatformType.class)); });
        deserializerMap.put("lastCertificateStateChangeDateTime", (n) -> { currentObject.setLastCertificateStateChangeDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the lastCertificateStateChangeDateTime property value. Last certificate issuance state change
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCertificateStateChangeDateTime() {
        return this._lastCertificateStateChangeDateTime;
    }
    /**
     * Gets the userDisplayName property value. User display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
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
    @javax.annotation.Nonnull
    public void setCertificateEnhancedKeyUsage(@javax.annotation.Nullable final String value) {
        this._certificateEnhancedKeyUsage = value;
    }
    /**
     * Sets the certificateErrorCode property value. Error code
     * @param value Value to set for the certificateErrorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateErrorCode(@javax.annotation.Nullable final Integer value) {
        this._certificateErrorCode = value;
    }
    /**
     * Sets the certificateExpirationDateTime property value. Certificate expiry date
     * @param value Value to set for the certificateExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certificateExpirationDateTime = value;
    }
    /**
     * Sets the certificateIssuanceDateTime property value. Issuance date
     * @param value Value to set for the certificateIssuanceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateIssuanceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certificateIssuanceDateTime = value;
    }
    /**
     * Sets the certificateIssuanceState property value. Certificate Issuance State Options.
     * @param value Value to set for the certificateIssuanceState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateIssuanceState(@javax.annotation.Nullable final CertificateIssuanceStates value) {
        this._certificateIssuanceState = value;
    }
    /**
     * Sets the certificateIssuer property value. Issuer
     * @param value Value to set for the certificateIssuer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateIssuer(@javax.annotation.Nullable final String value) {
        this._certificateIssuer = value;
    }
    /**
     * Sets the certificateKeyLength property value. Key length
     * @param value Value to set for the certificateKeyLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateKeyLength(@javax.annotation.Nullable final Integer value) {
        this._certificateKeyLength = value;
    }
    /**
     * Sets the certificateKeyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the certificateKeyStorageProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateKeyStorageProvider(@javax.annotation.Nullable final KeyStorageProviderOption value) {
        this._certificateKeyStorageProvider = value;
    }
    /**
     * Sets the certificateKeyUsage property value. Key Usage Options.
     * @param value Value to set for the certificateKeyUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateKeyUsage(@javax.annotation.Nullable final KeyUsages value) {
        this._certificateKeyUsage = value;
    }
    /**
     * Sets the certificateLastIssuanceStateChangedDateTime property value. Last certificate issuance state change
     * @param value Value to set for the certificateLastIssuanceStateChangedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateLastIssuanceStateChangedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certificateLastIssuanceStateChangedDateTime = value;
    }
    /**
     * Sets the certificateProfileDisplayName property value. Certificate profile display name
     * @param value Value to set for the certificateProfileDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateProfileDisplayName(@javax.annotation.Nullable final String value) {
        this._certificateProfileDisplayName = value;
    }
    /**
     * Sets the certificateRevokeStatus property value. Certificate Revocation Status.
     * @param value Value to set for the certificateRevokeStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateRevokeStatus(@javax.annotation.Nullable final CertificateRevocationStatus value) {
        this._certificateRevokeStatus = value;
    }
    /**
     * Sets the certificateSerialNumber property value. Serial number
     * @param value Value to set for the certificateSerialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSerialNumber(@javax.annotation.Nullable final String value) {
        this._certificateSerialNumber = value;
    }
    /**
     * Sets the certificateSubjectAlternativeNameFormat property value. Subject Alternative Name Options.
     * @param value Value to set for the certificateSubjectAlternativeNameFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSubjectAlternativeNameFormat(@javax.annotation.Nullable final SubjectAlternativeNameType value) {
        this._certificateSubjectAlternativeNameFormat = value;
    }
    /**
     * Sets the certificateSubjectAlternativeNameFormatString property value. Subject alternative name format string for custom formats
     * @param value Value to set for the certificateSubjectAlternativeNameFormatString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSubjectAlternativeNameFormatString(@javax.annotation.Nullable final String value) {
        this._certificateSubjectAlternativeNameFormatString = value;
    }
    /**
     * Sets the certificateSubjectNameFormat property value. Subject Name Format Options.
     * @param value Value to set for the certificateSubjectNameFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSubjectNameFormat(@javax.annotation.Nullable final SubjectNameFormat value) {
        this._certificateSubjectNameFormat = value;
    }
    /**
     * Sets the certificateSubjectNameFormatString property value. Subject name format string for custom subject name formats
     * @param value Value to set for the certificateSubjectNameFormatString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateSubjectNameFormatString(@javax.annotation.Nullable final String value) {
        this._certificateSubjectNameFormatString = value;
    }
    /**
     * Sets the certificateThumbprint property value. Thumbprint
     * @param value Value to set for the certificateThumbprint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateThumbprint(@javax.annotation.Nullable final String value) {
        this._certificateThumbprint = value;
    }
    /**
     * Sets the certificateValidityPeriod property value. Validity period
     * @param value Value to set for the certificateValidityPeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriod(@javax.annotation.Nullable final Integer value) {
        this._certificateValidityPeriod = value;
    }
    /**
     * Sets the certificateValidityPeriodUnits property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodUnits(@javax.annotation.Nullable final CertificateValidityPeriodScale value) {
        this._certificateValidityPeriodUnits = value;
    }
    /**
     * Sets the deviceDisplayName property value. Device display name
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceDisplayName = value;
    }
    /**
     * Sets the devicePlatform property value. Supported platform types.
     * @param value Value to set for the devicePlatform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicePlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this._devicePlatform = value;
    }
    /**
     * Sets the lastCertificateStateChangeDateTime property value. Last certificate issuance state change
     * @param value Value to set for the lastCertificateStateChangeDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastCertificateStateChangeDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCertificateStateChangeDateTime = value;
    }
    /**
     * Sets the userDisplayName property value. User display name
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
}
