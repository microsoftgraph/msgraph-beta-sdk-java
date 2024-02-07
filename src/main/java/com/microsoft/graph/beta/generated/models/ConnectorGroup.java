package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectorGroup extends Entity implements Parsable {
    /**
     * Instantiates a new ConnectorGroup and sets the default values.
     */
    public ConnectorGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectorGroup
     */
    @jakarta.annotation.Nonnull
    public static ConnectorGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorGroup();
    }
    /**
     * Gets the applications property value. The applications property
     * @return a java.util.List<Application>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Application> getApplications() {
        return this.backingStore.get("applications");
    }
    /**
     * Gets the connectorGroupType property value. The connectorGroupType property
     * @return a ConnectorGroupType
     */
    @jakarta.annotation.Nullable
    public ConnectorGroupType getConnectorGroupType() {
        return this.backingStore.get("connectorGroupType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applications", (n) -> { this.setApplications(n.getCollectionOfObjectValues(Application::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorGroupType", (n) -> { this.setConnectorGroupType(n.getEnumValue(ConnectorGroupType::forValue)); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(Connector::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getEnumValue(ConnectorGroupRegion::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the members property value. The members property
     * @return a java.util.List<Connector>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Connector> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the name property value. The name associated with the connectorGroup.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the region property value. The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue.
     * @return a ConnectorGroupRegion
     */
    @jakarta.annotation.Nullable
    public ConnectorGroupRegion getRegion() {
        return this.backingStore.get("region");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setApplications(@jakarta.annotation.Nullable final java.util.List<Application> value) {
        this.backingStore.set("applications", value);
    }
    /**
     * Sets the connectorGroupType property value. The connectorGroupType property
     * @param value Value to set for the connectorGroupType property.
     */
    public void setConnectorGroupType(@jakarta.annotation.Nullable final ConnectorGroupType value) {
        this.backingStore.set("connectorGroupType", value);
    }
    /**
     * Sets the isDefault property value. Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the members property value. The members property
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<Connector> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the name property value. The name associated with the connectorGroup.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the region property value. The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final ConnectorGroupRegion value) {
        this.backingStore.set("region", value);
    }
}
