package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity representing the defintion for a given setting */
public class DeviceManagementSettingDefinition extends Entity implements Parsable {
    /** Collection of constraints for the setting value */
    private java.util.List<DeviceManagementConstraint> _constraints;
    /** Collection of dependencies on other settings */
    private java.util.List<DeviceManagementSettingDependency> _dependencies;
    /** The setting's description */
    private String _description;
    /** The setting's display name */
    private String _displayName;
    /** Url to setting documentation */
    private String _documentationUrl;
    /** subtitle of the setting header for more details about the category/section */
    private String _headerSubtitle;
    /** title of the setting header represents a category/section of a setting/settings */
    private String _headerTitle;
    /** If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting */
    private Boolean _isTopLevel;
    /** Keywords associated with the setting */
    private java.util.List<String> _keywords;
    /** Placeholder text as an example of valid input */
    private String _placeholderText;
    /** The valueType property */
    private DeviceManangementIntentValueType _valueType;
    /**
     * Instantiates a new deviceManagementSettingDefinition and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingDefinition() {
        super();
        this.setType("#microsoft.graph.deviceManagementSettingDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConstraint> getConstraints() {
        return this._constraints;
    }
    /**
     * Gets the dependencies property value. Collection of dependencies on other settings
     * @return a deviceManagementSettingDependency
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingDependency> getDependencies() {
        return this._dependencies;
    }
    /**
     * Gets the description property value. The setting's description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The setting's display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the documentationUrl property value. Url to setting documentation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentationUrl() {
        return this._documentationUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("constraints", (n) -> { currentObject.setConstraints(n.getCollectionOfObjectValues(DeviceManagementConstraint::createFromDiscriminatorValue)); });
            this.put("dependencies", (n) -> { currentObject.setDependencies(n.getCollectionOfObjectValues(DeviceManagementSettingDependency::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("documentationUrl", (n) -> { currentObject.setDocumentationUrl(n.getStringValue()); });
            this.put("headerSubtitle", (n) -> { currentObject.setHeaderSubtitle(n.getStringValue()); });
            this.put("headerTitle", (n) -> { currentObject.setHeaderTitle(n.getStringValue()); });
            this.put("isTopLevel", (n) -> { currentObject.setIsTopLevel(n.getBooleanValue()); });
            this.put("keywords", (n) -> { currentObject.setKeywords(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("placeholderText", (n) -> { currentObject.setPlaceholderText(n.getStringValue()); });
            this.put("valueType", (n) -> { currentObject.setValueType(n.getEnumValue(DeviceManangementIntentValueType.class)); });
        }};
    }
    /**
     * Gets the headerSubtitle property value. subtitle of the setting header for more details about the category/section
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHeaderSubtitle() {
        return this._headerSubtitle;
    }
    /**
     * Gets the headerTitle property value. title of the setting header represents a category/section of a setting/settings
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHeaderTitle() {
        return this._headerTitle;
    }
    /**
     * Gets the isTopLevel property value. If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTopLevel() {
        return this._isTopLevel;
    }
    /**
     * Gets the keywords property value. Keywords associated with the setting
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKeywords() {
        return this._keywords;
    }
    /**
     * Gets the placeholderText property value. Placeholder text as an example of valid input
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlaceholderText() {
        return this._placeholderText;
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a deviceManangementIntentValueType
     */
    @javax.annotation.Nullable
    public DeviceManangementIntentValueType getValueType() {
        return this._valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setConstraints(@javax.annotation.Nullable final java.util.List<DeviceManagementConstraint> value) {
        this._constraints = value;
    }
    /**
     * Sets the dependencies property value. Collection of dependencies on other settings
     * @param value Value to set for the dependencies property.
     * @return a void
     */
    public void setDependencies(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingDependency> value) {
        this._dependencies = value;
    }
    /**
     * Sets the description property value. The setting's description
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The setting's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the documentationUrl property value. Url to setting documentation
     * @param value Value to set for the documentationUrl property.
     * @return a void
     */
    public void setDocumentationUrl(@javax.annotation.Nullable final String value) {
        this._documentationUrl = value;
    }
    /**
     * Sets the headerSubtitle property value. subtitle of the setting header for more details about the category/section
     * @param value Value to set for the headerSubtitle property.
     * @return a void
     */
    public void setHeaderSubtitle(@javax.annotation.Nullable final String value) {
        this._headerSubtitle = value;
    }
    /**
     * Sets the headerTitle property value. title of the setting header represents a category/section of a setting/settings
     * @param value Value to set for the headerTitle property.
     * @return a void
     */
    public void setHeaderTitle(@javax.annotation.Nullable final String value) {
        this._headerTitle = value;
    }
    /**
     * Sets the isTopLevel property value. If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting
     * @param value Value to set for the isTopLevel property.
     * @return a void
     */
    public void setIsTopLevel(@javax.annotation.Nullable final Boolean value) {
        this._isTopLevel = value;
    }
    /**
     * Sets the keywords property value. Keywords associated with the setting
     * @param value Value to set for the keywords property.
     * @return a void
     */
    public void setKeywords(@javax.annotation.Nullable final java.util.List<String> value) {
        this._keywords = value;
    }
    /**
     * Sets the placeholderText property value. Placeholder text as an example of valid input
     * @param value Value to set for the placeholderText property.
     * @return a void
     */
    public void setPlaceholderText(@javax.annotation.Nullable final String value) {
        this._placeholderText = value;
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     * @return a void
     */
    public void setValueType(@javax.annotation.Nullable final DeviceManangementIntentValueType value) {
        this._valueType = value;
    }
}
