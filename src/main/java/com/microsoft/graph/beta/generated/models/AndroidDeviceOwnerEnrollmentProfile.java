package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerEnrollmentProfile extends Entity implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerEnrollmentProfile and sets the default values.
     */
    public AndroidDeviceOwnerEnrollmentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerEnrollmentProfile
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerEnrollmentProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerEnrollmentProfile();
    }
    /**
     * Gets the accountId property value. Tenant GUID the enrollment profile belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.backingStore.get("accountId");
    }
    /**
     * Gets the configureWifi property value. Boolean that indicates that the Wi-Fi network should be configured during device provisioning. When set to TRUE, device provisioning will use Wi-Fi related properties to automatically connect to Wi-Fi networks. When set to FALSE or undefined, other Wi-Fi related properties will be ignored. Default value is TRUE. Returned by default.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConfigureWifi() {
        return this.backingStore.get("configureWifi");
    }
    /**
     * Gets the createdDateTime property value. Date time the enrollment profile was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description for the enrollment profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name for the enrollment profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnrolledDeviceCount() {
        return this.backingStore.get("enrolledDeviceCount");
    }
    /**
     * Gets the enrollmentMode property value. The enrollment mode for an enrollment profile.
     * @return a AndroidDeviceOwnerEnrollmentMode
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentMode getEnrollmentMode() {
        return this.backingStore.get("enrollmentMode");
    }
    /**
     * Gets the enrollmentTokenType property value. The enrollment token type for an enrollment profile.
     * @return a AndroidDeviceOwnerEnrollmentTokenType
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentTokenType getEnrollmentTokenType() {
        return this.backingStore.get("enrollmentTokenType");
    }
    /**
     * Gets the enrollmentTokenUsageCount property value. Total number of AOSP devices that have enrolled using the current token.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnrollmentTokenUsageCount() {
        return this.backingStore.get("enrollmentTokenUsageCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("configureWifi", (n) -> { this.setConfigureWifi(n.getBooleanValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrolledDeviceCount", (n) -> { this.setEnrolledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("enrollmentMode", (n) -> { this.setEnrollmentMode(n.getEnumValue(AndroidDeviceOwnerEnrollmentMode::forValue)); });
        deserializerMap.put("enrollmentTokenType", (n) -> { this.setEnrollmentTokenType(n.getEnumValue(AndroidDeviceOwnerEnrollmentTokenType::forValue)); });
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
        deserializerMap.put("wifiSecurityType", (n) -> { this.setWifiSecurityType(n.getEnumValue(AospWifiSecurityType::forValue)); });
        deserializerMap.put("wifiSsid", (n) -> { this.setWifiSsid(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTeamsDeviceProfile property value. Boolean indicating if this profile is an Android AOSP for Teams device profile.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTeamsDeviceProfile() {
        return this.backingStore.get("isTeamsDeviceProfile");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the qrCodeContent property value. String used to generate a QR code for the token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQrCodeContent() {
        return this.backingStore.get("qrCodeContent");
    }
    /**
     * Gets the qrCodeImage property value. String used to generate a QR code for the token.
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getQrCodeImage() {
        return this.backingStore.get("qrCodeImage");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the tokenCreationDateTime property value. Date time the most recently created token was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTokenCreationDateTime() {
        return this.backingStore.get("tokenCreationDateTime");
    }
    /**
     * Gets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this.backingStore.get("tokenExpirationDateTime");
    }
    /**
     * Gets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenValue() {
        return this.backingStore.get("tokenValue");
    }
    /**
     * Gets the wifiHidden property value. Boolean that indicates if hidden wifi networks are enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWifiHidden() {
        return this.backingStore.get("wifiHidden");
    }
    /**
     * Gets the wifiPassword property value. String that contains the wi-fi login password
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWifiPassword() {
        return this.backingStore.get("wifiPassword");
    }
    /**
     * Gets the wifiSecurityType property value. This enum represents Wi-Fi Security Types for Android Device Owner AOSP Scenarios.
     * @return a AospWifiSecurityType
     */
    @jakarta.annotation.Nullable
    public AospWifiSecurityType getWifiSecurityType() {
        return this.backingStore.get("wifiSecurityType");
    }
    /**
     * Gets the wifiSsid property value. String that contains the wi-fi login ssid
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWifiSsid() {
        return this.backingStore.get("wifiSsid");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountId", value);
    }
    /**
     * Sets the configureWifi property value. Boolean that indicates that the Wi-Fi network should be configured during device provisioning. When set to TRUE, device provisioning will use Wi-Fi related properties to automatically connect to Wi-Fi networks. When set to FALSE or undefined, other Wi-Fi related properties will be ignored. Default value is TRUE. Returned by default.
     * @param value Value to set for the configureWifi property.
     */
    public void setConfigureWifi(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("configureWifi", value);
    }
    /**
     * Sets the createdDateTime property value. Date time the enrollment profile was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description for the enrollment profile.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name for the enrollment profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @param value Value to set for the enrolledDeviceCount property.
     */
    public void setEnrolledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("enrolledDeviceCount", value);
    }
    /**
     * Sets the enrollmentMode property value. The enrollment mode for an enrollment profile.
     * @param value Value to set for the enrollmentMode property.
     */
    public void setEnrollmentMode(@jakarta.annotation.Nullable final AndroidDeviceOwnerEnrollmentMode value) {
        this.backingStore.set("enrollmentMode", value);
    }
    /**
     * Sets the enrollmentTokenType property value. The enrollment token type for an enrollment profile.
     * @param value Value to set for the enrollmentTokenType property.
     */
    public void setEnrollmentTokenType(@jakarta.annotation.Nullable final AndroidDeviceOwnerEnrollmentTokenType value) {
        this.backingStore.set("enrollmentTokenType", value);
    }
    /**
     * Sets the enrollmentTokenUsageCount property value. Total number of AOSP devices that have enrolled using the current token.
     * @param value Value to set for the enrollmentTokenUsageCount property.
     */
    public void setEnrollmentTokenUsageCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("enrollmentTokenUsageCount", value);
    }
    /**
     * Sets the isTeamsDeviceProfile property value. Boolean indicating if this profile is an Android AOSP for Teams device profile.
     * @param value Value to set for the isTeamsDeviceProfile property.
     */
    public void setIsTeamsDeviceProfile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTeamsDeviceProfile", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the qrCodeContent property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeContent property.
     */
    public void setQrCodeContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("qrCodeContent", value);
    }
    /**
     * Sets the qrCodeImage property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeImage property.
     */
    public void setQrCodeImage(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("qrCodeImage", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the tokenCreationDateTime property value. Date time the most recently created token was created.
     * @param value Value to set for the tokenCreationDateTime property.
     */
    public void setTokenCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("tokenCreationDateTime", value);
    }
    /**
     * Sets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     */
    public void setTokenExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("tokenExpirationDateTime", value);
    }
    /**
     * Sets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @param value Value to set for the tokenValue property.
     */
    public void setTokenValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tokenValue", value);
    }
    /**
     * Sets the wifiHidden property value. Boolean that indicates if hidden wifi networks are enabled
     * @param value Value to set for the wifiHidden property.
     */
    public void setWifiHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wifiHidden", value);
    }
    /**
     * Sets the wifiPassword property value. String that contains the wi-fi login password
     * @param value Value to set for the wifiPassword property.
     */
    public void setWifiPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("wifiPassword", value);
    }
    /**
     * Sets the wifiSecurityType property value. This enum represents Wi-Fi Security Types for Android Device Owner AOSP Scenarios.
     * @param value Value to set for the wifiSecurityType property.
     */
    public void setWifiSecurityType(@jakarta.annotation.Nullable final AospWifiSecurityType value) {
        this.backingStore.set("wifiSecurityType", value);
    }
    /**
     * Sets the wifiSsid property value. String that contains the wi-fi login ssid
     * @param value Value to set for the wifiSsid property.
     */
    public void setWifiSsid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("wifiSsid", value);
    }
}
