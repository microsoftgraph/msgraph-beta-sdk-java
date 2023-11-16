package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Device Owner PKCS certificate profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerPkcsCertificateProfile extends AndroidDeviceOwnerCertificateProfileBase implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerPkcsCertificateProfile and sets the default values.
     */
    public AndroidDeviceOwnerPkcsCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerPkcsCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerPkcsCertificateProfile
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerPkcsCertificateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerPkcsCertificateProfile();
    }
    /**
     * Gets the certificateAccessType property value. Certificate access type. Possible values are: userApproval, specificApps, unknownFutureValue.
     * @return a AndroidDeviceOwnerCertificateAccessType
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerCertificateAccessType getCertificateAccessType() {
        return this.BackingStore.get("certificateAccessType");
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
     * Gets the certificateTemplateName property value. PKCS Certificate Template Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateTemplateName() {
        return this.BackingStore.get("certificateTemplateName");
    }
    /**
     * Gets the certificationAuthority property value. PKCS Certification Authority
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificationAuthority() {
        return this.BackingStore.get("certificationAuthority");
    }
    /**
     * Gets the certificationAuthorityName property value. PKCS Certification Authority Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificationAuthorityName() {
        return this.BackingStore.get("certificationAuthorityName");
    }
    /**
     * Gets the certificationAuthorityType property value. Device Management Certification Authority Types.
     * @return a DeviceManagementCertificationAuthority
     */
    @jakarta.annotation.Nullable
    public DeviceManagementCertificationAuthority getCertificationAuthorityType() {
        return this.BackingStore.get("certificationAuthorityType");
    }
    /**
     * Gets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<CustomSubjectAlternativeName>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomSubjectAlternativeName> getCustomSubjectAlternativeNames() {
        return this.BackingStore.get("customSubjectAlternativeNames");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateAccessType", (n) -> { this.setCertificateAccessType(n.getEnumValue(AndroidDeviceOwnerCertificateAccessType.class)); });
        deserializerMap.put("certificateStore", (n) -> { this.setCertificateStore(n.getEnumValue(CertificateStore.class)); });
        deserializerMap.put("certificateTemplateName", (n) -> { this.setCertificateTemplateName(n.getStringValue()); });
        deserializerMap.put("certificationAuthority", (n) -> { this.setCertificationAuthority(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityName", (n) -> { this.setCertificationAuthorityName(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityType", (n) -> { this.setCertificationAuthorityType(n.getEnumValue(DeviceManagementCertificationAuthority.class)); });
        deserializerMap.put("customSubjectAlternativeNames", (n) -> { this.setCustomSubjectAlternativeNames(n.getCollectionOfObjectValues(CustomSubjectAlternativeName::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCertificateStates", (n) -> { this.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("silentCertificateAccessDetails", (n) -> { this.setSilentCertificateAccessDetails(n.getCollectionOfObjectValues(AndroidDeviceOwnerSilentCertificateAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectAlternativeNameFormatString", (n) -> { this.setSubjectAlternativeNameFormatString(n.getStringValue()); });
        deserializerMap.put("subjectNameFormatString", (n) -> { this.setSubjectNameFormatString(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @return a java.util.List<ManagedDeviceCertificateState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCertificateState> getManagedDeviceCertificateStates() {
        return this.BackingStore.get("managedDeviceCertificateStates");
    }
    /**
     * Gets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @return a java.util.List<AndroidDeviceOwnerSilentCertificateAccess>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerSilentCertificateAccess> getSilentCertificateAccessDetails() {
        return this.BackingStore.get("silentCertificateAccessDetails");
    }
    /**
     * Gets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubjectAlternativeNameFormatString() {
        return this.BackingStore.get("subjectAlternativeNameFormatString");
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
        writer.writeEnumValue("certificateAccessType", this.getCertificateAccessType());
        writer.writeEnumValue("certificateStore", this.getCertificateStore());
        writer.writeStringValue("certificateTemplateName", this.getCertificateTemplateName());
        writer.writeStringValue("certificationAuthority", this.getCertificationAuthority());
        writer.writeStringValue("certificationAuthorityName", this.getCertificationAuthorityName());
        writer.writeEnumValue("certificationAuthorityType", this.getCertificationAuthorityType());
        writer.writeCollectionOfObjectValues("customSubjectAlternativeNames", this.getCustomSubjectAlternativeNames());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeCollectionOfObjectValues("silentCertificateAccessDetails", this.getSilentCertificateAccessDetails());
        writer.writeStringValue("subjectAlternativeNameFormatString", this.getSubjectAlternativeNameFormatString());
        writer.writeStringValue("subjectNameFormatString", this.getSubjectNameFormatString());
    }
    /**
     * Sets the certificateAccessType property value. Certificate access type. Possible values are: userApproval, specificApps, unknownFutureValue.
     * @param value Value to set for the certificateAccessType property.
     */
    public void setCertificateAccessType(@jakarta.annotation.Nullable final AndroidDeviceOwnerCertificateAccessType value) {
        this.BackingStore.set("certificateAccessType", value);
    }
    /**
     * Sets the certificateStore property value. CertificateStore types
     * @param value Value to set for the certificateStore property.
     */
    public void setCertificateStore(@jakarta.annotation.Nullable final CertificateStore value) {
        this.BackingStore.set("certificateStore", value);
    }
    /**
     * Sets the certificateTemplateName property value. PKCS Certificate Template Name
     * @param value Value to set for the certificateTemplateName property.
     */
    public void setCertificateTemplateName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("certificateTemplateName", value);
    }
    /**
     * Sets the certificationAuthority property value. PKCS Certification Authority
     * @param value Value to set for the certificationAuthority property.
     */
    public void setCertificationAuthority(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("certificationAuthority", value);
    }
    /**
     * Sets the certificationAuthorityName property value. PKCS Certification Authority Name
     * @param value Value to set for the certificationAuthorityName property.
     */
    public void setCertificationAuthorityName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("certificationAuthorityName", value);
    }
    /**
     * Sets the certificationAuthorityType property value. Device Management Certification Authority Types.
     * @param value Value to set for the certificationAuthorityType property.
     */
    public void setCertificationAuthorityType(@jakarta.annotation.Nullable final DeviceManagementCertificationAuthority value) {
        this.BackingStore.set("certificationAuthorityType", value);
    }
    /**
     * Sets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the customSubjectAlternativeNames property.
     */
    public void setCustomSubjectAlternativeNames(@jakarta.annotation.Nullable final java.util.List<CustomSubjectAlternativeName> value) {
        this.BackingStore.set("customSubjectAlternativeNames", value);
    }
    /**
     * Sets the managedDeviceCertificateStates property value. Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     * @param value Value to set for the managedDeviceCertificateStates property.
     */
    public void setManagedDeviceCertificateStates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCertificateState> value) {
        this.BackingStore.set("managedDeviceCertificateStates", value);
    }
    /**
     * Sets the silentCertificateAccessDetails property value. Certificate access information. This collection can contain a maximum of 50 elements.
     * @param value Value to set for the silentCertificateAccessDetails property.
     */
    public void setSilentCertificateAccessDetails(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerSilentCertificateAccess> value) {
        this.BackingStore.set("silentCertificateAccessDetails", value);
    }
    /**
     * Sets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @param value Value to set for the subjectAlternativeNameFormatString property.
     */
    public void setSubjectAlternativeNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("subjectAlternativeNameFormatString", value);
    }
    /**
     * Sets the subjectNameFormatString property value. Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     * @param value Value to set for the subjectNameFormatString property.
     */
    public void setSubjectNameFormatString(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("subjectNameFormatString", value);
    }
}
