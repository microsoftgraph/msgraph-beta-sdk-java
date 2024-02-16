package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TypedEmailAddress extends EmailAddress implements Parsable {
    /**
     * Instantiates a new {@link TypedEmailAddress} and sets the default values.
     */
    public TypedEmailAddress() {
        super();
        this.setOdataType("#microsoft.graph.typedEmailAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TypedEmailAddress}
     */
    @jakarta.annotation.Nonnull
    public static TypedEmailAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TypedEmailAddress();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("otherLabel", (n) -> { this.setOtherLabel(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(EmailType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the otherLabel property value. To specify a custom type of email address, set type to other, and assign otherLabel to a custom string. For example, you may use a specific email address for your volunteer activities. Set type to other, and set otherLabel to a custom string such as Volunteer work.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOtherLabel() {
        return this.backingStore.get("otherLabel");
    }
    /**
     * Gets the type property value. The type of email address. Possible values are: unknown, work, personal, main, other. The default value is unknown, which means address has not been set as a specific type.
     * @return a {@link EmailType}
     */
    @jakarta.annotation.Nullable
    public EmailType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("otherLabel", this.getOtherLabel());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the otherLabel property value. To specify a custom type of email address, set type to other, and assign otherLabel to a custom string. For example, you may use a specific email address for your volunteer activities. Set type to other, and set otherLabel to a custom string such as Volunteer work.
     * @param value Value to set for the otherLabel property.
     */
    public void setOtherLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("otherLabel", value);
    }
    /**
     * Sets the type property value. The type of email address. Possible values are: unknown, work, personal, main, other. The default value is unknown, which means address has not been set as a specific type.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final EmailType value) {
        this.backingStore.set("type", value);
    }
}
