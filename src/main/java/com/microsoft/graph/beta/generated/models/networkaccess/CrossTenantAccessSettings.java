package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantAccessSettings extends Entity implements Parsable {
    /**
     * Instantiates a new CrossTenantAccessSettings and sets the default values.
     */
    public CrossTenantAccessSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantAccessSettings
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("networkPacketTaggingStatus", (n) -> { this.setNetworkPacketTaggingStatus(n.getEnumValue(Status::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the networkPacketTaggingStatus property value. The networkPacketTaggingStatus property
     * @return a Status
     */
    @jakarta.annotation.Nullable
    public Status getNetworkPacketTaggingStatus() {
        return this.backingStore.get("networkPacketTaggingStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("networkPacketTaggingStatus", this.getNetworkPacketTaggingStatus());
    }
    /**
     * Sets the networkPacketTaggingStatus property value. The networkPacketTaggingStatus property
     * @param value Value to set for the networkPacketTaggingStatus property.
     */
    public void setNetworkPacketTaggingStatus(@jakarta.annotation.Nullable final Status value) {
        this.backingStore.set("networkPacketTaggingStatus", value);
    }
}
