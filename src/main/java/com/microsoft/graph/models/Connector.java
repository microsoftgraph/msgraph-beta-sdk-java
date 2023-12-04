package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Connector extends Entity implements Parsable {
    /**
     * Instantiates a new Connector and sets the default values.
     */
    public Connector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Connector
     */
    @jakarta.annotation.Nonnull
    public static Connector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Connector();
    }
    /**
     * Gets the externalIp property value. The external IP address as detected by the the connector server. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalIp() {
        return this.backingStore.get("externalIp");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("externalIp", (n) -> { this.setExternalIp(n.getStringValue()); });
        deserializerMap.put("machineName", (n) -> { this.setMachineName(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(ConnectorGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectorStatus::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the machineName property value. The machine name the connector is installed and running on.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMachineName() {
        return this.backingStore.get("machineName");
    }
    /**
     * Gets the memberOf property value. The connectorGroup that the connector is a member of. Read-only.
     * @return a java.util.List<ConnectorGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectorGroup> getMemberOf() {
        return this.backingStore.get("memberOf");
    }
    /**
     * Gets the status property value. The status property
     * @return a ConnectorStatus
     */
    @jakarta.annotation.Nullable
    public ConnectorStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the version property value. The version property
     * @return a String
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
        writer.writeStringValue("externalIp", this.getExternalIp());
        writer.writeStringValue("machineName", this.getMachineName());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the externalIp property value. The external IP address as detected by the the connector server. Read-only.
     * @param value Value to set for the externalIp property.
     */
    public void setExternalIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalIp", value);
    }
    /**
     * Sets the machineName property value. The machine name the connector is installed and running on.
     * @param value Value to set for the machineName property.
     */
    public void setMachineName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("machineName", value);
    }
    /**
     * Sets the memberOf property value. The connectorGroup that the connector is a member of. Read-only.
     * @param value Value to set for the memberOf property.
     */
    public void setMemberOf(@jakarta.annotation.Nullable final java.util.List<ConnectorGroup> value) {
        this.backingStore.set("memberOf", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ConnectorStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
