package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackage extends Entity implements Parsable {
    /** Read-only. Nullable. Supports $expand. */
    private java.util.List<AccessPackageAssignmentPolicy> _accessPackageAssignmentPolicies;
    /** Read-only. Nullable. */
    private AccessPackageCatalog _accessPackageCatalog;
    /** Nullable. */
    private java.util.List<AccessPackageResourceRoleScope> _accessPackageResourceRoleScopes;
    /** The access packages that are incompatible with this package. Read-only. */
    private java.util.List<AccessPackage> _accessPackagesIncompatibleWith;
    /** Identifier of the access package catalog referencing this access package. Read-only. */
    private String _catalogId;
    /** The userPrincipalName of the user or identity of the subject who created this resource. Read-only. */
    private String _createdBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The description of the access package. */
    private String _description;
    /** The display name of the access package. Supports $filter (eq, contains). */
    private String _displayName;
    /** The  access packages whose assigned users are ineligible to be assigned this access package. */
    private java.util.List<AccessPackage> _incompatibleAccessPackages;
    /** The groups whose members are ineligible to be assigned this access package. */
    private java.util.List<Group> _incompatibleGroups;
    /** Whether the access package is hidden from the requestor. */
    private Boolean _isHidden;
    /** Indicates whether role scopes are visible. */
    private Boolean _isRoleScopesVisible;
    /** The userPrincipalName of the user who last modified this resource. Read-only. */
    private String _modifiedBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _modifiedDateTime;
    /**
     * Instantiates a new accessPackage and sets the default values.
     * @return a void
     */
    public AccessPackage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackage
     */
    @javax.annotation.Nonnull
    public static AccessPackage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackage();
    }
    /**
     * Gets the accessPackageAssignmentPolicies property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAccessPackageAssignmentPolicies() {
        return this._accessPackageAssignmentPolicies;
    }
    /**
     * Gets the accessPackageCatalog property value. Read-only. Nullable.
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog getAccessPackageCatalog() {
        return this._accessPackageCatalog;
    }
    /**
     * Gets the accessPackageResourceRoleScopes property value. Nullable.
     * @return a accessPackageResourceRoleScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceRoleScope> getAccessPackageResourceRoleScopes() {
        return this._accessPackageResourceRoleScopes;
    }
    /**
     * Gets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackagesIncompatibleWith() {
        return this._accessPackagesIncompatibleWith;
    }
    /**
     * Gets the catalogId property value. Identifier of the access package catalog referencing this access package. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCatalogId() {
        return this._catalogId;
    }
    /**
     * Gets the createdBy property value. The userPrincipalName of the user or identity of the subject who created this resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of the access package.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the access package. Supports $filter (eq, contains).
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
        final AccessPackage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessPackageAssignmentPolicies", (n) -> { currentObject.setAccessPackageAssignmentPolicies(n.getCollectionOfObjectValues(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
            this.put("accessPackageCatalog", (n) -> { currentObject.setAccessPackageCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
            this.put("accessPackageResourceRoleScopes", (n) -> { currentObject.setAccessPackageResourceRoleScopes(n.getCollectionOfObjectValues(AccessPackageResourceRoleScope::createFromDiscriminatorValue)); });
            this.put("accessPackagesIncompatibleWith", (n) -> { currentObject.setAccessPackagesIncompatibleWith(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
            this.put("catalogId", (n) -> { currentObject.setCatalogId(n.getStringValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("incompatibleAccessPackages", (n) -> { currentObject.setIncompatibleAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
            this.put("incompatibleGroups", (n) -> { currentObject.setIncompatibleGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
            this.put("isHidden", (n) -> { currentObject.setIsHidden(n.getBooleanValue()); });
            this.put("isRoleScopesVisible", (n) -> { currentObject.setIsRoleScopesVisible(n.getBooleanValue()); });
            this.put("modifiedBy", (n) -> { currentObject.setModifiedBy(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the incompatibleAccessPackages property value. The  access packages whose assigned users are ineligible to be assigned this access package.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getIncompatibleAccessPackages() {
        return this._incompatibleAccessPackages;
    }
    /**
     * Gets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @return a group
     */
    @javax.annotation.Nullable
    public java.util.List<Group> getIncompatibleGroups() {
        return this._incompatibleGroups;
    }
    /**
     * Gets the isHidden property value. Whether the access package is hidden from the requestor.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHidden() {
        return this._isHidden;
    }
    /**
     * Gets the isRoleScopesVisible property value. Indicates whether role scopes are visible.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRoleScopesVisible() {
        return this._isRoleScopesVisible;
    }
    /**
     * Gets the modifiedBy property value. The userPrincipalName of the user who last modified this resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModifiedBy() {
        return this._modifiedBy;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessPackageAssignmentPolicies", this.getAccessPackageAssignmentPolicies());
        writer.writeObjectValue("accessPackageCatalog", this.getAccessPackageCatalog());
        writer.writeCollectionOfObjectValues("accessPackageResourceRoleScopes", this.getAccessPackageResourceRoleScopes());
        writer.writeCollectionOfObjectValues("accessPackagesIncompatibleWith", this.getAccessPackagesIncompatibleWith());
        writer.writeStringValue("catalogId", this.getCatalogId());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("incompatibleAccessPackages", this.getIncompatibleAccessPackages());
        writer.writeCollectionOfObjectValues("incompatibleGroups", this.getIncompatibleGroups());
        writer.writeBooleanValue("isHidden", this.getIsHidden());
        writer.writeBooleanValue("isRoleScopesVisible", this.getIsRoleScopesVisible());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
    }
    /**
     * Sets the accessPackageAssignmentPolicies property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackageAssignmentPolicies property.
     * @return a void
     */
    public void setAccessPackageAssignmentPolicies(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this._accessPackageAssignmentPolicies = value;
    }
    /**
     * Sets the accessPackageCatalog property value. Read-only. Nullable.
     * @param value Value to set for the accessPackageCatalog property.
     * @return a void
     */
    public void setAccessPackageCatalog(@javax.annotation.Nullable final AccessPackageCatalog value) {
        this._accessPackageCatalog = value;
    }
    /**
     * Sets the accessPackageResourceRoleScopes property value. Nullable.
     * @param value Value to set for the accessPackageResourceRoleScopes property.
     * @return a void
     */
    public void setAccessPackageResourceRoleScopes(@javax.annotation.Nullable final java.util.List<AccessPackageResourceRoleScope> value) {
        this._accessPackageResourceRoleScopes = value;
    }
    /**
     * Sets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @param value Value to set for the accessPackagesIncompatibleWith property.
     * @return a void
     */
    public void setAccessPackagesIncompatibleWith(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this._accessPackagesIncompatibleWith = value;
    }
    /**
     * Sets the catalogId property value. Identifier of the access package catalog referencing this access package. Read-only.
     * @param value Value to set for the catalogId property.
     * @return a void
     */
    public void setCatalogId(@javax.annotation.Nullable final String value) {
        this._catalogId = value;
    }
    /**
     * Sets the createdBy property value. The userPrincipalName of the user or identity of the subject who created this resource. Read-only.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final String value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the access package.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the access package. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the incompatibleAccessPackages property value. The  access packages whose assigned users are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleAccessPackages property.
     * @return a void
     */
    public void setIncompatibleAccessPackages(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this._incompatibleAccessPackages = value;
    }
    /**
     * Sets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleGroups property.
     * @return a void
     */
    public void setIncompatibleGroups(@javax.annotation.Nullable final java.util.List<Group> value) {
        this._incompatibleGroups = value;
    }
    /**
     * Sets the isHidden property value. Whether the access package is hidden from the requestor.
     * @param value Value to set for the isHidden property.
     * @return a void
     */
    public void setIsHidden(@javax.annotation.Nullable final Boolean value) {
        this._isHidden = value;
    }
    /**
     * Sets the isRoleScopesVisible property value. Indicates whether role scopes are visible.
     * @param value Value to set for the isRoleScopesVisible property.
     * @return a void
     */
    public void setIsRoleScopesVisible(@javax.annotation.Nullable final Boolean value) {
        this._isRoleScopesVisible = value;
    }
    /**
     * Sets the modifiedBy property value. The userPrincipalName of the user who last modified this resource. Read-only.
     * @param value Value to set for the modifiedBy property.
     * @return a void
     */
    public void setModifiedBy(@javax.annotation.Nullable final String value) {
        this._modifiedBy = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
}
