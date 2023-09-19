package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android For Work certificate profile base.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkCertificateProfileBase extends DeviceConfiguration implements Parsable {
    /**
     * Certificate Validity Period Options.
     */
    private CertificateValidityPeriodScale certificateValidityPeriodScale;
    /**
     * Value for the Certificate Validity Period.
     */
    private Integer certificateValidityPeriodValue;
    /**
     * Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<ExtendedKeyUsage> extendedKeyUsages;
    /**
     * Certificate renewal threshold percentage. Valid values 1 to 99
     */
    private Integer renewalThresholdPercentage;
    /**
     * Trusted Root Certificate.
     */
    private AndroidForWorkTrustedRootCertificate rootCertificate;
    /**
     * Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     */
    private EnumSet<SubjectAlternativeNameType> subjectAlternativeNameType;
    /**
     * Subject Name Format Options.
     */
    private SubjectNameFormat subjectNameFormat;
    /**
     * Instantiates a new androidForWorkCertificateProfileBase and sets the default values.
     */
    public AndroidForWorkCertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkCertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidForWorkCertificateProfileBase
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkCertificateProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidForWorkPkcsCertificateProfile": return new AndroidForWorkPkcsCertificateProfile();
                case "#microsoft.graph.androidForWorkScepCertificateProfile": return new AndroidForWorkScepCertificateProfile();
            }
        }
        return new AndroidForWorkCertificateProfileBase();
    }
    /**
     * Gets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @return a certificateValidityPeriodScale
     */
    @jakarta.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodScale() {
        return this.certificateValidityPeriodScale;
    }
    /**
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this.certificateValidityPeriodValue;
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @return a extendedKeyUsage
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this.extendedKeyUsages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateValidityPeriodScale", (n) -> { this.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("certificateValidityPeriodValue", (n) -> { this.setCertificateValidityPeriodValue(n.getIntegerValue()); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("rootCertificate", (n) -> { this.setRootCertificate(n.getObjectValue(AndroidForWorkTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectAlternativeNameType", (n) -> { this.setSubjectAlternativeNameType(n.getEnumSetValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("subjectNameFormat", (n) -> { this.setSubjectNameFormat(n.getEnumValue(SubjectNameFormat.class)); });
        return deserializerMap;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.renewalThresholdPercentage;
    }
    /**
     * Gets the rootCertificate property value. Trusted Root Certificate.
     * @return a androidForWorkTrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkTrustedRootCertificate getRootCertificate() {
        return this.rootCertificate;
    }
    /**
     * Gets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @return a subjectAlternativeNameType
     */
    @jakarta.annotation.Nullable
    public EnumSet<SubjectAlternativeNameType> getSubjectAlternativeNameType() {
        return this.subjectAlternativeNameType;
    }
    /**
     * Gets the subjectNameFormat property value. Subject Name Format Options.
     * @return a subjectNameFormat
     */
    @jakarta.annotation.Nullable
    public SubjectNameFormat getSubjectNameFormat() {
        return this.subjectNameFormat;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateValidityPeriodScale", this.getCertificateValidityPeriodScale());
        writer.writeIntegerValue("certificateValidityPeriodValue", this.getCertificateValidityPeriodValue());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeObjectValue("rootCertificate", this.getRootCertificate());
        writer.writeEnumSetValue("subjectAlternativeNameType", this.getSubjectAlternativeNameType());
        writer.writeEnumValue("subjectNameFormat", this.getSubjectNameFormat());
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     */
    public void setCertificateValidityPeriodScale(@jakarta.annotation.Nullable final CertificateValidityPeriodScale value) {
        this.certificateValidityPeriodScale = value;
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @param value Value to set for the certificateValidityPeriodValue property.
     */
    public void setCertificateValidityPeriodValue(@jakarta.annotation.Nullable final Integer value) {
        this.certificateValidityPeriodValue = value;
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsages property.
     */
    public void setExtendedKeyUsages(@jakarta.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.extendedKeyUsages = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @param value Value to set for the renewalThresholdPercentage property.
     */
    public void setRenewalThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.renewalThresholdPercentage = value;
    }
    /**
     * Sets the rootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the rootCertificate property.
     */
    public void setRootCertificate(@jakarta.annotation.Nullable final AndroidForWorkTrustedRootCertificate value) {
        this.rootCertificate = value;
    }
    /**
     * Sets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @param value Value to set for the subjectAlternativeNameType property.
     */
    public void setSubjectAlternativeNameType(@jakarta.annotation.Nullable final EnumSet<SubjectAlternativeNameType> value) {
        this.subjectAlternativeNameType = value;
    }
    /**
     * Sets the subjectNameFormat property value. Subject Name Format Options.
     * @param value Value to set for the subjectNameFormat property.
     */
    public void setSubjectNameFormat(@jakarta.annotation.Nullable final SubjectNameFormat value) {
        this.subjectNameFormat = value;
    }
}
