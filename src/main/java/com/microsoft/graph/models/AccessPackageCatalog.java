package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageCatalog extends Entity implements Parsable {
    /** The roles in each resource in a catalog. Read-only. */
    private java.util.List<AccessPackageResourceRole> _accessPackageResourceRoles;
    /** The accessPackageResources property */
    private java.util.List<AccessPackageResource> _accessPackageResources;
    /** The accessPackageResourceScopes property */
    private java.util.List<AccessPackageResourceScope> _accessPackageResourceScopes;
    /** The access packages in this catalog. Read-only. Nullable. Supports $expand. */
    private java.util.List<AccessPackage> _accessPackages;
    /** Has the value Published if the access packages are available for management. */
    private String _catalogStatus;
    /** One of UserManaged or ServiceDefault. */
    private String _catalogType;
    /** UPN of the user who created this resource. Read-only. */
    private String _createdBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The customAccessPackageWorkflowExtensions property */
    private java.util.List<CustomAccessPackageWorkflowExtension> _customAccessPackageWorkflowExtensions;
    /** The description of the access package catalog. */
    private String _description;
    /** The display name of the access package catalog. Supports $filter (eq, contains). */
    private String _displayName;
    /** Whether the access packages in this catalog can be requested by users outside of the tenant. */
    private Boolean _isExternallyVisible;
    /** The UPN of the user who last modified this resource. Read-only. */
    private String _modifiedBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _modifiedDateTime;
    /**
     * Instantiates a new accessPackageCatalog and sets the default values.
     * @return a void
     */
    public AccessPackageCatalog() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageCatalog");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nonnull
    public static AccessPackageCatalog createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageCatalog();
    }
    /**
     * Gets the accessPackageResourceRoles property value. The roles in each resource in a catalog. Read-only.
     * @return a accessPackageResourceRole
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getAccessPackageResourceRoles() {
        return this._accessPackageResourceRoles;
    }
    /**
     * Gets the accessPackageResources property value. The accessPackageResources property
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResource> getAccessPackageResources() {
        return this._accessPackageResources;
    }
    /**
     * Gets the accessPackageResourceScopes property value. The accessPackageResourceScopes property
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getAccessPackageResourceScopes() {
        return this._accessPackageResourceScopes;
    }
    /**
     * Gets the accessPackages property value. The access packages in this catalog. Read-only. Nullable. Supports $expand.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this._accessPackages;
    }
    /**
     * Gets the catalogStatus property value. Has the value Published if the access packages are available for management.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCatalogStatus() {
        return this._catalogStatus;
    }
    /**
     * Gets the catalogType property value. One of UserManaged or ServiceDefault.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCatalogType() {
        return this._catalogType;
    }
    /**
     * Gets the createdBy property value. UPN of the user who created this resource. Read-only.
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
     * Gets the customAccessPackageWorkflowExtensions property value. The customAccessPackageWorkflowExtensions property
     * @return a customAccessPackageWorkflowExtension
     */
    @javax.annotation.Nullable
    public java.util.List<CustomAccessPackageWorkflowExtension> getCustomAccessPackageWorkflowExtensions() {
        return this._customAccessPackageWorkflowExtensions;
    }
    /**
     * Gets the description property value. The description of the access package catalog.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the access package catalog. Supports $filter (eq, contains).
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
        final AccessPackageCatalog currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackageResourceRoles", (n) -> { currentObject.setAccessPackageResourceRoles(n.getCollectionOfObjectValues(AccessPackageResourceRole::createFromDiscriminatorValue)); });
            this.put("accessPackageResources", (n) -> { currentObject.setAccessPackageResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
            this.put("accessPackageResourceScopes", (n) -> { currentObject.setAccessPackageResourceScopes(n.getCollectionOfObjectValues(AccessPackageResourceScope::createFromDiscriminatorValue)); });
            this.put("accessPackages", (n) -> { currentObject.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
            this.put("catalogStatus", (n) -> { currentObject.setCatalogStatus(n.getStringValue()); });
            this.put("catalogType", (n) -> { currentObject.setCatalogType(n.getStringValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("customAccessPackageWorkflowExtensions", (n) -> { currentObject.setCustomAccessPackageWorkflowExtensions(n.getCollectionOfObjectValues(CustomAccessPackageWorkflowExtension::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isExternallyVisible", (n) -> { currentObject.setIsExternallyVisible(n.getBooleanValue()); });
            this.put("modifiedBy", (n) -> { currentObject.setModifiedBy(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExternallyVisible() {
        return this._isExternallyVisible;
    }
    /**
     * Gets the modifiedBy property value. The UPN of the user who last modified this resource. Read-only.
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
        writer.writeCollectionOfObjectValues("accessPackageResourceRoles", this.getAccessPackageResourceRoles());
        writer.writeCollectionOfObjectValues("accessPackageResources", this.getAccessPackageResources());
        writer.writeCollectionOfObjectValues("accessPackageResourceScopes", this.getAccessPackageResourceScopes());
        writer.writeCollectionOfObjectValues("accessPackages", this.getAccessPackages());
        writer.writeStringValue("catalogStatus", this.getCatalogStatus());
        writer.writeStringValue("catalogType", this.getCatalogType());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customAccessPackageWorkflowExtensions", this.getCustomAccessPackageWorkflowExtensions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isExternallyVisible", this.getIsExternallyVisible());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
    }
    /**
     * Sets the accessPackageResourceRoles property value. The roles in each resource in a catalog. Read-only.
     * @param value Value to set for the accessPackageResourceRoles property.
     * @return a void
     */
    public void setAccessPackageResourceRoles(@javax.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this._accessPackageResourceRoles = value;
    }
    /**
     * Sets the accessPackageResources property value. The accessPackageResources property
     * @param value Value to set for the accessPackageResources property.
     * @return a void
     */
    public void setAccessPackageResources(@javax.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this._accessPackageResources = value;
    }
    /**
     * Sets the accessPackageResourceScopes property value. The accessPackageResourceScopes property
     * @param value Value to set for the accessPackageResourceScopes property.
     * @return a void
     */
    public void setAccessPackageResourceScopes(@javax.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this._accessPackageResourceScopes = value;
    }
    /**
     * Sets the accessPackages property value. The access packages in this catalog. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackages property.
     * @return a void
     */
    public void setAccessPackages(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this._accessPackages = value;
    }
    /**
     * Sets the catalogStatus property value. Has the value Published if the access packages are available for management.
     * @param value Value to set for the catalogStatus property.
     * @return a void
     */
    public void setCatalogStatus(@javax.annotation.Nullable final String value) {
        this._catalogStatus = value;
    }
    /**
     * Sets the catalogType property value. One of UserManaged or ServiceDefault.
     * @param value Value to set for the catalogType property.
     * @return a void
     */
    public void setCatalogType(@javax.annotation.Nullable final String value) {
        this._catalogType = value;
    }
    /**
     * Sets the createdBy property value. UPN of the user who created this resource. Read-only.
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
     * Sets the customAccessPackageWorkflowExtensions property value. The customAccessPackageWorkflowExtensions property
     * @param value Value to set for the customAccessPackageWorkflowExtensions property.
     * @return a void
     */
    public void setCustomAccessPackageWorkflowExtensions(@javax.annotation.Nullable final java.util.List<CustomAccessPackageWorkflowExtension> value) {
        this._customAccessPackageWorkflowExtensions = value;
    }
    /**
     * Sets the description property value. The description of the access package catalog.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the access package catalog. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @param value Value to set for the isExternallyVisible property.
     * @return a void
     */
    public void setIsExternallyVisible(@javax.annotation.Nullable final Boolean value) {
        this._isExternallyVisible = value;
    }
    /**
     * Sets the modifiedBy property value. The UPN of the user who last modified this resource. Read-only.
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
