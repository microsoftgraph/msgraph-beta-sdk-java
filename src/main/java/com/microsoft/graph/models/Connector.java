package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Connector extends Entity implements Parsable {
    /**
     * The external IP address as detected by the the connector server. Read-only.
     */
    private String externalIp;
    /**
     * The machine name the connector is installed and running on.
     */
    private String machineName;
    /**
     * The connectorGroup that the connector is a member of. Read-only.
     */
    private java.util.List<ConnectorGroup> memberOf;
    /**
     * The status property
     */
    private ConnectorStatus status;
    /**
     * The version property
     */
    private String version;
    /**
     * Instantiates a new connector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Connector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connector
     */
    @javax.annotation.Nonnull
    public static Connector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Connector();
    }
    /**
     * Gets the externalIp property value. The external IP address as detected by the the connector server. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalIp() {
        return this.externalIp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("externalIp", (n) -> { this.setExternalIp(n.getStringValue()); });
        deserializerMap.put("machineName", (n) -> { this.setMachineName(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(ConnectorGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectorStatus.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the machineName property value. The machine name the connector is installed and running on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMachineName() {
        return this.machineName;
    }
    /**
     * Gets the memberOf property value. The connectorGroup that the connector is a member of. Read-only.
     * @return a connectorGroup
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectorGroup> getMemberOf() {
        return this.memberOf;
    }
    /**
     * Gets the status property value. The status property
     * @return a connectorStatus
     */
    @javax.annotation.Nullable
    public ConnectorStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeStringValue("externalIp", this.getExternalIp());
        writer.writeStringValue("machineName", this.getMachineName());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the externalIp property value. The external IP address as detected by the the connector server. Read-only.
     * @param value Value to set for the externalIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalIp(@javax.annotation.Nullable final String value) {
        this.externalIp = value;
    }
    /**
     * Sets the machineName property value. The machine name the connector is installed and running on.
     * @param value Value to set for the machineName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMachineName(@javax.annotation.Nullable final String value) {
        this.machineName = value;
    }
    /**
     * Sets the memberOf property value. The connectorGroup that the connector is a member of. Read-only.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<ConnectorGroup> value) {
        this.memberOf = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ConnectorStatus value) {
        this.status = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
