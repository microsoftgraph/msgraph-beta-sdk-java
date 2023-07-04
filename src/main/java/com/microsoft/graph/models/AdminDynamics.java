package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AdminDynamics extends Entity implements Parsable {
    /**
     * The customerVoice property
     */
    private CustomerVoiceSettings customerVoice;
    /**
     * Instantiates a new AdminDynamics and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdminDynamics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AdminDynamics
     */
    @javax.annotation.Nonnull
    public static AdminDynamics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminDynamics();
    }
    /**
     * Gets the customerVoice property value. The customerVoice property
     * @return a CustomerVoiceSettings
     */
    @javax.annotation.Nullable
    public CustomerVoiceSettings getCustomerVoice() {
        return this.customerVoice;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customerVoice", (n) -> { this.setCustomerVoice(n.getObjectValue(CustomerVoiceSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("customerVoice", this.getCustomerVoice());
    }
    /**
     * Sets the customerVoice property value. The customerVoice property
     * @param value Value to set for the customerVoice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerVoice(@javax.annotation.Nullable final CustomerVoiceSettings value) {
        this.customerVoice = value;
    }
}
