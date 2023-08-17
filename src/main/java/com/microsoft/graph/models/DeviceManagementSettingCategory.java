package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing a setting category
 */
public class DeviceManagementSettingCategory extends Entity implements Parsable {
    /**
     * The category name
     */
    private String displayName;
    /**
     * The category contains top level required setting
     */
    private Boolean hasRequiredSetting;
    /**
     * The setting definitions this category contains
     */
    private java.util.List<DeviceManagementSettingDefinition> settingDefinitions;
    /**
     * Instantiates a new deviceManagementSettingCategory and sets the default values.
     */
    public DeviceManagementSettingCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingCategory
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementIntentSettingCategory": return new DeviceManagementIntentSettingCategory();
                case "#microsoft.graph.deviceManagementTemplateSettingCategory": return new DeviceManagementTemplateSettingCategory();
            }
        }
        return new DeviceManagementSettingCategory();
    }
    /**
     * Gets the displayName property value. The category name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hasRequiredSetting", (n) -> { this.setHasRequiredSetting(n.getBooleanValue()); });
        deserializerMap.put("settingDefinitions", (n) -> { this.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementSettingDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasRequiredSetting property value. The category contains top level required setting
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasRequiredSetting() {
        return this.hasRequiredSetting;
    }
    /**
     * Gets the settingDefinitions property value. The setting definitions this category contains
     * @return a deviceManagementSettingDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingDefinition> getSettingDefinitions() {
        return this.settingDefinitions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("hasRequiredSetting", this.getHasRequiredSetting());
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
    }
    /**
     * Sets the displayName property value. The category name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the hasRequiredSetting property value. The category contains top level required setting
     * @param value Value to set for the hasRequiredSetting property.
     */
    public void setHasRequiredSetting(@jakarta.annotation.Nullable final Boolean value) {
        this.hasRequiredSetting = value;
    }
    /**
     * Sets the settingDefinitions property value. The setting definitions this category contains
     * @param value Value to set for the settingDefinitions property.
     */
    public void setSettingDefinitions(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingDefinition> value) {
        this.settingDefinitions = value;
    }
}
