package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Enrollment Profile used to enroll COSU devices using Google's Cloud Management.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkEnrollmentProfile extends Entity implements Parsable {
    /**
     * Instantiates a new AndroidForWorkEnrollmentProfile and sets the default values.
     */
    public AndroidForWorkEnrollmentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkEnrollmentProfile
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkEnrollmentProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkEnrollmentProfile();
    }
    /**
     * Gets the accountId property value. Tenant GUID the enrollment profile belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.BackingStore.get("accountId");
    }
    /**
     * Gets the createdDateTime property value. Date time the enrollment profile was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description for the enrollment profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name for the enrollment profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnrolledDeviceCount() {
        return this.BackingStore.get("enrolledDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrolledDeviceCount", (n) -> { this.setEnrolledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("qrCodeContent", (n) -> { this.setQrCodeContent(n.getStringValue()); });
        deserializerMap.put("qrCodeImage", (n) -> { this.setQrCodeImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenExpirationDateTime", (n) -> { this.setTokenExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tokenValue", (n) -> { this.setTokenValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the qrCodeContent property value. String used to generate a QR code for the token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQrCodeContent() {
        return this.BackingStore.get("qrCodeContent");
    }
    /**
     * Gets the qrCodeImage property value. String used to generate a QR code for the token.
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getQrCodeImage() {
        return this.BackingStore.get("qrCodeImage");
    }
    /**
     * Gets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTokenExpirationDateTime() {
        return this.BackingStore.get("tokenExpirationDateTime");
    }
    /**
     * Gets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenValue() {
        return this.BackingStore.get("tokenValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("enrolledDeviceCount", this.getEnrolledDeviceCount());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("qrCodeContent", this.getQrCodeContent());
        writer.writeObjectValue("qrCodeImage", this.getQrCodeImage());
        writer.writeOffsetDateTimeValue("tokenExpirationDateTime", this.getTokenExpirationDateTime());
        writer.writeStringValue("tokenValue", this.getTokenValue());
    }
    /**
     * Sets the accountId property value. Tenant GUID the enrollment profile belongs to.
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("accountId", value);
    }
    /**
     * Sets the createdDateTime property value. Date time the enrollment profile was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description for the enrollment profile.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name for the enrollment profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the enrolledDeviceCount property value. Total number of Android devices that have enrolled using this enrollment profile.
     * @param value Value to set for the enrolledDeviceCount property.
     */
    public void setEnrolledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("enrolledDeviceCount", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date time the enrollment profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the qrCodeContent property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeContent property.
     */
    public void setQrCodeContent(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("qrCodeContent", value);
    }
    /**
     * Sets the qrCodeImage property value. String used to generate a QR code for the token.
     * @param value Value to set for the qrCodeImage property.
     */
    public void setQrCodeImage(@jakarta.annotation.Nullable final MimeContent value) {
        this.BackingStore.set("qrCodeImage", value);
    }
    /**
     * Sets the tokenExpirationDateTime property value. Date time the most recently created token will expire.
     * @param value Value to set for the tokenExpirationDateTime property.
     */
    public void setTokenExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("tokenExpirationDateTime", value);
    }
    /**
     * Sets the tokenValue property value. Value of the most recently created token for this enrollment profile.
     * @param value Value to set for the tokenValue property.
     */
    public void setTokenValue(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("tokenValue", value);
    }
}
