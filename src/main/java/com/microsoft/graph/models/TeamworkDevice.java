package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDevice extends Entity implements Parsable {
    /**
     * The activity properties that change based on the device usage.
     */
    private TeamworkDeviceActivity activity;
    /**
     * The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue.
     */
    private TeamworkDeviceActivityState activityState;
    /**
     * The company asset tag assigned by the admin on the device.
     */
    private String companyAssetTag;
    /**
     * The configuration properties of the device.
     */
    private TeamworkDeviceConfiguration configuration;
    /**
     * Identity of the user who enrolled the device to the tenant.
     */
    private IdentitySet createdBy;
    /**
     * The UTC date and time when the device was enrolled to the tenant.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The signed-in user on the device.
     */
    private TeamworkUserIdentity currentUser;
    /**
     * The deviceType property
     */
    private TeamworkDeviceType deviceType;
    /**
     * The hardwareDetail property
     */
    private TeamworkHardwareDetail hardwareDetail;
    /**
     * The health properties of the device.
     */
    private TeamworkDeviceHealth health;
    /**
     * The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue.
     */
    private TeamworkDeviceHealthStatus healthStatus;
    /**
     * Identity of the user who last modified the device details.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The UTC date and time when the device detail was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The notes added by the admin to the device.
     */
    private String notes;
    /**
     * The async operations on the device.
     */
    private java.util.List<TeamworkDeviceOperation> operations;
    /**
     * Instantiates a new teamworkDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDevice
     */
    @javax.annotation.Nonnull
    public static TeamworkDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDevice();
    }
    /**
     * Gets the activity property value. The activity properties that change based on the device usage.
     * @return a teamworkDeviceActivity
     */
    @javax.annotation.Nullable
    public TeamworkDeviceActivity getActivity() {
        return this.activity;
    }
    /**
     * Gets the activityState property value. The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue.
     * @return a teamworkDeviceActivityState
     */
    @javax.annotation.Nullable
    public TeamworkDeviceActivityState getActivityState() {
        return this.activityState;
    }
    /**
     * Gets the companyAssetTag property value. The company asset tag assigned by the admin on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyAssetTag() {
        return this.companyAssetTag;
    }
    /**
     * Gets the configuration property value. The configuration properties of the device.
     * @return a teamworkDeviceConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkDeviceConfiguration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the createdBy property value. Identity of the user who enrolled the device to the tenant.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device was enrolled to the tenant.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the currentUser property value. The signed-in user on the device.
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nullable
    public TeamworkUserIdentity getCurrentUser() {
        return this.currentUser;
    }
    /**
     * Gets the deviceType property value. The deviceType property
     * @return a TeamworkDeviceType
     */
    @javax.annotation.Nullable
    public TeamworkDeviceType getDeviceType() {
        return this.deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(TeamworkDeviceActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("activityState", (n) -> { this.setActivityState(n.getEnumValue(TeamworkDeviceActivityState.class)); });
        deserializerMap.put("companyAssetTag", (n) -> { this.setCompanyAssetTag(n.getStringValue()); });
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(TeamworkDeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentUser", (n) -> { this.setCurrentUser(n.getObjectValue(TeamworkUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(TeamworkDeviceType.class)); });
        deserializerMap.put("hardwareDetail", (n) -> { this.setHardwareDetail(n.getObjectValue(TeamworkHardwareDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("health", (n) -> { this.setHealth(n.getObjectValue(TeamworkDeviceHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(TeamworkDeviceHealthStatus.class)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(TeamworkDeviceOperation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hardwareDetail property value. The hardwareDetail property
     * @return a TeamworkHardwareDetail
     */
    @javax.annotation.Nullable
    public TeamworkHardwareDetail getHardwareDetail() {
        return this.hardwareDetail;
    }
    /**
     * Gets the health property value. The health properties of the device.
     * @return a teamworkDeviceHealth
     */
    @javax.annotation.Nullable
    public TeamworkDeviceHealth getHealth() {
        return this.health;
    }
    /**
     * Gets the healthStatus property value. The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue.
     * @return a teamworkDeviceHealthStatus
     */
    @javax.annotation.Nullable
    public TeamworkDeviceHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device details.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device detail was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the notes property value. The notes added by the admin to the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the operations property value. The async operations on the device.
     * @return a teamworkDeviceOperation
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkDeviceOperation> getOperations() {
        return this.operations;
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
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeEnumValue("activityState", this.getActivityState());
        writer.writeStringValue("companyAssetTag", this.getCompanyAssetTag());
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("currentUser", this.getCurrentUser());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeObjectValue("hardwareDetail", this.getHardwareDetail());
        writer.writeObjectValue("health", this.getHealth());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
    }
    /**
     * Sets the activity property value. The activity properties that change based on the device usage.
     * @param value Value to set for the activity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivity(@javax.annotation.Nullable final TeamworkDeviceActivity value) {
        this.activity = value;
    }
    /**
     * Sets the activityState property value. The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue.
     * @param value Value to set for the activityState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityState(@javax.annotation.Nullable final TeamworkDeviceActivityState value) {
        this.activityState = value;
    }
    /**
     * Sets the companyAssetTag property value. The company asset tag assigned by the admin on the device.
     * @param value Value to set for the companyAssetTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyAssetTag(@javax.annotation.Nullable final String value) {
        this.companyAssetTag = value;
    }
    /**
     * Sets the configuration property value. The configuration properties of the device.
     * @param value Value to set for the configuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final TeamworkDeviceConfiguration value) {
        this.configuration = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who enrolled the device to the tenant.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device was enrolled to the tenant.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the currentUser property value. The signed-in user on the device.
     * @param value Value to set for the currentUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentUser(@javax.annotation.Nullable final TeamworkUserIdentity value) {
        this.currentUser = value;
    }
    /**
     * Sets the deviceType property value. The deviceType property
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final TeamworkDeviceType value) {
        this.deviceType = value;
    }
    /**
     * Sets the hardwareDetail property value. The hardwareDetail property
     * @param value Value to set for the hardwareDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHardwareDetail(@javax.annotation.Nullable final TeamworkHardwareDetail value) {
        this.hardwareDetail = value;
    }
    /**
     * Sets the health property value. The health properties of the device.
     * @param value Value to set for the health property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealth(@javax.annotation.Nullable final TeamworkDeviceHealth value) {
        this.health = value;
    }
    /**
     * Sets the healthStatus property value. The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue.
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final TeamworkDeviceHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device details.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device detail was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the notes property value. The notes added by the admin to the device.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the operations property value. The async operations on the device.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<TeamworkDeviceOperation> value) {
        this.operations = value;
    }
}
