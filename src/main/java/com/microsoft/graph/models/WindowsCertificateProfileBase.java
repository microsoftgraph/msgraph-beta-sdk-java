package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsCertificateProfileBase extends DeviceConfiguration implements Parsable {
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale certificateValidityPeriodScale;
    /** Value for the Certificate Validity Period */
    private Integer certificateValidityPeriodValue;
    /** Key Storage Provider (KSP) Import Options. */
    private KeyStorageProviderOption keyStorageProvider;
    /** Certificate renewal threshold percentage. Valid values 1 to 99 */
    private Integer renewalThresholdPercentage;
    /** Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier. */
    private SubjectAlternativeNameType subjectAlternativeNameType;
    /** Subject Name Format Options. */
    private SubjectNameFormat subjectNameFormat;
    /**
     * Instantiates a new WindowsCertificateProfileBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsCertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.windowsCertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsCertificateProfileBase
     */
    @javax.annotation.Nonnull
    public static WindowsCertificateProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsCertificateProfileBase();
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
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this.certificateValidityPeriodValue;
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
        deserializerMap.put("keyStorageProvider", (n) -> { this.setKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption.class)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("subjectAlternativeNameType", (n) -> { this.setSubjectAlternativeNameType(n.getEnumValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("subjectNameFormat", (n) -> { this.setSubjectNameFormat(n.getEnumValue(SubjectNameFormat.class)); });
        return deserializerMap;
    }
    /**
     * Gets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a keyStorageProviderOption
     */
    @javax.annotation.Nullable
    public KeyStorageProviderOption getKeyStorageProvider() {
        return this.keyStorageProvider;
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
     * Gets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @return a subjectAlternativeNameType
     */
    @javax.annotation.Nullable
    public SubjectAlternativeNameType getSubjectAlternativeNameType() {
        return this.subjectAlternativeNameType;
    }
    /**
     * Gets the subjectNameFormat property value. Subject Name Format Options.
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
        writer.writeEnumValue("keyStorageProvider", this.getKeyStorageProvider());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
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
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @param value Value to set for the certificateValidityPeriodValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodValue(@javax.annotation.Nullable final Integer value) {
        this.certificateValidityPeriodValue = value;
    }
    /**
     * Sets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the keyStorageProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyStorageProvider(@javax.annotation.Nullable final KeyStorageProviderOption value) {
        this.keyStorageProvider = value;
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
     * Sets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @param value Value to set for the subjectAlternativeNameType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectAlternativeNameType(@javax.annotation.Nullable final SubjectAlternativeNameType value) {
        this.subjectAlternativeNameType = value;
    }
    /**
     * Sets the subjectNameFormat property value. Subject Name Format Options.
     * @param value Value to set for the subjectNameFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectNameFormat(@javax.annotation.Nullable final SubjectNameFormat value) {
        this.subjectNameFormat = value;
    }
}
