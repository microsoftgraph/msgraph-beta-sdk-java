package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsCertificateProfileBase extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link WindowsCertificateProfileBase} and sets the default values.
     */
    public WindowsCertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.windowsCertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsCertificateProfileBase}
     */
    @jakarta.annotation.Nonnull
    public static WindowsCertificateProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windows10CertificateProfileBase": return new Windows10CertificateProfileBase();
                case "#microsoft.graph.windows10ImportedPFXCertificateProfile": return new Windows10ImportedPFXCertificateProfile();
                case "#microsoft.graph.windows10PkcsCertificateProfile": return new Windows10PkcsCertificateProfile();
                case "#microsoft.graph.windows81CertificateProfileBase": return new Windows81CertificateProfileBase();
                case "#microsoft.graph.windows81SCEPCertificateProfile": return new Windows81SCEPCertificateProfile();
                case "#microsoft.graph.windowsPhone81ImportedPFXCertificateProfile": return new WindowsPhone81ImportedPFXCertificateProfile();
            }
        }
        return new WindowsCertificateProfileBase();
    }
    /**
     * Gets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @return a {@link CertificateValidityPeriodScale}
     */
    @jakarta.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodScale() {
        return this.backingStore.get("certificateValidityPeriodScale");
    }
    /**
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this.backingStore.get("certificateValidityPeriodValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateValidityPeriodScale", (n) -> { this.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale::forValue)); });
        deserializerMap.put("certificateValidityPeriodValue", (n) -> { this.setCertificateValidityPeriodValue(n.getIntegerValue()); });
        deserializerMap.put("keyStorageProvider", (n) -> { this.setKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption::forValue)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("subjectAlternativeNameType", (n) -> { this.setSubjectAlternativeNameType(n.getEnumSetValue(SubjectAlternativeNameType::forValue)); });
        deserializerMap.put("subjectNameFormat", (n) -> { this.setSubjectNameFormat(n.getEnumValue(SubjectNameFormat::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a {@link KeyStorageProviderOption}
     */
    @jakarta.annotation.Nullable
    public KeyStorageProviderOption getKeyStorageProvider() {
        return this.backingStore.get("keyStorageProvider");
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.backingStore.get("renewalThresholdPercentage");
    }
    /**
     * Gets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @return a {@link EnumSet<SubjectAlternativeNameType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<SubjectAlternativeNameType> getSubjectAlternativeNameType() {
        return this.backingStore.get("subjectAlternativeNameType");
    }
    /**
     * Gets the subjectNameFormat property value. Subject Name Format Options.
     * @return a {@link SubjectNameFormat}
     */
    @jakarta.annotation.Nullable
    public SubjectNameFormat getSubjectNameFormat() {
        return this.backingStore.get("subjectNameFormat");
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
        writer.writeEnumValue("keyStorageProvider", this.getKeyStorageProvider());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeEnumSetValue("subjectAlternativeNameType", this.getSubjectAlternativeNameType());
        writer.writeEnumValue("subjectNameFormat", this.getSubjectNameFormat());
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     */
    public void setCertificateValidityPeriodScale(@jakarta.annotation.Nullable final CertificateValidityPeriodScale value) {
        this.backingStore.set("certificateValidityPeriodScale", value);
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @param value Value to set for the certificateValidityPeriodValue property.
     */
    public void setCertificateValidityPeriodValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("certificateValidityPeriodValue", value);
    }
    /**
     * Sets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the keyStorageProvider property.
     */
    public void setKeyStorageProvider(@jakarta.annotation.Nullable final KeyStorageProviderOption value) {
        this.backingStore.set("keyStorageProvider", value);
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @param value Value to set for the renewalThresholdPercentage property.
     */
    public void setRenewalThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("renewalThresholdPercentage", value);
    }
    /**
     * Sets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @param value Value to set for the subjectAlternativeNameType property.
     */
    public void setSubjectAlternativeNameType(@jakarta.annotation.Nullable final EnumSet<SubjectAlternativeNameType> value) {
        this.backingStore.set("subjectAlternativeNameType", value);
    }
    /**
     * Sets the subjectNameFormat property value. Subject Name Format Options.
     * @param value Value to set for the subjectNameFormat property.
     */
    public void setSubjectNameFormat(@jakarta.annotation.Nullable final SubjectNameFormat value) {
        this.backingStore.set("subjectNameFormat", value);
    }
}
