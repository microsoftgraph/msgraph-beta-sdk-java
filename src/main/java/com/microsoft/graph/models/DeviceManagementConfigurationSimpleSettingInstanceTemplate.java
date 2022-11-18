package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSimpleSettingInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /** Simple Setting Value Template */
    private DeviceManagementConfigurationSimpleSettingValueTemplate _simpleSettingValueTemplate;
    /**
     * Instantiates a new DeviceManagementConfigurationSimpleSettingInstanceTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSimpleSettingInstanceTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingInstanceTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingInstanceTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSimpleSettingInstanceTemplate currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("simpleSettingValueTemplate", (n) -> { currentObject.setSimpleSettingValueTemplate(n.getObjectValue(DeviceManagementConfigurationSimpleSettingValueTemplate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the simpleSettingValueTemplate property value. Simple Setting Value Template
     * @return a deviceManagementConfigurationSimpleSettingValueTemplate
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingValueTemplate getSimpleSettingValueTemplate() {
        return this._simpleSettingValueTemplate;
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
        writer.writeObjectValue("simpleSettingValueTemplate", this.getSimpleSettingValueTemplate());
    }
    /**
     * Sets the simpleSettingValueTemplate property value. Simple Setting Value Template
     * @param value Value to set for the simpleSettingValueTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimpleSettingValueTemplate(@javax.annotation.Nullable final DeviceManagementConfigurationSimpleSettingValueTemplate value) {
        this._simpleSettingValueTemplate = value;
    }
}
