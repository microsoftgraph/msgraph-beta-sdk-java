package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Event representing an Apple Vpp Token Troubleshooting Event.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppleVppTokenTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /**
     * Instantiates a new AppleVppTokenTroubleshootingEvent and sets the default values.
     */
    public AppleVppTokenTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleVppTokenTroubleshootingEvent
     */
    @jakarta.annotation.Nonnull
    public static AppleVppTokenTroubleshootingEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleVppTokenTroubleshootingEvent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("tokenId", (n) -> { this.setTokenId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tokenId property value. Apple Volume Purchase Program Token Identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenId() {
        return this.backingStore.get("tokenId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("tokenId", this.getTokenId());
    }
    /**
     * Sets the tokenId property value. Apple Volume Purchase Program Token Identifier.
     * @param value Value to set for the tokenId property.
     */
    public void setTokenId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tokenId", value);
    }
}
