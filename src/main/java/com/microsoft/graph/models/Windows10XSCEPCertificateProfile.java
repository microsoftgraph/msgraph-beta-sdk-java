package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Windows X SCEP Certificate configuration profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10XSCEPCertificateProfile extends Windows10XCertificateProfile implements Parsable {
    /**
     * Instantiates a new Windows10XSCEPCertificateProfile and sets the default values.
     */
    public Windows10XSCEPCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.windows10XSCEPCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10XSCEPCertificateProfile
     */
    @jakarta.annotation.Nonnull
    public static Windows10XSCEPCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10XSCEPCertificateProfile();
    }
    /**
     * Gets the certificateStore property value. CertificateStore types
     * @return a CertificateStore
     */
    @jakarta.annotation.Nullable
    public CertificateStore getCertificateStore() {
        return this.BackingStore.get("certificateStore");
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
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this.BackingStore.get("certificateValidityPeriodValue");
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings.
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
        deserializerMap.put("certificateStore", (n) -> { this.setCertificateStore(n.getEnumValue(CertificateStore.class)); });
        deserializerMap.put("certificateValidityPeriodScale", (n) -> { this.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("certificateValidityPeriodValue", (n) -> { this.setCertificateValidityPeriodValue(n.getIntegerValue()); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("hashAlgorithm", (n) -> { this.setHashAlgorithm(n.getCollectionOfEnumValues(HashAlgorithms.class)); });
        deserializerMap.put("keySize", (n) -> { this.setKeySize(n.getEnumValue(KeySize.class)); });
        deserializerMap.put("keyStorageProvider", (n) -> { this.setKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption.class)); });
        deserializerMap.put("keyUsage", (n) -> { this.setKeyUsage(n.getEnumSetValue(KeyUsages.class)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("rootCertificateId", (n) -> { this.setRootCertificateId(n.getUUIDValue()); });
        deserializerMap.put("scepServerUrls", (n) -> { this.setScepServerUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subjectAlternativeNameFormats", (n) -> { this.setSubjectAlternativeNameFormats(n.getCollectionOfObjectValues(Windows10XCustomSubjectAlternativeName::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectNameFormatString", (n) -> { this.setSubjectNameFormatString(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hashAlgorithm property value. SCEP Hash Algorithm.
     * @return a java.util.List<HashAlgorithms>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HashAlgorithms> getHashAlgorithm() {
        return this.BackingStore.get("hashAlgorithm");
    }
    /**
     * Gets the keySize property value. Key Size Options.
     * @return a KeySize
     */
    @jakarta.annotation.Nullable
    public KeySize getKeySize() {
        return this.BackingStore.get("keySize");
    }
    /**
     * Gets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a KeyStorageProviderOption
     */
    @jakarta.annotation.Nullable
    public KeyStorageProviderOption getKeyStorageProvider() {
        return this.BackingStore.get("keyStorageProvider");
    }
    /**
     * Gets the keyUsage property value. Key Usage Options.
     * @return a EnumSet<KeyUsages>
     */
    @jakarta.annotation.Nullable
    public EnumSet<KeyUsages> getKeyUsage() {
        return this.BackingStore.get("keyUsage");
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.BackingStore.get("renewalThresholdPercentage");
    }
    /**
     * Gets the rootCertificateId property value. Trusted Root Certificate ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getRootCertificateId() {
        return this.BackingStore.get("rootCertificateId");
    }
    /**
     * Gets the scepServerUrls property value. SCEP Server Url(s).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScepServerUrls() {
        return this.BackingStore.get("scepServerUrls");
    }
    /**
     * Gets the subjectAlternativeNameFormats property value. Custom AAD Attributes.
     * @return a java.util.List<Windows10XCustomSubjectAlternativeName>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Windows10XCustomSubjectAlternativeName> getSubjectAlternativeNameFormats() {
        return this.BackingStore.get("subjectAlternativeNameFormats");
    }
    /**
     * Gets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubjectNameFormatString() {
        return this.BackingStore.get("subjectNameFormatString");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateStore", this.getCertificateStore());
        writer.writeEnumValue("certificateValidityPeriodScale", this.getCertificateValidityPeriodScale());
        writer.writeIntegerValue("certificateValidityPeriodValue", this.getCertificateValidityPeriodValue());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeCollectionOfEnumValues("hashAlgorithm", this.getHashAlgorithm());
        writer.writeEnumValue("keySize", this.getKeySize());
        writer.writeEnumValue("keyStorageProvider", this.getKeyStorageProvider());
        writer.writeEnumSetValue("keyUsage", this.getKeyUsage());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeUUIDValue("rootCertificateId", this.getRootCertificateId());
        writer.writeCollectionOfPrimitiveValues("scepServerUrls", this.getScepServerUrls());
        writer.writeCollectionOfObjectValues("subjectAlternativeNameFormats", this.getSubjectAlternativeNameFormats());
        writer.writeStringValue("subjectNameFormatString", this.getSubjectNameFormatString());
    }
    /**
     * Sets the certificateStore property value. CertificateStore types
     * @param value Value to set for the certificateStore property.
     */
    public void setCertificateStore(@jakarta.annotation.Nullable final CertificateStore value) {
        this.BackingStore.set("certificateStore", value);
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     */
    public void setCertificateValidityPeriodScale(@jakarta.annotation.Nullable final CertificateValidityPeriodScale value) {
        this.BackingStore.set("certificateValidityPeriodScale", value);
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @param value Value to set for the certificateValidityPeriodValue property.
     */
    public void setCertificateValidityPeriodValue(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("certificateValidityPeriodValue", value);
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings.
     * @param value Value to set for the extendedKeyUsages property.
     */
    public void setExtendedKeyUsages(@jakarta.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.BackingStore.set("extendedKeyUsages", value);
    }
    /**
     * Sets the hashAlgorithm property value. SCEP Hash Algorithm.
     * @param value Value to set for the hashAlgorithm property.
     */
    public void setHashAlgorithm(@jakarta.annotation.Nullable final java.util.List<HashAlgorithms> value) {
        this.BackingStore.set("hashAlgorithm", value);
    }
    /**
     * Sets the keySize property value. Key Size Options.
     * @param value Value to set for the keySize property.
     */
    public void setKeySize(@jakarta.annotation.Nullable final KeySize value) {
        this.BackingStore.set("keySize", value);
    }
    /**
     * Sets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the keyStorageProvider property.
     */
    public void setKeyStorageProvider(@jakarta.annotation.Nullable final KeyStorageProviderOption value) {
        this.BackingStore.set("keyStorageProvider", value);
    }
    /**
     * Sets the keyUsage property value. Key Usage Options.
     * @param value Value to set for the keyUsage property.
     */
    public void setKeyUsage(@jakarta.annotation.Nullable final EnumSet<KeyUsages> value) {
        this.BackingStore.set("keyUsage", value);
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage
     * @param value Value to set for the renewalThresholdPercentage property.
     */
    public void setRenewalThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("renewalThresholdPercentage", value);
    }
    /**
     * Sets the rootCertificateId property value. Trusted Root Certificate ID
     * @param value Value to set for the rootCertificateId property.
     */
    public void setRootCertificateId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("rootCertificateId", value);
    }
    /**
     * Sets the scepServerUrls property value. SCEP Server Url(s).
     * @param value Value to set for the scepServerUrls property.
     */
    public void setScepServerUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("scepServerUrls", value);
    }
    /**
     * Sets the subjectAlternativeNameFormats property value. Custom AAD Attributes.
     * @param value Value to set for the subjectAlternativeNameFormats property.
     */
    public void setSubjectAlternativeNameFormats(@jakarta.annotation.Nullable final java.util.List<Windows10XCustomSubjectAlternativeName> value) {
        this.BackingStore.set("subjectAlternativeNameFormats", value);
    }
    /**
     * Sets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     */
    public void setSubjectNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("subjectNameFormatString", value);
    }
}
