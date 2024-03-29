package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Group Policy setting to MDM/Intune mapping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicySettingMapping extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicySettingMapping} and sets the default values.
     */
    public GroupPolicySettingMapping() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicySettingMapping}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicySettingMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicySettingMapping();
    }
    /**
     * Gets the admxSettingDefinitionId property value. Admx Group Policy Id
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdmxSettingDefinitionId() {
        return this.backingStore.get("admxSettingDefinitionId");
    }
    /**
     * Gets the childIdList property value. List of Child Ids of the group policy setting.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChildIdList() {
        return this.backingStore.get("childIdList");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("mdmSupportedState", (n) -> { this.setMdmSupportedState(n.getEnumValue(MdmSupportedState::forValue)); });
        deserializerMap.put("parentId", (n) -> { this.setParentId(n.getStringValue()); });
        deserializerMap.put("settingCategory", (n) -> { this.setSettingCategory(n.getStringValue()); });
        deserializerMap.put("settingDisplayName", (n) -> { this.setSettingDisplayName(n.getStringValue()); });
        deserializerMap.put("settingDisplayValue", (n) -> { this.setSettingDisplayValue(n.getStringValue()); });
        deserializerMap.put("settingDisplayValueType", (n) -> { this.setSettingDisplayValueType(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("settingScope", (n) -> { this.setSettingScope(n.getEnumValue(GroupPolicySettingScope::forValue)); });
        deserializerMap.put("settingType", (n) -> { this.setSettingType(n.getEnumValue(GroupPolicySettingType::forValue)); });
        deserializerMap.put("settingValue", (n) -> { this.setSettingValue(n.getStringValue()); });
        deserializerMap.put("settingValueDisplayUnits", (n) -> { this.setSettingValueDisplayUnits(n.getStringValue()); });
        deserializerMap.put("settingValueType", (n) -> { this.setSettingValueType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intuneSettingDefinitionId property value. The Intune Setting Definition Id
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIntuneSettingDefinitionId() {
        return this.backingStore.get("intuneSettingDefinitionId");
    }
    /**
     * Gets the intuneSettingUriList property value. The list of Intune Setting URIs this group policy setting maps to
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIntuneSettingUriList() {
        return this.backingStore.get("intuneSettingUriList");
    }
    /**
     * Gets the isMdmSupported property value. Indicates if the setting is supported by Intune or not
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMdmSupported() {
        return this.backingStore.get("isMdmSupported");
    }
    /**
     * Gets the mdmCspName property value. The CSP name this group policy setting maps to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMdmCspName() {
        return this.backingStore.get("mdmCspName");
    }
    /**
     * Gets the mdmMinimumOSVersion property value. The minimum OS version this mdm setting supports.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMdmMinimumOSVersion() {
        return this.backingStore.get("mdmMinimumOSVersion");
    }
    /**
     * Gets the mdmSettingUri property value. The MDM CSP URI this group policy setting maps to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMdmSettingUri() {
        return this.backingStore.get("mdmSettingUri");
    }
    /**
     * Gets the mdmSupportedState property value. Mdm Support Status of the setting.
     * @return a {@link MdmSupportedState}
     */
    @jakarta.annotation.Nullable
    public MdmSupportedState getMdmSupportedState() {
        return this.backingStore.get("mdmSupportedState");
    }
    /**
     * Gets the parentId property value. Parent Id of the group policy setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentId() {
        return this.backingStore.get("parentId");
    }
    /**
     * Gets the settingCategory property value. The category the group policy setting is in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingCategory() {
        return this.backingStore.get("settingCategory");
    }
    /**
     * Gets the settingDisplayName property value. The display name of this group policy setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingDisplayName() {
        return this.backingStore.get("settingDisplayName");
    }
    /**
     * Gets the settingDisplayValue property value. The display value of this group policy setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingDisplayValue() {
        return this.backingStore.get("settingDisplayValue");
    }
    /**
     * Gets the settingDisplayValueType property value. The display value type of this group policy setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingDisplayValueType() {
        return this.backingStore.get("settingDisplayValueType");
    }
    /**
     * Gets the settingName property value. The name of this group policy setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.backingStore.get("settingName");
    }
    /**
     * Gets the settingScope property value. Scope of the group policy setting.
     * @return a {@link GroupPolicySettingScope}
     */
    @jakarta.annotation.Nullable
    public GroupPolicySettingScope getSettingScope() {
        return this.backingStore.get("settingScope");
    }
    /**
     * Gets the settingType property value. Setting type of the group policy.
     * @return a {@link GroupPolicySettingType}
     */
    @jakarta.annotation.Nullable
    public GroupPolicySettingType getSettingType() {
        return this.backingStore.get("settingType");
    }
    /**
     * Gets the settingValue property value. The value of this group policy setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingValue() {
        return this.backingStore.get("settingValue");
    }
    /**
     * Gets the settingValueDisplayUnits property value. The display units of this group policy setting value
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingValueDisplayUnits() {
        return this.backingStore.get("settingValueDisplayUnits");
    }
    /**
     * Gets the settingValueType property value. The value type of this group policy setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSettingValueType() {
        return this.backingStore.get("settingValueType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAdmxSettingDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("admxSettingDefinitionId", value);
    }
    /**
     * Sets the childIdList property value. List of Child Ids of the group policy setting.
     * @param value Value to set for the childIdList property.
     */
    public void setChildIdList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("childIdList", value);
    }
    /**
     * Sets the intuneSettingDefinitionId property value. The Intune Setting Definition Id
     * @param value Value to set for the intuneSettingDefinitionId property.
     */
    public void setIntuneSettingDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("intuneSettingDefinitionId", value);
    }
    /**
     * Sets the intuneSettingUriList property value. The list of Intune Setting URIs this group policy setting maps to
     * @param value Value to set for the intuneSettingUriList property.
     */
    public void setIntuneSettingUriList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("intuneSettingUriList", value);
    }
    /**
     * Sets the isMdmSupported property value. Indicates if the setting is supported by Intune or not
     * @param value Value to set for the isMdmSupported property.
     */
    public void setIsMdmSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMdmSupported", value);
    }
    /**
     * Sets the mdmCspName property value. The CSP name this group policy setting maps to.
     * @param value Value to set for the mdmCspName property.
     */
    public void setMdmCspName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdmCspName", value);
    }
    /**
     * Sets the mdmMinimumOSVersion property value. The minimum OS version this mdm setting supports.
     * @param value Value to set for the mdmMinimumOSVersion property.
     */
    public void setMdmMinimumOSVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("mdmMinimumOSVersion", value);
    }
    /**
     * Sets the mdmSettingUri property value. The MDM CSP URI this group policy setting maps to.
     * @param value Value to set for the mdmSettingUri property.
     */
    public void setMdmSettingUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdmSettingUri", value);
    }
    /**
     * Sets the mdmSupportedState property value. Mdm Support Status of the setting.
     * @param value Value to set for the mdmSupportedState property.
     */
    public void setMdmSupportedState(@jakarta.annotation.Nullable final MdmSupportedState value) {
        this.backingStore.set("mdmSupportedState", value);
    }
    /**
     * Sets the parentId property value. Parent Id of the group policy setting.
     * @param value Value to set for the parentId property.
     */
    public void setParentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentId", value);
    }
    /**
     * Sets the settingCategory property value. The category the group policy setting is in.
     * @param value Value to set for the settingCategory property.
     */
    public void setSettingCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingCategory", value);
    }
    /**
     * Sets the settingDisplayName property value. The display name of this group policy setting.
     * @param value Value to set for the settingDisplayName property.
     */
    public void setSettingDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingDisplayName", value);
    }
    /**
     * Sets the settingDisplayValue property value. The display value of this group policy setting.
     * @param value Value to set for the settingDisplayValue property.
     */
    public void setSettingDisplayValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingDisplayValue", value);
    }
    /**
     * Sets the settingDisplayValueType property value. The display value type of this group policy setting.
     * @param value Value to set for the settingDisplayValueType property.
     */
    public void setSettingDisplayValueType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingDisplayValueType", value);
    }
    /**
     * Sets the settingName property value. The name of this group policy setting.
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingName", value);
    }
    /**
     * Sets the settingScope property value. Scope of the group policy setting.
     * @param value Value to set for the settingScope property.
     */
    public void setSettingScope(@jakarta.annotation.Nullable final GroupPolicySettingScope value) {
        this.backingStore.set("settingScope", value);
    }
    /**
     * Sets the settingType property value. Setting type of the group policy.
     * @param value Value to set for the settingType property.
     */
    public void setSettingType(@jakarta.annotation.Nullable final GroupPolicySettingType value) {
        this.backingStore.set("settingType", value);
    }
    /**
     * Sets the settingValue property value. The value of this group policy setting.
     * @param value Value to set for the settingValue property.
     */
    public void setSettingValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingValue", value);
    }
    /**
     * Sets the settingValueDisplayUnits property value. The display units of this group policy setting value
     * @param value Value to set for the settingValueDisplayUnits property.
     */
    public void setSettingValueDisplayUnits(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingValueDisplayUnits", value);
    }
    /**
     * Sets the settingValueType property value. The value type of this group policy setting.
     * @param value Value to set for the settingValueType property.
     */
    public void setSettingValueType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingValueType", value);
    }
}
