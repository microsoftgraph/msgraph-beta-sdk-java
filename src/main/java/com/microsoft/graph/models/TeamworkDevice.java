package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkDevice extends Entity implements Parsable {
    /**
     * Instantiates a new TeamworkDevice and sets the default values.
     */
    public TeamworkDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkDevice
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDevice();
    }
    /**
     * Gets the activity property value. The activity properties that change based on the device usage.
     * @return a TeamworkDeviceActivity
     */
    @jakarta.annotation.Nullable
    public TeamworkDeviceActivity getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the activityState property value. The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue.
     * @return a TeamworkDeviceActivityState
     */
    @jakarta.annotation.Nullable
    public TeamworkDeviceActivityState getActivityState() {
        return this.backingStore.get("activityState");
    }
    /**
     * Gets the companyAssetTag property value. The company asset tag assigned by the admin on the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompanyAssetTag() {
        return this.backingStore.get("companyAssetTag");
    }
    /**
     * Gets the configuration property value. The configuration properties of the device.
     * @return a TeamworkDeviceConfiguration
     */
    @jakarta.annotation.Nullable
    public TeamworkDeviceConfiguration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the createdBy property value. Identity of the user who enrolled the device to the tenant.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device was enrolled to the tenant.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the currentUser property value. The signed-in user on the device.
     * @return a TeamworkUserIdentity
     */
    @jakarta.annotation.Nullable
    public TeamworkUserIdentity getCurrentUser() {
        return this.backingStore.get("currentUser");
    }
    /**
     * Gets the deviceType property value. The deviceType property
     * @return a TeamworkDeviceType
     */
    @jakarta.annotation.Nullable
    public TeamworkDeviceType getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public TeamworkHardwareDetail getHardwareDetail() {
        return this.backingStore.get("hardwareDetail");
    }
    /**
     * Gets the health property value. The health properties of the device.
     * @return a TeamworkDeviceHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkDeviceHealth getHealth() {
        return this.backingStore.get("health");
    }
    /**
     * Gets the healthStatus property value. The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue.
     * @return a TeamworkDeviceHealthStatus
     */
    @jakarta.annotation.Nullable
    public TeamworkDeviceHealthStatus getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device details.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device detail was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the notes property value. The notes added by the admin to the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the operations property value. The async operations on the device.
     * @return a java.util.List<TeamworkDeviceOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkDeviceOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActivity(@jakarta.annotation.Nullable final TeamworkDeviceActivity value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the activityState property value. The activity state of the device. The possible values are: unknown, busy, idle, unavailable, unknownFutureValue.
     * @param value Value to set for the activityState property.
     */
    public void setActivityState(@jakarta.annotation.Nullable final TeamworkDeviceActivityState value) {
        this.backingStore.set("activityState", value);
    }
    /**
     * Sets the companyAssetTag property value. The company asset tag assigned by the admin on the device.
     * @param value Value to set for the companyAssetTag property.
     */
    public void setCompanyAssetTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyAssetTag", value);
    }
    /**
     * Sets the configuration property value. The configuration properties of the device.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final TeamworkDeviceConfiguration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user who enrolled the device to the tenant.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device was enrolled to the tenant.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the currentUser property value. The signed-in user on the device.
     * @param value Value to set for the currentUser property.
     */
    public void setCurrentUser(@jakarta.annotation.Nullable final TeamworkUserIdentity value) {
        this.backingStore.set("currentUser", value);
    }
    /**
     * Sets the deviceType property value. The deviceType property
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final TeamworkDeviceType value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the hardwareDetail property value. The hardwareDetail property
     * @param value Value to set for the hardwareDetail property.
     */
    public void setHardwareDetail(@jakarta.annotation.Nullable final TeamworkHardwareDetail value) {
        this.backingStore.set("hardwareDetail", value);
    }
    /**
     * Sets the health property value. The health properties of the device.
     * @param value Value to set for the health property.
     */
    public void setHealth(@jakarta.annotation.Nullable final TeamworkDeviceHealth value) {
        this.backingStore.set("health", value);
    }
    /**
     * Sets the healthStatus property value. The health status of the device. The possible values are: unknown, offline, critical, nonUrgent, healthy, unknownFutureValue.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final TeamworkDeviceHealthStatus value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device details.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device detail was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the notes property value. The notes added by the admin to the device.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the operations property value. The async operations on the device.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<TeamworkDeviceOperation> value) {
        this.backingStore.set("operations", value);
    }
}
