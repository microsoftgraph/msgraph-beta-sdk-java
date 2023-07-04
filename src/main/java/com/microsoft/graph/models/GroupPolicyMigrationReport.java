package com.microsoft.graph.models;

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
public class GroupPolicyMigrationReport extends Entity implements Parsable {
    /**
     * The date and time at which the GroupPolicyMigrationReport was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The name of Group Policy Object from the GPO Xml Content
     */
    private String displayName;
    /**
     * The date and time at which the GroupPolicyMigrationReport was created.
     */
    private OffsetDateTime groupPolicyCreatedDateTime;
    /**
     * The date and time at which the GroupPolicyMigrationReport was last modified.
     */
    private OffsetDateTime groupPolicyLastModifiedDateTime;
    /**
     * The Group Policy Object GUID from GPO Xml content
     */
    private UUID groupPolicyObjectId;
    /**
     * A list of group policy settings to MDM/Intune mappings.
     */
    private java.util.List<GroupPolicySettingMapping> groupPolicySettingMappings;
    /**
     * The date and time at which the GroupPolicyMigrationReport was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Indicates if the Group Policy Object file is covered and ready for Intune migration.
     */
    private GroupPolicyMigrationReadiness migrationReadiness;
    /**
     * The distinguished name of the OU.
     */
    private String ouDistinguishedName;
    /**
     * The list of scope tags for the configuration.
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * The number of Group Policy Settings supported by Intune.
     */
    private Integer supportedSettingsCount;
    /**
     * The Percentage of Group Policy Settings supported by Intune.
     */
    private Integer supportedSettingsPercent;
    /**
     * The Targeted in AD property from GPO Xml Content
     */
    private Boolean targetedInActiveDirectory;
    /**
     * The total number of Group Policy Settings from GPO file.
     */
    private Integer totalSettingsCount;
    /**
     * A list of unsupported group policy extensions inside the Group Policy Object.
     */
    private java.util.List<UnsupportedGroupPolicyExtension> unsupportedGroupPolicyExtensions;
    /**
     * Instantiates a new groupPolicyMigrationReport and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyMigrationReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyMigrationReport
     */
    @javax.annotation.Nonnull
    public static GroupPolicyMigrationReport createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyMigrationReport();
    }
    /**
     * Gets the createdDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The name of Group Policy Object from the GPO Xml Content
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupPolicyCreatedDateTime", (n) -> { this.setGroupPolicyCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupPolicyLastModifiedDateTime", (n) -> { this.setGroupPolicyLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupPolicyObjectId", (n) -> { this.setGroupPolicyObjectId(n.getUUIDValue()); });
        deserializerMap.put("groupPolicySettingMappings", (n) -> { this.setGroupPolicySettingMappings(n.getCollectionOfObjectValues(GroupPolicySettingMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("migrationReadiness", (n) -> { this.setMigrationReadiness(n.getEnumValue(GroupPolicyMigrationReadiness.class)); });
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
    @javax.annotation.Nullable
    public OffsetDateTime getGroupPolicyCreatedDateTime() {
        return this.groupPolicyCreatedDateTime;
    }
    /**
     * Gets the groupPolicyLastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getGroupPolicyLastModifiedDateTime() {
        return this.groupPolicyLastModifiedDateTime;
    }
    /**
     * Gets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getGroupPolicyObjectId() {
        return this.groupPolicyObjectId;
    }
    /**
     * Gets the groupPolicySettingMappings property value. A list of group policy settings to MDM/Intune mappings.
     * @return a groupPolicySettingMapping
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicySettingMapping> getGroupPolicySettingMappings() {
        return this.groupPolicySettingMappings;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the migrationReadiness property value. Indicates if the Group Policy Object file is covered and ready for Intune migration.
     * @return a GroupPolicyMigrationReadiness
     */
    @javax.annotation.Nullable
    public GroupPolicyMigrationReadiness getMigrationReadiness() {
        return this.migrationReadiness;
    }
    /**
     * Gets the ouDistinguishedName property value. The distinguished name of the OU.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOuDistinguishedName() {
        return this.ouDistinguishedName;
    }
    /**
     * Gets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the supportedSettingsCount property value. The number of Group Policy Settings supported by Intune.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupportedSettingsCount() {
        return this.supportedSettingsCount;
    }
    /**
     * Gets the supportedSettingsPercent property value. The Percentage of Group Policy Settings supported by Intune.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupportedSettingsPercent() {
        return this.supportedSettingsPercent;
    }
    /**
     * Gets the targetedInActiveDirectory property value. The Targeted in AD property from GPO Xml Content
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTargetedInActiveDirectory() {
        return this.targetedInActiveDirectory;
    }
    /**
     * Gets the totalSettingsCount property value. The total number of Group Policy Settings from GPO file.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalSettingsCount() {
        return this.totalSettingsCount;
    }
    /**
     * Gets the unsupportedGroupPolicyExtensions property value. A list of unsupported group policy extensions inside the Group Policy Object.
     * @return a unsupportedGroupPolicyExtension
     */
    @javax.annotation.Nullable
    public java.util.List<UnsupportedGroupPolicyExtension> getUnsupportedGroupPolicyExtensions() {
        return this.unsupportedGroupPolicyExtensions;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The name of Group Policy Object from the GPO Xml Content
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the groupPolicyCreatedDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @param value Value to set for the groupPolicyCreatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.groupPolicyCreatedDateTime = value;
    }
    /**
     * Sets the groupPolicyLastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @param value Value to set for the groupPolicyLastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.groupPolicyLastModifiedDateTime = value;
    }
    /**
     * Sets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @param value Value to set for the groupPolicyObjectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyObjectId(@javax.annotation.Nullable final UUID value) {
        this.groupPolicyObjectId = value;
    }
    /**
     * Sets the groupPolicySettingMappings property value. A list of group policy settings to MDM/Intune mappings.
     * @param value Value to set for the groupPolicySettingMappings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicySettingMappings(@javax.annotation.Nullable final java.util.List<GroupPolicySettingMapping> value) {
        this.groupPolicySettingMappings = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the migrationReadiness property value. Indicates if the Group Policy Object file is covered and ready for Intune migration.
     * @param value Value to set for the migrationReadiness property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMigrationReadiness(@javax.annotation.Nullable final GroupPolicyMigrationReadiness value) {
        this.migrationReadiness = value;
    }
    /**
     * Sets the ouDistinguishedName property value. The distinguished name of the OU.
     * @param value Value to set for the ouDistinguishedName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOuDistinguishedName(@javax.annotation.Nullable final String value) {
        this.ouDistinguishedName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the supportedSettingsCount property value. The number of Group Policy Settings supported by Intune.
     * @param value Value to set for the supportedSettingsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedSettingsCount(@javax.annotation.Nullable final Integer value) {
        this.supportedSettingsCount = value;
    }
    /**
     * Sets the supportedSettingsPercent property value. The Percentage of Group Policy Settings supported by Intune.
     * @param value Value to set for the supportedSettingsPercent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedSettingsPercent(@javax.annotation.Nullable final Integer value) {
        this.supportedSettingsPercent = value;
    }
    /**
     * Sets the targetedInActiveDirectory property value. The Targeted in AD property from GPO Xml Content
     * @param value Value to set for the targetedInActiveDirectory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedInActiveDirectory(@javax.annotation.Nullable final Boolean value) {
        this.targetedInActiveDirectory = value;
    }
    /**
     * Sets the totalSettingsCount property value. The total number of Group Policy Settings from GPO file.
     * @param value Value to set for the totalSettingsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalSettingsCount(@javax.annotation.Nullable final Integer value) {
        this.totalSettingsCount = value;
    }
    /**
     * Sets the unsupportedGroupPolicyExtensions property value. A list of unsupported group policy extensions inside the Group Policy Object.
     * @param value Value to set for the unsupportedGroupPolicyExtensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnsupportedGroupPolicyExtensions(@javax.annotation.Nullable final java.util.List<UnsupportedGroupPolicyExtension> value) {
        this.unsupportedGroupPolicyExtensions = value;
    }
}
