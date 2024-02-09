package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * template insights definition
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementTemplateInsightsDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementTemplateInsightsDefinition} and sets the default values.
     */
    public DeviceManagementTemplateInsightsDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementTemplateInsightsDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementTemplateInsightsDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementTemplateInsightsDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settingInsights", (n) -> { this.setSettingInsights(n.getCollectionOfObjectValues(DeviceManagementSettingInsightsDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settingInsights property value. Setting insights in a template
     * @return a {@link java.util.List<DeviceManagementSettingInsightsDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInsightsDefinition> getSettingInsights() {
        return this.backingStore.get("settingInsights");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("settingInsights", this.getSettingInsights());
    }
    /**
     * Sets the settingInsights property value. Setting insights in a template
     * @param value Value to set for the settingInsights property.
     */
    public void setSettingInsights(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInsightsDefinition> value) {
        this.backingStore.set("settingInsights", value);
    }
}
