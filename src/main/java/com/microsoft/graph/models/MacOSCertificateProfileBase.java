package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Mac OS certificate profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSCertificateProfileBase extends DeviceConfiguration implements Parsable {
    /**
     * Certificate Validity Period Options.
     */
    private CertificateValidityPeriodScale certificateValidityPeriodScale;
    /**
     * Value for the Certificate Validity Period.
     */
    private Integer certificateValidityPeriodValue;
    /**
     * Certificate renewal threshold percentage.
     */
    private Integer renewalThresholdPercentage;
    /**
     * Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     */
    private EnumSet<SubjectAlternativeNameType> subjectAlternativeNameType;
    /**
     * Subject Name Format Options for Apple devices.
     */
    private AppleSubjectNameFormat subjectNameFormat;
    /**
     * Instantiates a new macOSCertificateProfileBase and sets the default values.
     */
    public MacOSCertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.macOSCertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSCertificateProfileBase
     */
    @jakarta.annotation.Nonnull
    public static MacOSCertificateProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.macOSImportedPFXCertificateProfile": return new MacOSImportedPFXCertificateProfile();
                case "#microsoft.graph.macOSPkcsCertificateProfile": return new MacOSPkcsCertificateProfile();
                case "#microsoft.graph.macOSScepCertificateProfile": return new MacOSScepCertificateProfile();
            }
        }
        return new MacOSCertificateProfileBase();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateValidityPeriodScale", (n) -> { this.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("certificateValidityPeriodValue", (n) -> { this.setCertificateValidityPeriodValue(n.getIntegerValue()); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("subjectAlternativeNameType", (n) -> { this.setSubjectAlternativeNameType(n.getEnumSetValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("subjectNameFormat", (n) -> { this.setSubjectNameFormat(n.getEnumValue(AppleSubjectNameFormat.class)); });
        return deserializerMap;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.renewalThresholdPercentage;
    }
    /**
     * Gets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @return a subjectAlternativeNameType
     */
    @jakarta.annotation.Nullable
    public SubjectAlternativeNameType getSubjectAlternativeNameType() {
        return this.subjectAlternativeNameType;
    }
    /**
     * Gets the subjectNameFormat property value. Subject Name Format Options for Apple devices.
     * @return a appleSubjectNameFormat
     */
    @jakarta.annotation.Nullable
    public AppleSubjectNameFormat getSubjectNameFormat() {
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
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
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
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage.
     * @param value Value to set for the renewalThresholdPercentage property.
     */
    public void setRenewalThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.renewalThresholdPercentage = value;
    }
    /**
     * Sets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @param value Value to set for the subjectAlternativeNameType property.
     */
    public void setSubjectAlternativeNameType(@jakarta.annotation.Nullable final SubjectAlternativeNameType value) {
        this.subjectAlternativeNameType = value;
    }
    /**
     * Sets the subjectNameFormat property value. Subject Name Format Options for Apple devices.
     * @param value Value to set for the subjectNameFormat property.
     */
    public void setSubjectNameFormat(@jakarta.annotation.Nullable final AppleSubjectNameFormat value) {
        this.subjectNameFormat = value;
    }
}
