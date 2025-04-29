package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QrPin extends Entity implements Parsable {
    /**
     * Instantiates a new {@link QrPin} and sets the default values.
     */
    public QrPin() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QrPin}
     */
    @jakarta.annotation.Nonnull
    public static QrPin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QrPin();
    }
    /**
     * Gets the code property value. PIN of the user. It is between 8-20 digits as configured in the QR code authentication method policy. The code is temporary when issued by admin but permanent after the user changes it at the first login attempt. This PIN can be reset by the admin but not the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.backingStore.get("code");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the PIN was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("forceChangePinNextSignIn", (n) -> { this.setForceChangePinNextSignIn(n.getBooleanValue()); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forceChangePinNextSignIn property value. Defaults to true for a temporary PIN.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getForceChangePinNextSignIn() {
        return this.backingStore.get("forceChangePinNextSignIn");
    }
    /**
     * Gets the updatedDateTime property value. The date and time when the PIN was updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this.backingStore.get("updatedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("forceChangePinNextSignIn", this.getForceChangePinNextSignIn());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
    }
    /**
     * Sets the code property value. PIN of the user. It is between 8-20 digits as configured in the QR code authentication method policy. The code is temporary when issued by admin but permanent after the user changes it at the first login attempt. This PIN can be reset by the admin but not the user.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("code", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the PIN was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the forceChangePinNextSignIn property value. Defaults to true for a temporary PIN.
     * @param value Value to set for the forceChangePinNextSignIn property.
     */
    public void setForceChangePinNextSignIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("forceChangePinNextSignIn", value);
    }
    /**
     * Sets the updatedDateTime property value. The date and time when the PIN was updated.
     * @param value Value to set for the updatedDateTime property.
     */
    public void setUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("updatedDateTime", value);
    }
}
