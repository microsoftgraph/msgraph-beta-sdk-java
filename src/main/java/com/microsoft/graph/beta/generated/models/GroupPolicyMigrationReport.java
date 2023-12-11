package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * The Group Policy migration report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyMigrationReport extends Entity implements Parsable {
    /**
     * Instantiates a new GroupPolicyMigrationReport and sets the default values.
     */
    public GroupPolicyMigrationReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyMigrationReport
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyMigrationReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyMigrationReport();
    }
    /**
     * Gets the createdDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The name of Group Policy Object from the GPO Xml Content
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupPolicyCreatedDateTime", (n) -> { this.setGroupPolicyCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupPolicyLastModifiedDateTime", (n) -> { this.setGroupPolicyLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupPolicyObjectId", (n) -> { this.setGroupPolicyObjectId(n.getUUIDValue()); });
        deserializerMap.put("groupPolicySettingMappings", (n) -> { this.setGroupPolicySettingMappings(n.getCollectionOfObjectValues(GroupPolicySettingMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("migrationReadiness", (n) -> { this.setMigrationReadiness(n.getEnumValue(GroupPolicyMigrationReadiness::forValue)); });
        deserializerMap.put("ouDistinguishedName", (n) -> { this.setOuDistinguishedName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportedSettingsCount", (n) -> { this.setSupportedSettingsCount(n.getIntegerValue()); });
        deserializerMap.put("supportedSettingsPercent", (n) -> { this.setSupportedSettingsPercent(n.getIntegerValue()); });
        deserializerMap.put("targetedInActiveDirectory", (n) -> { this.setTargetedInActiveDirectory(n.getBooleanValue()); });
        deserializerMap.put("totalSettingsCount", (n) -> { this.setTotalSettingsCount(n.getIntegerValue()); });
        deserializerMap.put("unsupportedGroupPolicyExtensions", (n) -> { this.setUnsupportedGroupPolicyExtensions(n.getCollectionOfObjectValues(UnsupportedGroupPolicyExtension::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyCreatedDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGroupPolicyCreatedDateTime() {
        return this.backingStore.get("groupPolicyCreatedDateTime");
    }
    /**
     * Gets the groupPolicyLastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGroupPolicyLastModifiedDateTime() {
        return this.backingStore.get("groupPolicyLastModifiedDateTime");
    }
    /**
     * Gets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getGroupPolicyObjectId() {
        return this.backingStore.get("groupPolicyObjectId");
    }
    /**
     * Gets the groupPolicySettingMappings property value. A list of group policy settings to MDM/Intune mappings.
     * @return a java.util.List<GroupPolicySettingMapping>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicySettingMapping> getGroupPolicySettingMappings() {
        return this.backingStore.get("groupPolicySettingMappings");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the migrationReadiness property value. Indicates if the Group Policy Object file is covered and ready for Intune migration.
     * @return a GroupPolicyMigrationReadiness
     */
    @jakarta.annotation.Nullable
    public GroupPolicyMigrationReadiness getMigrationReadiness() {
        return this.backingStore.get("migrationReadiness");
    }
    /**
     * Gets the ouDistinguishedName property value. The distinguished name of the OU.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOuDistinguishedName() {
        return this.backingStore.get("ouDistinguishedName");
    }
    /**
     * Gets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the supportedSettingsCount property value. The number of Group Policy Settings supported by Intune.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSupportedSettingsCount() {
        return this.backingStore.get("supportedSettingsCount");
    }
    /**
     * Gets the supportedSettingsPercent property value. The Percentage of Group Policy Settings supported by Intune.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSupportedSettingsPercent() {
        return this.backingStore.get("supportedSettingsPercent");
    }
    /**
     * Gets the targetedInActiveDirectory property value. The Targeted in AD property from GPO Xml Content
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTargetedInActiveDirectory() {
        return this.backingStore.get("targetedInActiveDirectory");
    }
    /**
     * Gets the totalSettingsCount property value. The total number of Group Policy Settings from GPO file.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalSettingsCount() {
        return this.backingStore.get("totalSettingsCount");
    }
    /**
     * Gets the unsupportedGroupPolicyExtensions property value. A list of unsupported group policy extensions inside the Group Policy Object.
     * @return a java.util.List<UnsupportedGroupPolicyExtension>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnsupportedGroupPolicyExtension> getUnsupportedGroupPolicyExtensions() {
        return this.backingStore.get("unsupportedGroupPolicyExtensions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("groupPolicyCreatedDateTime", this.getGroupPolicyCreatedDateTime());
        writer.writeOffsetDateTimeValue("groupPolicyLastModifiedDateTime", this.getGroupPolicyLastModifiedDateTime());
        writer.writeUUIDValue("groupPolicyObjectId", this.getGroupPolicyObjectId());
        writer.writeCollectionOfObjectValues("groupPolicySettingMappings", this.getGroupPolicySettingMappings());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("migrationReadiness", this.getMigrationReadiness());
        writer.writeStringValue("ouDistinguishedName", this.getOuDistinguishedName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeIntegerValue("supportedSettingsCount", this.getSupportedSettingsCount());
        writer.writeIntegerValue("supportedSettingsPercent", this.getSupportedSettingsPercent());
        writer.writeBooleanValue("targetedInActiveDirectory", this.getTargetedInActiveDirectory());
        writer.writeIntegerValue("totalSettingsCount", this.getTotalSettingsCount());
        writer.writeCollectionOfObjectValues("unsupportedGroupPolicyExtensions", this.getUnsupportedGroupPolicyExtensions());
    }
    /**
     * Sets the createdDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The name of Group Policy Object from the GPO Xml Content
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the groupPolicyCreatedDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @param value Value to set for the groupPolicyCreatedDateTime property.
     */
    public void setGroupPolicyCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("groupPolicyCreatedDateTime", value);
    }
    /**
     * Sets the groupPolicyLastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @param value Value to set for the groupPolicyLastModifiedDateTime property.
     */
    public void setGroupPolicyLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("groupPolicyLastModifiedDateTime", value);
    }
    /**
     * Sets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @param value Value to set for the groupPolicyObjectId property.
     */
    public void setGroupPolicyObjectId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("groupPolicyObjectId", value);
    }
    /**
     * Sets the groupPolicySettingMappings property value. A list of group policy settings to MDM/Intune mappings.
     * @param value Value to set for the groupPolicySettingMappings property.
     */
    public void setGroupPolicySettingMappings(@jakarta.annotation.Nullable final java.util.List<GroupPolicySettingMapping> value) {
        this.backingStore.set("groupPolicySettingMappings", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the migrationReadiness property value. Indicates if the Group Policy Object file is covered and ready for Intune migration.
     * @param value Value to set for the migrationReadiness property.
     */
    public void setMigrationReadiness(@jakarta.annotation.Nullable final GroupPolicyMigrationReadiness value) {
        this.backingStore.set("migrationReadiness", value);
    }
    /**
     * Sets the ouDistinguishedName property value. The distinguished name of the OU.
     * @param value Value to set for the ouDistinguishedName property.
     */
    public void setOuDistinguishedName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ouDistinguishedName", value);
    }
    /**
     * Sets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the supportedSettingsCount property value. The number of Group Policy Settings supported by Intune.
     * @param value Value to set for the supportedSettingsCount property.
     */
    public void setSupportedSettingsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("supportedSettingsCount", value);
    }
    /**
     * Sets the supportedSettingsPercent property value. The Percentage of Group Policy Settings supported by Intune.
     * @param value Value to set for the supportedSettingsPercent property.
     */
    public void setSupportedSettingsPercent(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("supportedSettingsPercent", value);
    }
    /**
     * Sets the targetedInActiveDirectory property value. The Targeted in AD property from GPO Xml Content
     * @param value Value to set for the targetedInActiveDirectory property.
     */
    public void setTargetedInActiveDirectory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("targetedInActiveDirectory", value);
    }
    /**
     * Sets the totalSettingsCount property value. The total number of Group Policy Settings from GPO file.
     * @param value Value to set for the totalSettingsCount property.
     */
    public void setTotalSettingsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalSettingsCount", value);
    }
    /**
     * Sets the unsupportedGroupPolicyExtensions property value. A list of unsupported group policy extensions inside the Group Policy Object.
     * @param value Value to set for the unsupportedGroupPolicyExtensions property.
     */
    public void setUnsupportedGroupPolicyExtensions(@jakarta.annotation.Nullable final java.util.List<UnsupportedGroupPolicyExtension> value) {
        this.backingStore.set("unsupportedGroupPolicyExtensions", value);
    }
}
