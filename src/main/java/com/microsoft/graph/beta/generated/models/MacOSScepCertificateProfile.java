package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Mac OS SCEP certificate profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSScepCertificateProfile extends MacOSCertificateProfileBase implements Parsable {
    /**
     * Instantiates a new {@link MacOSScepCertificateProfile} and sets the default values.
     */
    public MacOSScepCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.macOSScepCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOSScepCertificateProfile}
     */
    @jakarta.annotation.Nonnull
    public static MacOSScepCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSScepCertificateProfile();
    }
    /**
     * Gets the allowAllAppsAccess property value. AllowAllAppsAccess setting
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAllAppsAccess() {
        return this.backingStore.get("allowAllAppsAccess");
    }
    /**
     * Gets the certificateStore property value. Target store certificate. The possible values are: user, machine.
     * @return a {@link CertificateStore}
     */
    @jakarta.annotation.Nullable
    public CertificateStore getCertificateStore() {
        return this.backingStore.get("certificateStore");
    }
    /**
     * Gets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<CustomSubjectAlternativeName>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomSubjectAlternativeName> getCustomSubjectAlternativeNames() {
        return this.backingStore.get("customSubjectAlternativeNames");
    }
    /**
     * Gets the deploymentChannel property value. Indicates the deployment channel type used to deploy the configuration profile. Possible values are deviceChannel, userChannel. The possible values are: deviceChannel, userChannel, unknownFutureValue.
     * @return a {@link AppleDeploymentChannel}
     */
    @jakarta.annotation.Nullable
    public AppleDeploymentChannel getDeploymentChannel() {
        return this.backingStore.get("deploymentChannel");
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<ExtendedKeyUsage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this.backingStore.get("extendedKeyUsages");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAllAppsAccess", (n) -> { this.setAllowAllAppsAccess(n.getBooleanValue()); });
        deserializerMap.put("certificateStore", (n) -> { this.setCertificateStore(n.getEnumValue(CertificateStore::forValue)); });
        deserializerMap.put("customSubjectAlternativeNames", (n) -> { this.setCustomSubjectAlternativeNames(n.getCollectionOfObjectValues(CustomSubjectAlternativeName::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentChannel", (n) -> { this.setDeploymentChannel(n.getEnumValue(AppleDeploymentChannel::forValue)); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("hashAlgorithm", (n) -> { this.setHashAlgorithm(n.getEnumSetValue(HashAlgorithms::forValue)); });
        deserializerMap.put("keySize", (n) -> { this.setKeySize(n.getEnumValue(KeySize::forValue)); });
        deserializerMap.put("keyUsage", (n) -> { this.setKeyUsage(n.getEnumSetValue(KeyUsages::forValue)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { this.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("rootCertificate", (n) -> { this.setRootCertificate(n.getObjectValue(MacOSTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("scepServerUrls", (n) -> { this.setScepServerUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subjectAlternativeNameFormatString", (n) -> { this.setSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("subjectNameFormatString", (n) -> { this.setSubjectNameFormatString(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hashAlgorithm property value. SCEP Hash Algorithm. The possible values are: sha1, sha2.
     * @return a {@link EnumSet<HashAlgorithms>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<HashAlgorithms> getHashAlgorithm() {
        return this.backingStore.get("hashAlgorithm");
    }
    /**
     * Gets the keySize property value. Key Size Options.
     * @return a {@link KeySize}
     */
    @jakarta.annotation.Nullable
    public KeySize getKeySize() {
        return this.backingStore.get("keySize");
    }
    /**
     * Gets the keyUsage property value. Key Usage Options.
     * @return a {@link EnumSet<KeyUsages>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<KeyUsages> getKeyUsage() {
        return this.backingStore.get("keyUsage");
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a {@link java.util.List<ManagedDeviceCertificateState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this.backingStore.get("managedDeviceCertificateStates");
    }
    /**
     * Gets the rootCertificate property value. Trusted Root Certificate.
     * @return a {@link MacOSTrustedRootCertificate}
     */
    @jakarta.annotation.Nullable
    public MacOSTrustedRootCertificate getRootCertificate() {
        return this.backingStore.get("rootCertificate");
    }
    /**
     * Gets the scepServerUrls property value. SCEP Server Url(s).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScepServerUrls() {
        return this.backingStore.get("scepServerUrls");
    }
    /**
     * Gets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectAlternativeNameFormatString() {
        return this.backingStore.get("subjectAlternativeNameFormatString");
    }
    /**
     * Gets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectNameFormatString() {
        return this.backingStore.get("subjectNameFormatString");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowAllAppsAccess", this.getAllowAllAppsAccess());
        writer.writeEnumValue("certificateStore", this.getCertificateStore());
        writer.writeCollectionOfObjectValues("customSubjectAlternativeNames", this.getCustomSubjectAlternativeNames());
        writer.writeEnumValue("deploymentChannel", this.getDeploymentChannel());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeEnumSetValue("hashAlgorithm", this.getHashAlgorithm());
        writer.writeEnumValue("keySize", this.getKeySize());
        writer.writeEnumSetValue("keyUsage", this.getKeyUsage());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeObjectValue("rootCertificate", this.getRootCertificate());
        writer.writeCollectionOfPrimitiveValues("scepServerUrls", this.getScepServerUrls());
        writer.writeStringValue("subjectAlternativeNameFormatString", this.getSubjectAlternativeNameFormatString());
        writer.writeStringValue("subjectNameFormatString", this.getSubjectNameFormatString());
    }
    /**
     * Sets the allowAllAppsAccess property value. AllowAllAppsAccess setting
     * @param value Value to set for the allowAllAppsAccess property.
     */
    public void setAllowAllAppsAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAllAppsAccess", value);
    }
    /**
     * Sets the certificateStore property value. Target store certificate. The possible values are: user, machine.
     * @param value Value to set for the certificateStore property.
     */
    public void setCertificateStore(@jakarta.annotation.Nullable final CertificateStore value) {
        this.backingStore.set("certificateStore", value);
    }
    /**
     * Sets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the customSubjectAlternativeNames property.
     */
    public void setCustomSubjectAlternativeNames(@jakarta.annotation.Nullable final java.util.List<CustomSubjectAlternativeName> value) {
        this.backingStore.set("customSubjectAlternativeNames", value);
    }
    /**
     * Sets the deploymentChannel property value. Indicates the deployment channel type used to deploy the configuration profile. Possible values are deviceChannel, userChannel. The possible values are: deviceChannel, userChannel, unknownFutureValue.
     * @param value Value to set for the deploymentChannel property.
     */
    public void setDeploymentChannel(@jakarta.annotation.Nullable final AppleDeploymentChannel value) {
        this.backingStore.set("deploymentChannel", value);
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsages property.
     */
    public void setExtendedKeyUsages(@jakarta.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.backingStore.set("extendedKeyUsages", value);
    }
    /**
     * Sets the hashAlgorithm property value. SCEP Hash Algorithm. The possible values are: sha1, sha2.
     * @param value Value to set for the hashAlgorithm property.
     */
    public void setHashAlgorithm(@jakarta.annotation.Nullable final EnumSet<HashAlgorithms> value) {
        this.backingStore.set("hashAlgorithm", value);
    }
    /**
     * Sets the keySize property value. Key Size Options.
     * @param value Value to set for the keySize property.
     */
    public void setKeySize(@jakarta.annotation.Nullable final KeySize value) {
        this.backingStore.set("keySize", value);
    }
    /**
     * Sets the keyUsage property value. Key Usage Options.
     * @param value Value to set for the keyUsage property.
     */
    public void setKeyUsage(@jakarta.annotation.Nullable final EnumSet<KeyUsages> value) {
        this.backingStore.set("keyUsage", value);
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     */
    public void setManagedDeviceCertificateStates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this.backingStore.set("managedDeviceCertificateStates", value);
    }
    /**
     * Sets the rootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the rootCertificate property.
     */
    public void setRootCertificate(@jakarta.annotation.Nullable final MacOSTrustedRootCertificate value) {
        this.backingStore.set("rootCertificate", value);
    }
    /**
     * Sets the scepServerUrls property value. SCEP Server Url(s).
     * @param value Value to set for the scepServerUrls property.
     */
    public void setScepServerUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("scepServerUrls", value);
    }
    /**
     * Sets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @param value Value to set for the subjectAlternativeNameFormatString property.
     */
    public void setSubjectAlternativeNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectAlternativeNameFormatString", value);
    }
    /**
     * Sets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     */
    public void setSubjectNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectNameFormatString", value);
    }
}
