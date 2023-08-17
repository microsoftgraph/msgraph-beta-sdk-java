package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackage extends Entity implements Parsable {
    /**
     * Read-only. Nullable. Supports $expand.
     */
    private java.util.List<AccessPackageAssignmentPolicy> accessPackageAssignmentPolicies;
    /**
     * The accessPackageCatalog property
     */
    private AccessPackageCatalog accessPackageCatalog;
    /**
     * The accessPackageResourceRoleScopes property
     */
    private java.util.List<AccessPackageResourceRoleScope> accessPackageResourceRoleScopes;
    /**
     * The access packages that are incompatible with this package. Read-only.
     */
    private java.util.List<AccessPackage> accessPackagesIncompatibleWith;
    /**
     * Identifier of the access package catalog referencing this access package. Read-only.
     */
    private String catalogId;
    /**
     * The userPrincipalName of the user or identity of the subject who created this resource. Read-only.
     */
    private String createdBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of the access package.
     */
    private String description;
    /**
     * The display name of the access package. Supports $filter (eq, contains).
     */
    private String displayName;
    /**
     * The  access packages whose assigned users are ineligible to be assigned this access package.
     */
    private java.util.List<AccessPackage> incompatibleAccessPackages;
    /**
     * The groups whose members are ineligible to be assigned this access package.
     */
    private java.util.List<Group> incompatibleGroups;
    /**
     * Whether the access package is hidden from the requestor.
     */
    private Boolean isHidden;
    /**
     * Indicates whether role scopes are visible.
     */
    private Boolean isRoleScopesVisible;
    /**
     * The userPrincipalName of the user who last modified this resource. Read-only.
     */
    private String modifiedBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Instantiates a new accessPackage and sets the default values.
     */
    public AccessPackage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackage
     */
    @jakarta.annotation.Nonnull
    public static AccessPackage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackage();
    }
    /**
     * Gets the accessPackageAssignmentPolicies property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAccessPackageAssignmentPolicies() {
        return this.accessPackageAssignmentPolicies;
    }
    /**
     * Gets the accessPackageCatalog property value. The accessPackageCatalog property
     * @return a accessPackageCatalog
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalog getAccessPackageCatalog() {
        return this.accessPackageCatalog;
    }
    /**
     * Gets the accessPackageResourceRoleScopes property value. The accessPackageResourceRoleScopes property
     * @return a accessPackageResourceRoleScope
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRoleScope> getAccessPackageResourceRoleScopes() {
        return this.accessPackageResourceRoleScopes;
    }
    /**
     * Gets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackagesIncompatibleWith() {
        return this.accessPackagesIncompatibleWith;
    }
    /**
     * Gets the catalogId property value. Identifier of the access package catalog referencing this access package. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCatalogId() {
        return this.catalogId;
    }
    /**
     * Gets the createdBy property value. The userPrincipalName of the user or identity of the subject who created this resource. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of the access package.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the access package. Supports $filter (eq, contains).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageAssignmentPolicies", (n) -> { this.setAccessPackageAssignmentPolicies(n.getCollectionOfObjectValues(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageCatalog", (n) -> { this.setAccessPackageCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceRoleScopes", (n) -> { this.setAccessPackageResourceRoleScopes(n.getCollectionOfObjectValues(AccessPackageResourceRoleScope::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackagesIncompatibleWith", (n) -> { this.setAccessPackagesIncompatibleWith(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogId", (n) -> { this.setCatalogId(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("incompatibleAccessPackages", (n) -> { this.setIncompatibleAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("incompatibleGroups", (n) -> { this.setIncompatibleGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("isHidden", (n) -> { this.setIsHidden(n.getBooleanValue()); });
        deserializerMap.put("isRoleScopesVisible", (n) -> { this.setIsRoleScopesVisible(n.getBooleanValue()); });
        deserializerMap.put("modifiedBy", (n) -> { this.setModifiedBy(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompatibleAccessPackages property value. The  access packages whose assigned users are ineligible to be assigned this access package.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getIncompatibleAccessPackages() {
        return this.incompatibleAccessPackages;
    }
    /**
     * Gets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @return a group
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getIncompatibleGroups() {
        return this.incompatibleGroups;
    }
    /**
     * Gets the isHidden property value. Whether the access package is hidden from the requestor.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHidden() {
        return this.isHidden;
    }
    /**
     * Gets the isRoleScopesVisible property value. Indicates whether role scopes are visible.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRoleScopesVisible() {
        return this.isRoleScopesVisible;
    }
    /**
     * Gets the modifiedBy property value. The userPrincipalName of the user who last modified this resource. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccessPackageAssignmentPolicies(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this.accessPackageAssignmentPolicies = value;
    }
    /**
     * Sets the accessPackageCatalog property value. The accessPackageCatalog property
     * @param value Value to set for the accessPackageCatalog property.
     */
    public void setAccessPackageCatalog(@jakarta.annotation.Nullable final AccessPackageCatalog value) {
        this.accessPackageCatalog = value;
    }
    /**
     * Sets the accessPackageResourceRoleScopes property value. The accessPackageResourceRoleScopes property
     * @param value Value to set for the accessPackageResourceRoleScopes property.
     */
    public void setAccessPackageResourceRoleScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRoleScope> value) {
        this.accessPackageResourceRoleScopes = value;
    }
    /**
     * Sets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @param value Value to set for the accessPackagesIncompatibleWith property.
     */
    public void setAccessPackagesIncompatibleWith(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.accessPackagesIncompatibleWith = value;
    }
    /**
     * Sets the catalogId property value. Identifier of the access package catalog referencing this access package. Read-only.
     * @param value Value to set for the catalogId property.
     */
    public void setCatalogId(@jakarta.annotation.Nullable final String value) {
        this.catalogId = value;
    }
    /**
     * Sets the createdBy property value. The userPrincipalName of the user or identity of the subject who created this resource. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the access package.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the access package. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the incompatibleAccessPackages property value. The  access packages whose assigned users are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleAccessPackages property.
     */
    public void setIncompatibleAccessPackages(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.incompatibleAccessPackages = value;
    }
    /**
     * Sets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleGroups property.
     */
    public void setIncompatibleGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.incompatibleGroups = value;
    }
    /**
     * Sets the isHidden property value. Whether the access package is hidden from the requestor.
     * @param value Value to set for the isHidden property.
     */
    public void setIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.isHidden = value;
    }
    /**
     * Sets the isRoleScopesVisible property value. Indicates whether role scopes are visible.
     * @param value Value to set for the isRoleScopesVisible property.
     */
    public void setIsRoleScopesVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.isRoleScopesVisible = value;
    }
    /**
     * Sets the modifiedBy property value. The userPrincipalName of the user who last modified this resource. Read-only.
     * @param value Value to set for the modifiedBy property.
     */
    public void setModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.modifiedBy = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
}
