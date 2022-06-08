package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The Group Policy migration report. */
public class GroupPolicyMigrationReport extends Entity implements Parsable {
    /** The date and time at which the GroupPolicyMigrationReport was created. */
    private OffsetDateTime _createdDateTime;
    /** The name of Group Policy Object from the GPO Xml Content */
    private String _displayName;
    /** The date and time at which the GroupPolicyMigrationReport was created. */
    private OffsetDateTime _groupPolicyCreatedDateTime;
    /** The date and time at which the GroupPolicyMigrationReport was last modified. */
    private OffsetDateTime _groupPolicyLastModifiedDateTime;
    /** The Group Policy Object GUID from GPO Xml content */
    private String _groupPolicyObjectId;
    /** A list of group policy settings to MDM/Intune mappings. */
    private java.util.List<GroupPolicySettingMapping> _groupPolicySettingMappings;
    /** The date and time at which the GroupPolicyMigrationReport was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The Intune coverage for the associated Group Policy Object file. Possible values are: none, partial, complete, error, notApplicable. */
    private GroupPolicyMigrationReadiness _migrationReadiness;
    /** The distinguished name of the OU. */
    private String _ouDistinguishedName;
    /** The number of Group Policy Settings supported by Intune. */
    private Integer _supportedSettingsCount;
    /** The Percentage of Group Policy Settings supported by Intune. */
    private Integer _supportedSettingsPercent;
    /** The Targeted in AD property from GPO Xml Content */
    private Boolean _targetedInActiveDirectory;
    /** The total number of Group Policy Settings from GPO file. */
    private Integer _totalSettingsCount;
    /** A list of unsupported group policy extensions inside the Group Policy Object. */
    private java.util.List<UnsupportedGroupPolicyExtension> _unsupportedGroupPolicyExtensions;
    /**
     * Instantiates a new groupPolicyMigrationReport and sets the default values.
     * @return a void
     */
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
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The name of Group Policy Object from the GPO Xml Content
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
        final GroupPolicyMigrationReport currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("groupPolicyCreatedDateTime", (n) -> { currentObject.setGroupPolicyCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("groupPolicyLastModifiedDateTime", (n) -> { currentObject.setGroupPolicyLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("groupPolicyObjectId", (n) -> { currentObject.setGroupPolicyObjectId(n.getStringValue()); });
            this.put("groupPolicySettingMappings", (n) -> { currentObject.setGroupPolicySettingMappings(n.getCollectionOfObjectValues(GroupPolicySettingMapping::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("migrationReadiness", (n) -> { currentObject.setMigrationReadiness(n.getEnumValue(GroupPolicyMigrationReadiness.class)); });
            this.put("ouDistinguishedName", (n) -> { currentObject.setOuDistinguishedName(n.getStringValue()); });
            this.put("supportedSettingsCount", (n) -> { currentObject.setSupportedSettingsCount(n.getIntegerValue()); });
            this.put("supportedSettingsPercent", (n) -> { currentObject.setSupportedSettingsPercent(n.getIntegerValue()); });
            this.put("targetedInActiveDirectory", (n) -> { currentObject.setTargetedInActiveDirectory(n.getBooleanValue()); });
            this.put("totalSettingsCount", (n) -> { currentObject.setTotalSettingsCount(n.getIntegerValue()); });
            this.put("unsupportedGroupPolicyExtensions", (n) -> { currentObject.setUnsupportedGroupPolicyExtensions(n.getCollectionOfObjectValues(UnsupportedGroupPolicyExtension::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupPolicyCreatedDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getGroupPolicyCreatedDateTime() {
        return this._groupPolicyCreatedDateTime;
    }
    /**
     * Gets the groupPolicyLastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getGroupPolicyLastModifiedDateTime() {
        return this._groupPolicyLastModifiedDateTime;
    }
    /**
     * Gets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupPolicyObjectId() {
        return this._groupPolicyObjectId;
    }
    /**
     * Gets the groupPolicySettingMappings property value. A list of group policy settings to MDM/Intune mappings.
     * @return a groupPolicySettingMapping
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicySettingMapping> getGroupPolicySettingMappings() {
        return this._groupPolicySettingMappings;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the migrationReadiness property value. The Intune coverage for the associated Group Policy Object file. Possible values are: none, partial, complete, error, notApplicable.
     * @return a groupPolicyMigrationReadiness
     */
    @javax.annotation.Nullable
    public GroupPolicyMigrationReadiness getMigrationReadiness() {
        return this._migrationReadiness;
    }
    /**
     * Gets the ouDistinguishedName property value. The distinguished name of the OU.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOuDistinguishedName() {
        return this._ouDistinguishedName;
    }
    /**
     * Gets the supportedSettingsCount property value. The number of Group Policy Settings supported by Intune.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupportedSettingsCount() {
        return this._supportedSettingsCount;
    }
    /**
     * Gets the supportedSettingsPercent property value. The Percentage of Group Policy Settings supported by Intune.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupportedSettingsPercent() {
        return this._supportedSettingsPercent;
    }
    /**
     * Gets the targetedInActiveDirectory property value. The Targeted in AD property from GPO Xml Content
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTargetedInActiveDirectory() {
        return this._targetedInActiveDirectory;
    }
    /**
     * Gets the totalSettingsCount property value. The total number of Group Policy Settings from GPO file.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalSettingsCount() {
        return this._totalSettingsCount;
    }
    /**
     * Gets the unsupportedGroupPolicyExtensions property value. A list of unsupported group policy extensions inside the Group Policy Object.
     * @return a unsupportedGroupPolicyExtension
     */
    @javax.annotation.Nullable
    public java.util.List<UnsupportedGroupPolicyExtension> getUnsupportedGroupPolicyExtensions() {
        return this._unsupportedGroupPolicyExtensions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("groupPolicyCreatedDateTime", this.getGroupPolicyCreatedDateTime());
        writer.writeOffsetDateTimeValue("groupPolicyLastModifiedDateTime", this.getGroupPolicyLastModifiedDateTime());
        writer.writeStringValue("groupPolicyObjectId", this.getGroupPolicyObjectId());
        writer.writeCollectionOfObjectValues("groupPolicySettingMappings", this.getGroupPolicySettingMappings());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("migrationReadiness", this.getMigrationReadiness());
        writer.writeStringValue("ouDistinguishedName", this.getOuDistinguishedName());
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
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The name of Group Policy Object from the GPO Xml Content
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the groupPolicyCreatedDateTime property value. The date and time at which the GroupPolicyMigrationReport was created.
     * @param value Value to set for the groupPolicyCreatedDateTime property.
     * @return a void
     */
    public void setGroupPolicyCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._groupPolicyCreatedDateTime = value;
    }
    /**
     * Sets the groupPolicyLastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @param value Value to set for the groupPolicyLastModifiedDateTime property.
     * @return a void
     */
    public void setGroupPolicyLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._groupPolicyLastModifiedDateTime = value;
    }
    /**
     * Sets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @param value Value to set for the groupPolicyObjectId property.
     * @return a void
     */
    public void setGroupPolicyObjectId(@javax.annotation.Nullable final String value) {
        this._groupPolicyObjectId = value;
    }
    /**
     * Sets the groupPolicySettingMappings property value. A list of group policy settings to MDM/Intune mappings.
     * @param value Value to set for the groupPolicySettingMappings property.
     * @return a void
     */
    public void setGroupPolicySettingMappings(@javax.annotation.Nullable final java.util.List<GroupPolicySettingMapping> value) {
        this._groupPolicySettingMappings = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time at which the GroupPolicyMigrationReport was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the migrationReadiness property value. The Intune coverage for the associated Group Policy Object file. Possible values are: none, partial, complete, error, notApplicable.
     * @param value Value to set for the migrationReadiness property.
     * @return a void
     */
    public void setMigrationReadiness(@javax.annotation.Nullable final GroupPolicyMigrationReadiness value) {
        this._migrationReadiness = value;
    }
    /**
     * Sets the ouDistinguishedName property value. The distinguished name of the OU.
     * @param value Value to set for the ouDistinguishedName property.
     * @return a void
     */
    public void setOuDistinguishedName(@javax.annotation.Nullable final String value) {
        this._ouDistinguishedName = value;
    }
    /**
     * Sets the supportedSettingsCount property value. The number of Group Policy Settings supported by Intune.
     * @param value Value to set for the supportedSettingsCount property.
     * @return a void
     */
    public void setSupportedSettingsCount(@javax.annotation.Nullable final Integer value) {
        this._supportedSettingsCount = value;
    }
    /**
     * Sets the supportedSettingsPercent property value. The Percentage of Group Policy Settings supported by Intune.
     * @param value Value to set for the supportedSettingsPercent property.
     * @return a void
     */
    public void setSupportedSettingsPercent(@javax.annotation.Nullable final Integer value) {
        this._supportedSettingsPercent = value;
    }
    /**
     * Sets the targetedInActiveDirectory property value. The Targeted in AD property from GPO Xml Content
     * @param value Value to set for the targetedInActiveDirectory property.
     * @return a void
     */
    public void setTargetedInActiveDirectory(@javax.annotation.Nullable final Boolean value) {
        this._targetedInActiveDirectory = value;
    }
    /**
     * Sets the totalSettingsCount property value. The total number of Group Policy Settings from GPO file.
     * @param value Value to set for the totalSettingsCount property.
     * @return a void
     */
    public void setTotalSettingsCount(@javax.annotation.Nullable final Integer value) {
        this._totalSettingsCount = value;
    }
    /**
     * Sets the unsupportedGroupPolicyExtensions property value. A list of unsupported group policy extensions inside the Group Policy Object.
     * @param value Value to set for the unsupportedGroupPolicyExtensions property.
     * @return a void
     */
    public void setUnsupportedGroupPolicyExtensions(@javax.annotation.Nullable final java.util.List<UnsupportedGroupPolicyExtension> value) {
        this._unsupportedGroupPolicyExtensions = value;
    }
}
