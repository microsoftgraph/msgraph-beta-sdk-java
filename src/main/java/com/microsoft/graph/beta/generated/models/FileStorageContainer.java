package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileStorageContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link FileStorageContainer} and sets the default values.
     */
    public FileStorageContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileStorageContainer}
     */
    @jakarta.annotation.Nonnull
    public static FileStorageContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileStorageContainer();
    }
    /**
     * Gets the assignedSensitivityLabel property value. Sensitivity label assigned to the fileStorageContainer. Read-write.
     * @return a {@link AssignedLabel}
     */
    @jakarta.annotation.Nullable
    public AssignedLabel getAssignedSensitivityLabel() {
        return this.backingStore.get("assignedSensitivityLabel");
    }
    /**
     * Gets the columns property value. The set of custom structured metadata supported by the fileStorageContainer. Read-write.
     * @return a {@link java.util.List<ColumnDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this.backingStore.get("columns");
    }
    /**
     * Gets the containerTypeId property value. Container type ID of the fileStorageContainer. Each container must have only one container type. Read-only.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getContainerTypeId() {
        return this.backingStore.get("containerTypeId");
    }
    /**
     * Gets the createdDateTime property value. Date and time of the fileStorageContainer creation. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customProperties property value. Custom property collection for the fileStorageContainer. Read-write.
     * @return a {@link FileStorageContainerCustomPropertyDictionary}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerCustomPropertyDictionary getCustomProperties() {
        return this.backingStore.get("customProperties");
    }
    /**
     * Gets the description property value. Provides a user-visible description of the fileStorageContainer. Read-write.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the fileStorageContainer. Read-write.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the drive property value. The drive of the resource fileStorageContainer. Read-only.
     * @return a {@link Drive}
     */
    @jakarta.annotation.Nullable
    public Drive getDrive() {
        return this.backingStore.get("drive");
    }
    /**
     * Gets the externalGroupId property value. The externalGroupId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getExternalGroupId() {
        return this.backingStore.get("externalGroupId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedSensitivityLabel", (n) -> { this.setAssignedSensitivityLabel(n.getObjectValue(AssignedLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("containerTypeId", (n) -> { this.setContainerTypeId(n.getUUIDValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customProperties", (n) -> { this.setCustomProperties(n.getObjectValue(FileStorageContainerCustomPropertyDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("externalGroupId", (n) -> { this.setExternalGroupId(n.getUUIDValue()); });
        deserializerMap.put("isItemVersioningEnabled", (n) -> { this.setIsItemVersioningEnabled(n.getBooleanValue()); });
        deserializerMap.put("itemMajorVersionLimit", (n) -> { this.setItemMajorVersionLimit(n.getIntegerValue()); });
        deserializerMap.put("lockState", (n) -> { this.setLockState(n.getEnumValue(SiteLockState::forValue)); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("ownershipType", (n) -> { this.setOwnershipType(n.getEnumValue(FileStorageContainerOwnershipType::forValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
        deserializerMap.put("recycleBin", (n) -> { this.setRecycleBin(n.getObjectValue(RecycleBin::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FileStorageContainerStatus::forValue)); });
        deserializerMap.put("storageUsedInBytes", (n) -> { this.setStorageUsedInBytes(n.getLongValue()); });
        deserializerMap.put("viewpoint", (n) -> { this.setViewpoint(n.getObjectValue(FileStorageContainerViewpoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isItemVersioningEnabled property value. Indicates whether versioning is enabled for the fileStorageContainer. The setting is applicable to all items in the fileStorageContainer. Read-Write.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsItemVersioningEnabled() {
        return this.backingStore.get("isItemVersioningEnabled");
    }
    /**
     * Gets the itemMajorVersionLimit property value. Maximum number of major versions allowed for items in the fileStorageContainer. Read-write.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getItemMajorVersionLimit() {
        return this.backingStore.get("itemMajorVersionLimit");
    }
    /**
     * Gets the lockState property value. The lockState property
     * @return a {@link SiteLockState}
     */
    @jakarta.annotation.Nullable
    public SiteLockState getLockState() {
        return this.backingStore.get("lockState");
    }
    /**
     * Gets the owners property value. List of users who own the fileStorageContainer. Read-only.
     * @return a {@link java.util.List<UserIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserIdentity> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Gets the ownershipType property value. Ownership type of the fileStorageContainer.The possible values are: tenantOwned. Read-only.
     * @return a {@link FileStorageContainerOwnershipType}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerOwnershipType getOwnershipType() {
        return this.backingStore.get("ownershipType");
    }
    /**
     * Gets the permissions property value. The set of permissions for users in the fileStorageContainer. The permission for each user is set by the roles property. The possible values are 'reader', 'writer', 'manager', and 'owner'. Read-write.
     * @return a {@link java.util.List<Permission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the recycleBin property value. Recycle bin of the fileStorageContainer. Read-only.
     * @return a {@link RecycleBin}
     */
    @jakarta.annotation.Nullable
    public RecycleBin getRecycleBin() {
        return this.backingStore.get("recycleBin");
    }
    /**
     * Gets the status property value. Status of the fileStorageContainer. Containers are created as inactive and require activation. Inactive containers are subjected to automatic deletion in 24 hours. The possible values are: inactive, active. Read-only.
     * @return a {@link FileStorageContainerStatus}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the storageUsedInBytes property value. Storage used in the fileStorageContainer. In bytes. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getStorageUsedInBytes() {
        return this.backingStore.get("storageUsedInBytes");
    }
    /**
     * Gets the viewpoint property value. Data specific to the current user. Read-only.
     * @return a {@link FileStorageContainerViewpoint}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerViewpoint getViewpoint() {
        return this.backingStore.get("viewpoint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("assignedSensitivityLabel", this.getAssignedSensitivityLabel());
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeUUIDValue("containerTypeId", this.getContainerTypeId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("customProperties", this.getCustomProperties());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeUUIDValue("externalGroupId", this.getExternalGroupId());
        writer.writeBooleanValue("isItemVersioningEnabled", this.getIsItemVersioningEnabled());
        writer.writeIntegerValue("itemMajorVersionLimit", this.getItemMajorVersionLimit());
        writer.writeEnumValue("lockState", this.getLockState());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeEnumValue("ownershipType", this.getOwnershipType());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeObjectValue("recycleBin", this.getRecycleBin());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeLongValue("storageUsedInBytes", this.getStorageUsedInBytes());
        writer.writeObjectValue("viewpoint", this.getViewpoint());
    }
    /**
     * Sets the assignedSensitivityLabel property value. Sensitivity label assigned to the fileStorageContainer. Read-write.
     * @param value Value to set for the assignedSensitivityLabel property.
     */
    public void setAssignedSensitivityLabel(@jakarta.annotation.Nullable final AssignedLabel value) {
        this.backingStore.set("assignedSensitivityLabel", value);
    }
    /**
     * Sets the columns property value. The set of custom structured metadata supported by the fileStorageContainer. Read-write.
     * @param value Value to set for the columns property.
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("columns", value);
    }
    /**
     * Sets the containerTypeId property value. Container type ID of the fileStorageContainer. Each container must have only one container type. Read-only.
     * @param value Value to set for the containerTypeId property.
     */
    public void setContainerTypeId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("containerTypeId", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time of the fileStorageContainer creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customProperties property value. Custom property collection for the fileStorageContainer. Read-write.
     * @param value Value to set for the customProperties property.
     */
    public void setCustomProperties(@jakarta.annotation.Nullable final FileStorageContainerCustomPropertyDictionary value) {
        this.backingStore.set("customProperties", value);
    }
    /**
     * Sets the description property value. Provides a user-visible description of the fileStorageContainer. Read-write.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the fileStorageContainer. Read-write.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the drive property value. The drive of the resource fileStorageContainer. Read-only.
     * @param value Value to set for the drive property.
     */
    public void setDrive(@jakarta.annotation.Nullable final Drive value) {
        this.backingStore.set("drive", value);
    }
    /**
     * Sets the externalGroupId property value. The externalGroupId property
     * @param value Value to set for the externalGroupId property.
     */
    public void setExternalGroupId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("externalGroupId", value);
    }
    /**
     * Sets the isItemVersioningEnabled property value. Indicates whether versioning is enabled for the fileStorageContainer. The setting is applicable to all items in the fileStorageContainer. Read-Write.
     * @param value Value to set for the isItemVersioningEnabled property.
     */
    public void setIsItemVersioningEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isItemVersioningEnabled", value);
    }
    /**
     * Sets the itemMajorVersionLimit property value. Maximum number of major versions allowed for items in the fileStorageContainer. Read-write.
     * @param value Value to set for the itemMajorVersionLimit property.
     */
    public void setItemMajorVersionLimit(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("itemMajorVersionLimit", value);
    }
    /**
     * Sets the lockState property value. The lockState property
     * @param value Value to set for the lockState property.
     */
    public void setLockState(@jakarta.annotation.Nullable final SiteLockState value) {
        this.backingStore.set("lockState", value);
    }
    /**
     * Sets the owners property value. List of users who own the fileStorageContainer. Read-only.
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<UserIdentity> value) {
        this.backingStore.set("owners", value);
    }
    /**
     * Sets the ownershipType property value. Ownership type of the fileStorageContainer.The possible values are: tenantOwned. Read-only.
     * @param value Value to set for the ownershipType property.
     */
    public void setOwnershipType(@jakarta.annotation.Nullable final FileStorageContainerOwnershipType value) {
        this.backingStore.set("ownershipType", value);
    }
    /**
     * Sets the permissions property value. The set of permissions for users in the fileStorageContainer. The permission for each user is set by the roles property. The possible values are 'reader', 'writer', 'manager', and 'owner'. Read-write.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<Permission> value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the recycleBin property value. Recycle bin of the fileStorageContainer. Read-only.
     * @param value Value to set for the recycleBin property.
     */
    public void setRecycleBin(@jakarta.annotation.Nullable final RecycleBin value) {
        this.backingStore.set("recycleBin", value);
    }
    /**
     * Sets the status property value. Status of the fileStorageContainer. Containers are created as inactive and require activation. Inactive containers are subjected to automatic deletion in 24 hours. The possible values are: inactive, active. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FileStorageContainerStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the storageUsedInBytes property value. Storage used in the fileStorageContainer. In bytes. Read-only.
     * @param value Value to set for the storageUsedInBytes property.
     */
    public void setStorageUsedInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("storageUsedInBytes", value);
    }
    /**
     * Sets the viewpoint property value. Data specific to the current user. Read-only.
     * @param value Value to set for the viewpoint property.
     */
    public void setViewpoint(@jakarta.annotation.Nullable final FileStorageContainerViewpoint value) {
        this.backingStore.set("viewpoint", value);
    }
}
