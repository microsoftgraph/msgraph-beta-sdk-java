package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementConfigurationChoiceSettingCollectionDefinition;
import com.microsoft.graph.models.DeviceManagementConfigurationChoiceSettingDefinition;
import com.microsoft.graph.models.DeviceManagementConfigurationRedirectSettingDefinition;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingGroupCollectionDefinition;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingGroupDefinition;
import com.microsoft.graph.models.DeviceManagementConfigurationSimpleSettingCollectionDefinition;
import com.microsoft.graph.models.DeviceManagementConfigurationSimpleSettingDefinition;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class DeviceManagementConfigurationSettingDefinition extends Entity implements Parsable {
    /** The accessTypes property */
    private DeviceManagementConfigurationSettingAccessTypes _accessTypes;
    /** Details which device setting is applicable on */
    private DeviceManagementConfigurationSettingApplicability _applicability;
    /** Base CSP Path */
    private String _baseUri;
    /** Specifies the area group under which the setting is configured in a specified configuration service provider (CSP) */
    private String _categoryId;
    /** Description of the item */
    private String _description;
    /** Display name of the item */
    private String _displayName;
    /** Help text of the item */
    private String _helpText;
    /** List of links more info for the setting can be found at */
    private java.util.List<String> _infoUrls;
    /** Tokens which to search settings on */
    private java.util.List<String> _keywords;
    /** Name of the item */
    private String _name;
    /** Indicates whether the setting is required or not */
    private DeviceManagementConfigurationSettingOccurrence _occurrence;
    /** Offset CSP Path from Base */
    private String _offsetUri;
    /** List of referred setting information. */
    private java.util.List<DeviceManagementConfigurationReferredSettingInformation> _referredSettingInformationList;
    /** Root setting definition if the setting is a child setting. */
    private String _rootDefinitionId;
    /** Supported setting types */
    private DeviceManagementConfigurationSettingUsage _settingUsage;
    /** Setting control type representation in the UX */
    private DeviceManagementConfigurationControlType _uxBehavior;
    /** Item Version */
    private String _version;
    /** Supported setting types */
    private DeviceManagementConfigurationSettingVisibility _visibility;
    /**
     * Instantiates a new deviceManagementConfigurationSettingDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSettingDefinition");
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
     * @return a deviceManagementConfigurationSettingAccessTypes
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingAccessTypes getAccessTypes() {
        return this._accessTypes;
    }
    /**
     * Gets the applicability property value. Details which device setting is applicable on
     * @return a deviceManagementConfigurationSettingApplicability
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingApplicability getApplicability() {
        return this._applicability;
    }
    /**
     * Gets the baseUri property value. Base CSP Path
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBaseUri() {
        return this._baseUri;
    }
    /**
     * Gets the categoryId property value. Specifies the area group under which the setting is configured in a specified configuration service provider (CSP)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategoryId() {
        return this._categoryId;
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
        final DeviceManagementConfigurationSettingDefinition currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessTypes", (n) -> { currentObject.setAccessTypes(n.getEnumValue(DeviceManagementConfigurationSettingAccessTypes.class)); });
            this.put("applicability", (n) -> { currentObject.setApplicability(n.getObjectValue(DeviceManagementConfigurationSettingApplicability::createFromDiscriminatorValue)); });
            this.put("baseUri", (n) -> { currentObject.setBaseUri(n.getStringValue()); });
            this.put("categoryId", (n) -> { currentObject.setCategoryId(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("helpText", (n) -> { currentObject.setHelpText(n.getStringValue()); });
            this.put("infoUrls", (n) -> { currentObject.setInfoUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("keywords", (n) -> { currentObject.setKeywords(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("occurrence", (n) -> { currentObject.setOccurrence(n.getObjectValue(DeviceManagementConfigurationSettingOccurrence::createFromDiscriminatorValue)); });
            this.put("offsetUri", (n) -> { currentObject.setOffsetUri(n.getStringValue()); });
            this.put("referredSettingInformationList", (n) -> { currentObject.setReferredSettingInformationList(n.getCollectionOfObjectValues(DeviceManagementConfigurationReferredSettingInformation::createFromDiscriminatorValue)); });
            this.put("rootDefinitionId", (n) -> { currentObject.setRootDefinitionId(n.getStringValue()); });
            this.put("settingUsage", (n) -> { currentObject.setSettingUsage(n.getEnumValue(DeviceManagementConfigurationSettingUsage.class)); });
            this.put("uxBehavior", (n) -> { currentObject.setUxBehavior(n.getEnumValue(DeviceManagementConfigurationControlType.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
            this.put("visibility", (n) -> { currentObject.setVisibility(n.getEnumValue(DeviceManagementConfigurationSettingVisibility.class)); });
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
     * Gets the infoUrls property value. List of links more info for the setting can be found at
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInfoUrls() {
        return this._infoUrls;
    }
    /**
     * Gets the keywords property value. Tokens which to search settings on
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKeywords() {
        return this._keywords;
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
     * Gets the occurrence property value. Indicates whether the setting is required or not
     * @return a deviceManagementConfigurationSettingOccurrence
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingOccurrence getOccurrence() {
        return this._occurrence;
    }
    /**
     * Gets the offsetUri property value. Offset CSP Path from Base
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOffsetUri() {
        return this._offsetUri;
    }
    /**
     * Gets the referredSettingInformationList property value. List of referred setting information.
     * @return a deviceManagementConfigurationReferredSettingInformation
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationReferredSettingInformation> getReferredSettingInformationList() {
        return this._referredSettingInformationList;
    }
    /**
     * Gets the rootDefinitionId property value. Root setting definition if the setting is a child setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRootDefinitionId() {
        return this._rootDefinitionId;
    }
    /**
     * Gets the settingUsage property value. Supported setting types
     * @return a deviceManagementConfigurationSettingUsage
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingUsage getSettingUsage() {
        return this._settingUsage;
    }
    /**
     * Gets the uxBehavior property value. Setting control type representation in the UX
     * @return a deviceManagementConfigurationControlType
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationControlType getUxBehavior() {
        return this._uxBehavior;
    }
    /**
     * Gets the version property value. Item Version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Gets the visibility property value. Supported setting types
     * @return a deviceManagementConfigurationSettingVisibility
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingVisibility getVisibility() {
        return this._visibility;
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
        this._accessTypes = value;
    }
    /**
     * Sets the applicability property value. Details which device setting is applicable on
     * @param value Value to set for the applicability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicability(@javax.annotation.Nullable final DeviceManagementConfigurationSettingApplicability value) {
        this._applicability = value;
    }
    /**
     * Sets the baseUri property value. Base CSP Path
     * @param value Value to set for the baseUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBaseUri(@javax.annotation.Nullable final String value) {
        this._baseUri = value;
    }
    /**
     * Sets the categoryId property value. Specifies the area group under which the setting is configured in a specified configuration service provider (CSP)
     * @param value Value to set for the categoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryId(@javax.annotation.Nullable final String value) {
        this._categoryId = value;
    }
    /**
     * Sets the description property value. Description of the item
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name of the item
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the helpText property value. Help text of the item
     * @param value Value to set for the helpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHelpText(@javax.annotation.Nullable final String value) {
        this._helpText = value;
    }
    /**
     * Sets the infoUrls property value. List of links more info for the setting can be found at
     * @param value Value to set for the infoUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfoUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._infoUrls = value;
    }
    /**
     * Sets the keywords property value. Tokens which to search settings on
     * @param value Value to set for the keywords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeywords(@javax.annotation.Nullable final java.util.List<String> value) {
        this._keywords = value;
    }
    /**
     * Sets the name property value. Name of the item
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the occurrence property value. Indicates whether the setting is required or not
     * @param value Value to set for the occurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOccurrence(@javax.annotation.Nullable final DeviceManagementConfigurationSettingOccurrence value) {
        this._occurrence = value;
    }
    /**
     * Sets the offsetUri property value. Offset CSP Path from Base
     * @param value Value to set for the offsetUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffsetUri(@javax.annotation.Nullable final String value) {
        this._offsetUri = value;
    }
    /**
     * Sets the referredSettingInformationList property value. List of referred setting information.
     * @param value Value to set for the referredSettingInformationList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferredSettingInformationList(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationReferredSettingInformation> value) {
        this._referredSettingInformationList = value;
    }
    /**
     * Sets the rootDefinitionId property value. Root setting definition if the setting is a child setting.
     * @param value Value to set for the rootDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootDefinitionId(@javax.annotation.Nullable final String value) {
        this._rootDefinitionId = value;
    }
    /**
     * Sets the settingUsage property value. Supported setting types
     * @param value Value to set for the settingUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingUsage(@javax.annotation.Nullable final DeviceManagementConfigurationSettingUsage value) {
        this._settingUsage = value;
    }
    /**
     * Sets the uxBehavior property value. Setting control type representation in the UX
     * @param value Value to set for the uxBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUxBehavior(@javax.annotation.Nullable final DeviceManagementConfigurationControlType value) {
        this._uxBehavior = value;
    }
    /**
     * Sets the version property value. Item Version
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
    /**
     * Sets the visibility property value. Supported setting types
     * @param value Value to set for the visibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibility(@javax.annotation.Nullable final DeviceManagementConfigurationSettingVisibility value) {
        this._visibility = value;
    }
}
