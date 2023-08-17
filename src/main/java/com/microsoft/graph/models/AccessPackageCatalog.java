package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageCatalog extends Entity implements Parsable {
    /**
     * The attributes of a logic app, which can be called at various stages of an access package request and assignment cycle.
     */
    private java.util.List<CustomCalloutExtension> accessPackageCustomWorkflowExtensions;
    /**
     * The roles in each resource in a catalog. Read-only.
     */
    private java.util.List<AccessPackageResourceRole> accessPackageResourceRoles;
    /**
     * The accessPackageResources property
     */
    private java.util.List<AccessPackageResource> accessPackageResources;
    /**
     * The accessPackageResourceScopes property
     */
    private java.util.List<AccessPackageResourceScope> accessPackageResourceScopes;
    /**
     * The access packages in this catalog. Read-only. Nullable. Supports $expand.
     */
    private java.util.List<AccessPackage> accessPackages;
    /**
     * Has the value Published if the access packages are available for management.
     */
    private String catalogStatus;
    /**
     * One of UserManaged or ServiceDefault.
     */
    private String catalogType;
    /**
     * UPN of the user who created this resource. Read-only.
     */
    private String createdBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The customAccessPackageWorkflowExtensions property
     */
    private java.util.List<CustomAccessPackageWorkflowExtension> customAccessPackageWorkflowExtensions;
    /**
     * The description of the access package catalog.
     */
    private String description;
    /**
     * The display name of the access package catalog. Supports $filter (eq, contains).
     */
    private String displayName;
    /**
     * Whether the access packages in this catalog can be requested by users outside of the tenant.
     */
    private Boolean isExternallyVisible;
    /**
     * The UPN of the user who last modified this resource. Read-only.
     */
    private String modifiedBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Instantiates a new accessPackageCatalog and sets the default values.
     */
    public AccessPackageCatalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageCatalog
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageCatalog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageCatalog();
    }
    /**
     * Gets the accessPackageCustomWorkflowExtensions property value. The attributes of a logic app, which can be called at various stages of an access package request and assignment cycle.
     * @return a customCalloutExtension
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomCalloutExtension> getAccessPackageCustomWorkflowExtensions() {
        return this.accessPackageCustomWorkflowExtensions;
    }
    /**
     * Gets the accessPackageResourceRoles property value. The roles in each resource in a catalog. Read-only.
     * @return a accessPackageResourceRole
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getAccessPackageResourceRoles() {
        return this.accessPackageResourceRoles;
    }
    /**
     * Gets the accessPackageResources property value. The accessPackageResources property
     * @return a accessPackageResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResource> getAccessPackageResources() {
        return this.accessPackageResources;
    }
    /**
     * Gets the accessPackageResourceScopes property value. The accessPackageResourceScopes property
     * @return a accessPackageResourceScope
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getAccessPackageResourceScopes() {
        return this.accessPackageResourceScopes;
    }
    /**
     * Gets the accessPackages property value. The access packages in this catalog. Read-only. Nullable. Supports $expand.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this.accessPackages;
    }
    /**
     * Gets the catalogStatus property value. Has the value Published if the access packages are available for management.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCatalogStatus() {
        return this.catalogStatus;
    }
    /**
     * Gets the catalogType property value. One of UserManaged or ServiceDefault.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCatalogType() {
        return this.catalogType;
    }
    /**
     * Gets the createdBy property value. UPN of the user who created this resource. Read-only.
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
     * Gets the customAccessPackageWorkflowExtensions property value. The customAccessPackageWorkflowExtensions property
     * @return a customAccessPackageWorkflowExtension
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomAccessPackageWorkflowExtension> getCustomAccessPackageWorkflowExtensions() {
        return this.customAccessPackageWorkflowExtensions;
    }
    /**
     * Gets the description property value. The description of the access package catalog.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the access package catalog. Supports $filter (eq, contains).
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
        deserializerMap.put("accessPackageCustomWorkflowExtensions", (n) -> { this.setAccessPackageCustomWorkflowExtensions(n.getCollectionOfObjectValues(CustomCalloutExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceRoles", (n) -> { this.setAccessPackageResourceRoles(n.getCollectionOfObjectValues(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResources", (n) -> { this.setAccessPackageResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceScopes", (n) -> { this.setAccessPackageResourceScopes(n.getCollectionOfObjectValues(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackages", (n) -> { this.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogStatus", (n) -> { this.setCatalogStatus(n.getStringValue()); });
        deserializerMap.put("catalogType", (n) -> { this.setCatalogType(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customAccessPackageWorkflowExtensions", (n) -> { this.setCustomAccessPackageWorkflowExtensions(n.getCollectionOfObjectValues(CustomAccessPackageWorkflowExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isExternallyVisible", (n) -> { this.setIsExternallyVisible(n.getBooleanValue()); });
        deserializerMap.put("modifiedBy", (n) -> { this.setModifiedBy(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternallyVisible() {
        return this.isExternallyVisible;
    }
    /**
     * Gets the modifiedBy property value. The UPN of the user who last modified this resource. Read-only.
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
        writer.writeCollectionOfObjectValues("accessPackageCustomWorkflowExtensions", this.getAccessPackageCustomWorkflowExtensions());
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
     * Sets the accessPackageCustomWorkflowExtensions property value. The attributes of a logic app, which can be called at various stages of an access package request and assignment cycle.
     * @param value Value to set for the accessPackageCustomWorkflowExtensions property.
     */
    public void setAccessPackageCustomWorkflowExtensions(@jakarta.annotation.Nullable final java.util.List<CustomCalloutExtension> value) {
        this.accessPackageCustomWorkflowExtensions = value;
    }
    /**
     * Sets the accessPackageResourceRoles property value. The roles in each resource in a catalog. Read-only.
     * @param value Value to set for the accessPackageResourceRoles property.
     */
    public void setAccessPackageResourceRoles(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this.accessPackageResourceRoles = value;
    }
    /**
     * Sets the accessPackageResources property value. The accessPackageResources property
     * @param value Value to set for the accessPackageResources property.
     */
    public void setAccessPackageResources(@jakarta.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.accessPackageResources = value;
    }
    /**
     * Sets the accessPackageResourceScopes property value. The accessPackageResourceScopes property
     * @param value Value to set for the accessPackageResourceScopes property.
     */
    public void setAccessPackageResourceScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this.accessPackageResourceScopes = value;
    }
    /**
     * Sets the accessPackages property value. The access packages in this catalog. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackages property.
     */
    public void setAccessPackages(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.accessPackages = value;
    }
    /**
     * Sets the catalogStatus property value. Has the value Published if the access packages are available for management.
     * @param value Value to set for the catalogStatus property.
     */
    public void setCatalogStatus(@jakarta.annotation.Nullable final String value) {
        this.catalogStatus = value;
    }
    /**
     * Sets the catalogType property value. One of UserManaged or ServiceDefault.
     * @param value Value to set for the catalogType property.
     */
    public void setCatalogType(@jakarta.annotation.Nullable final String value) {
        this.catalogType = value;
    }
    /**
     * Sets the createdBy property value. UPN of the user who created this resource. Read-only.
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
     * Sets the customAccessPackageWorkflowExtensions property value. The customAccessPackageWorkflowExtensions property
     * @param value Value to set for the customAccessPackageWorkflowExtensions property.
     */
    public void setCustomAccessPackageWorkflowExtensions(@jakarta.annotation.Nullable final java.util.List<CustomAccessPackageWorkflowExtension> value) {
        this.customAccessPackageWorkflowExtensions = value;
    }
    /**
     * Sets the description property value. The description of the access package catalog.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the access package catalog. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @param value Value to set for the isExternallyVisible property.
     */
    public void setIsExternallyVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternallyVisible = value;
    }
    /**
     * Sets the modifiedBy property value. The UPN of the user who last modified this resource. Read-only.
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
