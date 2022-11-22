package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A Domain Join Connector is a connector that is responsible to allocate (and delete) machine account blobs */
public class DeviceManagementDomainJoinConnector extends Entity implements Parsable {
    /** The connector display name. */
    private String _displayName;
    /** Last time connector contacted Intune. */
    private OffsetDateTime _lastConnectionDateTime;
    /** The ODJ request states. */
    private DeviceManagementDomainJoinConnectorState _state;
    /** The version of the connector. */
    private String _version;
    /**
     * Instantiates a new deviceManagementDomainJoinConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementDomainJoinConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementDomainJoinConnector
     */
    @javax.annotation.Nonnull
    public static DeviceManagementDomainJoinConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementDomainJoinConnector();
    }
    /**
     * Gets the displayName property value. The connector display name.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastConnectionDateTime", (n) -> { this.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(DeviceManagementDomainJoinConnectorState.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastConnectionDateTime property value. Last time connector contacted Intune.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this._lastConnectionDateTime;
    }
    /**
     * Gets the state property value. The ODJ request states.
     * @return a deviceManagementDomainJoinConnectorState
     */
    @javax.annotation.Nullable
    public DeviceManagementDomainJoinConnectorState getState() {
        return this._state;
    }
    /**
     * Gets the version property value. The version of the connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastConnectionDateTime", this.getLastConnectionDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The connector display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastConnectionDateTime property value. Last time connector contacted Intune.
     * @param value Value to set for the lastConnectionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastConnectionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastConnectionDateTime = value;
    }
    /**
     * Sets the state property value. The ODJ request states.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final DeviceManagementDomainJoinConnectorState value) {
        this._state = value;
    }
    /**
     * Sets the version property value. The version of the connector.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
