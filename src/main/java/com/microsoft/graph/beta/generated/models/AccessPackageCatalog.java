package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageCatalog extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageCatalog} and sets the default values.
     */
    public AccessPackageCatalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageCatalog}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageCatalog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageCatalog();
    }
    /**
     * Gets the accessPackageCustomWorkflowExtensions property value. The attributes of a logic app, which can be called at various stages of an access package request and assignment cycle.
     * @return a {@link java.util.List<CustomCalloutExtension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomCalloutExtension> getAccessPackageCustomWorkflowExtensions() {
        return this.backingStore.get("accessPackageCustomWorkflowExtensions");
    }
    /**
     * Gets the accessPackageResourceRoles property value. The roles in each resource in a catalog. Read-only.
     * @return a {@link java.util.List<AccessPackageResourceRole>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getAccessPackageResourceRoles() {
        return this.backingStore.get("accessPackageResourceRoles");
    }
    /**
     * Gets the accessPackageResources property value. The accessPackageResources property
     * @return a {@link java.util.List<AccessPackageResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResource> getAccessPackageResources() {
        return this.backingStore.get("accessPackageResources");
    }
    /**
     * Gets the accessPackageResourceScopes property value. The accessPackageResourceScopes property
     * @return a {@link java.util.List<AccessPackageResourceScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getAccessPackageResourceScopes() {
        return this.backingStore.get("accessPackageResourceScopes");
    }
    /**
     * Gets the accessPackages property value. The access packages in this catalog. Read-only. Nullable. Supports $expand.
     * @return a {@link java.util.List<AccessPackage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this.backingStore.get("accessPackages");
    }
    /**
     * Gets the catalogStatus property value. Has the value Published if the access packages are available for management.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogStatus() {
        return this.backingStore.get("catalogStatus");
    }
    /**
     * Gets the catalogType property value. One of UserManaged or ServiceDefault.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogType() {
        return this.backingStore.get("catalogType");
    }
    /**
     * Gets the createdBy property value. UPN of the user who created this resource. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customAccessPackageWorkflowExtensions property value. The customAccessPackageWorkflowExtensions property
     * @return a {@link java.util.List<CustomAccessPackageWorkflowExtension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomAccessPackageWorkflowExtension> getCustomAccessPackageWorkflowExtensions() {
        return this.backingStore.get("customAccessPackageWorkflowExtensions");
    }
    /**
     * Gets the description property value. The description of the access package catalog.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the access package catalog. Supports $filter (eq, contains).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternallyVisible() {
        return this.backingStore.get("isExternallyVisible");
    }
    /**
     * Gets the modifiedBy property value. The UPN of the user who last modified this resource. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModifiedBy() {
        return this.backingStore.get("modifiedBy");
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the uniqueName property value. The uniqueName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueName() {
        return this.backingStore.get("uniqueName");
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
        writer.writeStringValue("uniqueName", this.getUniqueName());
    }
    /**
     * Sets the accessPackageCustomWorkflowExtensions property value. The attributes of a logic app, which can be called at various stages of an access package request and assignment cycle.
     * @param value Value to set for the accessPackageCustomWorkflowExtensions property.
     */
    public void setAccessPackageCustomWorkflowExtensions(@jakarta.annotation.Nullable final java.util.List<CustomCalloutExtension> value) {
        this.backingStore.set("accessPackageCustomWorkflowExtensions", value);
    }
    /**
     * Sets the accessPackageResourceRoles property value. The roles in each resource in a catalog. Read-only.
     * @param value Value to set for the accessPackageResourceRoles property.
     */
    public void setAccessPackageResourceRoles(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this.backingStore.set("accessPackageResourceRoles", value);
    }
    /**
     * Sets the accessPackageResources property value. The accessPackageResources property
     * @param value Value to set for the accessPackageResources property.
     */
    public void setAccessPackageResources(@jakarta.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.backingStore.set("accessPackageResources", value);
    }
    /**
     * Sets the accessPackageResourceScopes property value. The accessPackageResourceScopes property
     * @param value Value to set for the accessPackageResourceScopes property.
     */
    public void setAccessPackageResourceScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this.backingStore.set("accessPackageResourceScopes", value);
    }
    /**
     * Sets the accessPackages property value. The access packages in this catalog. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackages property.
     */
    public void setAccessPackages(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.backingStore.set("accessPackages", value);
    }
    /**
     * Sets the catalogStatus property value. Has the value Published if the access packages are available for management.
     * @param value Value to set for the catalogStatus property.
     */
    public void setCatalogStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogStatus", value);
    }
    /**
     * Sets the catalogType property value. One of UserManaged or ServiceDefault.
     * @param value Value to set for the catalogType property.
     */
    public void setCatalogType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogType", value);
    }
    /**
     * Sets the createdBy property value. UPN of the user who created this resource. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customAccessPackageWorkflowExtensions property value. The customAccessPackageWorkflowExtensions property
     * @param value Value to set for the customAccessPackageWorkflowExtensions property.
     */
    public void setCustomAccessPackageWorkflowExtensions(@jakarta.annotation.Nullable final java.util.List<CustomAccessPackageWorkflowExtension> value) {
        this.backingStore.set("customAccessPackageWorkflowExtensions", value);
    }
    /**
     * Sets the description property value. The description of the access package catalog.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the access package catalog. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @param value Value to set for the isExternallyVisible property.
     */
    public void setIsExternallyVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExternallyVisible", value);
    }
    /**
     * Sets the modifiedBy property value. The UPN of the user who last modified this resource. Read-only.
     * @param value Value to set for the modifiedBy property.
     */
    public void setModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("modifiedBy", value);
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the uniqueName property value. The uniqueName property
     * @param value Value to set for the uniqueName property.
     */
    public void setUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueName", value);
    }
}
