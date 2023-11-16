package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Device Owner certificate profile base.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerCertificateProfileBase extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerCertificateProfileBase and sets the default values.
     */
    public AndroidDeviceOwnerCertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerCertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerCertificateProfileBase
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerCertificateProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidDeviceOwnerImportedPFXCertificateProfile": return new AndroidDeviceOwnerImportedPFXCertificateProfile();
                case "#microsoft.graph.androidDeviceOwnerPkcsCertificateProfile": return new AndroidDeviceOwnerPkcsCertificateProfile();
                case "#microsoft.graph.androidDeviceOwnerScepCertificateProfile": return new AndroidDeviceOwnerScepCertificateProfile();
            }
        }
        return new AndroidDeviceOwnerCertificateProfileBase();
    }
    /**
     * Gets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @return a CertificateValidityPeriodScale
     */
    @jakarta.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodScale() {
        return this.BackingStore.get("certificateValidityPeriodScale");
    }
    /**
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this.BackingStore.get("certificateValidityPeriodValue");
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<ExtendedKeyUsage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this.BackingStore.get("extendedKeyUsages");
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
        deserializerMap.put("rootCertificate", (n) -> { this.setRootCertificate(n.getObjectValue(AndroidDeviceOwnerTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectAlternativeNameType", (n) -> { this.setSubjectAlternativeNameType(n.getEnumSetValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("subjectNameFormat", (n) -> { this.setSubjectNameFormat(n.getEnumValue(SubjectNameFormat.class)); });
        return deserializerMap;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.BackingStore.get("renewalThresholdPercentage");
    }
    /**
     * Gets the rootCertificate property value. Trusted Root Certificate.
     * @return a AndroidDeviceOwnerTrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerTrustedRootCertificate getRootCertificate() {
        return this.BackingStore.get("rootCertificate");
    }
    /**
     * Gets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @return a EnumSet<SubjectAlternativeNameType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<SubjectAlternativeNameType> getSubjectAlternativeNameType() {
        return this.BackingStore.get("subjectAlternativeNameType");
    }
    /**
     * Gets the subjectNameFormat property value. Certificate Subject Name Format. Possible values are: commonName, commonNameIncludingEmail, commonNameAsEmail, custom, commonNameAsIMEI, commonNameAsSerialNumber, commonNameAsAadDeviceId, commonNameAsIntuneDeviceId, commonNameAsDurableDeviceId.
     * @return a SubjectNameFormat
     */
    @jakarta.annotation.Nullable
    public SubjectNameFormat getSubjectNameFormat() {
        return this.BackingStore.get("subjectNameFormat");
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
        this.BackingStore.set("certificateValidityPeriodScale", value);
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @param value Value to set for the certificateValidityPeriodValue property.
     */
    public void setCertificateValidityPeriodValue(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("certificateValidityPeriodValue", value);
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsages property.
     */
    public void setExtendedKeyUsages(@jakarta.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.BackingStore.set("extendedKeyUsages", value);
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @param value Value to set for the renewalThresholdPercentage property.
     */
    public void setRenewalThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("renewalThresholdPercentage", value);
    }
    /**
     * Sets the rootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the rootCertificate property.
     */
    public void setRootCertificate(@jakarta.annotation.Nullable final AndroidDeviceOwnerTrustedRootCertificate value) {
        this.BackingStore.set("rootCertificate", value);
    }
    /**
     * Sets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @param value Value to set for the subjectAlternativeNameType property.
     */
    public void setSubjectAlternativeNameType(@jakarta.annotation.Nullable final EnumSet<SubjectAlternativeNameType> value) {
        this.BackingStore.set("subjectAlternativeNameType", value);
    }
    /**
     * Sets the subjectNameFormat property value. Certificate Subject Name Format. Possible values are: commonName, commonNameIncludingEmail, commonNameAsEmail, custom, commonNameAsIMEI, commonNameAsSerialNumber, commonNameAsAadDeviceId, commonNameAsIntuneDeviceId, commonNameAsDurableDeviceId.
     * @param value Value to set for the subjectNameFormat property.
     */
    public void setSubjectNameFormat(@jakarta.annotation.Nullable final SubjectNameFormat value) {
        this.BackingStore.set("subjectNameFormat", value);
    }
}
