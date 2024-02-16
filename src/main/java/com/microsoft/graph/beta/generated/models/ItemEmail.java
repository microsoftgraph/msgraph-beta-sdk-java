package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemEmail extends ItemFacet implements Parsable {
    /**
     * Instantiates a new {@link ItemEmail} and sets the default values.
     */
    public ItemEmail() {
        super();
        this.setOdataType("#microsoft.graph.itemEmail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemEmail}
     */
    @jakarta.annotation.Nonnull
    public static ItemEmail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemEmail();
    }
    /**
     * Gets the address property value. The email address itself.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddress() {
        return this.backingStore.get("address");
    }
    /**
     * Gets the displayName property value. The name or label a user has associated with a particular email address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("address", (n) -> { this.setAddress(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(EmailType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. The type property
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
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the address property value. The email address itself.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("address", value);
    }
    /**
     * Sets the displayName property value. The name or label a user has associated with a particular email address.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final EmailType value) {
        this.backingStore.set("type", value);
    }
}
