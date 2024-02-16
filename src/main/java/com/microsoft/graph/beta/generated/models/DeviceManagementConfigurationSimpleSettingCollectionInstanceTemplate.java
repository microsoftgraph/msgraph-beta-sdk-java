package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Simple Setting Collection Instance Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate} and sets the default values.
     */
    public DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingCollectionInstanceTemplate();
    }
    /**
     * Gets the allowUnmanagedValues property value. Linked policy may append values which are not present in the template.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUnmanagedValues() {
        return this.backingStore.get("allowUnmanagedValues");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowUnmanagedValues", (n) -> { this.setAllowUnmanagedValues(n.getBooleanValue()); });
        deserializerMap.put("simpleSettingCollectionValueTemplate", (n) -> { this.setSimpleSettingCollectionValueTemplate(n.getCollectionOfObjectValues(DeviceManagementConfigurationSimpleSettingValueTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simpleSettingCollectionValueTemplate property value. Simple Setting Collection Value Template
     * @return a {@link java.util.List<DeviceManagementConfigurationSimpleSettingValueTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSimpleSettingValueTemplate> getSimpleSettingCollectionValueTemplate() {
        return this.backingStore.get("simpleSettingCollectionValueTemplate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUnmanagedValues", this.getAllowUnmanagedValues());
        writer.writeCollectionOfObjectValues("simpleSettingCollectionValueTemplate", this.getSimpleSettingCollectionValueTemplate());
    }
    /**
     * Sets the allowUnmanagedValues property value. Linked policy may append values which are not present in the template.
     * @param value Value to set for the allowUnmanagedValues property.
     */
    public void setAllowUnmanagedValues(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUnmanagedValues", value);
    }
    /**
     * Sets the simpleSettingCollectionValueTemplate property value. Simple Setting Collection Value Template
     * @param value Value to set for the simpleSettingCollectionValueTemplate property.
     */
    public void setSimpleSettingCollectionValueTemplate(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSimpleSettingValueTemplate> value) {
        this.backingStore.set("simpleSettingCollectionValueTemplate", value);
    }
}
