package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class TeamworkDevice extends Entity implements Parsable {
    /** The activity properties that change based on the device usage. */
    private TeamworkDeviceActivity _activity;
    /** The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue. */
    private TeamworkDeviceActivityState _activityState;
    /** The company asset tag assigned by the admin on the device. */
    private String _companyAssetTag;
    /** The configuration properties of the device. */
    private TeamworkDeviceConfiguration _configuration;
    /** Identity of the user who enrolled the device to the tenant. */
    private IdentitySet _createdBy;
    /** The UTC date and time when the device was enrolled to the tenant. */
    private OffsetDateTime _createdDateTime;
    /** The signed-in user on the device. */
    private TeamworkUserIdentity _currentUser;
    /** The deviceType property */
    private TeamworkDeviceType _deviceType;
    /** The hardwareDetail property */
    private TeamworkHardwareDetail _hardwareDetail;
    /** The health properties of the device. */
    private TeamworkDeviceHealth _health;
    /** The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue. */
    private TeamworkDeviceHealthStatus _healthStatus;
    /** Identity of the user who last modified the device details. */
    private IdentitySet _lastModifiedBy;
    /** The UTC date and time when the device detail was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The notes added by the admin to the device. */
    private String _notes;
    /** The async operations on the device. */
    private java.util.List<TeamworkDeviceOperation> _operations;
    /**
     * Instantiates a new teamworkDevice and sets the default values.
     * @return a void
     */
    public TeamworkDevice() {
        super();
        this.setOdataType("#microsoft.graph.teamworkDevice");
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
        return this._activity;
    }
    /**
     * Gets the activityState property value. The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue.
     * @return a teamworkDeviceActivityState
     */
    @javax.annotation.Nullable
    public TeamworkDeviceActivityState getActivityState() {
        return this._activityState;
    }
    /**
     * Gets the companyAssetTag property value. The company asset tag assigned by the admin on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyAssetTag() {
        return this._companyAssetTag;
    }
    /**
     * Gets the configuration property value. The configuration properties of the device.
     * @return a teamworkDeviceConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkDeviceConfiguration getConfiguration() {
        return this._configuration;
    }
    /**
     * Gets the createdBy property value. Identity of the user who enrolled the device to the tenant.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device was enrolled to the tenant.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the currentUser property value. The signed-in user on the device.
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nullable
    public TeamworkUserIdentity getCurrentUser() {
        return this._currentUser;
    }
    /**
     * Gets the deviceType property value. The deviceType property
     * @return a teamworkDeviceType
     */
    @javax.annotation.Nullable
    public TeamworkDeviceType getDeviceType() {
        return this._deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDevice currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activity", (n) -> { currentObject.setActivity(n.getObjectValue(TeamworkDeviceActivity::createFromDiscriminatorValue)); });
            this.put("activityState", (n) -> { currentObject.setActivityState(n.getEnumValue(TeamworkDeviceActivityState.class)); });
            this.put("companyAssetTag", (n) -> { currentObject.setCompanyAssetTag(n.getStringValue()); });
            this.put("configuration", (n) -> { currentObject.setConfiguration(n.getObjectValue(TeamworkDeviceConfiguration::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("currentUser", (n) -> { currentObject.setCurrentUser(n.getObjectValue(TeamworkUserIdentity::createFromDiscriminatorValue)); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getEnumValue(TeamworkDeviceType.class)); });
            this.put("hardwareDetail", (n) -> { currentObject.setHardwareDetail(n.getObjectValue(TeamworkHardwareDetail::createFromDiscriminatorValue)); });
            this.put("health", (n) -> { currentObject.setHealth(n.getObjectValue(TeamworkDeviceHealth::createFromDiscriminatorValue)); });
            this.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(TeamworkDeviceHealthStatus.class)); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(TeamworkDeviceOperation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hardwareDetail property value. The hardwareDetail property
     * @return a teamworkHardwareDetail
     */
    @javax.annotation.Nullable
    public TeamworkHardwareDetail getHardwareDetail() {
        return this._hardwareDetail;
    }
    /**
     * Gets the health property value. The health properties of the device.
     * @return a teamworkDeviceHealth
     */
    @javax.annotation.Nullable
    public TeamworkDeviceHealth getHealth() {
        return this._health;
    }
    /**
     * Gets the healthStatus property value. The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue.
     * @return a teamworkDeviceHealthStatus
     */
    @javax.annotation.Nullable
    public TeamworkDeviceHealthStatus getHealthStatus() {
        return this._healthStatus;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device details.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device detail was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the notes property value. The notes added by the admin to the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the operations property value. The async operations on the device.
     * @return a teamworkDeviceOperation
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkDeviceOperation> getOperations() {
        return this._operations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setActivity(@javax.annotation.Nullable final TeamworkDeviceActivity value) {
        this._activity = value;
    }
    /**
     * Sets the activityState property value. The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue.
     * @param value Value to set for the activityState property.
     * @return a void
     */
    public void setActivityState(@javax.annotation.Nullable final TeamworkDeviceActivityState value) {
        this._activityState = value;
    }
    /**
     * Sets the companyAssetTag property value. The company asset tag assigned by the admin on the device.
     * @param value Value to set for the companyAssetTag property.
     * @return a void
     */
    public void setCompanyAssetTag(@javax.annotation.Nullable final String value) {
        this._companyAssetTag = value;
    }
    /**
     * Sets the configuration property value. The configuration properties of the device.
     * @param value Value to set for the configuration property.
     * @return a void
     */
    public void setConfiguration(@javax.annotation.Nullable final TeamworkDeviceConfiguration value) {
        this._configuration = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who enrolled the device to the tenant.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device was enrolled to the tenant.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the currentUser property value. The signed-in user on the device.
     * @param value Value to set for the currentUser property.
     * @return a void
     */
    public void setCurrentUser(@javax.annotation.Nullable final TeamworkUserIdentity value) {
        this._currentUser = value;
    }
    /**
     * Sets the deviceType property value. The deviceType property
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    public void setDeviceType(@javax.annotation.Nullable final TeamworkDeviceType value) {
        this._deviceType = value;
    }
    /**
     * Sets the hardwareDetail property value. The hardwareDetail property
     * @param value Value to set for the hardwareDetail property.
     * @return a void
     */
    public void setHardwareDetail(@javax.annotation.Nullable final TeamworkHardwareDetail value) {
        this._hardwareDetail = value;
    }
    /**
     * Sets the health property value. The health properties of the device.
     * @param value Value to set for the health property.
     * @return a void
     */
    public void setHealth(@javax.annotation.Nullable final TeamworkDeviceHealth value) {
        this._health = value;
    }
    /**
     * Sets the healthStatus property value. The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue.
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    public void setHealthStatus(@javax.annotation.Nullable final TeamworkDeviceHealthStatus value) {
        this._healthStatus = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device details.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device detail was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the notes property value. The notes added by the admin to the device.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the operations property value. The async operations on the device.
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<TeamworkDeviceOperation> value) {
        this._operations = value;
    }
}
