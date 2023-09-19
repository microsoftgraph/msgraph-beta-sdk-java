package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS SCEP certificate profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosScepCertificateProfile extends IosCertificateProfileBase implements Parsable {
    /**
     * Target store certificate. Possible values are: user, machine.
     */
    private CertificateStore certificateStore;
    /**
     * Custom Subject Alternative Name Settings. The OnPremisesUserPrincipalName variable is support as well as others documented here: https://go.microsoft.com/fwlink/?LinkId=2027630. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<CustomSubjectAlternativeName> customSubjectAlternativeNames;
    /**
     * Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<ExtendedKeyUsage> extendedKeyUsages;
    /**
     * Key Size Options.
     */
    private KeySize keySize;
    /**
     * Key Usage Options.
     */
    private EnumSet<KeyUsages> keyUsage;
    /**
     * Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     */
    private java.util.List<ManagedDeviceCertificateState> managedDeviceCertificateStates;
    /**
     * Trusted Root Certificate.
     */
    private IosTrustedRootCertificate rootCertificate;
    /**
     * SCEP Server Url(s).
     */
    private java.util.List<String> scepServerUrls;
    /**
     * Custom String that defines the AAD Attribute.
     */
    private String subjectAlternativeNameFormatString;
    /**
     * Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     */
    private String subjectNameFormatString;
    /**
     * Instantiates a new iosScepCertificateProfile and sets the default values.
     */
    public IosScepCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.iosScepCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosScepCertificateProfile
     */
    @jakarta.annotation.Nonnull
    public static IosScepCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosScepCertificateProfile();
    }
    /**
     * Gets the certificateStore property value. Target store certificate. Possible values are: user, machine.
     * @return a certificateStore
     */
    @jakarta.annotation.Nullable
    public CertificateStore getCertificateStore() {
        return this.certificateStore;
    }
    /**
     * Gets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. The OnPremisesUserPrincipalName variable is support as well as others documented here: https://go.microsoft.com/fwlink/?LinkId=2027630. This collection can contain a maximum of 500 elements.
     * @return a customSubjectAlternativeName
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomSubjectAlternativeName> getCustomSubjectAlternativeNames() {
        return this.customSubjectAlternativeNames;
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
        deserializerMap.put("certificateStore", (n) -> { this.setCertificateStore(n.getEnumValue(CertificateStore.class)); });
        deserializerMap.put("customSubjectAlternativeNames", (n) -> { this.setCustomSubjectAlternativeNames(n.getCollectionOfObjectValues(CustomSubjectAlternativeName::createFromDiscriminatorValue)); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("keySize", (n) -> { this.setKeySize(n.getEnumValue(KeySize.class)); });
        deserializerMap.put("keyUsage", (n) -> { this.setKeyUsage(n.getEnumSetValue(KeyUsages.class)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { this.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("rootCertificate", (n) -> { this.setRootCertificate(n.getObjectValue(IosTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("scepServerUrls", (n) -> { this.setScepServerUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subjectAlternativeNameFormatString", (n) -> { this.setSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("subjectNameFormatString", (n) -> { this.setSubjectNameFormatString(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keySize property value. Key Size Options.
     * @return a keySize
     */
    @jakarta.annotation.Nullable
    public KeySize getKeySize() {
        return this.keySize;
    }
    /**
     * Gets the keyUsage property value. Key Usage Options.
     * @return a keyUsages
     */
    @jakarta.annotation.Nullable
    public EnumSet<KeyUsages> getKeyUsage() {
        return this.keyUsage;
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a managedDeviceCertificateState
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this.managedDeviceCertificateStates;
    }
    /**
     * Gets the rootCertificate property value. Trusted Root Certificate.
     * @return a iosTrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public IosTrustedRootCertificate getRootCertificate() {
        return this.rootCertificate;
    }
    /**
     * Gets the scepServerUrls property value. SCEP Server Url(s).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScepServerUrls() {
        return this.scepServerUrls;
    }
    /**
     * Gets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubjectAlternativeNameFormatString() {
        return this.subjectAlternativeNameFormatString;
    }
    /**
     * Gets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubjectNameFormatString() {
        return this.subjectNameFormatString;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateStore", this.getCertificateStore());
        writer.writeCollectionOfObjectValues("customSubjectAlternativeNames", this.getCustomSubjectAlternativeNames());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeEnumValue("keySize", this.getKeySize());
        writer.writeEnumSetValue("keyUsage", this.getKeyUsage());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeObjectValue("rootCertificate", this.getRootCertificate());
        writer.writeCollectionOfPrimitiveValues("scepServerUrls", this.getScepServerUrls());
        writer.writeStringValue("subjectAlternativeNameFormatString", this.getSubjectAlternativeNameFormatString());
        writer.writeStringValue("subjectNameFormatString", this.getSubjectNameFormatString());
    }
    /**
     * Sets the certificateStore property value. Target store certificate. Possible values are: user, machine.
     * @param value Value to set for the certificateStore property.
     */
    public void setCertificateStore(@jakarta.annotation.Nullable final CertificateStore value) {
        this.certificateStore = value;
    }
    /**
     * Sets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. The OnPremisesUserPrincipalName variable is support as well as others documented here: https://go.microsoft.com/fwlink/?LinkId=2027630. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the customSubjectAlternativeNames property.
     */
    public void setCustomSubjectAlternativeNames(@jakarta.annotation.Nullable final java.util.List<CustomSubjectAlternativeName> value) {
        this.customSubjectAlternativeNames = value;
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsages property.
     */
    public void setExtendedKeyUsages(@jakarta.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.extendedKeyUsages = value;
    }
    /**
     * Sets the keySize property value. Key Size Options.
     * @param value Value to set for the keySize property.
     */
    public void setKeySize(@jakarta.annotation.Nullable final KeySize value) {
        this.keySize = value;
    }
    /**
     * Sets the keyUsage property value. Key Usage Options.
     * @param value Value to set for the keyUsage property.
     */
    public void setKeyUsage(@jakarta.annotation.Nullable final EnumSet<KeyUsages> value) {
        this.keyUsage = value;
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     */
    public void setManagedDeviceCertificateStates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this.managedDeviceCertificateStates = value;
    }
    /**
     * Sets the rootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the rootCertificate property.
     */
    public void setRootCertificate(@jakarta.annotation.Nullable final IosTrustedRootCertificate value) {
        this.rootCertificate = value;
    }
    /**
     * Sets the scepServerUrls property value. SCEP Server Url(s).
     * @param value Value to set for the scepServerUrls property.
     */
    public void setScepServerUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.scepServerUrls = value;
    }
    /**
     * Sets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @param value Value to set for the subjectAlternativeNameFormatString property.
     */
    public void setSubjectAlternativeNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.subjectAlternativeNameFormatString = value;
    }
    /**
     * Sets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     */
    public void setSubjectNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.subjectNameFormatString = value;
    }
}
