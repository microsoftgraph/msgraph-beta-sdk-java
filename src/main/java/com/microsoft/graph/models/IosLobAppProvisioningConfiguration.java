package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosLobAppProvisioningConfiguration extends Entity implements Parsable {
    /** The associated group assignments for IosLobAppProvisioningConfiguration. */
    private java.util.List<IosLobAppProvisioningConfigurationAssignment> assignments;
    /** DateTime the object was created. */
    private OffsetDateTime createdDateTime;
    /** Admin provided description of the Device Configuration. */
    private String description;
    /** The list of device installation states for this mobile app configuration. */
    private java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> deviceStatuses;
    /** Admin provided name of the device configuration. */
    private String displayName;
    /** Optional profile expiration date and time. */
    private OffsetDateTime expirationDateTime;
    /** The associated group assignments. */
    private java.util.List<MobileAppProvisioningConfigGroupAssignment> groupAssignments;
    /** DateTime the object was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** Payload. (UTF8 encoded byte array) */
    private byte[] payload;
    /** Payload file name (.mobileprovision */
    private String payloadFileName;
    /** List of Scope Tags for this iOS LOB app provisioning configuration entity. */
    private java.util.List<String> roleScopeTagIds;
    /** The list of user installation states for this mobile app configuration. */
    private java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> userStatuses;
    /** Version of the device configuration. */
    private Integer version;
    /**
     * Instantiates a new IosLobAppProvisioningConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosLobAppProvisioningConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosLobAppProvisioningConfiguration
     */
    @javax.annotation.Nonnull
    public static IosLobAppProvisioningConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosLobAppProvisioningConfiguration();
    }
    /**
     * Gets the assignments property value. The associated group assignments for IosLobAppProvisioningConfiguration.
     * @return a iosLobAppProvisioningConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<IosLobAppProvisioningConfigurationAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceStatuses property value. The list of device installation states for this mobile app configuration.
     * @return a managedDeviceMobileAppConfigurationDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> getDeviceStatuses() {
        return this.deviceStatuses;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the expirationDateTime property value. Optional profile expiration date and time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(IosLobAppProvisioningConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupAssignments", (n) -> { this.setGroupAssignments(n.getCollectionOfObjectValues(MobileAppProvisioningConfigGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getByteArrayValue()); });
        deserializerMap.put("payloadFileName", (n) -> { this.setPayloadFileName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userStatuses", (n) -> { this.setUserStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationUserStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupAssignments property value. The associated group assignments.
     * @return a mobileAppProvisioningConfigGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppProvisioningConfigGroupAssignment> getGroupAssignments() {
        return this.groupAssignments;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the payload property value. Payload. (UTF8 encoded byte array)
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getPayload() {
        return this.payload;
    }
    /**
     * Gets the payloadFileName property value. Payload file name (.mobileprovision
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadFileName() {
        return this.payloadFileName;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this iOS LOB app provisioning configuration entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the userStatuses property value. The list of user installation states for this mobile app configuration.
     * @return a managedDeviceMobileAppConfigurationUserStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> getUserStatuses() {
        return this.userStatuses;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this.version;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfObjectValues("groupAssignments", this.getGroupAssignments());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeByteArrayValue("payload", this.getPayload());
        writer.writeStringValue("payloadFileName", this.getPayloadFileName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The associated group assignments for IosLobAppProvisioningConfiguration.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<IosLobAppProvisioningConfigurationAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceStatuses property value. The list of device installation states for this mobile app configuration.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> value) {
        this.deviceStatuses = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the expirationDateTime property value. Optional profile expiration date and time.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the groupAssignments property value. The associated group assignments.
     * @param value Value to set for the groupAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupAssignments(@javax.annotation.Nullable final java.util.List<MobileAppProvisioningConfigGroupAssignment> value) {
        this.groupAssignments = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the payload property value. Payload. (UTF8 encoded byte array)
     * @param value Value to set for the payload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayload(@javax.annotation.Nullable final byte[] value) {
        this.payload = value;
    }
    /**
     * Sets the payloadFileName property value. Payload file name (.mobileprovision
     * @param value Value to set for the payloadFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadFileName(@javax.annotation.Nullable final String value) {
        this.payloadFileName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this iOS LOB app provisioning configuration entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the userStatuses property value. The list of user installation states for this mobile app configuration.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> value) {
        this.userStatuses = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
