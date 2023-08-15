package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing the defintion for a given setting
 */
public class DeviceManagementSettingDefinition extends Entity implements Parsable {
    /**
     * Collection of constraints for the setting value
     */
    private java.util.List<DeviceManagementConstraint> constraints;
    /**
     * Collection of dependencies on other settings
     */
    private java.util.List<DeviceManagementSettingDependency> dependencies;
    /**
     * The setting's description
     */
    private String description;
    /**
     * The setting's display name
     */
    private String displayName;
    /**
     * Url to setting documentation
     */
    private String documentationUrl;
    /**
     * subtitle of the setting header for more details about the category/section
     */
    private String headerSubtitle;
    /**
     * title of the setting header represents a category/section of a setting/settings
     */
    private String headerTitle;
    /**
     * If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting
     */
    private Boolean isTopLevel;
    /**
     * Keywords associated with the setting
     */
    private java.util.List<String> keywords;
    /**
     * Placeholder text as an example of valid input
     */
    private String placeholderText;
    /**
     * The valueType property
     */
    private DeviceManangementIntentValueType valueType;
    /**
     * Instantiates a new deviceManagementSettingDefinition and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingDefinition
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
     * @return a deviceManagementConstraint
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConstraint> getConstraints() {
        return this.constraints;
    }
    /**
     * Gets the dependencies property value. Collection of dependencies on other settings
     * @return a deviceManagementSettingDependency
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingDependency> getDependencies() {
        return this.dependencies;
    }
    /**
     * Gets the description property value. The setting's description
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The setting's display name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the documentationUrl property value. Url to setting documentation
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDocumentationUrl() {
        return this.documentationUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
        deserializerMap.put("valueType", (n) -> { this.setValueType(n.getEnumValue(DeviceManangementIntentValueType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the headerSubtitle property value. subtitle of the setting header for more details about the category/section
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHeaderSubtitle() {
        return this.headerSubtitle;
    }
    /**
     * Gets the headerTitle property value. title of the setting header represents a category/section of a setting/settings
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHeaderTitle() {
        return this.headerTitle;
    }
    /**
     * Gets the isTopLevel property value. If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTopLevel() {
        return this.isTopLevel;
    }
    /**
     * Gets the keywords property value. Keywords associated with the setting
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }
    /**
     * Gets the placeholderText property value. Placeholder text as an example of valid input
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPlaceholderText() {
        return this.placeholderText;
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a deviceManangementIntentValueType
     */
    @jakarta.annotation.Nullable
    public DeviceManangementIntentValueType getValueType() {
        return this.valueType;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConstraints(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConstraint> value) {
        this.constraints = value;
    }
    /**
     * Sets the dependencies property value. Collection of dependencies on other settings
     * @param value Value to set for the dependencies property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDependencies(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingDependency> value) {
        this.dependencies = value;
    }
    /**
     * Sets the description property value. The setting's description
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The setting's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the documentationUrl property value. Url to setting documentation
     * @param value Value to set for the documentationUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDocumentationUrl(@jakarta.annotation.Nullable final String value) {
        this.documentationUrl = value;
    }
    /**
     * Sets the headerSubtitle property value. subtitle of the setting header for more details about the category/section
     * @param value Value to set for the headerSubtitle property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHeaderSubtitle(@jakarta.annotation.Nullable final String value) {
        this.headerSubtitle = value;
    }
    /**
     * Sets the headerTitle property value. title of the setting header represents a category/section of a setting/settings
     * @param value Value to set for the headerTitle property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHeaderTitle(@jakarta.annotation.Nullable final String value) {
        this.headerTitle = value;
    }
    /**
     * Sets the isTopLevel property value. If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting
     * @param value Value to set for the isTopLevel property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsTopLevel(@jakarta.annotation.Nullable final Boolean value) {
        this.isTopLevel = value;
    }
    /**
     * Sets the keywords property value. Keywords associated with the setting
     * @param value Value to set for the keywords property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setKeywords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.keywords = value;
    }
    /**
     * Sets the placeholderText property value. Placeholder text as an example of valid input
     * @param value Value to set for the placeholderText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPlaceholderText(@jakarta.annotation.Nullable final String value) {
        this.placeholderText = value;
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValueType(@jakarta.annotation.Nullable final DeviceManangementIntentValueType value) {
        this.valueType = value;
    }
}
