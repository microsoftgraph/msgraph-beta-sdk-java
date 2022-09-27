package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Enrollment Profile used to enroll COSU devices using Google's Cloud Management. */
public class AndroidForWorkEnrollmentProfile extends Entity implements Parsable {
    /** Tenant GUID the enrollment profile belongs to. */
    private String _accountId;
    /** Date time the enrollment profile was created. */
    private OffsetDateTime _createdDateTime;
    /** Description for the enrollment profile. */
    private String _description;
    /** Display name for the enrollment profile. */
    private String _displayName;
    /** Total number of Android devices that have enrolled using this enrollment profile. */
    private Integer _enrolledDeviceCount;
    /** Date time the enrollment profile was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** String used to generate a QR code for the token. */
    private String _qrCodeContent;
    /** String used to generate a QR code for the token. */
    private MimeContent _qrCodeImage;
    /** Date time the most recently created token will expire. */
    private OffsetDateTime _tokenExpirationDateTime;
    /** Value of the most recently created token for this enrollment profile. */
    private String _tokenValue;
    /**
     * Instantiates a new androidForWorkEnrollmentProfile and sets the default values.
     * @return a void
     */
    public AndroidForWorkEnrollmentProfile() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkEnrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidForWorkEnrollmentProfile
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkEnrollmentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkEnrollmentProfile();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidForWorkEnrollmentProfile currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accountId", (n) -> { currentObject.setAccountId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enrolledDeviceCount", (n) -> { currentObject.setEnrolledDeviceCount(n.getIntegerValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("qrCodeContent", (n) -> { currentObject.setQrCodeContent(n.getStringValue()); });
            this.put("qrCodeImage", (n) -> { currentObject.setQrCodeImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("tokenExpirationDateTime", (n) -> { currentObject.setTokenExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("tokenValue", (n) -> { currentObject.setTokenValue(n.getStringValue()); });
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
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("qrCodeContent", this.getQrCodeContent());
        writer.writeObjectValue("qrCodeImage", this.getQrCodeImage());
        writer.writeOffsetDateTimeValue("tokenExpirationDateTime", this.getTokenExpirationDateTime());
        writer.writeStringValue("tokenValue", this.getTokenValue());
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
}
