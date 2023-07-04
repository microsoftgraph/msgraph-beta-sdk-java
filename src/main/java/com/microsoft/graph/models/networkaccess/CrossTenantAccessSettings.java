package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessSettings extends Entity implements Parsable {
    /**
     * The networkPacketTaggingStatus property
     */
    private Status networkPacketTaggingStatus;
    /**
     * Instantiates a new crossTenantAccessSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossTenantAccessSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessSettings
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("networkPacketTaggingStatus", (n) -> { this.setNetworkPacketTaggingStatus(n.getEnumValue(Status.class)); });
        return deserializerMap;
    }
    /**
     * Gets the networkPacketTaggingStatus property value. The networkPacketTaggingStatus property
     * @return a Status
     */
    @javax.annotation.Nullable
    public Status getNetworkPacketTaggingStatus() {
        return this.networkPacketTaggingStatus;
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
        writer.writeEnumValue("networkPacketTaggingStatus", this.getNetworkPacketTaggingStatus());
    }
    /**
     * Sets the networkPacketTaggingStatus property value. The networkPacketTaggingStatus property
     * @param value Value to set for the networkPacketTaggingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkPacketTaggingStatus(@javax.annotation.Nullable final Status value) {
        this.networkPacketTaggingStatus = value;
    }
}
