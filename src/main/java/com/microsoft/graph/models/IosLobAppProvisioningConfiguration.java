package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** This topic provides descriptions of the declared methods, properties and relationships exposed by the iOS Lob App Provisioning Configuration resource. */
public class IosLobAppProvisioningConfiguration extends Entity implements Parsable {
    /** The associated group assignments for IosLobAppProvisioningConfiguration. */
    private java.util.List<IosLobAppProvisioningConfigurationAssignment> _assignments;
    /** DateTime the object was created. */
    private OffsetDateTime _createdDateTime;
    /** Admin provided description of the Device Configuration. */
    private String _description;
    /** The list of device installation states for this mobile app configuration. */
    private java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> _deviceStatuses;
    /** Admin provided name of the device configuration. */
    private String _displayName;
    /** Optional profile expiration date and time. */
    private OffsetDateTime _expirationDateTime;
    /** The associated group assignments. */
    private java.util.List<MobileAppProvisioningConfigGroupAssignment> _groupAssignments;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Payload. (UTF8 encoded byte array) */
    private byte[] _payload;
    /** Payload file name (.mobileprovision */
    private String _payloadFileName;
    /** List of Scope Tags for this iOS LOB app provisioning configuration entity. */
    private java.util.List<String> _roleScopeTagIds;
    /** The list of user installation states for this mobile app configuration. */
    private java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> _userStatuses;
    /** Version of the device configuration. */
    private Integer _version;
    /**
     * Instantiates a new iosLobAppProvisioningConfiguration and sets the default values.
     * @return a void
     */
    public IosLobAppProvisioningConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosLobAppProvisioningConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosLobAppProvisioningConfiguration
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
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceStatuses property value. The list of device installation states for this mobile app configuration.
     * @return a managedDeviceMobileAppConfigurationDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the expirationDateTime property value. Optional profile expiration date and time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosLobAppProvisioningConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(IosLobAppProvisioningConfigurationAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationDeviceStatus::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("groupAssignments", (n) -> { currentObject.setGroupAssignments(n.getCollectionOfObjectValues(MobileAppProvisioningConfigGroupAssignment::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("payload", (n) -> { currentObject.setPayload(n.getByteArrayValue()); });
            this.put("payloadFileName", (n) -> { currentObject.setPayloadFileName(n.getStringValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("userStatuses", (n) -> { currentObject.setUserStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationUserStatus::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the groupAssignments property value. The associated group assignments.
     * @return a mobileAppProvisioningConfigGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppProvisioningConfigGroupAssignment> getGroupAssignments() {
        return this._groupAssignments;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the payload property value. Payload. (UTF8 encoded byte array)
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getPayload() {
        return this._payload;
    }
    /**
     * Gets the payloadFileName property value. Payload file name (.mobileprovision
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadFileName() {
        return this._payloadFileName;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this iOS LOB app provisioning configuration entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the userStatuses property value. The list of user installation states for this mobile app configuration.
     * @return a managedDeviceMobileAppConfigurationUserStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> getUserStatuses() {
        return this._userStatuses;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAssignments(@javax.annotation.Nullable final java.util.List<IosLobAppProvisioningConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceStatuses property value. The list of device installation states for this mobile app configuration.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the expirationDateTime property value. Optional profile expiration date and time.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the groupAssignments property value. The associated group assignments.
     * @param value Value to set for the groupAssignments property.
     * @return a void
     */
    public void setGroupAssignments(@javax.annotation.Nullable final java.util.List<MobileAppProvisioningConfigGroupAssignment> value) {
        this._groupAssignments = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the payload property value. Payload. (UTF8 encoded byte array)
     * @param value Value to set for the payload property.
     * @return a void
     */
    public void setPayload(@javax.annotation.Nullable final byte[] value) {
        this._payload = value;
    }
    /**
     * Sets the payloadFileName property value. Payload file name (.mobileprovision
     * @param value Value to set for the payloadFileName property.
     * @return a void
     */
    public void setPayloadFileName(@javax.annotation.Nullable final String value) {
        this._payloadFileName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this iOS LOB app provisioning configuration entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the userStatuses property value. The list of user installation states for this mobile app configuration.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> value) {
        this._userStatuses = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
