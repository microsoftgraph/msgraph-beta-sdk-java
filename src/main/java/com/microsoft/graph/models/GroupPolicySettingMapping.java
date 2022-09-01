package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The Group Policy setting to MDM/Intune mapping. */
public class GroupPolicySettingMapping extends Entity implements Parsable {
    /** Admx Group Policy Id */
    private String _admxSettingDefinitionId;
    /** List of Child Ids of the group policy setting. */
    private java.util.List<String> _childIdList;
    /** The Intune Setting Definition Id */
    private String _intuneSettingDefinitionId;
    /** The list of Intune Setting URIs this group policy setting maps to */
    private java.util.List<String> _intuneSettingUriList;
    /** Indicates if the setting is supported by Intune or not */
    private Boolean _isMdmSupported;
    /** The CSP name this group policy setting maps to. */
    private String _mdmCspName;
    /** The minimum OS version this mdm setting supports. */
    private Integer _mdmMinimumOSVersion;
    /** The MDM CSP URI this group policy setting maps to. */
    private String _mdmSettingUri;
    /** Mdm Support Status of the setting. */
    private MdmSupportedState _mdmSupportedState;
    /** Parent Id of the group policy setting. */
    private String _parentId;
    /** The category the group policy setting is in. */
    private String _settingCategory;
    /** The display name of this group policy setting. */
    private String _settingDisplayName;
    /** The display value of this group policy setting. */
    private String _settingDisplayValue;
    /** The display value type of this group policy setting. */
    private String _settingDisplayValueType;
    /** The name of this group policy setting. */
    private String _settingName;
    /** Scope of the group policy setting. */
    private GroupPolicySettingScope _settingScope;
    /** Setting type of the group policy. */
    private GroupPolicySettingType _settingType;
    /** The value of this group policy setting. */
    private String _settingValue;
    /** The display units of this group policy setting value */
    private String _settingValueDisplayUnits;
    /** The value type of this group policy setting. */
    private String _settingValueType;
    /**
     * Instantiates a new groupPolicySettingMapping and sets the default values.
     * @return a void
     */
    public GroupPolicySettingMapping() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicySettingMapping");
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
        return this._admxSettingDefinitionId;
    }
    /**
     * Gets the childIdList property value. List of Child Ids of the group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getChildIdList() {
        return this._childIdList;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicySettingMapping currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("admxSettingDefinitionId", (n) -> { currentObject.setAdmxSettingDefinitionId(n.getStringValue()); });
            this.put("childIdList", (n) -> { currentObject.setChildIdList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("intuneSettingDefinitionId", (n) -> { currentObject.setIntuneSettingDefinitionId(n.getStringValue()); });
            this.put("intuneSettingUriList", (n) -> { currentObject.setIntuneSettingUriList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isMdmSupported", (n) -> { currentObject.setIsMdmSupported(n.getBooleanValue()); });
            this.put("mdmCspName", (n) -> { currentObject.setMdmCspName(n.getStringValue()); });
            this.put("mdmMinimumOSVersion", (n) -> { currentObject.setMdmMinimumOSVersion(n.getIntegerValue()); });
            this.put("mdmSettingUri", (n) -> { currentObject.setMdmSettingUri(n.getStringValue()); });
            this.put("mdmSupportedState", (n) -> { currentObject.setMdmSupportedState(n.getEnumValue(MdmSupportedState.class)); });
            this.put("parentId", (n) -> { currentObject.setParentId(n.getStringValue()); });
            this.put("settingCategory", (n) -> { currentObject.setSettingCategory(n.getStringValue()); });
            this.put("settingDisplayName", (n) -> { currentObject.setSettingDisplayName(n.getStringValue()); });
            this.put("settingDisplayValue", (n) -> { currentObject.setSettingDisplayValue(n.getStringValue()); });
            this.put("settingDisplayValueType", (n) -> { currentObject.setSettingDisplayValueType(n.getStringValue()); });
            this.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
            this.put("settingScope", (n) -> { currentObject.setSettingScope(n.getEnumValue(GroupPolicySettingScope.class)); });
            this.put("settingType", (n) -> { currentObject.setSettingType(n.getEnumValue(GroupPolicySettingType.class)); });
            this.put("settingValue", (n) -> { currentObject.setSettingValue(n.getStringValue()); });
            this.put("settingValueDisplayUnits", (n) -> { currentObject.setSettingValueDisplayUnits(n.getStringValue()); });
            this.put("settingValueType", (n) -> { currentObject.setSettingValueType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the intuneSettingDefinitionId property value. The Intune Setting Definition Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntuneSettingDefinitionId() {
        return this._intuneSettingDefinitionId;
    }
    /**
     * Gets the intuneSettingUriList property value. The list of Intune Setting URIs this group policy setting maps to
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIntuneSettingUriList() {
        return this._intuneSettingUriList;
    }
    /**
     * Gets the isMdmSupported property value. Indicates if the setting is supported by Intune or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMdmSupported() {
        return this._isMdmSupported;
    }
    /**
     * Gets the mdmCspName property value. The CSP name this group policy setting maps to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmCspName() {
        return this._mdmCspName;
    }
    /**
     * Gets the mdmMinimumOSVersion property value. The minimum OS version this mdm setting supports.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMdmMinimumOSVersion() {
        return this._mdmMinimumOSVersion;
    }
    /**
     * Gets the mdmSettingUri property value. The MDM CSP URI this group policy setting maps to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmSettingUri() {
        return this._mdmSettingUri;
    }
    /**
     * Gets the mdmSupportedState property value. Mdm Support Status of the setting.
     * @return a mdmSupportedState
     */
    @javax.annotation.Nullable
    public MdmSupportedState getMdmSupportedState() {
        return this._mdmSupportedState;
    }
    /**
     * Gets the parentId property value. Parent Id of the group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentId() {
        return this._parentId;
    }
    /**
     * Gets the settingCategory property value. The category the group policy setting is in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingCategory() {
        return this._settingCategory;
    }
    /**
     * Gets the settingDisplayName property value. The display name of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDisplayName() {
        return this._settingDisplayName;
    }
    /**
     * Gets the settingDisplayValue property value. The display value of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDisplayValue() {
        return this._settingDisplayValue;
    }
    /**
     * Gets the settingDisplayValueType property value. The display value type of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingDisplayValueType() {
        return this._settingDisplayValueType;
    }
    /**
     * Gets the settingName property value. The name of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Gets the settingScope property value. Scope of the group policy setting.
     * @return a groupPolicySettingScope
     */
    @javax.annotation.Nullable
    public GroupPolicySettingScope getSettingScope() {
        return this._settingScope;
    }
    /**
     * Gets the settingType property value. Setting type of the group policy.
     * @return a groupPolicySettingType
     */
    @javax.annotation.Nullable
    public GroupPolicySettingType getSettingType() {
        return this._settingType;
    }
    /**
     * Gets the settingValue property value. The value of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValue() {
        return this._settingValue;
    }
    /**
     * Gets the settingValueDisplayUnits property value. The display units of this group policy setting value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValueDisplayUnits() {
        return this._settingValueDisplayUnits;
    }
    /**
     * Gets the settingValueType property value. The value type of this group policy setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValueType() {
        return this._settingValueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdmxSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this._admxSettingDefinitionId = value;
    }
    /**
     * Sets the childIdList property value. List of Child Ids of the group policy setting.
     * @param value Value to set for the childIdList property.
     * @return a void
     */
    public void setChildIdList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._childIdList = value;
    }
    /**
     * Sets the intuneSettingDefinitionId property value. The Intune Setting Definition Id
     * @param value Value to set for the intuneSettingDefinitionId property.
     * @return a void
     */
    public void setIntuneSettingDefinitionId(@javax.annotation.Nullable final String value) {
        this._intuneSettingDefinitionId = value;
    }
    /**
     * Sets the intuneSettingUriList property value. The list of Intune Setting URIs this group policy setting maps to
     * @param value Value to set for the intuneSettingUriList property.
     * @return a void
     */
    public void setIntuneSettingUriList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._intuneSettingUriList = value;
    }
    /**
     * Sets the isMdmSupported property value. Indicates if the setting is supported by Intune or not
     * @param value Value to set for the isMdmSupported property.
     * @return a void
     */
    public void setIsMdmSupported(@javax.annotation.Nullable final Boolean value) {
        this._isMdmSupported = value;
    }
    /**
     * Sets the mdmCspName property value. The CSP name this group policy setting maps to.
     * @param value Value to set for the mdmCspName property.
     * @return a void
     */
    public void setMdmCspName(@javax.annotation.Nullable final String value) {
        this._mdmCspName = value;
    }
    /**
     * Sets the mdmMinimumOSVersion property value. The minimum OS version this mdm setting supports.
     * @param value Value to set for the mdmMinimumOSVersion property.
     * @return a void
     */
    public void setMdmMinimumOSVersion(@javax.annotation.Nullable final Integer value) {
        this._mdmMinimumOSVersion = value;
    }
    /**
     * Sets the mdmSettingUri property value. The MDM CSP URI this group policy setting maps to.
     * @param value Value to set for the mdmSettingUri property.
     * @return a void
     */
    public void setMdmSettingUri(@javax.annotation.Nullable final String value) {
        this._mdmSettingUri = value;
    }
    /**
     * Sets the mdmSupportedState property value. Mdm Support Status of the setting.
     * @param value Value to set for the mdmSupportedState property.
     * @return a void
     */
    public void setMdmSupportedState(@javax.annotation.Nullable final MdmSupportedState value) {
        this._mdmSupportedState = value;
    }
    /**
     * Sets the parentId property value. Parent Id of the group policy setting.
     * @param value Value to set for the parentId property.
     * @return a void
     */
    public void setParentId(@javax.annotation.Nullable final String value) {
        this._parentId = value;
    }
    /**
     * Sets the settingCategory property value. The category the group policy setting is in.
     * @param value Value to set for the settingCategory property.
     * @return a void
     */
    public void setSettingCategory(@javax.annotation.Nullable final String value) {
        this._settingCategory = value;
    }
    /**
     * Sets the settingDisplayName property value. The display name of this group policy setting.
     * @param value Value to set for the settingDisplayName property.
     * @return a void
     */
    public void setSettingDisplayName(@javax.annotation.Nullable final String value) {
        this._settingDisplayName = value;
    }
    /**
     * Sets the settingDisplayValue property value. The display value of this group policy setting.
     * @param value Value to set for the settingDisplayValue property.
     * @return a void
     */
    public void setSettingDisplayValue(@javax.annotation.Nullable final String value) {
        this._settingDisplayValue = value;
    }
    /**
     * Sets the settingDisplayValueType property value. The display value type of this group policy setting.
     * @param value Value to set for the settingDisplayValueType property.
     * @return a void
     */
    public void setSettingDisplayValueType(@javax.annotation.Nullable final String value) {
        this._settingDisplayValueType = value;
    }
    /**
     * Sets the settingName property value. The name of this group policy setting.
     * @param value Value to set for the settingName property.
     * @return a void
     */
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
    /**
     * Sets the settingScope property value. Scope of the group policy setting.
     * @param value Value to set for the settingScope property.
     * @return a void
     */
    public void setSettingScope(@javax.annotation.Nullable final GroupPolicySettingScope value) {
        this._settingScope = value;
    }
    /**
     * Sets the settingType property value. Setting type of the group policy.
     * @param value Value to set for the settingType property.
     * @return a void
     */
    public void setSettingType(@javax.annotation.Nullable final GroupPolicySettingType value) {
        this._settingType = value;
    }
    /**
     * Sets the settingValue property value. The value of this group policy setting.
     * @param value Value to set for the settingValue property.
     * @return a void
     */
    public void setSettingValue(@javax.annotation.Nullable final String value) {
        this._settingValue = value;
    }
    /**
     * Sets the settingValueDisplayUnits property value. The display units of this group policy setting value
     * @param value Value to set for the settingValueDisplayUnits property.
     * @return a void
     */
    public void setSettingValueDisplayUnits(@javax.annotation.Nullable final String value) {
        this._settingValueDisplayUnits = value;
    }
    /**
     * Sets the settingValueType property value. The value type of this group policy setting.
     * @param value Value to set for the settingValueType property.
     * @return a void
     */
    public void setSettingValueType(@javax.annotation.Nullable final String value) {
        this._settingValueType = value;
    }
}
