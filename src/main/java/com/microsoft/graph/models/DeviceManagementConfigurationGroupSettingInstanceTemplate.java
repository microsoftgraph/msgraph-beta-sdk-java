package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Group Setting Instance Template
 */
public class DeviceManagementConfigurationGroupSettingInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /**
     * Group Setting Value Template
     */
    private DeviceManagementConfigurationGroupSettingValueTemplate groupSettingValueTemplate;
    /**
     * Instantiates a new deviceManagementConfigurationGroupSettingInstanceTemplate and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationGroupSettingInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationGroupSettingInstanceTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingInstanceTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingInstanceTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupSettingValueTemplate", (n) -> { this.setGroupSettingValueTemplate(n.getObjectValue(DeviceManagementConfigurationGroupSettingValueTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupSettingValueTemplate property value. Group Setting Value Template
     * @return a deviceManagementConfigurationGroupSettingValueTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingValueTemplate getGroupSettingValueTemplate() {
        return this.groupSettingValueTemplate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("groupSettingValueTemplate", this.getGroupSettingValueTemplate());
    }
    /**
     * Sets the groupSettingValueTemplate property value. Group Setting Value Template
     * @param value Value to set for the groupSettingValueTemplate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGroupSettingValueTemplate(@jakarta.annotation.Nullable final DeviceManagementConfigurationGroupSettingValueTemplate value) {
        this.groupSettingValueTemplate = value;
    }
}
