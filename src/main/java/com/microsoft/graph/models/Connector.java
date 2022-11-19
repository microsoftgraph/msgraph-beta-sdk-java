package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class Connector extends Entity implements Parsable {
    /** The external IP address as detected by the the connector server. Read-only. */
    private String _externalIp;
    /** The machine name the connector is installed and running on. */
    private String _machineName;
    /** The connectorGroup that the connector is a member of. Read-only. */
    private java.util.List<ConnectorGroup> _memberOf;
    /** The status property */
    private ConnectorStatus _status;
    /**
     * Instantiates a new connector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Connector() {
        super();
        this.setOdataType("#microsoft.graph.connector");
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
        return this._externalIp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Connector currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("externalIp", (n) -> { currentObject.setExternalIp(n.getStringValue()); });
        deserializerMap.put("machineName", (n) -> { currentObject.setMachineName(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { currentObject.setMemberOf(n.getCollectionOfObjectValues(ConnectorGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ConnectorStatus.class)); });
        return deserializerMap
    }
    /**
     * Gets the machineName property value. The machine name the connector is installed and running on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMachineName() {
        return this._machineName;
    }
    /**
     * Gets the memberOf property value. The connectorGroup that the connector is a member of. Read-only.
     * @return a connectorGroup
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectorGroup> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the status property value. The status property
     * @return a connectorStatus
     */
    @javax.annotation.Nullable
    public ConnectorStatus getStatus() {
        return this._status;
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
    }
    /**
     * Sets the externalIp property value. The external IP address as detected by the the connector server. Read-only.
     * @param value Value to set for the externalIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalIp(@javax.annotation.Nullable final String value) {
        this._externalIp = value;
    }
    /**
     * Sets the machineName property value. The machine name the connector is installed and running on.
     * @param value Value to set for the machineName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMachineName(@javax.annotation.Nullable final String value) {
        this._machineName = value;
    }
    /**
     * Sets the memberOf property value. The connectorGroup that the connector is a member of. Read-only.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<ConnectorGroup> value) {
        this._memberOf = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ConnectorStatus value) {
        this._status = value;
    }
}
