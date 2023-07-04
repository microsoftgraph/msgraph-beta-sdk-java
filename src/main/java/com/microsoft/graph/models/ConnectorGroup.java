package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorGroup extends Entity implements Parsable {
    /**
     * The applications property
     */
    private java.util.List<Application> applications;
    /**
     * The connectorGroupType property
     */
    private ConnectorGroupType connectorGroupType;
    /**
     * Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only.
     */
    private Boolean isDefault;
    /**
     * The members property
     */
    private java.util.List<Connector> members;
    /**
     * The name associated with the connectorGroup.
     */
    private String name;
    /**
     * The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue.
     */
    private ConnectorGroupRegion region;
    /**
     * Instantiates a new connectorGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectorGroup
     */
    @javax.annotation.Nonnull
    public static ConnectorGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorGroup();
    }
    /**
     * Gets the applications property value. The applications property
     * @return a application
     */
    @javax.annotation.Nullable
    public java.util.List<Application> getApplications() {
        return this.applications;
    }
    /**
     * Gets the connectorGroupType property value. The connectorGroupType property
     * @return a ConnectorGroupType
     */
    @javax.annotation.Nullable
    public ConnectorGroupType getConnectorGroupType() {
        return this.connectorGroupType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applications", (n) -> { this.setApplications(n.getCollectionOfObjectValues(Application::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorGroupType", (n) -> { this.setConnectorGroupType(n.getEnumValue(ConnectorGroupType.class)); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(Connector::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getEnumValue(ConnectorGroupRegion.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the members property value. The members property
     * @return a connector
     */
    @javax.annotation.Nullable
    public java.util.List<Connector> getMembers() {
        return this.members;
    }
    /**
     * Gets the name property value. The name associated with the connectorGroup.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the region property value. The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue.
     * @return a connectorGroupRegion
     */
    @javax.annotation.Nullable
    public ConnectorGroupRegion getRegion() {
        return this.region;
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
        writer.writeCollectionOfObjectValues("applications", this.getApplications());
        writer.writeEnumValue("connectorGroupType", this.getConnectorGroupType());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("region", this.getRegion());
    }
    /**
     * Sets the applications property value. The applications property
     * @param value Value to set for the applications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplications(@javax.annotation.Nullable final java.util.List<Application> value) {
        this.applications = value;
    }
    /**
     * Sets the connectorGroupType property value. The connectorGroupType property
     * @param value Value to set for the connectorGroupType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorGroupType(@javax.annotation.Nullable final ConnectorGroupType value) {
        this.connectorGroupType = value;
    }
    /**
     * Sets the isDefault property value. Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only.
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the members property value. The members property
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<Connector> value) {
        this.members = value;
    }
    /**
     * Sets the name property value. The name associated with the connectorGroup.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the region property value. The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue.
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final ConnectorGroupRegion value) {
        this.region = value;
    }
}
