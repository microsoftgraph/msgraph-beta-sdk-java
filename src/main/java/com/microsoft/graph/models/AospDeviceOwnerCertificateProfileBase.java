package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AospDeviceOwnerCertificateProfileBase extends DeviceConfiguration implements Parsable {
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale certificateValidityPeriodScale;
    /** Value for the Certificate Validity Period. */
    private Integer certificateValidityPeriodValue;
    /** Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements. */
    private java.util.List<ExtendedKeyUsage> extendedKeyUsages;
    /** Certificate renewal threshold percentage. Valid values 1 to 99 */
    private Integer renewalThresholdPercentage;
    /** Trusted Root Certificate. */
    private AospDeviceOwnerTrustedRootCertificate rootCertificate;
    /** Certificate Subject Alternative Name Type. This collection can contain a maximum of 500 elements. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier. */
    private SubjectAlternativeNameType subjectAlternativeNameType;
    /** Certificate Subject Name Format. This collection can contain a maximum of 500 elements. Possible values are: commonName, commonNameIncludingEmail, commonNameAsEmail, custom, commonNameAsIMEI, commonNameAsSerialNumber, commonNameAsAadDeviceId, commonNameAsIntuneDeviceId, commonNameAsDurableDeviceId. */
    private SubjectNameFormat subjectNameFormat;
    /**
     * Instantiates a new AospDeviceOwnerCertificateProfileBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AospDeviceOwnerCertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.aospDeviceOwnerCertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AospDeviceOwnerCertificateProfileBase
     */
    @javax.annotation.Nonnull
    public static AospDeviceOwnerCertificateProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AospDeviceOwnerCertificateProfileBase();
    }
    /**
     * Gets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @return a certificateValidityPeriodScale
     */
    @javax.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodScale() {
        return this.certificateValidityPeriodScale;
    }
    /**
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this.certificateValidityPeriodValue;
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @return a extendedKeyUsage
     */
    @javax.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this.extendedKeyUsages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateValidityPeriodScale", (n) -> { this.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("certificateValidityPeriodValue", (n) -> { this.setCertificateValidityPeriodValue(n.getIntegerValue()); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("rootCertificate", (n) -> { this.setRootCertificate(n.getObjectValue(AospDeviceOwnerTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectAlternativeNameType", (n) -> { this.setSubjectAlternativeNameType(n.getEnumValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("subjectNameFormat", (n) -> { this.setSubjectNameFormat(n.getEnumValue(SubjectNameFormat.class)); });
        return deserializerMap;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.renewalThresholdPercentage;
    }
    /**
     * Gets the rootCertificate property value. Trusted Root Certificate.
     * @return a aospDeviceOwnerTrustedRootCertificate
     */
    @javax.annotation.Nullable
    public AospDeviceOwnerTrustedRootCertificate getRootCertificate() {
        return this.rootCertificate;
    }
    /**
     * Gets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. This collection can contain a maximum of 500 elements. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @return a subjectAlternativeNameType
     */
    @javax.annotation.Nullable
    public SubjectAlternativeNameType getSubjectAlternativeNameType() {
        return this.subjectAlternativeNameType;
    }
    /**
     * Gets the subjectNameFormat property value. Certificate Subject Name Format. This collection can contain a maximum of 500 elements. Possible values are: commonName, commonNameIncludingEmail, commonNameAsEmail, custom, commonNameAsIMEI, commonNameAsSerialNumber, commonNameAsAadDeviceId, commonNameAsIntuneDeviceId, commonNameAsDurableDeviceId.
     * @return a subjectNameFormat
     */
    @javax.annotation.Nullable
    public SubjectNameFormat getSubjectNameFormat() {
        return this.subjectNameFormat;
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
        writer.writeEnumValue("certificateValidityPeriodScale", this.getCertificateValidityPeriodScale());
        writer.writeIntegerValue("certificateValidityPeriodValue", this.getCertificateValidityPeriodValue());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeObjectValue("rootCertificate", this.getRootCertificate());
        writer.writeEnumValue("subjectAlternativeNameType", this.getSubjectAlternativeNameType());
        writer.writeEnumValue("subjectNameFormat", this.getSubjectNameFormat());
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodScale(@javax.annotation.Nullable final CertificateValidityPeriodScale value) {
        this.certificateValidityPeriodScale = value;
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @param value Value to set for the certificateValidityPeriodValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodValue(@javax.annotation.Nullable final Integer value) {
        this.certificateValidityPeriodValue = value;
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtendedKeyUsages(@javax.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.extendedKeyUsages = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @param value Value to set for the renewalThresholdPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRenewalThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this.renewalThresholdPercentage = value;
    }
    /**
     * Sets the rootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the rootCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootCertificate(@javax.annotation.Nullable final AospDeviceOwnerTrustedRootCertificate value) {
        this.rootCertificate = value;
    }
    /**
     * Sets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. This collection can contain a maximum of 500 elements. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @param value Value to set for the subjectAlternativeNameType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectAlternativeNameType(@javax.annotation.Nullable final SubjectAlternativeNameType value) {
        this.subjectAlternativeNameType = value;
    }
    /**
     * Sets the subjectNameFormat property value. Certificate Subject Name Format. This collection can contain a maximum of 500 elements. Possible values are: commonName, commonNameIncludingEmail, commonNameAsEmail, custom, commonNameAsIMEI, commonNameAsSerialNumber, commonNameAsAadDeviceId, commonNameAsIntuneDeviceId, commonNameAsDurableDeviceId.
     * @param value Value to set for the subjectNameFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectNameFormat(@javax.annotation.Nullable final SubjectNameFormat value) {
        this.subjectNameFormat = value;
    }
}
