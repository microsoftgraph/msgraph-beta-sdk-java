package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing the defintion for a given setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementSettingDefinition} and sets the default values.
     */
    public DeviceManagementSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementSettingDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementAbstractComplexSettingDefinition": return new DeviceManagementAbstractComplexSettingDefinition();
                case "#microsoft.graph.deviceManagementCollectionSettingDefinition": return new DeviceManagementCollectionSettingDefinition();
                case "#microsoft.graph.deviceManagementComplexSettingDefinition": return new DeviceManagementComplexSettingDefinition();
            }
        }
        return new DeviceManagementSettingDefinition();
    }
    /**
     * Gets the constraints property value. Collection of constraints for the setting value
     * @return a {@link java.util.List<DeviceManagementConstraint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConstraint> getConstraints() {
        return this.backingStore.get("constraints");
    }
    /**
     * Gets the dependencies property value. Collection of dependencies on other settings
     * @return a {@link java.util.List<DeviceManagementSettingDependency>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingDependency> getDependencies() {
        return this.backingStore.get("dependencies");
    }
    /**
     * Gets the description property value. The setting&apos;s description
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The setting&apos;s display name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the documentationUrl property value. Url to setting documentation
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocumentationUrl() {
        return this.backingStore.get("documentationUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("constraints", (n) -> { this.setConstraints(n.getCollectionOfObjectValues(DeviceManagementConstraint::createFromDiscriminatorValue)); });
        deserializerMap.put("dependencies", (n) -> { this.setDependencies(n.getCollectionOfObjectValues(DeviceManagementSettingDependency::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("documentationUrl", (n) -> { this.setDocumentationUrl(n.getStringValue()); });
        deserializerMap.put("headerSubtitle", (n) -> { this.setHeaderSubtitle(n.getStringValue()); });
        deserializerMap.put("headerTitle", (n) -> { this.setHeaderTitle(n.getStringValue()); });
        deserializerMap.put("isTopLevel", (n) -> { this.setIsTopLevel(n.getBooleanValue()); });
        deserializerMap.put("keywords", (n) -> { this.setKeywords(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("placeholderText", (n) -> { this.setPlaceholderText(n.getStringValue()); });
        deserializerMap.put("valueType", (n) -> { this.setValueType(n.getEnumValue(DeviceManangementIntentValueType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the headerSubtitle property value. subtitle of the setting header for more details about the category/section
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeaderSubtitle() {
        return this.backingStore.get("headerSubtitle");
    }
    /**
     * Gets the headerTitle property value. title of the setting header represents a category/section of a setting/settings
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeaderTitle() {
        return this.backingStore.get("headerTitle");
    }
    /**
     * Gets the isTopLevel property value. If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTopLevel() {
        return this.backingStore.get("isTopLevel");
    }
    /**
     * Gets the keywords property value. Keywords associated with the setting
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKeywords() {
        return this.backingStore.get("keywords");
    }
    /**
     * Gets the placeholderText property value. Placeholder text as an example of valid input
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceholderText() {
        return this.backingStore.get("placeholderText");
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a {@link DeviceManangementIntentValueType}
     */
    @jakarta.annotation.Nullable
    public DeviceManangementIntentValueType getValueType() {
        return this.backingStore.get("valueType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("constraints", this.getConstraints());
        writer.writeCollectionOfObjectValues("dependencies", this.getDependencies());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("documentationUrl", this.getDocumentationUrl());
        writer.writeStringValue("headerSubtitle", this.getHeaderSubtitle());
        writer.writeStringValue("headerTitle", this.getHeaderTitle());
        writer.writeBooleanValue("isTopLevel", this.getIsTopLevel());
        writer.writeCollectionOfPrimitiveValues("keywords", this.getKeywords());
        writer.writeStringValue("placeholderText", this.getPlaceholderText());
        writer.writeEnumValue("valueType", this.getValueType());
    }
    /**
     * Sets the constraints property value. Collection of constraints for the setting value
     * @param value Value to set for the constraints property.
     */
    public void setConstraints(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConstraint> value) {
        this.backingStore.set("constraints", value);
    }
    /**
     * Sets the dependencies property value. Collection of dependencies on other settings
     * @param value Value to set for the dependencies property.
     */
    public void setDependencies(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingDependency> value) {
        this.backingStore.set("dependencies", value);
    }
    /**
     * Sets the description property value. The setting&apos;s description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The setting&apos;s display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the documentationUrl property value. Url to setting documentation
     * @param value Value to set for the documentationUrl property.
     */
    public void setDocumentationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("documentationUrl", value);
    }
    /**
     * Sets the headerSubtitle property value. subtitle of the setting header for more details about the category/section
     * @param value Value to set for the headerSubtitle property.
     */
    public void setHeaderSubtitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("headerSubtitle", value);
    }
    /**
     * Sets the headerTitle property value. title of the setting header represents a category/section of a setting/settings
     * @param value Value to set for the headerTitle property.
     */
    public void setHeaderTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("headerTitle", value);
    }
    /**
     * Sets the isTopLevel property value. If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting
     * @param value Value to set for the isTopLevel property.
     */
    public void setIsTopLevel(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTopLevel", value);
    }
    /**
     * Sets the keywords property value. Keywords associated with the setting
     * @param value Value to set for the keywords property.
     */
    public void setKeywords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("keywords", value);
    }
    /**
     * Sets the placeholderText property value. Placeholder text as an example of valid input
     * @param value Value to set for the placeholderText property.
     */
    public void setPlaceholderText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeholderText", value);
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     */
    public void setValueType(@jakarta.annotation.Nullable final DeviceManangementIntentValueType value) {
        this.backingStore.set("valueType", value);
    }
}
