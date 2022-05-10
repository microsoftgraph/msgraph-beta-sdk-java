package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAllDeviceCertificateState extends Entity implements Parsable {
    /** Certificate expiry date */
    private OffsetDateTime _certificateExpirationDateTime;
    /** Enhanced Key Usage */
    private String _certificateExtendedKeyUsages;
    /** Issuance date */
    private OffsetDateTime _certificateIssuanceDateTime;
    /** Issuer */
    private String _certificateIssuerName;
    /** Key Usage */
    private Integer _certificateKeyUsages;
    /** Revoke status. Possible values are: none, pending, issued, failed, revoked. */
    private CertificateRevocationStatus _certificateRevokeStatus;
    /** The time the revoke status was last changed */
    private OffsetDateTime _certificateRevokeStatusLastChangeDateTime;
    /** Serial number */
    private String _certificateSerialNumber;
    /** Certificate subject name */
    private String _certificateSubjectName;
    /** Thumbprint */
    private String _certificateThumbprint;
    /** Device display name */
    private String _managedDeviceDisplayName;
    /** User principal name */
    private String _userPrincipalName;
    /**
     * Instantiates a new managedAllDeviceCertificateState and sets the default values.
     * @return a void
     */
    public ManagedAllDeviceCertificateState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAllDeviceCertificateState
     */
    @javax.annotation.Nonnull
    public static ManagedAllDeviceCertificateState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAllDeviceCertificateState();
    }
    /**
     * Gets the certificateExpirationDateTime property value. Certificate expiry date
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateExpirationDateTime() {
        return this._certificateExpirationDateTime;
    }
    /**
     * Gets the certificateExtendedKeyUsages property value. Enhanced Key Usage
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateExtendedKeyUsages() {
        return this._certificateExtendedKeyUsages;
    }
    /**
     * Gets the certificateIssuanceDateTime property value. Issuance date
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateIssuanceDateTime() {
        return this._certificateIssuanceDateTime;
    }
    /**
     * Gets the certificateIssuerName property value. Issuer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateIssuerName() {
        return this._certificateIssuerName;
    }
    /**
     * Gets the certificateKeyUsages property value. Key Usage
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateKeyUsages() {
        return this._certificateKeyUsages;
    }
    /**
     * Gets the certificateRevokeStatus property value. Revoke status. Possible values are: none, pending, issued, failed, revoked.
     * @return a certificateRevocationStatus
     */
    @javax.annotation.Nullable
    public CertificateRevocationStatus getCertificateRevokeStatus() {
        return this._certificateRevokeStatus;
    }
    /**
     * Gets the certificateRevokeStatusLastChangeDateTime property value. The time the revoke status was last changed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificateRevokeStatusLastChangeDateTime() {
        return this._certificateRevokeStatusLastChangeDateTime;
    }
    /**
     * Gets the certificateSerialNumber property value. Serial number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this._certificateSerialNumber;
    }
    /**
     * Gets the certificateSubjectName property value. Certificate subject name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSubjectName() {
        return this._certificateSubjectName;
    }
    /**
     * Gets the certificateThumbprint property value. Thumbprint
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateThumbprint() {
        return this._certificateThumbprint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAllDeviceCertificateState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("certificateExpirationDateTime", (n) -> { currentObject.setCertificateExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("certificateExtendedKeyUsages", (n) -> { currentObject.setCertificateExtendedKeyUsages(n.getStringValue()); });
            this.put("certificateIssuanceDateTime", (n) -> { currentObject.setCertificateIssuanceDateTime(n.getOffsetDateTimeValue()); });
            this.put("certificateIssuerName", (n) -> { currentObject.setCertificateIssuerName(n.getStringValue()); });
            this.put("certificateKeyUsages", (n) -> { currentObject.setCertificateKeyUsages(n.getIntegerValue()); });
            this.put("certificateRevokeStatus", (n) -> { currentObject.setCertificateRevokeStatus(n.getEnumValue(CertificateRevocationStatus.class)); });
            this.put("certificateRevokeStatusLastChangeDateTime", (n) -> { currentObject.setCertificateRevokeStatusLastChangeDateTime(n.getOffsetDateTimeValue()); });
            this.put("certificateSerialNumber", (n) -> { currentObject.setCertificateSerialNumber(n.getStringValue()); });
            this.put("certificateSubjectName", (n) -> { currentObject.setCertificateSubjectName(n.getStringValue()); });
            this.put("certificateThumbprint", (n) -> { currentObject.setCertificateThumbprint(n.getStringValue()); });
            this.put("managedDeviceDisplayName", (n) -> { currentObject.setManagedDeviceDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDeviceDisplayName property value. Device display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceDisplayName() {
        return this._managedDeviceDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. User principal name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("certificateExpirationDateTime", this.getCertificateExpirationDateTime());
        writer.writeStringValue("certificateExtendedKeyUsages", this.getCertificateExtendedKeyUsages());
        writer.writeOffsetDateTimeValue("certificateIssuanceDateTime", this.getCertificateIssuanceDateTime());
        writer.writeStringValue("certificateIssuerName", this.getCertificateIssuerName());
        writer.writeIntegerValue("certificateKeyUsages", this.getCertificateKeyUsages());
        writer.writeEnumValue("certificateRevokeStatus", this.getCertificateRevokeStatus());
        writer.writeOffsetDateTimeValue("certificateRevokeStatusLastChangeDateTime", this.getCertificateRevokeStatusLastChangeDateTime());
        writer.writeStringValue("certificateSerialNumber", this.getCertificateSerialNumber());
        writer.writeStringValue("certificateSubjectName", this.getCertificateSubjectName());
        writer.writeStringValue("certificateThumbprint", this.getCertificateThumbprint());
        writer.writeStringValue("managedDeviceDisplayName", this.getManagedDeviceDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the certificateExpirationDateTime property value. Certificate expiry date
     * @param value Value to set for the certificateExpirationDateTime property.
     * @return a void
     */
    public void setCertificateExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certificateExpirationDateTime = value;
    }
    /**
     * Sets the certificateExtendedKeyUsages property value. Enhanced Key Usage
     * @param value Value to set for the certificateExtendedKeyUsages property.
     * @return a void
     */
    public void setCertificateExtendedKeyUsages(@javax.annotation.Nullable final String value) {
        this._certificateExtendedKeyUsages = value;
    }
    /**
     * Sets the certificateIssuanceDateTime property value. Issuance date
     * @param value Value to set for the certificateIssuanceDateTime property.
     * @return a void
     */
    public void setCertificateIssuanceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certificateIssuanceDateTime = value;
    }
    /**
     * Sets the certificateIssuerName property value. Issuer
     * @param value Value to set for the certificateIssuerName property.
     * @return a void
     */
    public void setCertificateIssuerName(@javax.annotation.Nullable final String value) {
        this._certificateIssuerName = value;
    }
    /**
     * Sets the certificateKeyUsages property value. Key Usage
     * @param value Value to set for the certificateKeyUsages property.
     * @return a void
     */
    public void setCertificateKeyUsages(@javax.annotation.Nullable final Integer value) {
        this._certificateKeyUsages = value;
    }
    /**
     * Sets the certificateRevokeStatus property value. Revoke status. Possible values are: none, pending, issued, failed, revoked.
     * @param value Value to set for the certificateRevokeStatus property.
     * @return a void
     */
    public void setCertificateRevokeStatus(@javax.annotation.Nullable final CertificateRevocationStatus value) {
        this._certificateRevokeStatus = value;
    }
    /**
     * Sets the certificateRevokeStatusLastChangeDateTime property value. The time the revoke status was last changed
     * @param value Value to set for the certificateRevokeStatusLastChangeDateTime property.
     * @return a void
     */
    public void setCertificateRevokeStatusLastChangeDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certificateRevokeStatusLastChangeDateTime = value;
    }
    /**
     * Sets the certificateSerialNumber property value. Serial number
     * @param value Value to set for the certificateSerialNumber property.
     * @return a void
     */
    public void setCertificateSerialNumber(@javax.annotation.Nullable final String value) {
        this._certificateSerialNumber = value;
    }
    /**
     * Sets the certificateSubjectName property value. Certificate subject name
     * @param value Value to set for the certificateSubjectName property.
     * @return a void
     */
    public void setCertificateSubjectName(@javax.annotation.Nullable final String value) {
        this._certificateSubjectName = value;
    }
    /**
     * Sets the certificateThumbprint property value. Thumbprint
     * @param value Value to set for the certificateThumbprint property.
     * @return a void
     */
    public void setCertificateThumbprint(@javax.annotation.Nullable final String value) {
        this._certificateThumbprint = value;
    }
    /**
     * Sets the managedDeviceDisplayName property value. Device display name
     * @param value Value to set for the managedDeviceDisplayName property.
     * @return a void
     */
    public void setManagedDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._managedDeviceDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
