package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSPkcsCertificateProfile extends MacOSCertificateProfileBase implements Parsable {
    /** AllowAllAppsAccess setting */
    private Boolean _allowAllAppsAccess;
    /** Target store certificate. Possible values are: user, machine. */
    private CertificateStore _certificateStore;
    /** PKCS certificate template name. */
    private String _certificateTemplateName;
    /** PKCS certification authority FQDN. */
    private String _certificationAuthority;
    /** PKCS certification authority Name. */
    private String _certificationAuthorityName;
    /** Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements. */
    private java.util.List<CustomSubjectAlternativeName> _customSubjectAlternativeNames;
    /** Certificate state for devices. This collection can contain a maximum of 2147483647 elements. */
    private java.util.List<ManagedDeviceCertificateState> _managedDeviceCertificateStates;
    /** Format string that defines the subject alternative name. */
    private String _subjectAlternativeNameFormatString;
    /** Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US */
    private String _subjectNameFormatString;
    /**
     * Instantiates a new MacOSPkcsCertificateProfile and sets the default values.
     * @return a void
     */
    public MacOSPkcsCertificateProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSPkcsCertificateProfile
     */
    @javax.annotation.Nonnull
    public static MacOSPkcsCertificateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSPkcsCertificateProfile();
    }
    /**
     * Gets the allowAllAppsAccess property value. AllowAllAppsAccess setting
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAllAppsAccess() {
        return this._allowAllAppsAccess;
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
     * Gets the certificateTemplateName property value. PKCS certificate template name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateTemplateName() {
        return this._certificateTemplateName;
    }
    /**
     * Gets the certificationAuthority property value. PKCS certification authority FQDN.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthority() {
        return this._certificationAuthority;
    }
    /**
     * Gets the certificationAuthorityName property value. PKCS certification authority Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthorityName() {
        return this._certificationAuthorityName;
    }
    /**
     * Gets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @return a customSubjectAlternativeName
     */
    @javax.annotation.Nullable
    public java.util.List<CustomSubjectAlternativeName> getCustomSubjectAlternativeNames() {
        return this._customSubjectAlternativeNames;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSPkcsCertificateProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowAllAppsAccess", (n) -> { currentObject.setAllowAllAppsAccess(n.getBooleanValue()); });
            this.put("certificateStore", (n) -> { currentObject.setCertificateStore(n.getEnumValue(CertificateStore.class)); });
            this.put("certificateTemplateName", (n) -> { currentObject.setCertificateTemplateName(n.getStringValue()); });
            this.put("certificationAuthority", (n) -> { currentObject.setCertificationAuthority(n.getStringValue()); });
            this.put("certificationAuthorityName", (n) -> { currentObject.setCertificationAuthorityName(n.getStringValue()); });
            this.put("customSubjectAlternativeNames", (n) -> { currentObject.setCustomSubjectAlternativeNames(n.getCollectionOfObjectValues(CustomSubjectAlternativeName::createFromDiscriminatorValue)); });
            this.put("managedDeviceCertificateStates", (n) -> { currentObject.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
            this.put("subjectAlternativeNameFormatString", (n) -> { currentObject.setSubjectAlternativeNameFormatString(n.getStringValue()); });
            this.put("subjectNameFormatString", (n) -> { currentObject.setSubjectNameFormatString(n.getStringValue()); });
        }};
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
     * Gets the subjectAlternativeNameFormatString property value. Format string that defines the subject alternative name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectAlternativeNameFormatString() {
        return this._subjectAlternativeNameFormatString;
    }
    /**
     * Gets the subjectNameFormatString property value. Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
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
        writer.writeBooleanValue("allowAllAppsAccess", this.getAllowAllAppsAccess());
        writer.writeEnumValue("certificateStore", this.getCertificateStore());
        writer.writeStringValue("certificateTemplateName", this.getCertificateTemplateName());
        writer.writeStringValue("certificationAuthority", this.getCertificationAuthority());
        writer.writeStringValue("certificationAuthorityName", this.getCertificationAuthorityName());
        writer.writeCollectionOfObjectValues("customSubjectAlternativeNames", this.getCustomSubjectAlternativeNames());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeStringValue("subjectAlternativeNameFormatString", this.getSubjectAlternativeNameFormatString());
        writer.writeStringValue("subjectNameFormatString", this.getSubjectNameFormatString());
    }
    /**
     * Sets the allowAllAppsAccess property value. AllowAllAppsAccess setting
     * @param value Value to set for the allowAllAppsAccess property.
     * @return a void
     */
    public void setAllowAllAppsAccess(@javax.annotation.Nullable final Boolean value) {
        this._allowAllAppsAccess = value;
    }
    /**
     * Sets the certificateStore property value. Target store certificate. Possible values are: user, machine.
     * @param value Value to set for the certificateStore property.
     * @return a void
     */
    public void setCertificateStore(@javax.annotation.Nullable final CertificateStore value) {
        this._certificateStore = value;
    }
    /**
     * Sets the certificateTemplateName property value. PKCS certificate template name.
     * @param value Value to set for the certificateTemplateName property.
     * @return a void
     */
    public void setCertificateTemplateName(@javax.annotation.Nullable final String value) {
        this._certificateTemplateName = value;
    }
    /**
     * Sets the certificationAuthority property value. PKCS certification authority FQDN.
     * @param value Value to set for the certificationAuthority property.
     * @return a void
     */
    public void setCertificationAuthority(@javax.annotation.Nullable final String value) {
        this._certificationAuthority = value;
    }
    /**
     * Sets the certificationAuthorityName property value. PKCS certification authority Name.
     * @param value Value to set for the certificationAuthorityName property.
     * @return a void
     */
    public void setCertificationAuthorityName(@javax.annotation.Nullable final String value) {
        this._certificationAuthorityName = value;
    }
    /**
     * Sets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the customSubjectAlternativeNames property.
     * @return a void
     */
    public void setCustomSubjectAlternativeNames(@javax.annotation.Nullable final java.util.List<CustomSubjectAlternativeName> value) {
        this._customSubjectAlternativeNames = value;
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     * @return a void
     */
    public void setManagedDeviceCertificateStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this._managedDeviceCertificateStates = value;
    }
    /**
     * Sets the subjectAlternativeNameFormatString property value. Format string that defines the subject alternative name.
     * @param value Value to set for the subjectAlternativeNameFormatString property.
     * @return a void
     */
    public void setSubjectAlternativeNameFormatString(@javax.annotation.Nullable final String value) {
        this._subjectAlternativeNameFormatString = value;
    }
    /**
     * Sets the subjectNameFormatString property value. Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     * @return a void
     */
    public void setSubjectNameFormatString(@javax.annotation.Nullable final String value) {
        this._subjectNameFormatString = value;
    }
}
