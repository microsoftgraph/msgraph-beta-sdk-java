package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Driver Update Profile */
public class WindowsDriverUpdateProfile extends Entity implements Parsable {
    /** An enum type to represent approval type of a driver update profile. */
    private DriverUpdateProfileApprovalType _approvalType;
    /** The list of group assignments of the profile. */
    private java.util.List<WindowsDriverUpdateProfileAssignment> _assignments;
    /** The date time that the profile was created. */
    private OffsetDateTime _createdDateTime;
    /** Deployment deferral settings in days, only applicable when ApprovalType is set to automatic approval. */
    private Integer _deploymentDeferralInDays;
    /** The description of the profile which is specified by the user. */
    private String _description;
    /** Number of devices reporting for this profile */
    private Integer _deviceReporting;
    /** The display name for the profile. */
    private String _displayName;
    /** Driver inventories for this profile. */
    private java.util.List<WindowsDriverUpdateInventory> _driverInventories;
    /** Driver inventory sync status for this profile. */
    private WindowsDriverUpdateProfileInventorySyncStatus _inventorySyncStatus;
    /** The date time that the profile was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Number of new driver updates available for this profile. */
    private Integer _newUpdates;
    /** List of Scope Tags for this Driver Update entity. */
    private java.util.List<String> _roleScopeTagIds;
    /**
     * Instantiates a new windowsDriverUpdateProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDriverUpdateProfile() {
        super();
        this.setOdataType("#microsoft.graph.windowsDriverUpdateProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDriverUpdateProfile
     */
    @javax.annotation.Nonnull
    public static WindowsDriverUpdateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDriverUpdateProfile();
    }
    /**
     * Gets the approvalType property value. An enum type to represent approval type of a driver update profile.
     * @return a driverUpdateProfileApprovalType
     */
    @javax.annotation.Nullable
    public DriverUpdateProfileApprovalType getApprovalType() {
        return this._approvalType;
    }
    /**
     * Gets the assignments property value. The list of group assignments of the profile.
     * @return a windowsDriverUpdateProfileAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDriverUpdateProfileAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The date time that the profile was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deploymentDeferralInDays property value. Deployment deferral settings in days, only applicable when ApprovalType is set to automatic approval.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeploymentDeferralInDays() {
        return this._deploymentDeferralInDays;
    }
    /**
     * Gets the description property value. The description of the profile which is specified by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceReporting property value. Number of devices reporting for this profile
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceReporting() {
        return this._deviceReporting;
    }
    /**
     * Gets the displayName property value. The display name for the profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the driverInventories property value. Driver inventories for this profile.
     * @return a windowsDriverUpdateInventory
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDriverUpdateInventory> getDriverInventories() {
        return this._driverInventories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDriverUpdateProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalType", (n) -> { currentObject.setApprovalType(n.getEnumValue(DriverUpdateProfileApprovalType.class)); });
        deserializerMap.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(WindowsDriverUpdateProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentDeferralInDays", (n) -> { currentObject.setDeploymentDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceReporting", (n) -> { currentObject.setDeviceReporting(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("driverInventories", (n) -> { currentObject.setDriverInventories(n.getCollectionOfObjectValues(WindowsDriverUpdateInventory::createFromDiscriminatorValue)); });
        deserializerMap.put("inventorySyncStatus", (n) -> { currentObject.setInventorySyncStatus(n.getObjectValue(WindowsDriverUpdateProfileInventorySyncStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("newUpdates", (n) -> { currentObject.setNewUpdates(n.getIntegerValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the inventorySyncStatus property value. Driver inventory sync status for this profile.
     * @return a windowsDriverUpdateProfileInventorySyncStatus
     */
    @javax.annotation.Nullable
    public WindowsDriverUpdateProfileInventorySyncStatus getInventorySyncStatus() {
        return this._inventorySyncStatus;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the newUpdates property value. Number of new driver updates available for this profile.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNewUpdates() {
        return this._newUpdates;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Driver Update entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovalType(@javax.annotation.Nullable final DriverUpdateProfileApprovalType value) {
        this._approvalType = value;
    }
    /**
     * Sets the assignments property value. The list of group assignments of the profile.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<WindowsDriverUpdateProfileAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date time that the profile was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deploymentDeferralInDays property value. Deployment deferral settings in days, only applicable when ApprovalType is set to automatic approval.
     * @param value Value to set for the deploymentDeferralInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentDeferralInDays(@javax.annotation.Nullable final Integer value) {
        this._deploymentDeferralInDays = value;
    }
    /**
     * Sets the description property value. The description of the profile which is specified by the user.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceReporting property value. Number of devices reporting for this profile
     * @param value Value to set for the deviceReporting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceReporting(@javax.annotation.Nullable final Integer value) {
        this._deviceReporting = value;
    }
    /**
     * Sets the displayName property value. The display name for the profile.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the driverInventories property value. Driver inventories for this profile.
     * @param value Value to set for the driverInventories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriverInventories(@javax.annotation.Nullable final java.util.List<WindowsDriverUpdateInventory> value) {
        this._driverInventories = value;
    }
    /**
     * Sets the inventorySyncStatus property value. Driver inventory sync status for this profile.
     * @param value Value to set for the inventorySyncStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInventorySyncStatus(@javax.annotation.Nullable final WindowsDriverUpdateProfileInventorySyncStatus value) {
        this._inventorySyncStatus = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the newUpdates property value. Number of new driver updates available for this profile.
     * @param value Value to set for the newUpdates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewUpdates(@javax.annotation.Nullable final Integer value) {
        this._newUpdates = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Driver Update entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
}
