package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationCategory extends Entity implements Parsable {
    /** Description of the category header */
    private String _categoryDescription;
    /** List of child ids of the category. */
    private java.util.List<String> _childCategoryIds;
    /** Description of the item */
    private String _description;
    /** Display name of the item */
    private String _displayName;
    /** Help text of the item */
    private String _helpText;
    /** Name of the item */
    private String _name;
    /** Parent id of the category. */
    private String _parentCategoryId;
    /** Platforms types, which settings in the category have. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue. */
    private DeviceManagementConfigurationPlatforms _platforms;
    /** Root id of the category. */
    private String _rootCategoryId;
    /** Indicates that the category contains settings that are used for Compliance or Configuration. Possible values are: none, configuration, compliance. */
    private DeviceManagementConfigurationSettingUsage _settingUsage;
    /** Technologies types, which settings in the category have. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue. */
    private DeviceManagementConfigurationTechnologies _technologies;
    /**
     * Instantiates a new deviceManagementConfigurationCategory and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationCategory
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationCategory();
    }
    /**
     * Gets the categoryDescription property value. Description of the category header
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategoryDescription() {
        return this._categoryDescription;
    }
    /**
     * Gets the childCategoryIds property value. List of child ids of the category.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getChildCategoryIds() {
        return this._childCategoryIds;
    }
    /**
     * Gets the description property value. Description of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationCategory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("categoryDescription", (n) -> { currentObject.setCategoryDescription(n.getStringValue()); });
            this.put("childCategoryIds", (n) -> { currentObject.setChildCategoryIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("helpText", (n) -> { currentObject.setHelpText(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("parentCategoryId", (n) -> { currentObject.setParentCategoryId(n.getStringValue()); });
            this.put("platforms", (n) -> { currentObject.setPlatforms(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
            this.put("rootCategoryId", (n) -> { currentObject.setRootCategoryId(n.getStringValue()); });
            this.put("settingUsage", (n) -> { currentObject.setSettingUsage(n.getEnumValue(DeviceManagementConfigurationSettingUsage.class)); });
            this.put("technologies", (n) -> { currentObject.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
        }};
    }
    /**
     * Gets the helpText property value. Help text of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHelpText() {
        return this._helpText;
    }
    /**
     * Gets the name property value. Name of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the parentCategoryId property value. Parent id of the category.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentCategoryId() {
        return this._parentCategoryId;
    }
    /**
     * Gets the platforms property value. Platforms types, which settings in the category have. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatforms() {
        return this._platforms;
    }
    /**
     * Gets the rootCategoryId property value. Root id of the category.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRootCategoryId() {
        return this._rootCategoryId;
    }
    /**
     * Gets the settingUsage property value. Indicates that the category contains settings that are used for Compliance or Configuration. Possible values are: none, configuration, compliance.
     * @return a deviceManagementConfigurationSettingUsage
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingUsage getSettingUsage() {
        return this._settingUsage;
    }
    /**
     * Gets the technologies property value. Technologies types, which settings in the category have. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this._technologies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("categoryDescription", this.getCategoryDescription());
        writer.writeCollectionOfPrimitiveValues("childCategoryIds", this.getChildCategoryIds());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("helpText", this.getHelpText());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("parentCategoryId", this.getParentCategoryId());
        writer.writeEnumValue("platforms", this.getPlatforms());
        writer.writeStringValue("rootCategoryId", this.getRootCategoryId());
        writer.writeEnumValue("settingUsage", this.getSettingUsage());
        writer.writeEnumValue("technologies", this.getTechnologies());
    }
    /**
     * Sets the categoryDescription property value. Description of the category header
     * @param value Value to set for the categoryDescription property.
     * @return a void
     */
    public void setCategoryDescription(@javax.annotation.Nullable final String value) {
        this._categoryDescription = value;
    }
    /**
     * Sets the childCategoryIds property value. List of child ids of the category.
     * @param value Value to set for the childCategoryIds property.
     * @return a void
     */
    public void setChildCategoryIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._childCategoryIds = value;
    }
    /**
     * Sets the description property value. Description of the item
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name of the item
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the helpText property value. Help text of the item
     * @param value Value to set for the helpText property.
     * @return a void
     */
    public void setHelpText(@javax.annotation.Nullable final String value) {
        this._helpText = value;
    }
    /**
     * Sets the name property value. Name of the item
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parentCategoryId property value. Parent id of the category.
     * @param value Value to set for the parentCategoryId property.
     * @return a void
     */
    public void setParentCategoryId(@javax.annotation.Nullable final String value) {
        this._parentCategoryId = value;
    }
    /**
     * Sets the platforms property value. Platforms types, which settings in the category have. Possible values are: none, android, iOS, macOS, windows10X, windows10, linux, unknownFutureValue.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    public void setPlatforms(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this._platforms = value;
    }
    /**
     * Sets the rootCategoryId property value. Root id of the category.
     * @param value Value to set for the rootCategoryId property.
     * @return a void
     */
    public void setRootCategoryId(@javax.annotation.Nullable final String value) {
        this._rootCategoryId = value;
    }
    /**
     * Sets the settingUsage property value. Indicates that the category contains settings that are used for Compliance or Configuration. Possible values are: none, configuration, compliance.
     * @param value Value to set for the settingUsage property.
     * @return a void
     */
    public void setSettingUsage(@javax.annotation.Nullable final DeviceManagementConfigurationSettingUsage value) {
        this._settingUsage = value;
    }
    /**
     * Sets the technologies property value. Technologies types, which settings in the category have. Possible values are: none, mdm, windows10XManagement, configManager, appleRemoteManagement, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     * @param value Value to set for the technologies property.
     * @return a void
     */
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this._technologies = value;
    }
}
