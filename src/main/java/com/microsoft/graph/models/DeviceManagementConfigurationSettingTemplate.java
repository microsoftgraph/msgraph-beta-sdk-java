package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Setting Template */
public class DeviceManagementConfigurationSettingTemplate extends Entity implements Parsable {
    /** List of related Setting Definitions */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> _settingDefinitions;
    /** Setting Instance Template */
    private DeviceManagementConfigurationSettingInstanceTemplate _settingInstanceTemplate;
    /**
     * Instantiates a new deviceManagementConfigurationSettingTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSettingTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSettingTemplate currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("settingDefinitions", (n) -> { currentObject.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
            this.put("settingInstanceTemplate", (n) -> { currentObject.setSettingInstanceTemplate(n.getObjectValue(DeviceManagementConfigurationSettingInstanceTemplate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settingDefinitions property value. List of related Setting Definitions
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getSettingDefinitions() {
        return this._settingDefinitions;
    }
    /**
     * Gets the settingInstanceTemplate property value. Setting Instance Template
     * @return a deviceManagementConfigurationSettingInstanceTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingInstanceTemplate getSettingInstanceTemplate() {
        return this._settingInstanceTemplate;
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
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settingInstanceTemplate", this.getSettingInstanceTemplate());
    }
    /**
     * Sets the settingDefinitions property value. List of related Setting Definitions
     * @param value Value to set for the settingDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDefinitions(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this._settingDefinitions = value;
    }
    /**
     * Sets the settingInstanceTemplate property value. Setting Instance Template
     * @param value Value to set for the settingInstanceTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingInstanceTemplate(@javax.annotation.Nullable final DeviceManagementConfigurationSettingInstanceTemplate value) {
        this._settingInstanceTemplate = value;
    }
}
