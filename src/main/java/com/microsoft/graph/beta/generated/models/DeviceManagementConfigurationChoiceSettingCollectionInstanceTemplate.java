package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Choice Setting Collection Instance Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate} and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingCollectionInstanceTemplate();
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
     * Gets the choiceSettingCollectionValueTemplate property value. Choice Setting Collection Value Template
     * @return a {@link java.util.List<DeviceManagementConfigurationChoiceSettingValueTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationChoiceSettingValueTemplate> getChoiceSettingCollectionValueTemplate() {
        return this.backingStore.get("choiceSettingCollectionValueTemplate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowUnmanagedValues", (n) -> { this.setAllowUnmanagedValues(n.getBooleanValue()); });
        deserializerMap.put("choiceSettingCollectionValueTemplate", (n) -> { this.setChoiceSettingCollectionValueTemplate(n.getCollectionOfObjectValues(DeviceManagementConfigurationChoiceSettingValueTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUnmanagedValues", this.getAllowUnmanagedValues());
        writer.writeCollectionOfObjectValues("choiceSettingCollectionValueTemplate", this.getChoiceSettingCollectionValueTemplate());
    }
    /**
     * Sets the allowUnmanagedValues property value. Linked policy may append values which are not present in the template.
     * @param value Value to set for the allowUnmanagedValues property.
     */
    public void setAllowUnmanagedValues(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUnmanagedValues", value);
    }
    /**
     * Sets the choiceSettingCollectionValueTemplate property value. Choice Setting Collection Value Template
     * @param value Value to set for the choiceSettingCollectionValueTemplate property.
     */
    public void setChoiceSettingCollectionValueTemplate(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationChoiceSettingValueTemplate> value) {
        this.backingStore.set("choiceSettingCollectionValueTemplate", value);
    }
}
