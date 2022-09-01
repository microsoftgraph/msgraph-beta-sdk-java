package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10XSCEPCertificateProfile extends Windows10XCertificateProfile implements Parsable {
    /** CertificateStore types */
    private CertificateStore _certificateStore;
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale _certificateValidityPeriodScale;
    /** Value for the Certificate Validity Period */
    private Integer _certificateValidityPeriodValue;
    /** Extended Key Usage (EKU) settings. */
    private java.util.List<ExtendedKeyUsage> _extendedKeyUsages;
    /** SCEP Hash Algorithm. */
    private java.util.List<String> _hashAlgorithm;
    /** Key Size Options. */
    private KeySize _keySize;
    /** Key Storage Provider (KSP) Import Options. */
    private KeyStorageProviderOption _keyStorageProvider;
    /** Key Usage Options. */
    private KeyUsages _keyUsage;
    /** Certificate renewal threshold percentage */
    private Integer _renewalThresholdPercentage;
    /** Trusted Root Certificate ID */
    private String _rootCertificateId;
    /** SCEP Server Url(s). */
    private java.util.List<String> _scepServerUrls;
    /** Custom AAD Attributes. */
    private java.util.List<Windows10XCustomSubjectAlternativeName> _subjectAlternativeNameFormats;
    /** Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US */
    private String _subjectNameFormatString;
    /**
     * Instantiates a new Windows10XSCEPCertificateProfile and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static Windows10XSCEPCertificateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10XSCEPCertificateProfile();
    }
    /**
     * Gets the certificateStore property value. CertificateStore types
     * @return a certificateStore
     */
    @javax.annotation.Nullable
    public CertificateStore getCertificateStore() {
        return this._certificateStore;
    }
    /**
     * Gets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @return a certificateValidityPeriodScale
     */
    @javax.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodScale() {
        return this._certificateValidityPeriodScale;
    }
    /**
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this._certificateValidityPeriodValue;
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings.
     * @return a extendedKeyUsage
     */
    @javax.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this._extendedKeyUsages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10XSCEPCertificateProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("certificateStore", (n) -> { currentObject.setCertificateStore(n.getEnumValue(CertificateStore.class)); });
            this.put("certificateValidityPeriodScale", (n) -> { currentObject.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
            this.put("certificateValidityPeriodValue", (n) -> { currentObject.setCertificateValidityPeriodValue(n.getIntegerValue()); });
            this.put("extendedKeyUsages", (n) -> { currentObject.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
            this.put("hashAlgorithm", (n) -> { currentObject.setHashAlgorithm(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("keySize", (n) -> { currentObject.setKeySize(n.getEnumValue(KeySize.class)); });
            this.put("keyStorageProvider", (n) -> { currentObject.setKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption.class)); });
            this.put("keyUsage", (n) -> { currentObject.setKeyUsage(n.getEnumValue(KeyUsages.class)); });
            this.put("renewalThresholdPercentage", (n) -> { currentObject.setRenewalThresholdPercentage(n.getIntegerValue()); });
            this.put("rootCertificateId", (n) -> { currentObject.setRootCertificateId(n.getStringValue()); });
            this.put("scepServerUrls", (n) -> { currentObject.setScepServerUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("subjectAlternativeNameFormats", (n) -> { currentObject.setSubjectAlternativeNameFormats(n.getCollectionOfObjectValues(Windows10XCustomSubjectAlternativeName::createFromDiscriminatorValue)); });
            this.put("subjectNameFormatString", (n) -> { currentObject.setSubjectNameFormatString(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hashAlgorithm property value. SCEP Hash Algorithm.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getHashAlgorithm() {
        return this._hashAlgorithm;
    }
    /**
     * Gets the keySize property value. Key Size Options.
     * @return a keySize
     */
    @javax.annotation.Nullable
    public KeySize getKeySize() {
        return this._keySize;
    }
    /**
     * Gets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a keyStorageProviderOption
     */
    @javax.annotation.Nullable
    public KeyStorageProviderOption getKeyStorageProvider() {
        return this._keyStorageProvider;
    }
    /**
     * Gets the keyUsage property value. Key Usage Options.
     * @return a keyUsages
     */
    @javax.annotation.Nullable
    public KeyUsages getKeyUsage() {
        return this._keyUsage;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this._renewalThresholdPercentage;
    }
    /**
     * Gets the rootCertificateId property value. Trusted Root Certificate ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRootCertificateId() {
        return this._rootCertificateId;
    }
    /**
     * Gets the scepServerUrls property value. SCEP Server Url(s).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getScepServerUrls() {
        return this._scepServerUrls;
    }
    /**
     * Gets the subjectAlternativeNameFormats property value. Custom AAD Attributes.
     * @return a windows10XCustomSubjectAlternativeName
     */
    @javax.annotation.Nullable
    public java.util.List<Windows10XCustomSubjectAlternativeName> getSubjectAlternativeNameFormats() {
        return this._subjectAlternativeNameFormats;
    }
    /**
     * Gets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectNameFormatString() {
        return this._subjectNameFormatString;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateStore", this.getCertificateStore());
        writer.writeEnumValue("certificateValidityPeriodScale", this.getCertificateValidityPeriodScale());
        writer.writeIntegerValue("certificateValidityPeriodValue", this.getCertificateValidityPeriodValue());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeCollectionOfPrimitiveValues("hashAlgorithm", this.getHashAlgorithm());
        writer.writeEnumValue("keySize", this.getKeySize());
        writer.writeEnumValue("keyStorageProvider", this.getKeyStorageProvider());
        writer.writeEnumValue("keyUsage", this.getKeyUsage());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeStringValue("rootCertificateId", this.getRootCertificateId());
        writer.writeCollectionOfPrimitiveValues("scepServerUrls", this.getScepServerUrls());
        writer.writeCollectionOfObjectValues("subjectAlternativeNameFormats", this.getSubjectAlternativeNameFormats());
        writer.writeStringValue("subjectNameFormatString", this.getSubjectNameFormatString());
    }
    /**
     * Sets the certificateStore property value. CertificateStore types
     * @param value Value to set for the certificateStore property.
     * @return a void
     */
    public void setCertificateStore(@javax.annotation.Nullable final CertificateStore value) {
        this._certificateStore = value;
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     * @return a void
     */
    public void setCertificateValidityPeriodScale(@javax.annotation.Nullable final CertificateValidityPeriodScale value) {
        this._certificateValidityPeriodScale = value;
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period
     * @param value Value to set for the certificateValidityPeriodValue property.
     * @return a void
     */
    public void setCertificateValidityPeriodValue(@javax.annotation.Nullable final Integer value) {
        this._certificateValidityPeriodValue = value;
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings.
     * @param value Value to set for the extendedKeyUsages property.
     * @return a void
     */
    public void setExtendedKeyUsages(@javax.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this._extendedKeyUsages = value;
    }
    /**
     * Sets the hashAlgorithm property value. SCEP Hash Algorithm.
     * @param value Value to set for the hashAlgorithm property.
     * @return a void
     */
    public void setHashAlgorithm(@javax.annotation.Nullable final java.util.List<String> value) {
        this._hashAlgorithm = value;
    }
    /**
     * Sets the keySize property value. Key Size Options.
     * @param value Value to set for the keySize property.
     * @return a void
     */
    public void setKeySize(@javax.annotation.Nullable final KeySize value) {
        this._keySize = value;
    }
    /**
     * Sets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the keyStorageProvider property.
     * @return a void
     */
    public void setKeyStorageProvider(@javax.annotation.Nullable final KeyStorageProviderOption value) {
        this._keyStorageProvider = value;
    }
    /**
     * Sets the keyUsage property value. Key Usage Options.
     * @param value Value to set for the keyUsage property.
     * @return a void
     */
    public void setKeyUsage(@javax.annotation.Nullable final KeyUsages value) {
        this._keyUsage = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage
     * @param value Value to set for the renewalThresholdPercentage property.
     * @return a void
     */
    public void setRenewalThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this._renewalThresholdPercentage = value;
    }
    /**
     * Sets the rootCertificateId property value. Trusted Root Certificate ID
     * @param value Value to set for the rootCertificateId property.
     * @return a void
     */
    public void setRootCertificateId(@javax.annotation.Nullable final String value) {
        this._rootCertificateId = value;
    }
    /**
     * Sets the scepServerUrls property value. SCEP Server Url(s).
     * @param value Value to set for the scepServerUrls property.
     * @return a void
     */
    public void setScepServerUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._scepServerUrls = value;
    }
    /**
     * Sets the subjectAlternativeNameFormats property value. Custom AAD Attributes.
     * @param value Value to set for the subjectAlternativeNameFormats property.
     * @return a void
     */
    public void setSubjectAlternativeNameFormats(@javax.annotation.Nullable final java.util.List<Windows10XCustomSubjectAlternativeName> value) {
        this._subjectAlternativeNameFormats = value;
    }
    /**
     * Sets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     * @return a void
     */
    public void setSubjectNameFormatString(@javax.annotation.Nullable final String value) {
        this._subjectNameFormatString = value;
    }
}
