package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QrCode extends Entity implements Parsable {
    /**
     * Instantiates a new {@link QrCode} and sets the default values.
     */
    public QrCode() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QrCode}
     */
    @jakarta.annotation.Nonnull
    public static QrCode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QrCode();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the QR code was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the expireDateTime property value. Temporary QR code lifetime is between 1-12 hours. Standard QR code lifetime is in days and max. is 395 days (13 months) and default value is 365 days (12 months).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpireDateTime() {
        return this.backingStore.get("expireDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expireDateTime", (n) -> { this.setExpireDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(QrCodeImageDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("lastUsedDateTime", (n) -> { this.setLastUsedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the image property value. The QR code image&apos;s raw data that is returned when a standard or temporary QR code is created.
     * @return a {@link QrCodeImageDetails}
     */
    @jakarta.annotation.Nullable
    public QrCodeImageDetails getImage() {
        return this.backingStore.get("image");
    }
    /**
     * Gets the lastUsedDateTime property value. The date and time when the QR code was last used for a successful sign-in.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedDateTime() {
        return this.backingStore.get("lastUsedDateTime");
    }
    /**
     * Gets the startDateTime property value. The date and time when the QR code becomes active and available to use.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expireDateTime", this.getExpireDateTime());
        writer.writeObjectValue("image", this.getImage());
        writer.writeOffsetDateTimeValue("lastUsedDateTime", this.getLastUsedDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the QR code was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the expireDateTime property value. Temporary QR code lifetime is between 1-12 hours. Standard QR code lifetime is in days and max. is 395 days (13 months) and default value is 365 days (12 months).
     * @param value Value to set for the expireDateTime property.
     */
    public void setExpireDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expireDateTime", value);
    }
    /**
     * Sets the image property value. The QR code image&apos;s raw data that is returned when a standard or temporary QR code is created.
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final QrCodeImageDetails value) {
        this.backingStore.set("image", value);
    }
    /**
     * Sets the lastUsedDateTime property value. The date and time when the QR code was last used for a successful sign-in.
     * @param value Value to set for the lastUsedDateTime property.
     */
    public void setLastUsedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUsedDateTime", value);
    }
    /**
     * Sets the startDateTime property value. The date and time when the QR code becomes active and available to use.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
}
