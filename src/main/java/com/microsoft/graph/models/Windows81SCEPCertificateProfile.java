package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows81SCEPCertificateProfile extends Windows81CertificateProfileBase implements Parsable {
    /** Target store certificate. Possible values are: user, machine. */
    private CertificateStore _certificateStore;
    /** Hash Algorithm Options. */
    private HashAlgorithms _hashAlgorithm;
    /** Key Size Options. */
    private KeySize _keySize;
    /** Key Usage Options. */
    private KeyUsages _keyUsage;
    /** Certificate state for devices. This collection can contain a maximum of 2147483647 elements. */
    private java.util.List<ManagedDeviceCertificateState> _managedDeviceCertificateStates;
    /** Trusted Root Certificate */
    private Windows81TrustedRootCertificate _rootCertificate;
    /** SCEP Server Url(s). */
    private java.util.List<String> _scepServerUrls;
    /** Custom String that defines the AAD Attribute. */
    private String _subjectAlternativeNameFormatString;
    /** Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US */
    private String _subjectNameFormatString;
    /**
     * Instantiates a new Windows81SCEPCertificateProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows81SCEPCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.windows81SCEPCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows81SCEPCertificateProfile
     */
    @javax.annotation.Nonnull
    public static Windows81SCEPCertificateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81SCEPCertificateProfile();
    }
    /**
     * Gets the certificateStore property value. Target store certificate. Possible values are: user, machine.
     * @return a certificateStore
     */
    @javax.annotation.Nullable
    public CertificateStore getCertificateStore() {
        return this._certificateStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows81SCEPCertificateProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateStore", (n) -> { currentObject.setCertificateStore(n.getEnumValue(CertificateStore.class)); });
        deserializerMap.put("hashAlgorithm", (n) -> { currentObject.setHashAlgorithm(n.getEnumValue(HashAlgorithms.class)); });
        deserializerMap.put("keySize", (n) -> { currentObject.setKeySize(n.getEnumValue(KeySize.class)); });
        deserializerMap.put("keyUsage", (n) -> { currentObject.setKeyUsage(n.getEnumValue(KeyUsages.class)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { currentObject.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("rootCertificate", (n) -> { currentObject.setRootCertificate(n.getObjectValue(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("scepServerUrls", (n) -> { currentObject.setScepServerUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subjectAlternativeNameFormatString", (n) -> { currentObject.setSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("subjectNameFormatString", (n) -> { currentObject.setSubjectNameFormatString(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the hashAlgorithm property value. Hash Algorithm Options.
     * @return a hashAlgorithms
     */
    @javax.annotation.Nullable
    public HashAlgorithms getHashAlgorithm() {
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
     * Gets the keyUsage property value. Key Usage Options.
     * @return a keyUsages
     */
    @javax.annotation.Nullable
    public KeyUsages getKeyUsage() {
        return this._keyUsage;
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a managedDeviceCertificateState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this._managedDeviceCertificateStates;
    }
    /**
     * Gets the rootCertificate property value. Trusted Root Certificate
     * @return a windows81TrustedRootCertificate
     */
    @javax.annotation.Nullable
    public Windows81TrustedRootCertificate getRootCertificate() {
        return this._rootCertificate;
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
     * Gets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectAlternativeNameFormatString() {
        return this._subjectAlternativeNameFormatString;
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateStore", this.getCertificateStore());
        writer.writeEnumValue("hashAlgorithm", this.getHashAlgorithm());
        writer.writeEnumValue("keySize", this.getKeySize());
        writer.writeEnumValue("keyUsage", this.getKeyUsage());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeObjectValue("rootCertificate", this.getRootCertificate());
        writer.writeCollectionOfPrimitiveValues("scepServerUrls", this.getScepServerUrls());
        writer.writeStringValue("subjectAlternativeNameFormatString", this.getSubjectAlternativeNameFormatString());
        writer.writeStringValue("subjectNameFormatString", this.getSubjectNameFormatString());
    }
    /**
     * Sets the certificateStore property value. Target store certificate. Possible values are: user, machine.
     * @param value Value to set for the certificateStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateStore(@javax.annotation.Nullable final CertificateStore value) {
        this._certificateStore = value;
    }
    /**
     * Sets the hashAlgorithm property value. Hash Algorithm Options.
     * @param value Value to set for the hashAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHashAlgorithm(@javax.annotation.Nullable final HashAlgorithms value) {
        this._hashAlgorithm = value;
    }
    /**
     * Sets the keySize property value. Key Size Options.
     * @param value Value to set for the keySize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeySize(@javax.annotation.Nullable final KeySize value) {
        this._keySize = value;
    }
    /**
     * Sets the keyUsage property value. Key Usage Options.
     * @param value Value to set for the keyUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyUsage(@javax.annotation.Nullable final KeyUsages value) {
        this._keyUsage = value;
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceCertificateStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this._managedDeviceCertificateStates = value;
    }
    /**
     * Sets the rootCertificate property value. Trusted Root Certificate
     * @param value Value to set for the rootCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootCertificate(@javax.annotation.Nullable final Windows81TrustedRootCertificate value) {
        this._rootCertificate = value;
    }
    /**
     * Sets the scepServerUrls property value. SCEP Server Url(s).
     * @param value Value to set for the scepServerUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScepServerUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._scepServerUrls = value;
    }
    /**
     * Sets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @param value Value to set for the subjectAlternativeNameFormatString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectAlternativeNameFormatString(@javax.annotation.Nullable final String value) {
        this._subjectAlternativeNameFormatString = value;
    }
    /**
     * Sets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectNameFormatString(@javax.annotation.Nullable final String value) {
        this._subjectNameFormatString = value;
    }
}
