package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSettingGroupDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSettingGroupDefinition} and sets the default values.
     */
    public DeviceManagementConfigurationSettingGroupDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSettingGroupDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingGroupDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationSettingGroupCollectionDefinition": return new DeviceManagementConfigurationSettingGroupCollectionDefinition();
            }
        }
        return new DeviceManagementConfigurationSettingGroupDefinition();
    }
    /**
     * Gets the childIds property value. Dependent child settings to this group of settings.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChildIds() {
        return this.backingStore.get("childIds");
    }
    /**
     * Gets the dependedOnBy property value. List of child settings that depend on this setting
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingDependedOnBy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDependedOnBy> getDependedOnBy() {
        return this.backingStore.get("dependedOnBy");
    }
    /**
     * Gets the dependentOn property value. List of Dependencies for the setting group
     * @return a {@link java.util.List<DeviceManagementConfigurationDependentOn>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationDependentOn> getDependentOn() {
        return this.backingStore.get("dependentOn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childIds", (n) -> { this.setChildIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dependedOnBy", (n) -> { this.setDependedOnBy(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDependedOnBy::createFromDiscriminatorValue)); });
        deserializerMap.put("dependentOn", (n) -> { this.setDependentOn(n.getCollectionOfObjectValues(DeviceManagementConfigurationDependentOn::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("childIds", this.getChildIds());
        writer.writeCollectionOfObjectValues("dependedOnBy", this.getDependedOnBy());
        writer.writeCollectionOfObjectValues("dependentOn", this.getDependentOn());
    }
    /**
     * Sets the childIds property value. Dependent child settings to this group of settings.
     * @param value Value to set for the childIds property.
     */
    public void setChildIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("childIds", value);
    }
    /**
     * Sets the dependedOnBy property value. List of child settings that depend on this setting
     * @param value Value to set for the dependedOnBy property.
     */
    public void setDependedOnBy(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDependedOnBy> value) {
        this.backingStore.set("dependedOnBy", value);
    }
    /**
     * Sets the dependentOn property value. List of Dependencies for the setting group
     * @param value Value to set for the dependentOn property.
     */
    public void setDependentOn(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationDependentOn> value) {
        this.backingStore.set("dependentOn", value);
    }
}
