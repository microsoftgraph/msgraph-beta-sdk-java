package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /** Linked policy may append values which are not present in the template. */
    private Boolean _allowUnmanagedValues;
    /** Group Setting Collection Value Template */
    private java.util.List<DeviceManagementConfigurationGroupSettingValueTemplate> _groupSettingCollectionValueTemplate;
    /**
     * Instantiates a new DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate();
    }
    /**
     * Gets the allowUnmanagedValues property value. Linked policy may append values which are not present in the template.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUnmanagedValues() {
        return this._allowUnmanagedValues;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationGroupSettingCollectionInstanceTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowUnmanagedValues", (n) -> { currentObject.setAllowUnmanagedValues(n.getBooleanValue()); });
            this.put("groupSettingCollectionValueTemplate", (n) -> { currentObject.setGroupSettingCollectionValueTemplate(n.getCollectionOfObjectValues(DeviceManagementConfigurationGroupSettingValueTemplate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupSettingCollectionValueTemplate property value. Group Setting Collection Value Template
     * @return a deviceManagementConfigurationGroupSettingValueTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationGroupSettingValueTemplate> getGroupSettingCollectionValueTemplate() {
        return this._groupSettingCollectionValueTemplate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUnmanagedValues", this.getAllowUnmanagedValues());
        writer.writeCollectionOfObjectValues("groupSettingCollectionValueTemplate", this.getGroupSettingCollectionValueTemplate());
    }
    /**
     * Sets the allowUnmanagedValues property value. Linked policy may append values which are not present in the template.
     * @param value Value to set for the allowUnmanagedValues property.
     * @return a void
     */
    public void setAllowUnmanagedValues(@javax.annotation.Nullable final Boolean value) {
        this._allowUnmanagedValues = value;
    }
    /**
     * Sets the groupSettingCollectionValueTemplate property value. Group Setting Collection Value Template
     * @param value Value to set for the groupSettingCollectionValueTemplate property.
     * @return a void
     */
    public void setGroupSettingCollectionValueTemplate(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationGroupSettingValueTemplate> value) {
        this._groupSettingCollectionValueTemplate = value;
    }
}
