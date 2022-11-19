package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity that represents a single Microsoft Tunnel server */
public class MicrosoftTunnelServer extends Entity implements Parsable {
    /** The digest of the current agent image running on this server */
    private String _agentImageDigest;
    /** The display name for the server. This property is required when a server is created and cannot be cleared during updates. */
    private String _displayName;
    /** Indicates when the server last checked in */
    private OffsetDateTime _lastCheckinDateTime;
    /** The digest of the current server image running on this server */
    private String _serverImageDigest;
    /** Enum of possible MicrosoftTunnelServer health status types */
    private MicrosoftTunnelServerHealthStatus _tunnelServerHealthStatus;
    /**
     * Instantiates a new microsoftTunnelServer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelServer() {
        super();
        this.setOdataType("#microsoft.graph.microsoftTunnelServer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftTunnelServer
     */
    @javax.annotation.Nonnull
    public static MicrosoftTunnelServer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelServer();
    }
    /**
     * Gets the agentImageDigest property value. The digest of the current agent image running on this server
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAgentImageDigest() {
        return this._agentImageDigest;
    }
    /**
     * Gets the displayName property value. The display name for the server. This property is required when a server is created and cannot be cleared during updates.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftTunnelServer currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentImageDigest", (n) -> { currentObject.setAgentImageDigest(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastCheckinDateTime", (n) -> { currentObject.setLastCheckinDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serverImageDigest", (n) -> { currentObject.setServerImageDigest(n.getStringValue()); });
        deserializerMap.put("tunnelServerHealthStatus", (n) -> { currentObject.setTunnelServerHealthStatus(n.getEnumValue(MicrosoftTunnelServerHealthStatus.class)); });
        return deserializerMap
    }
    /**
     * Gets the lastCheckinDateTime property value. Indicates when the server last checked in
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckinDateTime() {
        return this._lastCheckinDateTime;
    }
    /**
     * Gets the serverImageDigest property value. The digest of the current server image running on this server
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerImageDigest() {
        return this._serverImageDigest;
    }
    /**
     * Gets the tunnelServerHealthStatus property value. Enum of possible MicrosoftTunnelServer health status types
     * @return a microsoftTunnelServerHealthStatus
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelServerHealthStatus getTunnelServerHealthStatus() {
        return this._tunnelServerHealthStatus;
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
        writer.writeStringValue("agentImageDigest", this.getAgentImageDigest());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastCheckinDateTime", this.getLastCheckinDateTime());
        writer.writeStringValue("serverImageDigest", this.getServerImageDigest());
        writer.writeEnumValue("tunnelServerHealthStatus", this.getTunnelServerHealthStatus());
    }
    /**
     * Sets the agentImageDigest property value. The digest of the current agent image running on this server
     * @param value Value to set for the agentImageDigest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgentImageDigest(@javax.annotation.Nullable final String value) {
        this._agentImageDigest = value;
    }
    /**
     * Sets the displayName property value. The display name for the server. This property is required when a server is created and cannot be cleared during updates.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastCheckinDateTime property value. Indicates when the server last checked in
     * @param value Value to set for the lastCheckinDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastCheckinDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCheckinDateTime = value;
    }
    /**
     * Sets the serverImageDigest property value. The digest of the current server image running on this server
     * @param value Value to set for the serverImageDigest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerImageDigest(@javax.annotation.Nullable final String value) {
        this._serverImageDigest = value;
    }
    /**
     * Sets the tunnelServerHealthStatus property value. Enum of possible MicrosoftTunnelServer health status types
     * @param value Value to set for the tunnelServerHealthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTunnelServerHealthStatus(@javax.annotation.Nullable final MicrosoftTunnelServerHealthStatus value) {
        this._tunnelServerHealthStatus = value;
    }
}
