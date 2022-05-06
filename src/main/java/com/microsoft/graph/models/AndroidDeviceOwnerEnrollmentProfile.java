package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerEnrollmentProfile extends Entity implements Parsable {
    /** Tenant GUID the enrollment profile belongs to.  */
    private String _accountId;
    /** Date time the enrollment profile was created.  */
    private OffsetDateTime _createdDateTime;
    /** Description for the enrollment profile.  */
    private String _description;
    /** Display name for the enrollment profile.  */
    private String _displayName;
    /** Total number of Android devices that have enrolled using this enrollment profile.  */
    private Integer _enrolledDeviceCount;
    /** The enrollment mode of devices that use this enrollment profile. Possible values are: corporateOwnedDedicatedDevice, corporateOwnedFullyManaged, corporateOwnedWorkProfile, corporateOwnedAOSPUserlessDevice, corporateOwnedAOSPUserAssociatedDevice.  */
    private AndroidDeviceOwnerEnrollmentMode _enrollmentMode;
    /** The enrollment token type for an enrollment profile. Possible values are: default, corporateOwnedDedicatedDeviceWithAzureADSharedMode.  */
    private AndroidDeviceOwnerEnrollmentTokenType _enrollmentTokenType;
    /** Total number of AOSP devices that have enrolled using the current token.  */
    private Integer _enrollmentTokenUsageCount;
    /** Date time the enrollment profile was last modified.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** String used to generate a QR code for the token.  */
    private String _qrCodeContent;
    /** String used to generate a QR code for the token.  */
    private MimeContent _qrCodeImage;
    /** List of Scope Tags for this Entity instance.  */
    private java.util.List<String> _roleScopeTagIds;
    /** Date time the most recently created token was created.  */
    private OffsetDateTime _tokenCreationDateTime;
    /** Date time the most recently created token will expire.  */
    private OffsetDateTime _tokenExpirationDateTime;
    /** Value of the most recently created token for this enrollment profile.  */
    private String _tokenValue;
    /** Boolean that indicates if hidden wifi networks are enabled  */
    private Boolean _wifiHidden;
    /** String that contains the wi-fi login password  */
    private String _wifiPassword;
    /** String that contains the wi-fi security type. Possible values are: none, wpa, wep.  */
    private AospWifiSecurityType _wifiSecurityType;
    /** String that contains the wi-fi login ssid  */
    private String _wifiSsid;
    /**
     * Instantiates a new androidDeviceOwnerEnrollmentProfile and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerEnrollmentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerEnrollmentProfile
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerEnrollmentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerEnrollmentProfile();
    }
    /**
     * Gets the accountId property value. Tenant GUID the enrollment profile belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this._accountId;
    }
    /**
     * Gets the createdDateTime property value. Date time the enrollment profile was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description for the enrollment profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name for the enrollment profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnrolledDeviceCount() {
        return this._enrolledDeviceCount;
    }
    /**
     * Gets the enrollmentMode property value. The enrollment mode of devices that use this enrollment profile. Possible values are: corporateOwnedDedicatedDevice, corporateOwnedFullyManaged, corporateOwnedWorkProfile, corporateOwnedAOSPUserlessDevice, corporateOwnedAOSPUserAssociatedDevice.
     * @return a androidDeviceOwnerEnrollmentMode
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentMode getEnrollmentMode() {
        return this._enrollmentMode;
    }
    /**
     * Gets the enrollmentTokenType property value. The enrollment token type for an enrollment profile. Possible values are: default, corporateOwnedDedicatedDeviceWithAzureADSharedMode.
     * @return a androidDeviceOwnerEnrollmentTokenType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentTokenType getEnrollmentTokenType() {
        return this._enrollmentTokenType;
    }
    /**
     * Gets the enrollmentTokenUsageCount property value. Total number of AOSP devices that have enrolled using the current token.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnrollmentTokenUsageCount() {
        return this._enrollmentTokenUsageCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerEnrollmentProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountId", (n) -> { currentObject.setAccountId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enrolledDeviceCount", (n) -> { currentObject.setEnrolledDeviceCount(n.getIntegerValue()); });
            this.put("enrollmentMode", (n) -> { currentObject.setEnrollmentMode(n.getEnumValue(AndroidDeviceOwnerEnrollmentMode.class)); });
            this.put("enrollmentTokenType", (n) -> { currentObject.setEnrollmentTokenType(n.getEnumValue(AndroidDeviceOwnerEnrollmentTokenType.class)); });
            this.put("enrollmentTokenUsageCount", (n) -> { currentObject.setEnrollmentTokenUsageCount(n.getIntegerValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("qrCodeContent", (n) -> { currentObject.setQrCodeContent(n.getStringValue()); });
            this.put("qrCodeImage", (n) -> { currentObject.setQrCodeImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("tokenCreationDateTime", (n) -> { currentObject.setTokenCreationDateTime(n.getOffsetDateTimeValue()); });
            this.put("tokenExpirationDateTime", (n) -> { currentObject.setTokenExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("tokenValue", (n) -> { currentObject.setTokenValue(n.getStringValue()); });
            this.put("wifiHidden", (n) -> { currentObject.setWifiHidden(n.getBooleanValue()); });
            this.put("wifiPassword", (n) -> { currentObject.setWifiPassword(n.getStringValue()); });
            this.put("wifiSecurityType", (n) -> { currentObject.setWifiSecurityType(n.getEnumValue(AospWifiSecurityType.class)); });
            this.put("wifiSsid", (n) -> { currentObject.setWifiSsid(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the qrCodeContent property value. String used to generate a QR code for the token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQrCodeContent() {
        return this._qrCodeContent;
    }
    /**
     * Gets the qrCodeImage property value. String used to generate a QR code for the token.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getQrCodeImage() {
        return this._qrCodeImage;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the tokenCreationDateTime property value. Date time the most recently created token was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTokenCreationDateTime() {
        return this._tokenCreationDateTime;
    }
    /**
     * Gets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this._tokenExpirationDateTime;
    }
    /**
     * Gets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenValue() {
        return this._tokenValue;
    }
    /**
     * Gets the wifiHidden property value. Boolean that indicates if hidden wifi networks are enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiHidden() {
        return this._wifiHidden;
    }
    /**
     * Gets the wifiPassword property value. String that contains the wi-fi login password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiPassword() {
        return this._wifiPassword;
    }
    /**
     * Gets the wifiSecurityType property value. String that contains the wi-fi security type. Possible values are: none, wpa, wep.
     * @return a aospWifiSecurityType
     */
    @javax.annotation.Nullable
    public AospWifiSecurityType getWifiSecurityType() {
        return this._wifiSecurityType;
    }
    /**
     * Gets the wifiSsid property value. String that contains the wi-fi login ssid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiSsid() {
        return this._wifiSsid;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("enrolledDeviceCount", this.getEnrolledDeviceCount());
        writer.writeEnumValue("enrollmentMode", this.getEnrollmentMode());
        writer.writeEnumValue("enrollmentTokenType", this.getEnrollmentTokenType());
        writer.writeIntegerValue("enrollmentTokenUsageCount", this.getEnrollmentTokenUsageCount());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("qrCodeContent", this.getQrCodeContent());
        writer.writeObjectValue("qrCodeImage", this.getQrCodeImage());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeOffsetDateTimeValue("tokenCreationDateTime", this.getTokenCreationDateTime());
        writer.writeOffsetDateTimeValue("tokenExpirationDateTime", this.getTokenExpirationDateTime());
        writer.writeStringValue("tokenValue", this.getTokenValue());
        writer.writeBooleanValue("wifiHidden", this.getWifiHidden());
        writer.writeStringValue("wifiPassword", this.getWifiPassword());
        writer.writeEnumValue("wifiSecurityType", this.getWifiSecurityType());
        writer.writeStringValue("wifiSsid", this.getWifiSsid());
    }
    /**
     * Sets the accountId property value. Tenant GUID the enrollment profile belongs to.
     * @param value Value to set for the accountId property.
     * @return a void
     */
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this._accountId = value;
    }
    /**
     * Sets the createdDateTime property value. Date time the enrollment profile was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description for the enrollment profile.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name for the enrollment profile.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @param value Value to set for the enrolledDeviceCount property.
     * @return a void
     */
    public void setEnrolledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._enrolledDeviceCount = value;
    }
    /**
     * Sets the enrollmentMode property value. The enrollment mode of devices that use this enrollment profile. Possible values are: corporateOwnedDedicatedDevice, corporateOwnedFullyManaged, corporateOwnedWorkProfile, corporateOwnedAOSPUserlessDevice, corporateOwnedAOSPUserAssociatedDevice.
     * @param value Value to set for the enrollmentMode property.
     * @return a void
     */
    public void setEnrollmentMode(@javax.annotation.Nullable final AndroidDeviceOwnerEnrollmentMode value) {
        this._enrollmentMode = value;
    }
    /**
     * Sets the enrollmentTokenType property value. The enrollment token type for an enrollment profile. Possible values are: default, corporateOwnedDedicatedDeviceWithAzureADSharedMode.
     * @param value Value to set for the enrollmentTokenType property.
     * @return a void
     */
    public void setEnrollmentTokenType(@javax.annotation.Nullable final AndroidDeviceOwnerEnrollmentTokenType value) {
        this._enrollmentTokenType = value;
    }
    /**
     * Sets the enrollmentTokenUsageCount property value. Total number of AOSP devices that have enrolled using the current token.
     * @param value Value to set for the enrollmentTokenUsageCount property.
     * @return a void
     */
    public void setEnrollmentTokenUsageCount(@javax.annotation.Nullable final Integer value) {
        this._enrollmentTokenUsageCount = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the qrCodeContent property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeContent property.
     * @return a void
     */
    public void setQrCodeContent(@javax.annotation.Nullable final String value) {
        this._qrCodeContent = value;
    }
    /**
     * Sets the qrCodeImage property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeImage property.
     * @return a void
     */
    public void setQrCodeImage(@javax.annotation.Nullable final MimeContent value) {
        this._qrCodeImage = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the tokenCreationDateTime property value. Date time the most recently created token was created.
     * @param value Value to set for the tokenCreationDateTime property.
     * @return a void
     */
    public void setTokenCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._tokenCreationDateTime = value;
    }
    /**
     * Sets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     * @return a void
     */
    public void setTokenExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._tokenExpirationDateTime = value;
    }
    /**
     * Sets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @param value Value to set for the tokenValue property.
     * @return a void
     */
    public void setTokenValue(@javax.annotation.Nullable final String value) {
        this._tokenValue = value;
    }
    /**
     * Sets the wifiHidden property value. Boolean that indicates if hidden wifi networks are enabled
     * @param value Value to set for the wifiHidden property.
     * @return a void
     */
    public void setWifiHidden(@javax.annotation.Nullable final Boolean value) {
        this._wifiHidden = value;
    }
    /**
     * Sets the wifiPassword property value. String that contains the wi-fi login password
     * @param value Value to set for the wifiPassword property.
     * @return a void
     */
    public void setWifiPassword(@javax.annotation.Nullable final String value) {
        this._wifiPassword = value;
    }
    /**
     * Sets the wifiSecurityType property value. String that contains the wi-fi security type. Possible values are: none, wpa, wep.
     * @param value Value to set for the wifiSecurityType property.
     * @return a void
     */
    public void setWifiSecurityType(@javax.annotation.Nullable final AospWifiSecurityType value) {
        this._wifiSecurityType = value;
    }
    /**
     * Sets the wifiSsid property value. String that contains the wi-fi login ssid
     * @param value Value to set for the wifiSsid property.
     * @return a void
     */
    public void setWifiSsid(@javax.annotation.Nullable final String value) {
        this._wifiSsid = value;
    }
}
