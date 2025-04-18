package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSettingDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSettingDefinition} and sets the default values.
     */
    public DeviceManagementConfigurationSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSettingDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a {@link EnumSet<DeviceManagementConfigurationSettingAccessTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationSettingAccessTypes> getAccessTypes() {
        return this.backingStore.get("accessTypes");
    }
    /**
     * Gets the applicability property value. Details which device setting is applicable on. Supports: $filters.
     * @return a {@link DeviceManagementConfigurationSettingApplicability}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingApplicability getApplicability() {
        return this.backingStore.get("applicability");
    }
    /**
     * Gets the baseUri property value. Base CSP Path
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBaseUri() {
        return this.backingStore.get("baseUri");
    }
    /**
     * Gets the categoryId property value. Specify category in which the setting is under. Support $filters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.backingStore.get("categoryId");
    }
    /**
     * Gets the description property value. Description of the setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the setting. For example: Allow Toast.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessTypes", (n) -> { this.setAccessTypes(n.getEnumSetValue(DeviceManagementConfigurationSettingAccessTypes::forValue)); });
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
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumSetValue(DeviceManagementConfigurationSettingRiskLevel::forValue)); });
        deserializerMap.put("rootDefinitionId", (n) -> { this.setRootDefinitionId(n.getStringValue()); });
        deserializerMap.put("settingUsage", (n) -> { this.setSettingUsage(n.getEnumSetValue(DeviceManagementConfigurationSettingUsage::forValue)); });
        deserializerMap.put("uxBehavior", (n) -> { this.setUxBehavior(n.getEnumValue(DeviceManagementConfigurationControlType::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumSetValue(DeviceManagementConfigurationSettingVisibility::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the helpText property value. Help text of the setting. Give more details of the setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpText() {
        return this.backingStore.get("helpText");
    }
    /**
     * Gets the infoUrls property value. List of links more info for the setting can be found at.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInfoUrls() {
        return this.backingStore.get("infoUrls");
    }
    /**
     * Gets the keywords property value. Tokens which to search settings on
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKeywords() {
        return this.backingStore.get("keywords");
    }
    /**
     * Gets the name property value. Name of the item
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the occurrence property value. Indicates whether the setting is required or not
     * @return a {@link DeviceManagementConfigurationSettingOccurrence}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingOccurrence getOccurrence() {
        return this.backingStore.get("occurrence");
    }
    /**
     * Gets the offsetUri property value. Offset CSP Path from Base
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOffsetUri() {
        return this.backingStore.get("offsetUri");
    }
    /**
     * Gets the referredSettingInformationList property value. List of referred setting information.
     * @return a {@link java.util.List<DeviceManagementConfigurationReferredSettingInformation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationReferredSettingInformation> getReferredSettingInformationList() {
        return this.backingStore.get("referredSettingInformationList");
    }
    /**
     * Gets the riskLevel property value. Setting RiskLevel
     * @return a {@link EnumSet<DeviceManagementConfigurationSettingRiskLevel>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationSettingRiskLevel> getRiskLevel() {
        return this.backingStore.get("riskLevel");
    }
    /**
     * Gets the rootDefinitionId property value. Root setting definition id if the setting is a child setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRootDefinitionId() {
        return this.backingStore.get("rootDefinitionId");
    }
    /**
     * Gets the settingUsage property value. Supported setting types
     * @return a {@link EnumSet<DeviceManagementConfigurationSettingUsage>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationSettingUsage> getSettingUsage() {
        return this.backingStore.get("settingUsage");
    }
    /**
     * Gets the uxBehavior property value. Setting control type representation in the UX
     * @return a {@link DeviceManagementConfigurationControlType}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationControlType getUxBehavior() {
        return this.backingStore.get("uxBehavior");
    }
    /**
     * Gets the version property value. Item Version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the visibility property value. Supported setting types
     * @return a {@link EnumSet<DeviceManagementConfigurationSettingVisibility>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationSettingVisibility> getVisibility() {
        return this.backingStore.get("visibility");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("accessTypes", this.getAccessTypes());
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
        writer.writeEnumSetValue("riskLevel", this.getRiskLevel());
        writer.writeStringValue("rootDefinitionId", this.getRootDefinitionId());
        writer.writeEnumSetValue("settingUsage", this.getSettingUsage());
        writer.writeEnumValue("uxBehavior", this.getUxBehavior());
        writer.writeStringValue("version", this.getVersion());
        writer.writeEnumSetValue("visibility", this.getVisibility());
    }
    /**
     * Sets the accessTypes property value. The accessTypes property
     * @param value Value to set for the accessTypes property.
     */
    public void setAccessTypes(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationSettingAccessTypes> value) {
        this.backingStore.set("accessTypes", value);
    }
    /**
     * Sets the applicability property value. Details which device setting is applicable on. Supports: $filters.
     * @param value Value to set for the applicability property.
     */
    public void setApplicability(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingApplicability value) {
        this.backingStore.set("applicability", value);
    }
    /**
     * Sets the baseUri property value. Base CSP Path
     * @param value Value to set for the baseUri property.
     */
    public void setBaseUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("baseUri", value);
    }
    /**
     * Sets the categoryId property value. Specify category in which the setting is under. Support $filters.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("categoryId", value);
    }
    /**
     * Sets the description property value. Description of the setting.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the setting. For example: Allow Toast.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the helpText property value. Help text of the setting. Give more details of the setting.
     * @param value Value to set for the helpText property.
     */
    public void setHelpText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("helpText", value);
    }
    /**
     * Sets the infoUrls property value. List of links more info for the setting can be found at.
     * @param value Value to set for the infoUrls property.
     */
    public void setInfoUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("infoUrls", value);
    }
    /**
     * Sets the keywords property value. Tokens which to search settings on
     * @param value Value to set for the keywords property.
     */
    public void setKeywords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("keywords", value);
    }
    /**
     * Sets the name property value. Name of the item
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the occurrence property value. Indicates whether the setting is required or not
     * @param value Value to set for the occurrence property.
     */
    public void setOccurrence(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingOccurrence value) {
        this.backingStore.set("occurrence", value);
    }
    /**
     * Sets the offsetUri property value. Offset CSP Path from Base
     * @param value Value to set for the offsetUri property.
     */
    public void setOffsetUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("offsetUri", value);
    }
    /**
     * Sets the referredSettingInformationList property value. List of referred setting information.
     * @param value Value to set for the referredSettingInformationList property.
     */
    public void setReferredSettingInformationList(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationReferredSettingInformation> value) {
        this.backingStore.set("referredSettingInformationList", value);
    }
    /**
     * Sets the riskLevel property value. Setting RiskLevel
     * @param value Value to set for the riskLevel property.
     */
    public void setRiskLevel(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationSettingRiskLevel> value) {
        this.backingStore.set("riskLevel", value);
    }
    /**
     * Sets the rootDefinitionId property value. Root setting definition id if the setting is a child setting.
     * @param value Value to set for the rootDefinitionId property.
     */
    public void setRootDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rootDefinitionId", value);
    }
    /**
     * Sets the settingUsage property value. Supported setting types
     * @param value Value to set for the settingUsage property.
     */
    public void setSettingUsage(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationSettingUsage> value) {
        this.backingStore.set("settingUsage", value);
    }
    /**
     * Sets the uxBehavior property value. Setting control type representation in the UX
     * @param value Value to set for the uxBehavior property.
     */
    public void setUxBehavior(@jakarta.annotation.Nullable final DeviceManagementConfigurationControlType value) {
        this.backingStore.set("uxBehavior", value);
    }
    /**
     * Sets the version property value. Item Version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
    /**
     * Sets the visibility property value. Supported setting types
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationSettingVisibility> value) {
        this.backingStore.set("visibility", value);
    }
}
