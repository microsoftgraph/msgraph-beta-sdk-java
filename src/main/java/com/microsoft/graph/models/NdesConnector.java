package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity which represents an OnPrem Ndes connector.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NdesConnector extends Entity implements Parsable {
    /**
     * Instantiates a new NdesConnector and sets the default values.
     */
    public NdesConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NdesConnector
     */
    @jakarta.annotation.Nonnull
    public static NdesConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NdesConnector();
    }
    /**
     * Gets the connectorVersion property value. The build version of the Ndes Connector.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorVersion() {
        return this.BackingStore.get("connectorVersion");
    }
    /**
     * Gets the displayName property value. The friendly name of the Ndes Connector.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the enrolledDateTime property value. Timestamp when on-prem certificate connector was enrolled in Intune.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this.BackingStore.get("enrolledDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this.BackingStore.get("lastConnectionDateTime");
    }
    /**
     * Gets the machineName property value. Name of the machine running on-prem certificate connector service.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMachineName() {
        return this.BackingStore.get("machineName");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.BackingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the state property value. The current status of the Ndes Connector.
     * @return a NdesConnectorState
     */
    @jakarta.annotation.Nullable
    public NdesConnectorState getState() {
        return this.BackingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setConnectorVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("connectorVersion", value);
    }
    /**
     * Sets the displayName property value. The friendly name of the Ndes Connector.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the enrolledDateTime property value. Timestamp when on-prem certificate connector was enrolled in Intune.
     * @param value Value to set for the enrolledDateTime property.
     */
    public void setEnrolledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("enrolledDateTime", value);
    }
    /**
     * Sets the lastConnectionDateTime property value. Last connection time for the Ndes Connector
     * @param value Value to set for the lastConnectionDateTime property.
     */
    public void setLastConnectionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastConnectionDateTime", value);
    }
    /**
     * Sets the machineName property value. Name of the machine running on-prem certificate connector service.
     * @param value Value to set for the machineName property.
     */
    public void setMachineName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("machineName", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the state property value. The current status of the Ndes Connector.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final NdesConnectorState value) {
        this.BackingStore.set("state", value);
    }
}
