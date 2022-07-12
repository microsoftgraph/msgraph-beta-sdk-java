package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectorGroup extends Entity implements Parsable {
    /** The applications property */
    private java.util.List<Application> _applications;
    /** The connectorGroupType property */
    private ConnectorGroupType _connectorGroupType;
    /** Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only. */
    private Boolean _isDefault;
    /** The members property */
    private java.util.List<Connector> _members;
    /** The name associated with the connectorGroup. */
    private String _name;
    /** The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue. */
    private ConnectorGroupRegion _region;
    /**
     * Instantiates a new connectorGroup and sets the default values.
     * @return a void
     */
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
        return this._applications;
    }
    /**
     * Gets the connectorGroupType property value. The connectorGroupType property
     * @return a connectorGroupType
     */
    @javax.annotation.Nullable
    public ConnectorGroupType getConnectorGroupType() {
        return this._connectorGroupType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConnectorGroup currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applications", (n) -> { currentObject.setApplications(n.getCollectionOfObjectValues(Application::createFromDiscriminatorValue)); });
            this.put("connectorGroupType", (n) -> { currentObject.setConnectorGroupType(n.getEnumValue(ConnectorGroupType.class)); });
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(Connector::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("region", (n) -> { currentObject.setRegion(n.getEnumValue(ConnectorGroupRegion.class)); });
        }};
    }
    /**
     * Gets the isDefault property value. Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the members property value. The members property
     * @return a connector
     */
    @javax.annotation.Nullable
    public java.util.List<Connector> getMembers() {
        return this._members;
    }
    /**
     * Gets the name property value. The name associated with the connectorGroup.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the region property value. The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue.
     * @return a connectorGroupRegion
     */
    @javax.annotation.Nullable
    public ConnectorGroupRegion getRegion() {
        return this._region;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setApplications(@javax.annotation.Nullable final java.util.List<Application> value) {
        this._applications = value;
    }
    /**
     * Sets the connectorGroupType property value. The connectorGroupType property
     * @param value Value to set for the connectorGroupType property.
     * @return a void
     */
    public void setConnectorGroupType(@javax.annotation.Nullable final ConnectorGroupType value) {
        this._connectorGroupType = value;
    }
    /**
     * Sets the isDefault property value. Indicates if the connectorGroup is the default connectorGroup. Only a single connector group can be the default connectorGroup and this is pre-set by the system. Read-only.
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the members property value. The members property
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<Connector> value) {
        this._members = value;
    }
    /**
     * Sets the name property value. The name associated with the connectorGroup.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the region property value. The region the connectorGroup is assigned to and will optimize traffic for. This region can only be set if no connectors or applications are assigned to the connectorGroup. The possible values are: nam (for North America), eur (for Europe), aus (for Australia), asia (for Asia), ind (for India), and unknownFutureValue.
     * @param value Value to set for the region property.
     * @return a void
     */
    public void setRegion(@javax.annotation.Nullable final ConnectorGroupRegion value) {
        this._region = value;
    }
}
