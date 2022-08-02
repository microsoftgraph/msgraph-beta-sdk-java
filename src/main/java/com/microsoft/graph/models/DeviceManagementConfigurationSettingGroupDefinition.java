package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSettingGroupDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /** Dependent child settings to this group of settings */
    private java.util.List<String> _childIds;
    /** List of child settings that depend on this setting */
    private java.util.List<DeviceManagementConfigurationSettingDependedOnBy> _dependedOnBy;
    /** List of Dependencies for the setting group */
    private java.util.List<DeviceManagementConfigurationDependentOn> _dependentOn;
    /**
     * Instantiates a new DeviceManagementConfigurationSettingGroupDefinition and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSettingGroupDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSettingGroupDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSettingGroupDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingGroupDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationSettingGroupCollectionDefinition": return new DeviceManagementConfigurationSettingGroupCollectionDefinition();
            }
        }
        return new DeviceManagementConfigurationSettingGroupDefinition();
    }
    /**
     * Gets the childIds property value. Dependent child settings to this group of settings
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getChildIds() {
        return this._childIds;
    }
    /**
     * Gets the dependedOnBy property value. List of child settings that depend on this setting
     * @return a deviceManagementConfigurationSettingDependedOnBy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDependedOnBy> getDependedOnBy() {
        return this._dependedOnBy;
    }
    /**
     * Gets the dependentOn property value. List of Dependencies for the setting group
     * @return a deviceManagementConfigurationDependentOn
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationDependentOn> getDependentOn() {
        return this._dependentOn;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSettingGroupDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("childIds", (n) -> { currentObject.setChildIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("dependedOnBy", (n) -> { currentObject.setDependedOnBy(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDependedOnBy::createFromDiscriminatorValue)); });
            this.put("dependentOn", (n) -> { currentObject.setDependentOn(n.getCollectionOfObjectValues(DeviceManagementConfigurationDependentOn::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("childIds", this.getChildIds());
        writer.writeCollectionOfObjectValues("dependedOnBy", this.getDependedOnBy());
        writer.writeCollectionOfObjectValues("dependentOn", this.getDependentOn());
    }
    /**
     * Sets the childIds property value. Dependent child settings to this group of settings
     * @param value Value to set for the childIds property.
     * @return a void
     */
    public void setChildIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._childIds = value;
    }
    /**
     * Sets the dependedOnBy property value. List of child settings that depend on this setting
     * @param value Value to set for the dependedOnBy property.
     * @return a void
     */
    public void setDependedOnBy(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDependedOnBy> value) {
        this._dependedOnBy = value;
    }
    /**
     * Sets the dependentOn property value. List of Dependencies for the setting group
     * @param value Value to set for the dependentOn property.
     * @return a void
     */
    public void setDependentOn(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationDependentOn> value) {
        this._dependentOn = value;
    }
}
