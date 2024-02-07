package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents a single Microsoft Tunnel server
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftTunnelServer extends Entity implements Parsable {
    /**
     * Instantiates a new MicrosoftTunnelServer and sets the default values.
     */
    public MicrosoftTunnelServer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftTunnelServer
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTunnelServer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelServer();
    }
    /**
     * Gets the agentImageDigest property value. The digest of the current agent image running on this server
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAgentImageDigest() {
        return this.backingStore.get("agentImageDigest");
    }
    /**
     * Gets the displayName property value. The display name for the server. This property is required when a server is created and cannot be cleared during updates.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentImageDigest", (n) -> { this.setAgentImageDigest(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastCheckinDateTime", (n) -> { this.setLastCheckinDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serverImageDigest", (n) -> { this.setServerImageDigest(n.getStringValue()); });
        deserializerMap.put("tunnelServerHealthStatus", (n) -> { this.setTunnelServerHealthStatus(n.getEnumValue(MicrosoftTunnelServerHealthStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastCheckinDateTime property value. Indicates when the server last checked in
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCheckinDateTime() {
        return this.backingStore.get("lastCheckinDateTime");
    }
    /**
     * Gets the serverImageDigest property value. The digest of the current server image running on this server
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServerImageDigest() {
        return this.backingStore.get("serverImageDigest");
    }
    /**
     * Gets the tunnelServerHealthStatus property value. Enum of possible MicrosoftTunnelServer health status types
     * @return a MicrosoftTunnelServerHealthStatus
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelServerHealthStatus getTunnelServerHealthStatus() {
        return this.backingStore.get("tunnelServerHealthStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agentImageDigest", this.getAgentImageDigest());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastCheckinDateTime", this.getLastCheckinDateTime());
        writer.writeStringValue("serverImageDigest", this.getServerImageDigest());
        writer.writeEnumValue("tunnelServerHealthStatus", this.getTunnelServerHealthStatus());
    }
    /**
     * Sets the agentImageDigest property value. The digest of the current agent image running on this server
     * @param value Value to set for the agentImageDigest property.
     */
    public void setAgentImageDigest(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentImageDigest", value);
    }
    /**
     * Sets the displayName property value. The display name for the server. This property is required when a server is created and cannot be cleared during updates.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastCheckinDateTime property value. Indicates when the server last checked in
     * @param value Value to set for the lastCheckinDateTime property.
     */
    public void setLastCheckinDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCheckinDateTime", value);
    }
    /**
     * Sets the serverImageDigest property value. The digest of the current server image running on this server
     * @param value Value to set for the serverImageDigest property.
     */
    public void setServerImageDigest(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serverImageDigest", value);
    }
    /**
     * Sets the tunnelServerHealthStatus property value. Enum of possible MicrosoftTunnelServer health status types
     * @param value Value to set for the tunnelServerHealthStatus property.
     */
    public void setTunnelServerHealthStatus(@jakarta.annotation.Nullable final MicrosoftTunnelServerHealthStatus value) {
        this.backingStore.set("tunnelServerHealthStatus", value);
    }
}
