package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationModule extends Entity implements Parsable {
    /**
     * The display name of the user that created the module.
     */
    private IdentitySet createdBy;
    /**
     * Date time the module was created.  The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description of the module.
     */
    private String description;
    /**
     * Name of the module.
     */
    private String displayName;
    /**
     * Indicates whether the module is pinned or not.
     */
    private Boolean isPinned;
    /**
     * The last user that modified the module.
     */
    private IdentitySet lastModifiedBy;
    /**
     * Date time the module was last modified.  The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Learning objects that are associated with this module.  Only teachers can modify this list. Nullable.
     */
    private java.util.List<EducationModuleResource> resources;
    /**
     * Folder URL where all the file resources for this module are stored.
     */
    private String resourcesFolderUrl;
    /**
     * Status of the module.  You can't use a PATCH operation to update this value. Possible values are: draft and published.
     */
    private EducationModuleStatus status;
    /**
     * Instantiates a new educationModule and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public EducationModule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationModule
     */
    @jakarta.annotation.Nonnull
    public static EducationModule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationModule();
    }
    /**
     * Gets the createdBy property value. The display name of the user that created the module.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date time the module was created.  The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description of the module.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Name of the module.
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
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isPinned", (n) -> { this.setIsPinned(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(EducationModuleResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourcesFolderUrl", (n) -> { this.setResourcesFolderUrl(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EducationModuleStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isPinned property value. Indicates whether the module is pinned or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPinned() {
        return this.isPinned;
    }
    /**
     * Gets the lastModifiedBy property value. The last user that modified the module.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date time the module was last modified.  The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the resources property value. Learning objects that are associated with this module.  Only teachers can modify this list. Nullable.
     * @return a educationModuleResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationModuleResource> getResources() {
        return this.resources;
    }
    /**
     * Gets the resourcesFolderUrl property value. Folder URL where all the file resources for this module are stored.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourcesFolderUrl() {
        return this.resourcesFolderUrl;
    }
    /**
     * Gets the status property value. Status of the module.  You can't use a PATCH operation to update this value. Possible values are: draft and published.
     * @return a educationModuleStatus
     */
    @jakarta.annotation.Nullable
    public EducationModuleStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isPinned", this.getIsPinned());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
    }
    /**
     * Sets the createdBy property value. The display name of the user that created the module.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date time the module was created.  The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the module.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Name of the module.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isPinned property value. Indicates whether the module is pinned or not.
     * @param value Value to set for the isPinned property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsPinned(@jakarta.annotation.Nullable final Boolean value) {
        this.isPinned = value;
    }
    /**
     * Sets the lastModifiedBy property value. The last user that modified the module.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date time the module was last modified.  The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the resources property value. Learning objects that are associated with this module.  Only teachers can modify this list. Nullable.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResources(@jakarta.annotation.Nullable final java.util.List<EducationModuleResource> value) {
        this.resources = value;
    }
    /**
     * Sets the resourcesFolderUrl property value. Folder URL where all the file resources for this module are stored.
     * @param value Value to set for the resourcesFolderUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourcesFolderUrl(@jakarta.annotation.Nullable final String value) {
        this.resourcesFolderUrl = value;
    }
    /**
     * Sets the status property value. Status of the module.  You can't use a PATCH operation to update this value. Possible values are: draft and published.
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final EducationModuleStatus value) {
        this.status = value;
    }
}
