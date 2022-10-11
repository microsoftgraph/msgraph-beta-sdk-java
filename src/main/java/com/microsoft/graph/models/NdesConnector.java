package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity which represents an OnPrem Ndes connector. */
public class NdesConnector extends Entity implements Parsable {
    /** The build version of the Ndes Connector. */
    private String _connectorVersion;
    /** The friendly name of the Ndes Connector. */
    private String _displayName;
    /** Timestamp when on-prem certificate connector was enrolled in Intune. */
    private OffsetDateTime _enrolledDateTime;
    /** Last connection time for the Ndes Connector */
    private OffsetDateTime _lastConnectionDateTime;
    /** Name of the machine running on-prem certificate connector service. */
    private String _machineName;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** The current status of the Ndes Connector. */
    private NdesConnectorState _state;
    /**
     * Instantiates a new ndesConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NdesConnector() {
        super();
        this.setOdataType("#microsoft.graph.ndesConnector");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ndesConnector
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
        return this._connectorVersion;
    }
    /**
     * Gets the displayName property value. The friendly name of the Ndes Connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enrolledDateTime property value. Timestamp when on-prem certificate connector was enrolled in Intune.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this._enrolledDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NdesConnector currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("connectorVersion", (n) -> { currentObject.setConnectorVersion(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enrolledDateTime", (n) -> { currentObject.setEnrolledDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastConnectionDateTime", (n) -> { currentObject.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
            this.put("machineName", (n) -> { currentObject.setMachineName(n.getStringValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(NdesConnectorState.class)); });
        }};
    }
    /**
     * Gets the lastConnectionDateTime property value. Last connection time for the Ndes Connector
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this._lastConnectionDateTime;
    }
    /**
     * Gets the machineName property value. Name of the machine running on-prem certificate connector service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMachineName() {
        return this._machineName;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the state property value. The current status of the Ndes Connector.
     * @return a ndesConnectorState
     */
    @javax.annotation.Nullable
    public NdesConnectorState getState() {
        return this._state;
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
        this._connectorVersion = value;
    }
    /**
     * Sets the displayName property value. The friendly name of the Ndes Connector.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enrolledDateTime property value. Timestamp when on-prem certificate connector was enrolled in Intune.
     * @param value Value to set for the enrolledDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrolledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._enrolledDateTime = value;
    }
    /**
     * Sets the lastConnectionDateTime property value. Last connection time for the Ndes Connector
     * @param value Value to set for the lastConnectionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastConnectionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastConnectionDateTime = value;
    }
    /**
     * Sets the machineName property value. Name of the machine running on-prem certificate connector service.
     * @param value Value to set for the machineName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMachineName(@javax.annotation.Nullable final String value) {
        this._machineName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the state property value. The current status of the Ndes Connector.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final NdesConnectorState value) {
        this._state = value;
    }
}
