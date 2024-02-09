package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminDynamics extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AdminDynamics} and sets the default values.
     */
    public AdminDynamics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminDynamics}
     */
    @jakarta.annotation.Nonnull
    public static AdminDynamics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminDynamics();
    }
    /**
     * Gets the customerVoice property value. The customerVoice property
     * @return a {@link CustomerVoiceSettings}
     */
    @jakarta.annotation.Nullable
    public CustomerVoiceSettings getCustomerVoice() {
        return this.backingStore.get("customerVoice");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customerVoice", (n) -> { this.setCustomerVoice(n.getObjectValue(CustomerVoiceSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("customerVoice", this.getCustomerVoice());
    }
    /**
     * Sets the customerVoice property value. The customerVoice property
     * @param value Value to set for the customerVoice property.
     */
    public void setCustomerVoice(@jakarta.annotation.Nullable final CustomerVoiceSettings value) {
        this.backingStore.set("customerVoice", value);
    }
}
