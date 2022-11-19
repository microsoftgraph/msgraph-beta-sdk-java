package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /** Linked policy may append values which are not present in the template. */
    private Boolean _allowUnmanagedValues;
    /** Simple Setting Collection Value Template */
    private java.util.List<DeviceManagementConfigurationSimpleSettingValueTemplate> _simpleSettingCollectionValueTemplate;
    /**
     * Instantiates a new DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate();
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
        final DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowUnmanagedValues", (n) -> { currentObject.setAllowUnmanagedValues(n.getBooleanValue()); });
        deserializerMap.put("simpleSettingCollectionValueTemplate", (n) -> { currentObject.setSimpleSettingCollectionValueTemplate(n.getCollectionOfObjectValues(DeviceManagementConfigurationSimpleSettingValueTemplate::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the simpleSettingCollectionValueTemplate property value. Simple Setting Collection Value Template
     * @return a deviceManagementConfigurationSimpleSettingValueTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSimpleSettingValueTemplate> getSimpleSettingCollectionValueTemplate() {
        return this._simpleSettingCollectionValueTemplate;
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
        writer.writeBooleanValue("allowUnmanagedValues", this.getAllowUnmanagedValues());
        writer.writeCollectionOfObjectValues("simpleSettingCollectionValueTemplate", this.getSimpleSettingCollectionValueTemplate());
    }
    /**
     * Sets the allowUnmanagedValues property value. Linked policy may append values which are not present in the template.
     * @param value Value to set for the allowUnmanagedValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowUnmanagedValues(@javax.annotation.Nullable final Boolean value) {
        this._allowUnmanagedValues = value;
    }
    /**
     * Sets the simpleSettingCollectionValueTemplate property value. Simple Setting Collection Value Template
     * @param value Value to set for the simpleSettingCollectionValueTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimpleSettingCollectionValueTemplate(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSimpleSettingValueTemplate> value) {
        this._simpleSettingCollectionValueTemplate = value;
    }
}
