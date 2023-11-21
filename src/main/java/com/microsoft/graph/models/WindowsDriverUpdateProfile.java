package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Driver Update Profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDriverUpdateProfile extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsDriverUpdateProfile and sets the default values.
     */
    public WindowsDriverUpdateProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDriverUpdateProfile
     */
    @jakarta.annotation.Nonnull
    public static WindowsDriverUpdateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDriverUpdateProfile();
    }
    /**
     * Gets the approvalType property value. An enum type to represent approval type of a driver update profile.
     * @return a DriverUpdateProfileApprovalType
     */
    @jakarta.annotation.Nullable
    public DriverUpdateProfileApprovalType getApprovalType() {
        return this.backingStore.get("approvalType");
    }
    /**
     * Gets the assignments property value. The list of group assignments of the profile.
     * @return a java.util.List<WindowsDriverUpdateProfileAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDriverUpdateProfileAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The date time that the profile was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deploymentDeferralInDays property value. Deployment deferral settings in days, only applicable when ApprovalType is set to automatic approval.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeploymentDeferralInDays() {
        return this.backingStore.get("deploymentDeferralInDays");
    }
    /**
     * Gets the description property value. The description of the profile which is specified by the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceReporting property value. Number of devices reporting for this profile
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceReporting() {
        return this.backingStore.get("deviceReporting");
    }
    /**
     * Gets the displayName property value. The display name for the profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the driverInventories property value. Driver inventories for this profile.
     * @return a java.util.List<WindowsDriverUpdateInventory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDriverUpdateInventory> getDriverInventories() {
        return this.backingStore.get("driverInventories");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalType", (n) -> { this.setApprovalType(n.getEnumValue(DriverUpdateProfileApprovalType.class)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(WindowsDriverUpdateProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentDeferralInDays", (n) -> { this.setDeploymentDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceReporting", (n) -> { this.setDeviceReporting(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("driverInventories", (n) -> { this.setDriverInventories(n.getCollectionOfObjectValues(WindowsDriverUpdateInventory::createFromDiscriminatorValue)); });
        deserializerMap.put("inventorySyncStatus", (n) -> { this.setInventorySyncStatus(n.getObjectValue(WindowsDriverUpdateProfileInventorySyncStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("newUpdates", (n) -> { this.setNewUpdates(n.getIntegerValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the inventorySyncStatus property value. Driver inventory sync status for this profile.
     * @return a WindowsDriverUpdateProfileInventorySyncStatus
     */
    @jakarta.annotation.Nullable
    public WindowsDriverUpdateProfileInventorySyncStatus getInventorySyncStatus() {
        return this.backingStore.get("inventorySyncStatus");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the newUpdates property value. Number of new driver updates available for this profile.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNewUpdates() {
        return this.backingStore.get("newUpdates");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Driver Update entity.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("approvalType", this.getApprovalType());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("deploymentDeferralInDays", this.getDeploymentDeferralInDays());
        writer.writeStringValue("description", this.getDescription());
        writer.writeIntegerValue("deviceReporting", this.getDeviceReporting());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("driverInventories", this.getDriverInventories());
        writer.writeObjectValue("inventorySyncStatus", this.getInventorySyncStatus());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("newUpdates", this.getNewUpdates());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the approvalType property value. An enum type to represent approval type of a driver update profile.
     * @param value Value to set for the approvalType property.
     */
    public void setApprovalType(@jakarta.annotation.Nullable final DriverUpdateProfileApprovalType value) {
        this.backingStore.set("approvalType", value);
    }
    /**
     * Sets the assignments property value. The list of group assignments of the profile.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<WindowsDriverUpdateProfileAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The date time that the profile was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deploymentDeferralInDays property value. Deployment deferral settings in days, only applicable when ApprovalType is set to automatic approval.
     * @param value Value to set for the deploymentDeferralInDays property.
     */
    public void setDeploymentDeferralInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deploymentDeferralInDays", value);
    }
    /**
     * Sets the description property value. The description of the profile which is specified by the user.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceReporting property value. Number of devices reporting for this profile
     * @param value Value to set for the deviceReporting property.
     */
    public void setDeviceReporting(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceReporting", value);
    }
    /**
     * Sets the displayName property value. The display name for the profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the driverInventories property value. Driver inventories for this profile.
     * @param value Value to set for the driverInventories property.
     */
    public void setDriverInventories(@jakarta.annotation.Nullable final java.util.List<WindowsDriverUpdateInventory> value) {
        this.backingStore.set("driverInventories", value);
    }
    /**
     * Sets the inventorySyncStatus property value. Driver inventory sync status for this profile.
     * @param value Value to set for the inventorySyncStatus property.
     */
    public void setInventorySyncStatus(@jakarta.annotation.Nullable final WindowsDriverUpdateProfileInventorySyncStatus value) {
        this.backingStore.set("inventorySyncStatus", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the newUpdates property value. Number of new driver updates available for this profile.
     * @param value Value to set for the newUpdates property.
     */
    public void setNewUpdates(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("newUpdates", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Driver Update entity.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
}
