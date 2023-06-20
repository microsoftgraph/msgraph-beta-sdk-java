package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Enrollment Profile used to enroll Android Enterprise devices using Google's Cloud Management.
 */
public class AndroidDeviceOwnerEnrollmentProfile extends Entity implements Parsable {
    /** Tenant GUID the enrollment profile belongs to. */
    private String accountId;
    /** Boolean that indicates that the Wi-Fi network should be configured during device provisioning. When set to TRUE, device provisioning will use Wi-Fi related properties to automatically connect to Wi-Fi networks. When set to FALSE or undefined, other Wi-Fi related properties will be ignored. Default value is TRUE. Returned by default. */
    private Boolean configureWifi;
    /** Date time the enrollment profile was created. */
    private OffsetDateTime createdDateTime;
    /** Description for the enrollment profile. */
    private String description;
    /** Display name for the enrollment profile. */
    private String displayName;
    /** Total number of Android devices that have enrolled using this enrollment profile. */
    private Integer enrolledDeviceCount;
    /** The enrollment mode for an enrollment profile. */
    private AndroidDeviceOwnerEnrollmentMode enrollmentMode;
    /** The enrollment token type for an enrollment profile. */
    private AndroidDeviceOwnerEnrollmentTokenType enrollmentTokenType;
    /** Total number of AOSP devices that have enrolled using the current token. */
    private Integer enrollmentTokenUsageCount;
    /** Boolean indicating if this profile is an Android AOSP for Teams device profile. */
    private Boolean isTeamsDeviceProfile;
    /** Date time the enrollment profile was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** String used to generate a QR code for the token. */
    private String qrCodeContent;
    /** String used to generate a QR code for the token. */
    private MimeContent qrCodeImage;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> roleScopeTagIds;
    /** Date time the most recently created token was created. */
    private OffsetDateTime tokenCreationDateTime;
    /** Date time the most recently created token will expire. */
    private OffsetDateTime tokenExpirationDateTime;
    /** Value of the most recently created token for this enrollment profile. */
    private String tokenValue;
    /** Boolean that indicates if hidden wifi networks are enabled */
    private Boolean wifiHidden;
    /** String that contains the wi-fi login password */
    private String wifiPassword;
    /** This enum represents Wi-Fi Security Types for Android Device Owner AOSP Scenarios. */
    private AospWifiSecurityType wifiSecurityType;
    /** String that contains the wi-fi login ssid */
    private String wifiSsid;
    /**
     * Instantiates a new androidDeviceOwnerEnrollmentProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.accountId;
    }
    /**
     * Gets the configureWifi property value. Boolean that indicates that the Wi-Fi network should be configured during device provisioning. When set to TRUE, device provisioning will use Wi-Fi related properties to automatically connect to Wi-Fi networks. When set to FALSE or undefined, other Wi-Fi related properties will be ignored. Default value is TRUE. Returned by default.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigureWifi() {
        return this.configureWifi;
    }
    /**
     * Gets the createdDateTime property value. Date time the enrollment profile was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description for the enrollment profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name for the enrollment profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnrolledDeviceCount() {
        return this.enrolledDeviceCount;
    }
    /**
     * Gets the enrollmentMode property value. The enrollment mode for an enrollment profile.
     * @return a AndroidDeviceOwnerEnrollmentMode
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentMode getEnrollmentMode() {
        return this.enrollmentMode;
    }
    /**
     * Gets the enrollmentTokenType property value. The enrollment token type for an enrollment profile.
     * @return a AndroidDeviceOwnerEnrollmentTokenType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentTokenType getEnrollmentTokenType() {
        return this.enrollmentTokenType;
    }
    /**
     * Gets the enrollmentTokenUsageCount property value. Total number of AOSP devices that have enrolled using the current token.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnrollmentTokenUsageCount() {
        return this.enrollmentTokenUsageCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("configureWifi", (n) -> { this.setConfigureWifi(n.getBooleanValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrolledDeviceCount", (n) -> { this.setEnrolledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("enrollmentMode", (n) -> { this.setEnrollmentMode(n.getEnumValue(AndroidDeviceOwnerEnrollmentMode.class)); });
        deserializerMap.put("enrollmentTokenType", (n) -> { this.setEnrollmentTokenType(n.getEnumValue(AndroidDeviceOwnerEnrollmentTokenType.class)); });
        deserializerMap.put("enrollmentTokenUsageCount", (n) -> { this.setEnrollmentTokenUsageCount(n.getIntegerValue()); });
        deserializerMap.put("isTeamsDeviceProfile", (n) -> { this.setIsTeamsDeviceProfile(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("qrCodeContent", (n) -> { this.setQrCodeContent(n.getStringValue()); });
        deserializerMap.put("qrCodeImage", (n) -> { this.setQrCodeImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tokenCreationDateTime", (n) -> { this.setTokenCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tokenExpirationDateTime", (n) -> { this.setTokenExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tokenValue", (n) -> { this.setTokenValue(n.getStringValue()); });
        deserializerMap.put("wifiHidden", (n) -> { this.setWifiHidden(n.getBooleanValue()); });
        deserializerMap.put("wifiPassword", (n) -> { this.setWifiPassword(n.getStringValue()); });
        deserializerMap.put("wifiSecurityType", (n) -> { this.setWifiSecurityType(n.getEnumValue(AospWifiSecurityType.class)); });
        deserializerMap.put("wifiSsid", (n) -> { this.setWifiSsid(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTeamsDeviceProfile property value. Boolean indicating if this profile is an Android AOSP for Teams device profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTeamsDeviceProfile() {
        return this.isTeamsDeviceProfile;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the qrCodeContent property value. String used to generate a QR code for the token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQrCodeContent() {
        return this.qrCodeContent;
    }
    /**
     * Gets the qrCodeImage property value. String used to generate a QR code for the token.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getQrCodeImage() {
        return this.qrCodeImage;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the tokenCreationDateTime property value. Date time the most recently created token was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTokenCreationDateTime() {
        return this.tokenCreationDateTime;
    }
    /**
     * Gets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this.tokenExpirationDateTime;
    }
    /**
     * Gets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenValue() {
        return this.tokenValue;
    }
    /**
     * Gets the wifiHidden property value. Boolean that indicates if hidden wifi networks are enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiHidden() {
        return this.wifiHidden;
    }
    /**
     * Gets the wifiPassword property value. String that contains the wi-fi login password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiPassword() {
        return this.wifiPassword;
    }
    /**
     * Gets the wifiSecurityType property value. This enum represents Wi-Fi Security Types for Android Device Owner AOSP Scenarios.
     * @return a AospWifiSecurityType
     */
    @javax.annotation.Nullable
    public AospWifiSecurityType getWifiSecurityType() {
        return this.wifiSecurityType;
    }
    /**
     * Gets the wifiSsid property value. String that contains the wi-fi login ssid
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiSsid() {
        return this.wifiSsid;
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
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeBooleanValue("configureWifi", this.getConfigureWifi());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("enrolledDeviceCount", this.getEnrolledDeviceCount());
        writer.writeEnumValue("enrollmentMode", this.getEnrollmentMode());
        writer.writeEnumValue("enrollmentTokenType", this.getEnrollmentTokenType());
        writer.writeIntegerValue("enrollmentTokenUsageCount", this.getEnrollmentTokenUsageCount());
        writer.writeBooleanValue("isTeamsDeviceProfile", this.getIsTeamsDeviceProfile());
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
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the configureWifi property value. Boolean that indicates that the Wi-Fi network should be configured during device provisioning. When set to TRUE, device provisioning will use Wi-Fi related properties to automatically connect to Wi-Fi networks. When set to FALSE or undefined, other Wi-Fi related properties will be ignored. Default value is TRUE. Returned by default.
     * @param value Value to set for the configureWifi property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigureWifi(@javax.annotation.Nullable final Boolean value) {
        this.configureWifi = value;
    }
    /**
     * Sets the createdDateTime property value. Date time the enrollment profile was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description for the enrollment profile.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name for the enrollment profile.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @param value Value to set for the enrolledDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrolledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.enrolledDeviceCount = value;
    }
    /**
     * Sets the enrollmentMode property value. The enrollment mode for an enrollment profile.
     * @param value Value to set for the enrollmentMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentMode(@javax.annotation.Nullable final AndroidDeviceOwnerEnrollmentMode value) {
        this.enrollmentMode = value;
    }
    /**
     * Sets the enrollmentTokenType property value. The enrollment token type for an enrollment profile.
     * @param value Value to set for the enrollmentTokenType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentTokenType(@javax.annotation.Nullable final AndroidDeviceOwnerEnrollmentTokenType value) {
        this.enrollmentTokenType = value;
    }
    /**
     * Sets the enrollmentTokenUsageCount property value. Total number of AOSP devices that have enrolled using the current token.
     * @param value Value to set for the enrollmentTokenUsageCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentTokenUsageCount(@javax.annotation.Nullable final Integer value) {
        this.enrollmentTokenUsageCount = value;
    }
    /**
     * Sets the isTeamsDeviceProfile property value. Boolean indicating if this profile is an Android AOSP for Teams device profile.
     * @param value Value to set for the isTeamsDeviceProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsTeamsDeviceProfile(@javax.annotation.Nullable final Boolean value) {
        this.isTeamsDeviceProfile = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the qrCodeContent property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQrCodeContent(@javax.annotation.Nullable final String value) {
        this.qrCodeContent = value;
    }
    /**
     * Sets the qrCodeImage property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeImage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQrCodeImage(@javax.annotation.Nullable final MimeContent value) {
        this.qrCodeImage = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the tokenCreationDateTime property value. Date time the most recently created token was created.
     * @param value Value to set for the tokenCreationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.tokenCreationDateTime = value;
    }
    /**
     * Sets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.tokenExpirationDateTime = value;
    }
    /**
     * Sets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @param value Value to set for the tokenValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenValue(@javax.annotation.Nullable final String value) {
        this.tokenValue = value;
    }
    /**
     * Sets the wifiHidden property value. Boolean that indicates if hidden wifi networks are enabled
     * @param value Value to set for the wifiHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiHidden(@javax.annotation.Nullable final Boolean value) {
        this.wifiHidden = value;
    }
    /**
     * Sets the wifiPassword property value. String that contains the wi-fi login password
     * @param value Value to set for the wifiPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiPassword(@javax.annotation.Nullable final String value) {
        this.wifiPassword = value;
    }
    /**
     * Sets the wifiSecurityType property value. This enum represents Wi-Fi Security Types for Android Device Owner AOSP Scenarios.
     * @param value Value to set for the wifiSecurityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiSecurityType(@javax.annotation.Nullable final AospWifiSecurityType value) {
        this.wifiSecurityType = value;
    }
    /**
     * Sets the wifiSsid property value. String that contains the wi-fi login ssid
     * @param value Value to set for the wifiSsid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiSsid(@javax.annotation.Nullable final String value) {
        this.wifiSsid = value;
    }
}
