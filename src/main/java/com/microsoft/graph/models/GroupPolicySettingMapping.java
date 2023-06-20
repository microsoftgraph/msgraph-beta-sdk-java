package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Group Policy setting to MDM/Intune mapping.
 */
public class GroupPolicySettingMapping extends Entity implements Parsable {
    /** Admx Group Policy Id */
    private String admxSettingDefinitionId;
    /** List of Child Ids of the group policy setting. */
    private java.util.List<String> childIdList;
    /** The Intune Setting Definition Id */
    private String intuneSettingDefinitionId;
    /** The list of Intune Setting URIs this group policy setting maps to */
    private java.util.List<String> intuneSettingUriList;
    /** Indicates if the setting is supported by Intune or not */
    private Boolean isMdmSupported;
    /** The CSP name this group policy setting maps to. */
    private String mdmCspName;
    /** The minimum OS version this mdm setting supports. */
    private Integer mdmMinimumOSVersion;
    /** The MDM CSP URI this group policy setting maps to. */
    private String mdmSettingUri;
    /** Mdm Support Status of the setting. */
    private MdmSupportedState mdmSupportedState;
    /** Parent Id of the group policy setting. */
    private String parentId;
    /** The category the group policy setting is in. */
    private String settingCategory;
    /** The display name of this group policy setting. */
    private String settingDisplayName;
    /** The display value of this group policy setting. */
    private String settingDisplayValue;
    /** The display value type of this group policy setting. */
    private String settingDisplayValueType;
    /** The name of this group policy setting. */
    private String settingName;
    /** Scope of the group policy setting. */
    private GroupPolicySettingScope settingScope;
    /** Setting type of the group policy. */
    private GroupPolicySettingType settingType;
    /** The value of this group policy setting. */
    private String settingValue;
    /** The display units of this group policy setting value */
    private String settingValueDisplayUnits;
    /** The value type of this group policy setting. */
    private String settingValueType;
    /**
     * Instantiates a new groupPolicySettingMapping and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicySettingMapping() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicySettingMapping
     */
    @javax.annotation.Nonnull
    public static GroupPolicySettingMapping createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicySettingMapping();
    }
    /**
     * Gets the admxSettingDefinitionId property value. Admx Group Policy Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdmxSettingDefinitionId() {
        return this.admxSettingDefinitionId;
    }
    /**
     * Gets the childIdList property value. List of Child Ids of the group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getChildIdList() {
        return this.childIdList;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("admxSettingDefinitionId", (n) -> { this.setAdmxSettingDefinitionId(n.getStringValue()); });
        deserializerMap.put("childIdList", (n) -> { this.setChildIdList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("intuneSettingDefinitionId", (n) -> { this.setIntuneSettingDefinitionId(n.getStringValue()); });
        deserializerMap.put("intuneSettingUriList", (n) -> { this.setIntuneSettingUriList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isMdmSupported", (n) -> { this.setIsMdmSupported(n.getBooleanValue()); });
        deserializerMap.put("mdmCspName", (n) -> { this.setMdmCspName(n.getStringValue()); });
        deserializerMap.put("mdmMinimumOSVersion", (n) -> { this.setMdmMinimumOSVersion(n.getIntegerValue()); });
        deserializerMap.put("mdmSettingUri", (n) -> { this.setMdmSettingUri(n.getStringValue()); });
        deserializerMap.put("mdmSupportedState", (n) -> { this.setMdmSupportedState(n.getEnumValue(MdmSupportedState.class)); });
        deserializerMap.put("parentId", (n) -> { this.setParentId(n.getStringValue()); });
        deserializerMap.put("settingCategory", (n) -> { this.setSettingCategory(n.getStringValue()); });
        deserializerMap.put("settingDisplayName", (n) -> { this.setSettingDisplayName(n.getStringValue()); });
        deserializerMap.put("settingDisplayValue", (n) -> { this.setSettingDisplayValue(n.getStringValue()); });
        deserializerMap.put("settingDisplayValueType", (n) -> { this.setSettingDisplayValueType(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("settingScope", (n) -> { this.setSettingScope(n.getEnumValue(GroupPolicySettingScope.class)); });
        deserializerMap.put("settingType", (n) -> { this.setSettingType(n.getEnumValue(GroupPolicySettingType.class)); });
        deserializerMap.put("settingValue", (n) -> { this.setSettingValue(n.getStringValue()); });
        deserializerMap.put("settingValueDisplayUnits", (n) -> { this.setSettingValueDisplayUnits(n.getStringValue()); });
        deserializerMap.put("settingValueType", (n) -> { this.setSettingValueType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intuneSettingDefinitionId property value. The Intune Setting Definition Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntuneSettingDefinitionId() {
        return this.intuneSettingDefinitionId;
    }
    /**
     * Gets the intuneSettingUriList property value. The list of Intune Setting URIs this group policy setting maps to
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIntuneSettingUriList() {
        return this.intuneSettingUriList;
    }
    /**
     * Gets the isMdmSupported property value. Indicates if the setting is supported by Intune or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMdmSupported() {
        return this.isMdmSupported;
    }
    /**
     * Gets the mdmCspName property value. The CSP name this group policy setting maps to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmCspName() {
        return this.mdmCspName;
    }
    /**
     * Gets the mdmMinimumOSVersion property value. The minimum OS version this mdm setting supports.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMdmMinimumOSVersion() {
        return this.mdmMinimumOSVersion;
    }
    /**
     * Gets the mdmSettingUri property value. The MDM CSP URI this group policy setting maps to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmSettingUri() {
        return this.mdmSettingUri;
    }
    /**
     * Gets the mdmSupportedState property value. Mdm Support Status of the setting.
     * @return a MdmSupportedState
     */
    @javax.annotation.Nullable
    public MdmSupportedState getMdmSupportedState() {
        return this.mdmSupportedState;
    }
    /**
     * Gets the parentId property value. Parent Id of the group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentId() {
        return this.parentId;
    }
    /**
     * Gets the settingCategory property value. The category the group policy setting is in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingCategory() {
        return this.settingCategory;
    }
    /**
     * Gets the settingDisplayName property value. The display name of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDisplayName() {
        return this.settingDisplayName;
    }
    /**
     * Gets the settingDisplayValue property value. The display value of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDisplayValue() {
        return this.settingDisplayValue;
    }
    /**
     * Gets the settingDisplayValueType property value. The display value type of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDisplayValueType() {
        return this.settingDisplayValueType;
    }
    /**
     * Gets the settingName property value. The name of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Gets the settingScope property value. Scope of the group policy setting.
     * @return a GroupPolicySettingScope
     */
    @javax.annotation.Nullable
    public GroupPolicySettingScope getSettingScope() {
        return this.settingScope;
    }
    /**
     * Gets the settingType property value. Setting type of the group policy.
     * @return a GroupPolicySettingType
     */
    @javax.annotation.Nullable
    public GroupPolicySettingType getSettingType() {
        return this.settingType;
    }
    /**
     * Gets the settingValue property value. The value of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValue() {
        return this.settingValue;
    }
    /**
     * Gets the settingValueDisplayUnits property value. The display units of this group policy setting value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValueDisplayUnits() {
        return this.settingValueDisplayUnits;
    }
    /**
     * Gets the settingValueType property value. The value type of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValueType() {
        return this.settingValueType;
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
        writer.writeStringValue("admxSettingDefinitionId", this.getAdmxSettingDefinitionId());
        writer.writeCollectionOfPrimitiveValues("childIdList", this.getChildIdList());
        writer.writeStringValue("intuneSettingDefinitionId", this.getIntuneSettingDefinitionId());
        writer.writeCollectionOfPrimitiveValues("intuneSettingUriList", this.getIntuneSettingUriList());
        writer.writeBooleanValue("isMdmSupported", this.getIsMdmSupported());
        writer.writeStringValue("mdmCspName", this.getMdmCspName());
        writer.writeIntegerValue("mdmMinimumOSVersion", this.getMdmMinimumOSVersion());
        writer.writeStringValue("mdmSettingUri", this.getMdmSettingUri());
        writer.writeEnumValue("mdmSupportedState", this.getMdmSupportedState());
        writer.writeStringValue("parentId", this.getParentId());
        writer.writeStringValue("settingCategory", this.getSettingCategory());
        writer.writeStringValue("settingDisplayName", this.getSettingDisplayName());
        writer.writeStringValue("settingDisplayValue", this.getSettingDisplayValue());
        writer.writeStringValue("settingDisplayValueType", this.getSettingDisplayValueType());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeEnumValue("settingScope", this.getSettingScope());
        writer.writeEnumValue("settingType", this.getSettingType());
        writer.writeStringValue("settingValue", this.getSettingValue());
        writer.writeStringValue("settingValueDisplayUnits", this.getSettingValueDisplayUnits());
        writer.writeStringValue("settingValueType", this.getSettingValueType());
    }
    /**
     * Sets the admxSettingDefinitionId property value. Admx Group Policy Id
     * @param value Value to set for the admxSettingDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdmxSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this.admxSettingDefinitionId = value;
    }
    /**
     * Sets the childIdList property value. List of Child Ids of the group policy setting.
     * @param value Value to set for the childIdList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildIdList(@javax.annotation.Nullable final java.util.List<String> value) {
        this.childIdList = value;
    }
    /**
     * Sets the intuneSettingDefinitionId property value. The Intune Setting Definition Id
     * @param value Value to set for the intuneSettingDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this.intuneSettingDefinitionId = value;
    }
    /**
     * Sets the intuneSettingUriList property value. The list of Intune Setting URIs this group policy setting maps to
     * @param value Value to set for the intuneSettingUriList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneSettingUriList(@javax.annotation.Nullable final java.util.List<String> value) {
        this.intuneSettingUriList = value;
    }
    /**
     * Sets the isMdmSupported property value. Indicates if the setting is supported by Intune or not
     * @param value Value to set for the isMdmSupported property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMdmSupported(@javax.annotation.Nullable final Boolean value) {
        this.isMdmSupported = value;
    }
    /**
     * Sets the mdmCspName property value. The CSP name this group policy setting maps to.
     * @param value Value to set for the mdmCspName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmCspName(@javax.annotation.Nullable final String value) {
        this.mdmCspName = value;
    }
    /**
     * Sets the mdmMinimumOSVersion property value. The minimum OS version this mdm setting supports.
     * @param value Value to set for the mdmMinimumOSVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmMinimumOSVersion(@javax.annotation.Nullable final Integer value) {
        this.mdmMinimumOSVersion = value;
    }
    /**
     * Sets the mdmSettingUri property value. The MDM CSP URI this group policy setting maps to.
     * @param value Value to set for the mdmSettingUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmSettingUri(@javax.annotation.Nullable final String value) {
        this.mdmSettingUri = value;
    }
    /**
     * Sets the mdmSupportedState property value. Mdm Support Status of the setting.
     * @param value Value to set for the mdmSupportedState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmSupportedState(@javax.annotation.Nullable final MdmSupportedState value) {
        this.mdmSupportedState = value;
    }
    /**
     * Sets the parentId property value. Parent Id of the group policy setting.
     * @param value Value to set for the parentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentId(@javax.annotation.Nullable final String value) {
        this.parentId = value;
    }
    /**
     * Sets the settingCategory property value. The category the group policy setting is in.
     * @param value Value to set for the settingCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingCategory(@javax.annotation.Nullable final String value) {
        this.settingCategory = value;
    }
    /**
     * Sets the settingDisplayName property value. The display name of this group policy setting.
     * @param value Value to set for the settingDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDisplayName(@javax.annotation.Nullable final String value) {
        this.settingDisplayName = value;
    }
    /**
     * Sets the settingDisplayValue property value. The display value of this group policy setting.
     * @param value Value to set for the settingDisplayValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDisplayValue(@javax.annotation.Nullable final String value) {
        this.settingDisplayValue = value;
    }
    /**
     * Sets the settingDisplayValueType property value. The display value type of this group policy setting.
     * @param value Value to set for the settingDisplayValueType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingDisplayValueType(@javax.annotation.Nullable final String value) {
        this.settingDisplayValueType = value;
    }
    /**
     * Sets the settingName property value. The name of this group policy setting.
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this.settingName = value;
    }
    /**
     * Sets the settingScope property value. Scope of the group policy setting.
     * @param value Value to set for the settingScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingScope(@javax.annotation.Nullable final GroupPolicySettingScope value) {
        this.settingScope = value;
    }
    /**
     * Sets the settingType property value. Setting type of the group policy.
     * @param value Value to set for the settingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingType(@javax.annotation.Nullable final GroupPolicySettingType value) {
        this.settingType = value;
    }
    /**
     * Sets the settingValue property value. The value of this group policy setting.
     * @param value Value to set for the settingValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingValue(@javax.annotation.Nullable final String value) {
        this.settingValue = value;
    }
    /**
     * Sets the settingValueDisplayUnits property value. The display units of this group policy setting value
     * @param value Value to set for the settingValueDisplayUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingValueDisplayUnits(@javax.annotation.Nullable final String value) {
        this.settingValueDisplayUnits = value;
    }
    /**
     * Sets the settingValueType property value. The value type of this group policy setting.
     * @param value Value to set for the settingValueType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingValueType(@javax.annotation.Nullable final String value) {
        this.settingValueType = value;
    }
}
