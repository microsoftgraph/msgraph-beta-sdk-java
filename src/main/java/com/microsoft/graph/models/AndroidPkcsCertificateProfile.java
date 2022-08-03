package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidPkcsCertificateProfile extends AndroidCertificateProfileBase implements Parsable {
    /** PKCS Certificate Template Name */
    private String _certificateTemplateName;
    /** PKCS Certification Authority */
    private String _certificationAuthority;
    /** PKCS Certification Authority Name */
    private String _certificationAuthorityName;
    /** Certificate state for devices. This collection can contain a maximum of 2147483647 elements. */
    private java.util.List<ManagedDeviceCertificateState> _managedDeviceCertificateStates;
    /** Custom String that defines the AAD Attribute. */
    private String _subjectAlternativeNameFormatString;
    /**
     * Instantiates a new AndroidPkcsCertificateProfile and sets the default values.
     * @return a void
     */
    public AndroidPkcsCertificateProfile() {
        super();
        this.setOdataType("#microsoft.graph.androidPkcsCertificateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidPkcsCertificateProfile
     */
    @javax.annotation.Nonnull
    public static AndroidPkcsCertificateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidPkcsCertificateProfile();
    }
    /**
     * Gets the certificateTemplateName property value. PKCS Certificate Template Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateTemplateName() {
        return this._certificateTemplateName;
    }
    /**
     * Gets the certificationAuthority property value. PKCS Certification Authority
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthority() {
        return this._certificationAuthority;
    }
    /**
     * Gets the certificationAuthorityName property value. PKCS Certification Authority Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthorityName() {
        return this._certificationAuthorityName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidPkcsCertificateProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("certificateTemplateName", (n) -> { currentObject.setCertificateTemplateName(n.getStringValue()); });
            this.put("certificationAuthority", (n) -> { currentObject.setCertificationAuthority(n.getStringValue()); });
            this.put("certificationAuthorityName", (n) -> { currentObject.setCertificationAuthorityName(n.getStringValue()); });
            this.put("managedDeviceCertificateStates", (n) -> { currentObject.setManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedDeviceCertificateState::createFromDiscriminatorValue)); });
            this.put("subjectAlternativeNameFormatString", (n) -> { currentObject.setSubjectAlternativeNameFormatString(n.getStringValue()); });
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
     * Gets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectAlternativeNameFormatString() {
        return this._subjectAlternativeNameFormatString;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificateTemplateName", this.getCertificateTemplateName());
        writer.writeStringValue("certificationAuthority", this.getCertificationAuthority());
        writer.writeStringValue("certificationAuthorityName", this.getCertificationAuthorityName());
        writer.writeCollectionOfObjectValues("managedDeviceCertificateStates", this.getManagedDeviceCertificateStates());
        writer.writeStringValue("subjectAlternativeNameFormatString", this.getSubjectAlternativeNameFormatString());
    }
    /**
     * Sets the certificateTemplateName property value. PKCS Certificate Template Name
     * @param value Value to set for the certificateTemplateName property.
     * @return a void
     */
    public void setCertificateTemplateName(@javax.annotation.Nullable final String value) {
        this._certificateTemplateName = value;
    }
    /**
     * Sets the certificationAuthority property value. PKCS Certification Authority
     * @param value Value to set for the certificationAuthority property.
     * @return a void
     */
    public void setCertificationAuthority(@javax.annotation.Nullable final String value) {
        this._certificationAuthority = value;
    }
    /**
     * Sets the certificationAuthorityName property value. PKCS Certification Authority Name
     * @param value Value to set for the certificationAuthorityName property.
     * @return a void
     */
    public void setCertificationAuthorityName(@javax.annotation.Nullable final String value) {
        this._certificationAuthorityName = value;
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
     * Sets the subjectAlternativeNameFormatString property value. Custom String that defines the AAD Attribute.
     * @param value Value to set for the subjectAlternativeNameFormatString property.
     * @return a void
     */
    public void setSubjectAlternativeNameFormatString(@javax.annotation.Nullable final String value) {
        this._subjectAlternativeNameFormatString = value;
    }
}
