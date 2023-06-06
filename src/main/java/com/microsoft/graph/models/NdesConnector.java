package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NdesConnector extends Entity implements Parsable {
    /** The build version of the Ndes Connector. */
    private String connectorVersion;
    /** The friendly name of the Ndes Connector. */
    private String displayName;
    /** Timestamp when on-prem certificate connector was enrolled in Intune. */
    private OffsetDateTime enrolledDateTime;
    /** Last connection time for the Ndes Connector */
    private OffsetDateTime lastConnectionDateTime;
    /** Name of the machine running on-prem certificate connector service. */
    private String machineName;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> roleScopeTagIds;
    /** The current status of the Ndes Connector. */
    private NdesConnectorState state;
    /**
     * Instantiates a new NdesConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NdesConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NdesConnector
     */
    @javax.annotation.Nonnull
    public static NdesConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NdesConnector();
    }
    /**
     * Gets the connectorVersion property value. The build version of the Ndes Connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorVersion() {
        return this.connectorVersion;
    }
    /**
     * Gets the displayName property value. The friendly name of the Ndes Connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enrolledDateTime property value. Timestamp when on-prem certificate connector was enrolled in Intune.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this.enrolledDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectorVersion", (n) -> { this.setConnectorVersion(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrolledDateTime", (n) -> { this.setEnrolledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastConnectionDateTime", (n) -> { this.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("machineName", (n) -> { this.setMachineName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(NdesConnectorState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastConnectionDateTime property value. Last connection time for the Ndes Connector
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this.lastConnectionDateTime;
    }
    /**
     * Gets the machineName property value. Name of the machine running on-prem certificate connector service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMachineName() {
        return this.machineName;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the state property value. The current status of the Ndes Connector.
     * @return a ndesConnectorState
     */
    @javax.annotation.Nullable
    public NdesConnectorState getState() {
        return this.state;
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
        writer.writeStringValue("connectorVersion", this.getConnectorVersion());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("enrolledDateTime", this.getEnrolledDateTime());
        writer.writeOffsetDateTimeValue("lastConnectionDateTime", this.getLastConnectionDateTime());
        writer.writeStringValue("machineName", this.getMachineName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the connectorVersion property value. The build version of the Ndes Connector.
     * @param value Value to set for the connectorVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorVersion(@javax.annotation.Nullable final String value) {
        this.connectorVersion = value;
    }
    /**
     * Sets the displayName property value. The friendly name of the Ndes Connector.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enrolledDateTime property value. Timestamp when on-prem certificate connector was enrolled in Intune.
     * @param value Value to set for the enrolledDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrolledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.enrolledDateTime = value;
    }
    /**
     * Sets the lastConnectionDateTime property value. Last connection time for the Ndes Connector
     * @param value Value to set for the lastConnectionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastConnectionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastConnectionDateTime = value;
    }
    /**
     * Sets the machineName property value. Name of the machine running on-prem certificate connector service.
     * @param value Value to set for the machineName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMachineName(@javax.annotation.Nullable final String value) {
        this.machineName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the state property value. The current status of the Ndes Connector.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final NdesConnectorState value) {
        this.state = value;
    }
}
