package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A Domain Join Connector is a connector that is responsible to allocate (and delete) machine account blobs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementDomainJoinConnector extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementDomainJoinConnector} and sets the default values.
     */
    public DeviceManagementDomainJoinConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementDomainJoinConnector}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementDomainJoinConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementDomainJoinConnector();
    }
    /**
     * Gets the displayName property value. The connector display name.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastConnectionDateTime", (n) -> { this.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(DeviceManagementDomainJoinConnectorState::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastConnectionDateTime property value. Last time connector contacted Intune.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this.backingStore.get("lastConnectionDateTime");
    }
    /**
     * Gets the state property value. The ODJ request states.
     * @return a {@link DeviceManagementDomainJoinConnectorState}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDomainJoinConnectorState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the version property value. The version of the connector.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastConnectionDateTime property value. Last time connector contacted Intune.
     * @param value Value to set for the lastConnectionDateTime property.
     */
    public void setLastConnectionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastConnectionDateTime", value);
    }
    /**
     * Sets the state property value. The ODJ request states.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final DeviceManagementDomainJoinConnectorState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the version property value. The version of the connector.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
