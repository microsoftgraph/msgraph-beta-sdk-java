package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS PKCS certificate profile.
 */
public class MacOSPkcsCertificateProfile extends MacOSCertificateProfileBase implements Parsable {
    /**
     * AllowAllAppsAccess setting
     */
    private Boolean allowAllAppsAccess;
    /**
     * Target store certificate. Possible values are: user, machine.
     */
    private CertificateStore certificateStore;
    /**
     * PKCS certificate template name.
     */
    private String certificateTemplateName;
    /**
     * PKCS certification authority FQDN.
     */
    private String certificationAuthority;
    /**
     * PKCS certification authority Name.
     */
    private String certificationAuthorityName;
    /**
     * Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<CustomSubjectAlternativeName> customSubjectAlternativeNames;
    /**
     * Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     */
    private java.util.List<ManagedDeviceCertificateState> managedDeviceCertificateStates;
    /**
     * Format string that defines the subject alternative name.
     */
    private String subjectAlternativeNameFormatString;
    /**
     * Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     */
    private String subjectNameFormatString;
    /**
     * Instantiates a new macOSPkcsCertificateProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSPkcsCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.macOSPkcsCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSPkcsCertificateProfile
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
        return this.allowAllAppsAccess;
    }
    /**
     * Gets the certificateStore property value. Target store certificate. Possible values are: user, machine.
     * @return a certificateStore
     */
    @javax.annotation.Nullable
    public CertificateStore getCertificateStore() {
        return this.certificateStore;
    }
    /**
     * Gets the certificateTemplateName property value. PKCS certificate template name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateTemplateName() {
        return this.certificateTemplateName;
    }
    /**
     * Gets the certificationAuthority property value. PKCS certification authority FQDN.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthority() {
        return this.certificationAuthority;
    }
    /**
     * Gets the certificationAuthorityName property value. PKCS certification authority Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthorityName() {
        return this.certificationAuthorityName;
    }
    /**
     * Gets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @return a customSubjectAlternativeName
     */
    @javax.annotation.Nullable
    public java.util.List<CustomSubjectAlternativeName> getCustomSubjectAlternativeNames() {
        return this.customSubjectAlternativeNames;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAllAppsAccess", (n) -> { this.setAllowAllAppsAccess(n.getBooleanValue()); });
        deserializerMap.put("certificateStore", (n) -> { this.setCertificateStore(n.getEnumValue(CertificateStore.class)); });
        deserializerMap.put("certificateTemplateName", (n) -> { this.setCertificateTemplateName(n.getStringValue()); });
        deserializerMap.put("certificationAuthority", (n) -> { this.setCertificationAuthority(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityName", (n) -> { this.setCertificationAuthorityName(n.getStringValue()); });
        deserializerMap.put("customSubjectAlternativeNames", (n) -> { this.setCustomSubjectAlternativeNames(n.getCollectionOfObjectValues(CustomSubjectAlternativeName::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { this.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectAlternativeNameFormatString", (n) -> { this.setSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("subjectNameFormatString", (n) -> { this.setSubjectNameFormatString(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a managedDeviceCertificateState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this.managedDeviceCertificateStates;
    }
    /**
     * Gets the subjectAlternativeNameFormatString property value. Format string that defines the subject alternative name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectAlternativeNameFormatString() {
        return this.subjectAlternativeNameFormatString;
    }
    /**
     * Gets the subjectNameFormatString property value. Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectNameFormatString() {
        return this.subjectNameFormatString;
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
    @javax.annotation.Nonnull
    public void setAllowAllAppsAccess(@javax.annotation.Nullable final Boolean value) {
        this.allowAllAppsAccess = value;
    }
    /**
     * Sets the certificateStore property value. Target store certificate. Possible values are: user, machine.
     * @param value Value to set for the certificateStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateStore(@javax.annotation.Nullable final CertificateStore value) {
        this.certificateStore = value;
    }
    /**
     * Sets the certificateTemplateName property value. PKCS certificate template name.
     * @param value Value to set for the certificateTemplateName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateTemplateName(@javax.annotation.Nullable final String value) {
        this.certificateTemplateName = value;
    }
    /**
     * Sets the certificationAuthority property value. PKCS certification authority FQDN.
     * @param value Value to set for the certificationAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificationAuthority(@javax.annotation.Nullable final String value) {
        this.certificationAuthority = value;
    }
    /**
     * Sets the certificationAuthorityName property value. PKCS certification authority Name.
     * @param value Value to set for the certificationAuthorityName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificationAuthorityName(@javax.annotation.Nullable final String value) {
        this.certificationAuthorityName = value;
    }
    /**
     * Sets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the customSubjectAlternativeNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomSubjectAlternativeNames(@javax.annotation.Nullable final java.util.List<CustomSubjectAlternativeName> value) {
        this.customSubjectAlternativeNames = value;
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceCertificateStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this.managedDeviceCertificateStates = value;
    }
    /**
     * Sets the subjectAlternativeNameFormatString property value. Format string that defines the subject alternative name.
     * @param value Value to set for the subjectAlternativeNameFormatString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectAlternativeNameFormatString(@javax.annotation.Nullable final String value) {
        this.subjectAlternativeNameFormatString = value;
    }
    /**
     * Sets the subjectNameFormatString property value. Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectNameFormatString(@javax.annotation.Nullable final String value) {
        this.subjectNameFormatString = value;
    }
}
