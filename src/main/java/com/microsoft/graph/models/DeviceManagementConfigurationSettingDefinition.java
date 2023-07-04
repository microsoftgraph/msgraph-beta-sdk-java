package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSettingDefinition extends Entity implements Parsable {
    /**
     * The accessTypes property
     */
    private DeviceManagementConfigurationSettingAccessTypes accessTypes;
    /**
     * Details which device setting is applicable on
     */
    private DeviceManagementConfigurationSettingApplicability applicability;
    /**
     * Base CSP Path
     */
    private String baseUri;
    /**
     * Specifies the area group under which the setting is configured in a specified configuration service provider (CSP)
     */
    private String categoryId;
    /**
     * Description of the item
     */
    private String description;
    /**
     * Display name of the item
     */
    private String displayName;
    /**
     * Help text of the item
     */
    private String helpText;
    /**
     * List of links more info for the setting can be found at
     */
    private java.util.List<String> infoUrls;
    /**
     * Tokens which to search settings on
     */
    private java.util.List<String> keywords;
    /**
     * Name of the item
     */
    private String name;
    /**
     * Indicates whether the setting is required or not
     */
    private DeviceManagementConfigurationSettingOccurrence occurrence;
    /**
     * Offset CSP Path from Base
     */
    private String offsetUri;
    /**
     * List of referred setting information.
     */
    private java.util.List<DeviceManagementConfigurationReferredSettingInformation> referredSettingInformationList;
    /**
     * Root setting definition if the setting is a child setting.
     */
    private String rootDefinitionId;
    /**
     * Supported setting types
     */
    private DeviceManagementConfigurationSettingUsage settingUsage;
    /**
     * Setting control type representation in the UX
     */
    private DeviceManagementConfigurationControlType uxBehavior;
    /**
     * Item Version
     */
    private String version;
    /**
     * Supported setting types
     */
    private DeviceManagementConfigurationSettingVisibility visibility;
    /**
     * Instantiates a new deviceManagementConfigurationSettingDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionDefinition": return new DeviceManagementConfigurationChoiceSettingCollectionDefinition();
                case "#microsoft.graph.deviceManagementConfigurationChoiceSettingDefinition": return new DeviceManagementConfigurationChoiceSettingDefinition();
                case "#microsoft.graph.deviceManagementConfigurationRedirectSettingDefinition": return new DeviceManagementConfigurationRedirectSettingDefinition();
                case "#microsoft.graph.deviceManagementConfigurationSettingGroupCollectionDefinition": return new DeviceManagementConfigurationSettingGroupCollectionDefinition();
                case "#microsoft.graph.deviceManagementConfigurationSettingGroupDefinition": return new DeviceManagementConfigurationSettingGroupDefinition();
                case "#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionDefinition": return new DeviceManagementConfigurationSimpleSettingCollectionDefinition();
                case "#microsoft.graph.deviceManagementConfigurationSimpleSettingDefinition": return new DeviceManagementConfigurationSimpleSettingDefinition();
            }
        }
        return new DeviceManagementConfigurationSettingDefinition();
    }
    /**
     * Gets the accessTypes property value. The accessTypes property
     * @return a DeviceManagementConfigurationSettingAccessTypes
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingAccessTypes getAccessTypes() {
        return this.accessTypes;
    }
    /**
     * Gets the applicability property value. Details which device setting is applicable on
     * @return a deviceManagementConfigurationSettingApplicability
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingApplicability getApplicability() {
        return this.applicability;
    }
    /**
     * Gets the baseUri property value. Base CSP Path
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBaseUri() {
        return this.baseUri;
    }
    /**
     * Gets the categoryId property value. Specifies the area group under which the setting is configured in a specified configuration service provider (CSP)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the description property value. Description of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessTypes", (n) -> { this.setAccessTypes(n.getEnumValue(DeviceManagementConfigurationSettingAccessTypes.class)); });
        deserializerMap.put("applicability", (n) -> { this.setApplicability(n.getObjectValue(DeviceManagementConfigurationSettingApplicability::createFromDiscriminatorValue)); });
        deserializerMap.put("baseUri", (n) -> { this.setBaseUri(n.getStringValue()); });
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpText", (n) -> { this.setHelpText(n.getStringValue()); });
        deserializerMap.put("infoUrls", (n) -> { this.setInfoUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("keywords", (n) -> { this.setKeywords(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("occurrence", (n) -> { this.setOccurrence(n.getObjectValue(DeviceManagementConfigurationSettingOccurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("offsetUri", (n) -> { this.setOffsetUri(n.getStringValue()); });
        deserializerMap.put("referredSettingInformationList", (n) -> { this.setReferredSettingInformationList(n.getCollectionOfObjectValues(DeviceManagementConfigurationReferredSettingInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("rootDefinitionId", (n) -> { this.setRootDefinitionId(n.getStringValue()); });
        deserializerMap.put("settingUsage", (n) -> { this.setSettingUsage(n.getEnumValue(DeviceManagementConfigurationSettingUsage.class)); });
        deserializerMap.put("uxBehavior", (n) -> { this.setUxBehavior(n.getEnumValue(DeviceManagementConfigurationControlType.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(DeviceManagementConfigurationSettingVisibility.class)); });
        return deserializerMap;
    }
    /**
     * Gets the helpText property value. Help text of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHelpText() {
        return this.helpText;
    }
    /**
     * Gets the infoUrls property value. List of links more info for the setting can be found at
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInfoUrls() {
        return this.infoUrls;
    }
    /**
     * Gets the keywords property value. Tokens which to search settings on
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }
    /**
     * Gets the name property value. Name of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the occurrence property value. Indicates whether the setting is required or not
     * @return a deviceManagementConfigurationSettingOccurrence
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingOccurrence getOccurrence() {
        return this.occurrence;
    }
    /**
     * Gets the offsetUri property value. Offset CSP Path from Base
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOffsetUri() {
        return this.offsetUri;
    }
    /**
     * Gets the referredSettingInformationList property value. List of referred setting information.
     * @return a deviceManagementConfigurationReferredSettingInformation
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationReferredSettingInformation> getReferredSettingInformationList() {
        return this.referredSettingInformationList;
    }
    /**
     * Gets the rootDefinitionId property value. Root setting definition if the setting is a child setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRootDefinitionId() {
        return this.rootDefinitionId;
    }
    /**
     * Gets the settingUsage property value. Supported setting types
     * @return a DeviceManagementConfigurationSettingUsage
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingUsage getSettingUsage() {
        return this.settingUsage;
    }
    /**
     * Gets the uxBehavior property value. Setting control type representation in the UX
     * @return a DeviceManagementConfigurationControlType
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationControlType getUxBehavior() {
        return this.uxBehavior;
    }
    /**
     * Gets the version property value. Item Version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Gets the visibility property value. Supported setting types
     * @return a DeviceManagementConfigurationSettingVisibility
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingVisibility getVisibility() {
        return this.visibility;
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
        writer.writeEnumValue("accessTypes", this.getAccessTypes());
        writer.writeObjectValue("applicability", this.getApplicability());
        writer.writeStringValue("baseUri", this.getBaseUri());
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("helpText", this.getHelpText());
        writer.writeCollectionOfPrimitiveValues("infoUrls", this.getInfoUrls());
        writer.writeCollectionOfPrimitiveValues("keywords", this.getKeywords());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("occurrence", this.getOccurrence());
        writer.writeStringValue("offsetUri", this.getOffsetUri());
        writer.writeCollectionOfObjectValues("referredSettingInformationList", this.getReferredSettingInformationList());
        writer.writeStringValue("rootDefinitionId", this.getRootDefinitionId());
        writer.writeEnumValue("settingUsage", this.getSettingUsage());
        writer.writeEnumValue("uxBehavior", this.getUxBehavior());
        writer.writeStringValue("version", this.getVersion());
        writer.writeEnumValue("visibility", this.getVisibility());
    }
    /**
     * Sets the accessTypes property value. The accessTypes property
     * @param value Value to set for the accessTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessTypes(@javax.annotation.Nullable final DeviceManagementConfigurationSettingAccessTypes value) {
        this.accessTypes = value;
    }
    /**
     * Sets the applicability property value. Details which device setting is applicable on
     * @param value Value to set for the applicability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicability(@javax.annotation.Nullable final DeviceManagementConfigurationSettingApplicability value) {
        this.applicability = value;
    }
    /**
     * Sets the baseUri property value. Base CSP Path
     * @param value Value to set for the baseUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBaseUri(@javax.annotation.Nullable final String value) {
        this.baseUri = value;
    }
    /**
     * Sets the categoryId property value. Specifies the area group under which the setting is configured in a specified configuration service provider (CSP)
     * @param value Value to set for the categoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryId(@javax.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the description property value. Description of the item
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of the item
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the helpText property value. Help text of the item
     * @param value Value to set for the helpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHelpText(@javax.annotation.Nullable final String value) {
        this.helpText = value;
    }
    /**
     * Sets the infoUrls property value. List of links more info for the setting can be found at
     * @param value Value to set for the infoUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfoUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this.infoUrls = value;
    }
    /**
     * Sets the keywords property value. Tokens which to search settings on
     * @param value Value to set for the keywords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeywords(@javax.annotation.Nullable final java.util.List<String> value) {
        this.keywords = value;
    }
    /**
     * Sets the name property value. Name of the item
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the occurrence property value. Indicates whether the setting is required or not
     * @param value Value to set for the occurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOccurrence(@javax.annotation.Nullable final DeviceManagementConfigurationSettingOccurrence value) {
        this.occurrence = value;
    }
    /**
     * Sets the offsetUri property value. Offset CSP Path from Base
     * @param value Value to set for the offsetUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffsetUri(@javax.annotation.Nullable final String value) {
        this.offsetUri = value;
    }
    /**
     * Sets the referredSettingInformationList property value. List of referred setting information.
     * @param value Value to set for the referredSettingInformationList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferredSettingInformationList(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationReferredSettingInformation> value) {
        this.referredSettingInformationList = value;
    }
    /**
     * Sets the rootDefinitionId property value. Root setting definition if the setting is a child setting.
     * @param value Value to set for the rootDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootDefinitionId(@javax.annotation.Nullable final String value) {
        this.rootDefinitionId = value;
    }
    /**
     * Sets the settingUsage property value. Supported setting types
     * @param value Value to set for the settingUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingUsage(@javax.annotation.Nullable final DeviceManagementConfigurationSettingUsage value) {
        this.settingUsage = value;
    }
    /**
     * Sets the uxBehavior property value. Setting control type representation in the UX
     * @param value Value to set for the uxBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUxBehavior(@javax.annotation.Nullable final DeviceManagementConfigurationControlType value) {
        this.uxBehavior = value;
    }
    /**
     * Sets the version property value. Item Version
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
    /**
     * Sets the visibility property value. Supported setting types
     * @param value Value to set for the visibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibility(@javax.annotation.Nullable final DeviceManagementConfigurationSettingVisibility value) {
        this.visibility = value;
    }
}
