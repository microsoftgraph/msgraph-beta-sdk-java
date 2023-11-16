package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessSettings extends Entity implements Parsable {
    /**
     * Instantiates a new ConditionalAccessSettings and sets the default values.
     */
    public ConditionalAccessSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessSettings
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("signalingStatus", (n) -> { this.setSignalingStatus(n.getEnumValue(Status.class)); });
        return deserializerMap;
    }
    /**
     * Gets the signalingStatus property value. The signalingStatus property
     * @return a Status
     */
    @jakarta.annotation.Nullable
    public Status getSignalingStatus() {
        return this.BackingStore.get("signalingStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("signalingStatus", this.getSignalingStatus());
    }
    /**
     * Sets the signalingStatus property value. The signalingStatus property
     * @param value Value to set for the signalingStatus property.
     */
    public void setSignalingStatus(@jakarta.annotation.Nullable final Status value) {
        this.BackingStore.set("signalingStatus", value);
    }
}
