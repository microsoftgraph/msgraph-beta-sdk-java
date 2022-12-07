package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationGroupSettingInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /** Group Setting Value Template */
    private DeviceManagementConfigurationGroupSettingValueTemplate _groupSettingValueTemplate;
    /**
     * Instantiates a new DeviceManagementConfigurationGroupSettingInstanceTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationGroupSettingInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationGroupSettingInstanceTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingInstanceTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingInstanceTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupSettingValueTemplate", (n) -> { this.setGroupSettingValueTemplate(n.getObjectValue(DeviceManagementConfigurationGroupSettingValueTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupSettingValueTemplate property value. Group Setting Value Template
     * @return a deviceManagementConfigurationGroupSettingValueTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingValueTemplate getGroupSettingValueTemplate() {
        return this._groupSettingValueTemplate;
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
        writer.writeObjectValue("groupSettingValueTemplate", this.getGroupSettingValueTemplate());
    }
    /**
     * Sets the groupSettingValueTemplate property value. Group Setting Value Template
     * @param value Value to set for the groupSettingValueTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupSettingValueTemplate(@javax.annotation.Nullable final DeviceManagementConfigurationGroupSettingValueTemplate value) {
        this._groupSettingValueTemplate = value;
    }
}
